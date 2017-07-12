package in.ac.amu.zhcet.data.model;

import in.ac.amu.zhcet.data.model.base.entity.BaseIdEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Course extends BaseIdEntity {

    private String title;
    @Column(unique = true)
    private String code;

    @ManyToOne
    private Department department;
}
