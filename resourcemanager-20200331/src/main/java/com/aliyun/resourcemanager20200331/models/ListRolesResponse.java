// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListRolesResponse extends TeaModel {
    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("Roles")
    @Validation(required = true)
    public ListRolesResponseRoles roles;

    public static ListRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRolesResponse self = new ListRolesResponse();
        return TeaModel.build(map, self);
    }

    public ListRolesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListRolesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRolesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRolesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRolesResponse setRoles(ListRolesResponseRoles roles) {
        this.roles = roles;
        return this;
    }
    public ListRolesResponseRoles getRoles() {
        return this.roles;
    }

    public static class ListRolesResponseRolesRoleLatestDeletionTask extends TeaModel {
        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("DeletionTaskId")
        @Validation(required = true)
        public String deletionTaskId;

        public static ListRolesResponseRolesRoleLatestDeletionTask build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseRolesRoleLatestDeletionTask self = new ListRolesResponseRolesRoleLatestDeletionTask();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseRolesRoleLatestDeletionTask setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListRolesResponseRolesRoleLatestDeletionTask setDeletionTaskId(String deletionTaskId) {
            this.deletionTaskId = deletionTaskId;
            return this;
        }
        public String getDeletionTaskId() {
            return this.deletionTaskId;
        }

    }

    public static class ListRolesResponseRolesRole extends TeaModel {
        @NameInMap("MaxSessionDuration")
        @Validation(required = true)
        public Long maxSessionDuration;

        @NameInMap("UpdateDate")
        @Validation(required = true)
        public String updateDate;

        @NameInMap("RoleName")
        @Validation(required = true)
        public String roleName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("IsServiceLinkedRole")
        @Validation(required = true)
        public Boolean isServiceLinkedRole;

        @NameInMap("Arn")
        @Validation(required = true)
        public String arn;

        @NameInMap("RoleId")
        @Validation(required = true)
        public String roleId;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("RolePrincipalName")
        @Validation(required = true)
        public String rolePrincipalName;

        @NameInMap("LatestDeletionTask")
        @Validation(required = true)
        public ListRolesResponseRolesRoleLatestDeletionTask latestDeletionTask;

        public static ListRolesResponseRolesRole build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseRolesRole self = new ListRolesResponseRolesRole();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseRolesRole setMaxSessionDuration(Long maxSessionDuration) {
            this.maxSessionDuration = maxSessionDuration;
            return this;
        }
        public Long getMaxSessionDuration() {
            return this.maxSessionDuration;
        }

        public ListRolesResponseRolesRole setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public ListRolesResponseRolesRole setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListRolesResponseRolesRole setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRolesResponseRolesRole setIsServiceLinkedRole(Boolean isServiceLinkedRole) {
            this.isServiceLinkedRole = isServiceLinkedRole;
            return this;
        }
        public Boolean getIsServiceLinkedRole() {
            return this.isServiceLinkedRole;
        }

        public ListRolesResponseRolesRole setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public ListRolesResponseRolesRole setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public ListRolesResponseRolesRole setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListRolesResponseRolesRole setRolePrincipalName(String rolePrincipalName) {
            this.rolePrincipalName = rolePrincipalName;
            return this;
        }
        public String getRolePrincipalName() {
            return this.rolePrincipalName;
        }

        public ListRolesResponseRolesRole setLatestDeletionTask(ListRolesResponseRolesRoleLatestDeletionTask latestDeletionTask) {
            this.latestDeletionTask = latestDeletionTask;
            return this;
        }
        public ListRolesResponseRolesRoleLatestDeletionTask getLatestDeletionTask() {
            return this.latestDeletionTask;
        }

    }

    public static class ListRolesResponseRoles extends TeaModel {
        @NameInMap("Role")
        @Validation(required = true)
        public java.util.List<ListRolesResponseRolesRole> role;

        public static ListRolesResponseRoles build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseRoles self = new ListRolesResponseRoles();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseRoles setRole(java.util.List<ListRolesResponseRolesRole> role) {
            this.role = role;
            return this;
        }
        public java.util.List<ListRolesResponseRolesRole> getRole() {
            return this.role;
        }

    }

}
