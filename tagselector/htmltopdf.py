import pdfkit
import requests
from lxml import html

def filter_html(html_content, selected_xpath):
    tree = html.fromstring(html_content)
    elements_to_keep = tree.xpath(selected_xpath)
    for element in tree.xpath("//*"):
        if element not in elements_to_keep:
            if element.getparent() is not None:
                element.getparent().remove(element)
    return html.tostring(tree)

def html_url_to_pdf(html_url, output_pdf_path, selected_xpath):
    try:
        response = requests.get(html_url)
        response.raise_for_status()  # Raise an error for bad responses
        html_content = response.text
        filtered_html = filter_html(html_content, selected_xpath)
        pdfkit.from_string(filtered_html, output_pdf_path)
        print("PDF created successfully.")
    except requests.RequestException as e:
        print("Error retrieving HTML content:", e)
    except Exception as e:
        print("Error:", e)

# Example usage:
html_url = "https://www.google.com/"  # Replace with your HTML URL
selected_xpath = '//*[@id="hplogo"]'  # Example XPath expression to select specific elements
output_pdf_path = 'output.pdf'


html_url_to_pdf(html_url, output_pdf_path, selected_xpath)
