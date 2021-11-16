package com.codingfreaks.NiagaraFallsCurlingClub.controllers;

import com.codingfreaks.NiagaraFallsCurlingClub.modelClasses.Match;
import com.codingfreaks.NiagaraFallsCurlingClub.repositories.MatchRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public class EditMatchContoller {
  
  String userId;
  String matchId;

  @Autowired
  private MatchRepository matchRepository;

  @RequestMapping(value = "/edit_match", method = RequestMethod.GET)
  public String edit_match(Model model, RedirectAttributes redirectAttrs, @RequestParam("matchId") String mid) {
      matchId = mid;
      return "views/editMatch";
  }

  private Match getMatchDetails() {

      return matchRepository.findById(matchId).orElse(null);
  }


}
