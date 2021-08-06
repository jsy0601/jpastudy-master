package com.circus.jpastudy.store;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class StoreController {

    private final StoreService storeService;

    private final StoreRepository storeRepository;

    @GetMapping("/addStore")
    public String addStore(Model model) {
        model.addAttribute("storeRegisterDTO", new StoreRegisterDTO());

        return "createShopForm";
    }

    @PostMapping("/addStore")
    public String addStore(StoreRegisterDTO storeRegisterDTO) {
        storeService.save(storeRegisterDTO);

        return "redirect:/addStore";
    }

    @GetMapping("/storeInfo/{id}")
    public String updateStore(Model model) {
        model.addAttribute("storeRegisterDTO", new StoreRegisterDTO());

        return "storeInfoForm";
    }

    @PostMapping("/storeInfo/{id}")
    public String updateStore(@PathVariable Long id, @ModelAttribute StoreRegisterDTO storeRegisterDTO) {
        storeService.update(id, storeRegisterDTO);
        return "redirect:/storeInfoForm";
    }
}
