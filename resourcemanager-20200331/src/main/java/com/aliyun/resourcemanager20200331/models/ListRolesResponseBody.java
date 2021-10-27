// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListRolesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Roles")
    public ListRolesResponseBodyRoles roles;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRolesResponseBody self = new ListRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRolesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRolesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRolesResponseBody setRoles(ListRolesResponseBodyRoles roles) {
        this.roles = roles;
        return this;
    }
    public ListRolesResponseBodyRoles getRoles() {
        return this.roles;
    }

    public ListRolesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListRolesResponseBodyRolesRoleLatestDeletionTask extends TeaModel {
        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("DeletionTaskId")
        public String deletionTaskId;

        public static ListRolesResponseBodyRolesRoleLatestDeletionTask build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseBodyRolesRoleLatestDeletionTask self = new ListRolesResponseBodyRolesRoleLatestDeletionTask();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseBodyRolesRoleLatestDeletionTask setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListRolesResponseBodyRolesRoleLatestDeletionTask setDeletionTaskId(String deletionTaskId) {
            this.deletionTaskId = deletionTaskId;
            return this;
        }
        public String getDeletionTaskId() {
            return this.deletionTaskId;
        }

    }

    public static class ListRolesResponseBodyRolesRole extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("IsServiceLinkedRole")
        public Boolean isServiceLinkedRole;

        @NameInMap("LatestDeletionTask")
        public ListRolesResponseBodyRolesRoleLatestDeletionTask latestDeletionTask;

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

        public static ListRolesResponseBodyRolesRole build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseBodyRolesRole self = new ListRolesResponseBodyRolesRole();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseBodyRolesRole setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public ListRolesResponseBodyRolesRole setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListRolesResponseBodyRolesRole setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRolesResponseBodyRolesRole setIsServiceLinkedRole(Boolean isServiceLinkedRole) {
            this.isServiceLinkedRole = isServiceLinkedRole;
            return this;
        }
        public Boolean getIsServiceLinkedRole() {
            return this.isServiceLinkedRole;
        }

        public ListRolesResponseBodyRolesRole setLatestDeletionTask(ListRolesResponseBodyRolesRoleLatestDeletionTask latestDeletionTask) {
            this.latestDeletionTask = latestDeletionTask;
            return this;
        }
        public ListRolesResponseBodyRolesRoleLatestDeletionTask getLatestDeletionTask() {
            return this.latestDeletionTask;
        }

        public ListRolesResponseBodyRolesRole setMaxSessionDuration(Long maxSessionDuration) {
            this.maxSessionDuration = maxSessionDuration;
            return this;
        }
        public Long getMaxSessionDuration() {
            return this.maxSessionDuration;
        }

        public ListRolesResponseBodyRolesRole setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public ListRolesResponseBodyRolesRole setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListRolesResponseBodyRolesRole setRolePrincipalName(String rolePrincipalName) {
            this.rolePrincipalName = rolePrincipalName;
            return this;
        }
        public String getRolePrincipalName() {
            return this.rolePrincipalName;
        }

        public ListRolesResponseBodyRolesRole setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
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
