package kr.happyjob.study.cmp.service;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

public interface SalesRankingInter {
	public void backController (HttpSession session, ModelAndView mav, int serviceCode);
	public void backController (Model model, int serviceCode);
}