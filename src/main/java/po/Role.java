package po;

public class Role {
    private Integer roleId;

    private String roleName;

    private String Permissions;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getPermissions() {
        return Permissions;
    }

    public void setPermissions(String permissions) {
        Permissions = permissions;
    }
}
