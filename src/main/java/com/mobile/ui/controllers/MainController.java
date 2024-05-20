package com.mobile.ui.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mobile.ui.config.LocaleProperties;
import com.mobile.ui.service.SeoService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MainController {

	private static final String DEFAULT_COUNTRY = "us";
	private static final String DEFAULT_LANGUAGE = "en";

	private final LocaleProperties localeProperties;

	public MainController(LocaleProperties localeProperties, SeoService seoService) {
		this.localeProperties = localeProperties;
		this.seoService = seoService;
	}

	private SeoService seoService = new SeoService();

	@GetMapping("/{country}/{lang}/layout")
	public String home(@PathVariable("country") String country, @PathVariable("lang") String lang,
			HttpServletRequest request, Model model) {

		String direction = localeProperties.getLanguageDirections().get(lang);
		model.addAttribute("direction", direction);
		model.addAttribute("currentCountry", country);
		model.addAttribute("currentLanguage", lang);
		model.addAttribute("pageTitle", seoService.getTitleForRequest(request, country));
		model.addAttribute("pageDescription", seoService.getDescriptionForRequest(request, country));

		return "layout";

	}

	@GetMapping("/{layout}")
	public String redirectWithDefaultLocale(@PathVariable("layout") String layout) {
		// Assuming the layout parameter matches the expected "layout" string for
		// redirecting
		if ("layout".equals(layout)) {
			return "redirect:/" + DEFAULT_COUNTRY + "/" + DEFAULT_LANGUAGE + "/layout";
		}
		// Handle unexpected layout values or add additional logic as necessary
		return "error"; // redirect to an error page or handle differently
	}

	// Additional mappings as needed
}
