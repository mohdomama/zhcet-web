package in.ac.amu.zhcet.data.service.user;

import in.ac.amu.zhcet.data.model.Department;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

@Getter
@Setter
public class CustomUser extends User {

    private String name;
    private String avatar;
    private String type;
    private Department department;

    public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public CustomUser name(String name) {
        setName(name);
        return this;
    }

    public CustomUser avatar(String avatar) {
        setAvatar(avatar);
        return this;
    }

    public CustomUser type(String type) {
        setType(type);
        return this;
    }

    public CustomUser department(Department department) {
        setDepartment(department);
        return this;
    }

}
