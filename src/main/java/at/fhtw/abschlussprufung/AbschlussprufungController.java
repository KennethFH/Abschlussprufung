package at.fhtw.abschlussprufung;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbschlussprufungController {
    @GetMapping("/square")
    public int quadrieren(int q)
    {
        return q*q;
    }
}
