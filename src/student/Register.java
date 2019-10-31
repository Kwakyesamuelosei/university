package student;

import java.util.ArrayList;
import java.util.List;

public class Register {
    private List<Nameable> nameables;

    public Register(List<Nameable> nameables) {
        this.nameables = nameables;
    }

    public List<String> getRegister(){
        List<String> studentNames = new ArrayList<>();
        for(Nameable nameable: nameables){
            studentNames.add(nameable.getName());
        }
        return studentNames;
    }
    public List<String> getRegisterByLevel(Level level){
        List<String> studentNames = new ArrayList<>();
        for(Nameable nameable: nameables){
            if(nameable.getLevel().equals(level)){
                studentNames.add(nameable.getName());
            }
        }
        return studentNames;
    }

    public String printReport(){

    }


}
