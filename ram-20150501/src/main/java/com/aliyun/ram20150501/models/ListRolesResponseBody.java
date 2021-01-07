// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListRolesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    @NameInMap("Roles")
    public ListRolesResponseBodyRoles roles;

    @NameInMap("Marker")
    public String marker;

    public static ListRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRolesResponseBody self = new ListRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRolesResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListRolesResponseBody setRoles(ListRolesResponseBodyRoles roles) {
        this.roles = roles;
        return this;
    }
    public ListRolesResponseBodyRoles getRoles() {
        return this.roles;
    }

    public ListRolesResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public static class ListRolesResponseBodyRolesRole extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("UpdateDate")
        public String updateDate;

        @NameInMap("MaxSessionDuration")
        public Long maxSessionDuration;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("RoleId")
        public String roleId;

        @NameInMap("Arn")
        public String arn;

        public static ListRolesResponseBodyRolesRole build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseBodyRolesRole self = new ListRolesResponseBodyRolesRole();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseBodyRolesRole setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRolesResponseBodyRolesRole setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public ListRolesResponseBodyRolesRole setMaxSessionDuration(Long maxSessionDuration) {
            this.maxSessionDuration = maxSessionDuration;
            return this;
        }
        public Long getMaxSessionDuration() {
            return this.maxSessionDuration;
        }

        public ListRolesResponseBodyRolesRole setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListRolesResponseBodyRolesRole setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListRolesResponseBodyRolesRole setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public ListRolesResponseBodyRolesRole setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

    }

    public static class ListRolesResponseBodyRoles extends TeaModel {
        @NameInMap("Role")
        public java.util.List<ListRolesResponseBodyRolesRole> role;

        public static ListRolesResponseBodyRoles build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseBodyRoles self = new ListRolesResponseBodyRoles();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseBodyRoles setRole(java.util.List<ListRolesResponseBodyRolesRole> role) {
            this.role = role;
            return this;
        }
        public java.util.List<ListRolesResponseBodyRolesRole> getRole() {
            return this.role;
        }

    }

}
