// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class FullSyncRequest extends TeaModel {
    @NameInMap("DepartmentInfos")
    public java.util.List<FullSyncRequestDepartmentInfos> departmentInfos;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("RoleInfos")
    public java.util.List<FullSyncRequestRoleInfos> roleInfos;

    @NameInMap("StaffInfos")
    public java.util.List<FullSyncRequestStaffInfos> staffInfos;

    @NameInMap("SyncType")
    public String syncType;

    public static FullSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        FullSyncRequest self = new FullSyncRequest();
        return TeaModel.build(map, self);
    }

    public FullSyncRequest setDepartmentInfos(java.util.List<FullSyncRequestDepartmentInfos> departmentInfos) {
        this.departmentInfos = departmentInfos;
        return this;
    }
    public java.util.List<FullSyncRequestDepartmentInfos> getDepartmentInfos() {
        return this.departmentInfos;
    }

    public FullSyncRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public FullSyncRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public FullSyncRequest setRoleInfos(java.util.List<FullSyncRequestRoleInfos> roleInfos) {
        this.roleInfos = roleInfos;
        return this;
    }
    public java.util.List<FullSyncRequestRoleInfos> getRoleInfos() {
        return this.roleInfos;
    }

    public FullSyncRequest setStaffInfos(java.util.List<FullSyncRequestStaffInfos> staffInfos) {
        this.staffInfos = staffInfos;
        return this;
    }
    public java.util.List<FullSyncRequestStaffInfos> getStaffInfos() {
        return this.staffInfos;
    }

    public FullSyncRequest setSyncType(String syncType) {
        this.syncType = syncType;
        return this;
    }
    public String getSyncType() {
        return this.syncType;
    }

    public static class FullSyncRequestDepartmentInfos extends TeaModel {
        @NameInMap("DeptCode")
        public String deptCode;

        @NameInMap("DeptHiding")
        public Long deptHiding;

        @NameInMap("DeptName")
        public String deptName;

        @NameInMap("DeptOrder")
        public String deptOrder;

        @NameInMap("DeptType")
        public String deptType;

        @NameInMap("Ext")
        public String ext;

        @NameInMap("ParentCode")
        public String parentCode;

        public static FullSyncRequestDepartmentInfos build(java.util.Map<String, ?> map) throws Exception {
            FullSyncRequestDepartmentInfos self = new FullSyncRequestDepartmentInfos();
            return TeaModel.build(map, self);
        }

        public FullSyncRequestDepartmentInfos setDeptCode(String deptCode) {
            this.deptCode = deptCode;
            return this;
        }
        public String getDeptCode() {
            return this.deptCode;
        }

        public FullSyncRequestDepartmentInfos setDeptHiding(Long deptHiding) {
            this.deptHiding = deptHiding;
            return this;
        }
        public Long getDeptHiding() {
            return this.deptHiding;
        }

        public FullSyncRequestDepartmentInfos setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }
        public String getDeptName() {
            return this.deptName;
        }

        public FullSyncRequestDepartmentInfos setDeptOrder(String deptOrder) {
            this.deptOrder = deptOrder;
            return this;
        }
        public String getDeptOrder() {
            return this.deptOrder;
        }

        public FullSyncRequestDepartmentInfos setDeptType(String deptType) {
            this.deptType = deptType;
            return this;
        }
        public String getDeptType() {
            return this.deptType;
        }

        public FullSyncRequestDepartmentInfos setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public FullSyncRequestDepartmentInfos setParentCode(String parentCode) {
            this.parentCode = parentCode;
            return this;
        }
        public String getParentCode() {
            return this.parentCode;
        }

    }

    public static class FullSyncRequestRoleInfos extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("RoleDesc")
        public String roleDesc;

        @NameInMap("RoleId")
        public String roleId;

        @NameInMap("RoleName")
        public String roleName;

        public static FullSyncRequestRoleInfos build(java.util.Map<String, ?> map) throws Exception {
            FullSyncRequestRoleInfos self = new FullSyncRequestRoleInfos();
            return TeaModel.build(map, self);
        }

        public FullSyncRequestRoleInfos setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public FullSyncRequestRoleInfos setRoleDesc(String roleDesc) {
            this.roleDesc = roleDesc;
            return this;
        }
        public String getRoleDesc() {
            return this.roleDesc;
        }

        public FullSyncRequestRoleInfos setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public FullSyncRequestRoleInfos setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

    public static class FullSyncRequestStaffInfosDepts extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static FullSyncRequestStaffInfosDepts build(java.util.Map<String, ?> map) throws Exception {
            FullSyncRequestStaffInfosDepts self = new FullSyncRequestStaffInfosDepts();
            return TeaModel.build(map, self);
        }

        public FullSyncRequestStaffInfosDepts setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public FullSyncRequestStaffInfosDepts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class FullSyncRequestStaffInfosRoles extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static FullSyncRequestStaffInfosRoles build(java.util.Map<String, ?> map) throws Exception {
            FullSyncRequestStaffInfosRoles self = new FullSyncRequestStaffInfosRoles();
            return TeaModel.build(map, self);
        }

        public FullSyncRequestStaffInfosRoles setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public FullSyncRequestStaffInfosRoles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class FullSyncRequestStaffInfos extends TeaModel {
        @NameInMap("Depts")
        public java.util.List<FullSyncRequestStaffInfosDepts> depts;

        @NameInMap("Email")
        public String email;

        @NameInMap("Ext")
        public String ext;

        @NameInMap("IsDeptAdmin")
        public Long isDeptAdmin;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Name")
        public String name;

        @NameInMap("Nick")
        public String nick;

        @NameInMap("Position")
        public String position;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Roles")
        public java.util.List<FullSyncRequestStaffInfosRoles> roles;

        @NameInMap("Status")
        public Long status;

        @NameInMap("Tel")
        public String tel;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("WorkPlace")
        public String workPlace;

        public static FullSyncRequestStaffInfos build(java.util.Map<String, ?> map) throws Exception {
            FullSyncRequestStaffInfos self = new FullSyncRequestStaffInfos();
            return TeaModel.build(map, self);
        }

        public FullSyncRequestStaffInfos setDepts(java.util.List<FullSyncRequestStaffInfosDepts> depts) {
            this.depts = depts;
            return this;
        }
        public java.util.List<FullSyncRequestStaffInfosDepts> getDepts() {
            return this.depts;
        }

        public FullSyncRequestStaffInfos setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public FullSyncRequestStaffInfos setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public FullSyncRequestStaffInfos setIsDeptAdmin(Long isDeptAdmin) {
            this.isDeptAdmin = isDeptAdmin;
            return this;
        }
        public Long getIsDeptAdmin() {
            return this.isDeptAdmin;
        }

        public FullSyncRequestStaffInfos setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public FullSyncRequestStaffInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FullSyncRequestStaffInfos setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public FullSyncRequestStaffInfos setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public FullSyncRequestStaffInfos setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public FullSyncRequestStaffInfos setRoles(java.util.List<FullSyncRequestStaffInfosRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<FullSyncRequestStaffInfosRoles> getRoles() {
            return this.roles;
        }

        public FullSyncRequestStaffInfos setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public FullSyncRequestStaffInfos setTel(String tel) {
            this.tel = tel;
            return this;
        }
        public String getTel() {
            return this.tel;
        }

        public FullSyncRequestStaffInfos setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public FullSyncRequestStaffInfos setWorkPlace(String workPlace) {
            this.workPlace = workPlace;
            return this;
        }
        public String getWorkPlace() {
            return this.workPlace;
        }

    }

}
