package employeeApp.model;

import employeeApp.enums.Plan;

public class Healthplan {
    //instance variable
    private int id;
    private String name;
    private Plan plan;

    public Healthplan(int id, String name, Plan plan){
        this.id = id;
        this.name = name;
        this.plan = plan;
        //System.out.println(this.plan.BASIC);
    }

    //TODO: Asla Getter metodlarının içerisine lojik eklemeyin.
    public int getId(){
        return id;
    }

    //TODO[Dogancan] id değerinin 0'dan büyük olduğunu kontrol et.
    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + " Name: " + this.name
                + " Plan Name: " + plan.getName()
                + " Plan Price: " + plan.getPrice();
    }
}
