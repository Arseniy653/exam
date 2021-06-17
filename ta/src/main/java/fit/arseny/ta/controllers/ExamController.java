package fit.arseny.ta.controllers;

import fit.arseny.ta.models.Exam;
import fit.arseny.ta.repo.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ExamController {

    @Autowired
    private ExamRepository examRepository;

    @GetMapping("/exam")
    public String lab_second_main(Model model){

        Iterable<Exam> db_exam = examRepository.findAll();

        model.addAttribute("title", "page for Exam");
        model.addAttribute("db_exam", db_exam);
        return "exam-main";
    }

    @GetMapping("/exam/add")
    public String exam_add(Model model){
        return "exam-add";
    }

    @PostMapping("exam/add")
    public String exam_post_add(@RequestParam String x, Model model){
        Exam tmp = new Exam(Float.parseFloat(x));
        tmp.func();
        examRepository.save(tmp);
        return "redirect:/exam";
    }


    @GetMapping("/exam/add-random")
    public String exam_add_random(Model model){
        return "exam-add-random";
    }

    @PostMapping("exam/add-random")
    public String exam_post_add_random(Model model){
        for(int i = 0; i < 83; i++){
            Exam tmp = new Exam(getRandomNumber(0,100));
            tmp.func();
            examRepository.save(tmp);
        }
        return "redirect:/exam";
    }

    public float getRandomNumber(int min, int max) {
        return (float) ((Math.random() * (max - min)) + min);
    }

}

