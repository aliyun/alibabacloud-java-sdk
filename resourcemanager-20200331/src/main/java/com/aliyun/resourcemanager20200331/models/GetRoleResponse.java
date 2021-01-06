// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetRoleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Role")
    @Validation(required = true)
    public GetRoleResponseRole role;

    public static GetRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRoleResponse self = new GetRoleResponse();
        return TeaModel.build(map, self);
    }

    public GetRoleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRoleResponse setRole(GetRoleResponseRole role) {
        this.role = role;
        return this;
    }
    public GetRoleResponseRole getRole() {
        return this.role;
    }

    public static class GetRoleResponseRoleLatestDeletionTask extends TeaModel {
        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("DeletionTaskId")
        @Validation(required = true)
        public String deletionTaskId;

        public static GetRoleResponseRoleLatestDeletionTask build(java.util.Map<String, ?> map) throws Exception {
            GetRoleResponseRoleLatestDeletionTask self = new GetRoleResponseRoleLatestDeletionTask();
            return TeaModel.build(map, self);
        }

        public GetRoleResponseRoleLatestDeletionTask setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetRoleResponseRoleLatestDeletionTask setDeletionTaskId(String deletionTaskId) {
            this.deletionTaskId = deletionTaskId;
            return this;
        }
        public String getDeletionTaskId() {
            return this.deletionTaskId;
        }

    }

    public static class GetRoleResponseRole extends TeaModel {
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

        @NameInMap("AssumeRolePolicyDocument")
        @Validation(required = true)
        public String assumeRolePolicyDocument;

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
        public GetRoleResponseRoleLatestDeletionTask latestDeletionTask;

        public static GetRoleResponseRole build(java.util.Map<String, ?> map) throws Exception {
            GetRoleResponseRole self = new GetRoleResponseRole();
            return TeaModel.build(map, self);
        }

        public GetRoleResponseRole setMaxSessionDuration(Long maxSessionDuration) {
            this.maxSessionDuration = maxSessionDuration;
            return this;
        }
        public Long getMaxSessionDuration() {
            return this.maxSessionDuration;
        }

        public GetRoleResponseRole setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public GetRoleResponseRole setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public GetRoleResponseRole setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRoleResponseRole setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
            this.assumeRolePolicyDocument = assumeRolePolicyDocument;
            return this;
        }
        public String getAssumeRolePolicyDocument() {
            return this.assumeRolePolicyDocument;
        }

        public GetRoleResponseRole setIsServiceLinkedRole(Boolean isServiceLinkedRole) {
            this.isServiceLinkedRole = isServiceLinkedRole;
            return this;
        }
        public Boolean getIsServiceLinkedRole() {
            return this.isServiceLinkedRole;
        }

        public GetRoleResponseRole setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public GetRoleResponseRole setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public GetRoleResponseRole setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetRoleResponseRole setRolePrincipalName(String rolePrincipalName) {
            this.rolePrincipalName = rolePrincipalName;
            return this;
        }
        public String getRolePrincipalName() {
            return this.rolePrincipalName;
        }

        public GetRoleResponseRole setLatestDeletionTask(GetRoleResponseRoleLatestDeletionTask latestDeletionTask) {
            this.latestDeletionTask = latestDeletionTask;
            return this;
        }
        public GetRoleResponseRoleLatestDeletionTask getLatestDeletionTask() {
            return this.latestDeletionTask;
        }

    }

}
