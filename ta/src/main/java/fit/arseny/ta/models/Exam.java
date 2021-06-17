package fit.arseny.ta.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Float x;
    private Float answer;

    public Exam(){}

    public Exam(Float x){
        this.x = x;
    }

    public Long getId() {
        return id;
    }

    public Float getX() {
        return x;
    }

    public Float getAnswer() {
        return answer;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public void setAnswer(Float answer) {
        this.answer = answer;
    }

    public void func(){
        this.answer = 3 / (7*x + 8);
    }
}