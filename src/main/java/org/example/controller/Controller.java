package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class Controller {
    @PostMapping("/hello")
    public ResponseEntity<String> hello() {
        String tester = "tester";

        boolean bln = StringUtils.hasText(tester);// and so on
        System.out.println(bln);

        Assert.notNull(tester, "Can't be null"); // and so on

        List<Integer> ints = Arrays.asList(4, 3, 5, 1);
        int i = CollectionUtils.firstElement(ints);

        return ResponseEntity.ok("Hello");
    }
}