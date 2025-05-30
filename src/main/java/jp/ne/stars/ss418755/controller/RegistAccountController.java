package jp.ne.stars.ss418755.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.ne.stars.ss418755.form.LoginForm;

/**
 * アカウント登録処理
 */
@Controller
public class RegistAccountController {
	@RequestMapping("/regist/account/input")
	public String registInput(
			@ModelAttribute LoginForm userForm) {
		return "regist/account/input";
	}

	@PostMapping("/regist/account/check")
	public String registCheck() {
		return "regist/acccount/check";
	}
}
