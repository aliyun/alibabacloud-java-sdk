// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class IncrementSyncRequest extends TeaModel {
    @NameInMap("DepartmentInfos")
    public java.util.List<IncrementSyncRequestDepartmentInfos> departmentInfos;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("Ids")
    public java.util.List<String> ids;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("RoleInfos")
    public java.util.List<IncrementSyncRequestRoleInfos> roleInfos;

    @NameInMap("StaffInfos")
    public java.util.List<IncrementSyncRequestStaffInfos> staffInfos;

    public static IncrementSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        IncrementSyncRequest self = new IncrementSyncRequest();
        return TeaModel.build(map, self);
    }

    public IncrementSyncRequest setDepartmentInfos(java.util.List<IncrementSyncRequestDepartmentInfos> departmentInfos) {
        this.departmentInfos = departmentInfos;
        return this;
    }
    public java.util.List<IncrementSyncRequestDepartmentInfos> getDepartmentInfos() {
        return this.departmentInfos;
    }

    public IncrementSyncRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public IncrementSyncRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

    public IncrementSyncRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public IncrementSyncRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public IncrementSyncRequest setRoleInfos(java.util.List<IncrementSyncRequestRoleInfos> roleInfos) {
        this.roleInfos = roleInfos;
        return this;
    }
    public java.util.List<IncrementSyncRequestRoleInfos> getRoleInfos() {
        return this.roleInfos;
    }

    public IncrementSyncRequest setStaffInfos(java.util.List<IncrementSyncRequestStaffInfos> staffInfos) {
        this.staffInfos = staffInfos;
        return this;
    }
    public java.util.List<IncrementSyncRequestStaffInfos> getStaffInfos() {
        return this.staffInfos;
    }

    public static class IncrementSyncRequestDepartmentInfos extends TeaModel {
        @NameInMap("DeptCode")
        public String deptCode;

        @NameInMap("DeptHiding")
        public String deptHiding;

        @NameInMap("DeptName")
        public String deptName;

        @NameInMap("DeptOrder")
        public String deptOrder;

        @NameInMap("DeptType")
        public String deptType;

        @NameInMap("IsDelete")
        public String isDelete;

        @NameInMap("ParentCode")
        public String parentCode;

        @NameInMap("ext")
        public String ext;

        public static IncrementSyncRequestDepartmentInfos build(java.util.Map<String, ?> map) throws Exception {
            IncrementSyncRequestDepartmentInfos self = new IncrementSyncRequestDepartmentInfos();
            return TeaModel.build(map, self);
        }

        public IncrementSyncRequestDepartmentInfos setDeptCode(String deptCode) {
            this.deptCode = deptCode;
            return this;
        }
        public String getDeptCode() {
            return this.deptCode;
        }

        public IncrementSyncRequestDepartmentInfos setDeptHiding(String deptHiding) {
            this.deptHiding = deptHiding;
            return this;
        }
        public String getDeptHiding() {
            return this.deptHiding;
        }

        public IncrementSyncRequestDepartmentInfos setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }
        public String getDeptName() {
            return this.deptName;
        }

        public IncrementSyncRequestDepartmentInfos setDeptOrder(String deptOrder) {
            this.deptOrder = deptOrder;
            return this;
        }
        public String getDeptOrder() {
            return this.deptOrder;
        }

        public IncrementSyncRequestDepartmentInfos setDeptType(String deptType) {
            this.deptType = deptType;
            return this;
        }
        public String getDeptType() {
            return this.deptType;
        }

        public IncrementSyncRequestDepartmentInfos setIsDelete(String isDelete) {
            this.isDelete = isDelete;
            return this;
        }
        public String getIsDelete() {
            return this.isDelete;
        }

        public IncrementSyncRequestDepartmentInfos setParentCode(String parentCode) {
            this.parentCode = parentCode;
            return this;
        }
        public String getParentCode() {
            return this.parentCode;
        }

        public IncrementSyncRequestDepartmentInfos setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

    }

    public static class IncrementSyncRequestRoleInfos extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("IsDelete")
        public String isDelete;

        @NameInMap("RoleDesc")
        public String roleDesc;

        @NameInMap("RoleId")
        public String roleId;

        @NameInMap("RoleName")
        public String roleName;

        public static IncrementSyncRequestRoleInfos build(java.util.Map<String, ?> map) throws Exception {
            IncrementSyncRequestRoleInfos self = new IncrementSyncRequestRoleInfos();
            return TeaModel.build(map, self);
        }

        public IncrementSyncRequestRoleInfos setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public IncrementSyncRequestRoleInfos setIsDelete(String isDelete) {
            this.isDelete = isDelete;
            return this;
        }
        public String getIsDelete() {
            return this.isDelete;
        }

        public IncrementSyncRequestRoleInfos setRoleDesc(String roleDesc) {
            this.roleDesc = roleDesc;
            return this;
        }
        public String getRoleDesc() {
            return this.roleDesc;
        }

        public IncrementSyncRequestRoleInfos setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public IncrementSyncRequestRoleInfos setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

    public static class IncrementSyncRequestStaffInfosDepts extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static IncrementSyncRequestStaffInfosDepts build(java.util.Map<String, ?> map) throws Exception {
            IncrementSyncRequestStaffInfosDepts self = new IncrementSyncRequestStaffInfosDepts();
            return TeaModel.build(map, self);
        }

        public IncrementSyncRequestStaffInfosDepts setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public IncrementSyncRequestStaffInfosDepts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class IncrementSyncRequestStaffInfosRoles extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static IncrementSyncRequestStaffInfosRoles build(java.util.Map<String, ?> map) throws Exception {
            IncrementSyncRequestStaffInfosRoles self = new IncrementSyncRequestStaffInfosRoles();
            return TeaModel.build(map, self);
        }

        public IncrementSyncRequestStaffInfosRoles setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public IncrementSyncRequestStaffInfosRoles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class IncrementSyncRequestStaffInfos extends TeaModel {
        @NameInMap("Depts")
        public java.util.List<IncrementSyncRequestStaffInfosDepts> depts;

        @NameInMap("Email")
        public String email;

        @NameInMap("Ext")
        public String ext;

        @NameInMap("IsDelete")
        public Long isDelete;

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
        public java.util.List<IncrementSyncRequestStaffInfosRoles> roles;

        @NameInMap("Status")
        public Long status;

        @NameInMap("Tel")
        public String tel;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("WorkPlace")
        public String workPlace;

        public static IncrementSyncRequestStaffInfos build(java.util.Map<String, ?> map) throws Exception {
            IncrementSyncRequestStaffInfos self = new IncrementSyncRequestStaffInfos();
            return TeaModel.build(map, self);
        }

        public IncrementSyncRequestStaffInfos setDepts(java.util.List<IncrementSyncRequestStaffInfosDepts> depts) {
            this.depts = depts;
            return this;
        }
        public java.util.List<IncrementSyncRequestStaffInfosDepts> getDepts() {
            return this.depts;
        }

        public IncrementSyncRequestStaffInfos setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public IncrementSyncRequestStaffInfos setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public IncrementSyncRequestStaffInfos setIsDelete(Long isDelete) {
            this.isDelete = isDelete;
            return this;
        }
        public Long getIsDelete() {
            return this.isDelete;
        }

        public IncrementSyncRequestStaffInfos setIsDeptAdmin(Long isDeptAdmin) {
            this.isDeptAdmin = isDeptAdmin;
            return this;
        }
        public Long getIsDeptAdmin() {
            return this.isDeptAdmin;
        }

        public IncrementSyncRequestStaffInfos setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public IncrementSyncRequestStaffInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public IncrementSyncRequestStaffInfos setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public IncrementSyncRequestStaffInfos setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public IncrementSyncRequestStaffInfos setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public IncrementSyncRequestStaffInfos setRoles(java.util.List<IncrementSyncRequestStaffInfosRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<IncrementSyncRequestStaffInfosRoles> getRoles() {
            return this.roles;
        }

        public IncrementSyncRequestStaffInfos setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public IncrementSyncRequestStaffInfos setTel(String tel) {
            this.tel = tel;
            return this;
        }
        public String getTel() {
            return this.tel;
        }

        public IncrementSyncRequestStaffInfos setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public IncrementSyncRequestStaffInfos setWorkPlace(String workPlace) {
            this.workPlace = workPlace;
            return this;
        }
        public String getWorkPlace() {
            return this.workPlace;
        }

    }

}
