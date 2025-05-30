package jp.ne.stars.ss418755.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import jp.ne.stars.ss418755.form.LoginForm;

/**
 * ログイン/ログアウト処理
 */
@Controller
public class IndexController {
	/**
	 * ログイン画面表示処理
	 * 
	 * @param loginForm ログインフォームクラス
	 * @return ログイン画面
	 */
	@RequestMapping("/")
	public String index(@ModelAttribute LoginForm loginForm) {
		return "index";
	}

	@PostMapping("/login")
	public String login(
			@Valid @ModelAttribute LoginForm loginForm,
			BindingResult result, HttpSession session) {
		if (result.hasErrors()) {
			return "index";
		} else {
			
		}

		return "list/work/works";
	}

	/**
	 * ログアウト処理
	 * セッションを破棄
	 * 
	 * @return ログイン画面にリダイレクト
	 */
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
