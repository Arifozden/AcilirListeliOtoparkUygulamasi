package oslomet.ukeoppgavenedtrekk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TasitController {

    public final List<Tasit> tasitKayit=new ArrayList<>();
    public final List<Araba> arabaKayit=new ArrayList<>();

    public TasitController(){
        Araba araba1=new Araba("Volvo","V30");
        arabaKayit.add(araba1);
        Araba araba2=new Araba("Volvo","V70");
        arabaKayit.add(araba2);
        Araba araba3=new Araba("Volvo","V91");
        arabaKayit.add(araba3);
        Araba araba4=new Araba("Audi","A8");
        arabaKayit.add(araba4);
        Araba araba5=new Araba("Audi","Q7");
        arabaKayit.add(araba5);
        Araba araba6=new Araba("Audi","Q8");
        arabaKayit.add(araba6);
    }

    @GetMapping("/arabalariGetir")
    public List<Araba>arabalariGetir(){
        return arabaKayit;
    }
@PostMapping("/kayit")
    public void musteriKayit(Tasit araba){
    tasitKayit.add(araba);
    }

    @GetMapping("/hepsiniGetir")
    public List<Tasit>hepsiniGetir(){
    return tasitKayit;
    }

    @GetMapping("/hepsiniSil")
    public void hepsiniSil(){
        tasitKayit.clear();
    }
}
