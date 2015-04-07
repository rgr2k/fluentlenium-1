package br.com.oitavo.fluentlenium.test;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;

public class GoogleTest extends FluentTestBase{
	
	@Test
	public void testFluentLeniumGetTitleWithJUnitAndJQuery() {
		goTo(URL);		
		$("#lst-ib").text("google test");
		$("#lst-ib").first().getElement().sendKeys(Keys.ENTER);		
		Assert.assertEquals("Google", title());
	}
	 
	@Test
	public void testFluentLeniumGetTitleWithFestAssert() {
		goTo(URL);
		fill("#lst-ib").with("Google");
		click("#tsf");
		assertThat(title()).contains("Google");
	}
	
	@Test
	public void testFluentLeniumGetTitleWithJQuerySyntax() {
		goTo(URL);
		$("#lst-ib").text("Google");
		$("#tsf").click();
		assertThat(title()).isEqualTo("Google");
		Assert.assertEquals("Pesquisa Google", $(".jsb>center>input").getValue());
	}
}
