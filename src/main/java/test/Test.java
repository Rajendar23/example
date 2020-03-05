package test;

import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test {
	public static void main(String[] args) {
		System.out.println("main");

		String html = "<p>For some of the Materials, such as the Datasets listed in The World Bank Data Catalog or the Publications made available in the&nbsp;<a href=\"https://openknowledge.worldbank.org/\">Open Knowledge Repository</a>. The World Bank Group has additional specific terms of use, all of which are hereby incorporated by reference. Those specific terms of use are available on the pages through which the relevant Materials are accessible, and are also collected here:</p>\r\n"
				+ "<p><a href=\"http://www.worldbank.org/en/about/legal/terms-of-use-for-datasets\">Terms of Use for Datasets</a></p>\r\n"
				+ "<p><a href=\"https://openknowledge.worldbank.org/terms-of-use\">Terms of Use for the Open Knowledge Repository</a></p>\r\n"
				+ "<p><a href=\"http://archivesphotos.worldbank.org/en/about/archives/photo-gallery/terms-of-use\">Terms of Use for the World Bank Group Archives Photo Catalog</a></p>";
		System.out.println(html);

		Document doc = Jsoup.parse(html);
		Elements elements = doc.select("a");

		if (!elements.isEmpty()) {
			Iterator<Element> iterator = elements.iterator();
			
			while (iterator.hasNext()) {
				Element element = (Element) iterator.next();
				
				if (element.hasAttr("href")) {
					System.out.println(element.attr("href"));	
				}
				
			}
		}
		System.out.println();
	}
}
