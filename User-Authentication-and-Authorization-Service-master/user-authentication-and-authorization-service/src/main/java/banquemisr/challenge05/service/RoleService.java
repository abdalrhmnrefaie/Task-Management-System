package banquemisr.challenge05.service;

import java.util.List;

import banquemisr.challenge05.model.Role;
import banquemisr.challenge05.model.User;

public interface RoleService {
    public List<Role> getAll();
    public Role getById(Long id);
    public Role getByName(String name);
    public Role getByNameOrNull(String name);
    public Role save(Role role);
}
