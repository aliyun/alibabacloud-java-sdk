// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class ListRolesForServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Roles")
    public ListRolesForServiceResponseBodyRoles roles;

    public static ListRolesForServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRolesForServiceResponseBody self = new ListRolesForServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRolesForServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRolesForServiceResponseBody setRoles(ListRolesForServiceResponseBodyRoles roles) {
        this.roles = roles;
        return this;
    }
    public ListRolesForServiceResponseBodyRoles getRoles() {
        return this.roles;
    }

    public static class ListRolesForServiceResponseBodyRolesRoleLatestDeletionTask extends TeaModel {
        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("DeletionTaskId")
        public String deletionTaskId;

        public static ListRolesForServiceResponseBodyRolesRoleLatestDeletionTask build(java.util.Map<String, ?> map) throws Exception {
            ListRolesForServiceResponseBodyRolesRoleLatestDeletionTask self = new ListRolesForServiceResponseBodyRolesRoleLatestDeletionTask();
            return TeaModel.build(map, self);
        }

        public ListRolesForServiceResponseBodyRolesRoleLatestDeletionTask setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListRolesForServiceResponseBodyRolesRoleLatestDeletionTask setDeletionTaskId(String deletionTaskId) {
            this.deletionTaskId = deletionTaskId;
            return this;
        }
        public String getDeletionTaskId() {
            return this.deletionTaskId;
        }

    }

    public static class ListRolesForServiceResponseBodyRolesRole extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("IsServiceLinkedRole")
        public Boolean isServiceLinkedRole;

        @NameInMap("LatestDeletionTask")
        public ListRolesForServiceResponseBodyRolesRoleLatestDeletionTask latestDeletionTask;

        @NameInMap("MaxSessionDuration")
        public Long maxSessionDuration;

        @NameInMap("RoleId")
        public String roleId;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("RolePrincipalName")
        public String rolePrincipalName;

        @NameInMap("UpdateDate")
        public String updateDate;

        public static ListRolesForServiceResponseBodyRolesRole build(java.util.Map<String, ?> map) throws Exception {
            ListRolesForServiceResponseBodyRolesRole self = new ListRolesForServiceResponseBodyRolesRole();
            return TeaModel.build(map, self);
        }

        public ListRolesForServiceResponseBodyRolesRole setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public ListRolesForServiceResponseBodyRolesRole setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListRolesForServiceResponseBodyRolesRole setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRolesForServiceResponseBodyRolesRole setIsServiceLinkedRole(Boolean isServiceLinkedRole) {
            this.isServiceLinkedRole = isServiceLinkedRole;
            return this;
        }
        public Boolean getIsServiceLinkedRole() {
            return this.isServiceLinkedRole;
        }

        public ListRolesForServiceResponseBodyRolesRole setLatestDeletionTask(ListRolesForServiceResponseBodyRolesRoleLatestDeletionTask latestDeletionTask) {
            this.latestDeletionTask = latestDeletionTask;
            return this;
        }
        public ListRolesForServiceResponseBodyRolesRoleLatestDeletionTask getLatestDeletionTask() {
            return this.latestDeletionTask;
        }

        public ListRolesForServiceResponseBodyRolesRole setMaxSessionDuration(Long maxSessionDuration) {
            this.maxSessionDuration = maxSessionDuration;
            return this;
        }
        public Long getMaxSessionDuration() {
            return this.maxSessionDuration;
        }

        public ListRolesForServiceResponseBodyRolesRole setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public ListRolesForServiceResponseBodyRolesRole setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListRolesForServiceResponseBodyRolesRole setRolePrincipalName(String rolePrincipalName) {
            this.rolePrincipalName = rolePrincipalName;
            return this;
        }
        public String getRolePrincipalName() {
            return this.rolePrincipalName;
        }

        public ListRolesForServiceResponseBodyRolesRole setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

    public static class ListRolesForServiceResponseBodyRoles extends TeaModel {
        @NameInMap("Role")
        public java.util.List<ListRolesForServiceResponseBodyRolesRole> role;

        public static ListRolesForServiceResponseBodyRoles build(java.util.Map<String, ?> map) throws Exception {
            ListRolesForServiceResponseBodyRoles self = new ListRolesForServiceResponseBodyRoles();
            return TeaModel.build(map, self);
        }

        public ListRolesForServiceResponseBodyRoles setRole(java.util.List<ListRolesForServiceResponseBodyRolesRole> role) {
            this.role = role;
            return this;
        }
        public java.util.List<ListRolesForServiceResponseBodyRolesRole> getRole() {
            return this.role;
        }

    }

}
