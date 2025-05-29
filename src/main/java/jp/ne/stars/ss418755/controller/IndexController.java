package jp.ne.stars.ss418755.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import jp.ne.stars.ss418755.form.LoginForm;

/**
 * ログイン/ログアウト処理
 */
@Controller
public class IndexController {
	@Autowired
	HttpSession session;

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

	public String login() {
		return "list/list";
	}

	/**
	 * ログアウト処理
	 * セッションを破棄
	 * 
	 * @return ログイン画面にリダイレクト
	 */
	@RequestMapping("/logout")
	public String logout() {
		session.invalidate();
		return "redirect:/";
	}
}
