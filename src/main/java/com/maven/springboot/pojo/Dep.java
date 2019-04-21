package com.maven.springboot.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Administrator on 2019/4/13.
 */
@Entity
@Table(name="t_dept")
public class Dep implements Serializable{

    @Id
    private Long uuid;
    private String name;
    private String tele;

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dep dep = (Dep) o;

        if (uuid != null ? !uuid.equals(dep.uuid) : dep.uuid != null) return false;
        if (name != null ? !name.equals(dep.name) : dep.name != null) return false;
        return tele != null ? tele.equals(dep.tele) : dep.tele == null;

    }

    @Override
    public int hashCode() {
        int result = uuid != null ? uuid.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (tele != null ? tele.hashCode() : 0);
        return result;
    }
}
