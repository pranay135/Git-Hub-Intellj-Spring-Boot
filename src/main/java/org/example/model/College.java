package org.example.model;

import javax.persistence.*;

@Entity
@Table(name="College")
public class College {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
  //  @Column(name="CollegeName") as these variable names will be same in DB,
  //  so if we want to change the column name use this annotation
    String name;
    int nos;

    public College() {
    }

    public College(long id, String name, int nos) {
        this.id = id;
        this.name = name;
        this.nos = nos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNos() {
        return nos;
    }

    public void setNos(int nos) {
        this.nos = nos;
    }

    @Override
    public String toString() {
        return "College{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nos=" + nos +
                '}';
    }
}
