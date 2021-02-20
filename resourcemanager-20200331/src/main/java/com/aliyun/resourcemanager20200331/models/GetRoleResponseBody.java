// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetRoleResponseBody extends TeaModel {
    @NameInMap("Role")
    public GetRoleResponseBodyRole role;

    @NameInMap("RequestId")
    public String requestId;

    public static GetRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRoleResponseBody self = new GetRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRoleResponseBody setRole(GetRoleResponseBodyRole role) {
        this.role = role;
        return this;
    }
    public GetRoleResponseBodyRole getRole() {
        return this.role;
    }

    public GetRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRoleResponseBodyRoleLatestDeletionTask extends TeaModel {
        @NameInMap("DeletionTaskId")
        public String deletionTaskId;

        @NameInMap("CreateDate")
        public String createDate;

        public static GetRoleResponseBodyRoleLatestDeletionTask build(java.util.Map<String, ?> map) throws Exception {
            GetRoleResponseBodyRoleLatestDeletionTask self = new GetRoleResponseBodyRoleLatestDeletionTask();
            return TeaModel.build(map, self);
        }

        public GetRoleResponseBodyRoleLatestDeletionTask setDeletionTaskId(String deletionTaskId) {
            this.deletionTaskId = deletionTaskId;
            return this;
        }
        public String getDeletionTaskId() {
            return this.deletionTaskId;
        }

        public GetRoleResponseBodyRoleLatestDeletionTask setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

    }

    public static class GetRoleResponseBodyRole extends TeaModel {
        @NameInMap("AssumeRolePolicyDocument")
        public String assumeRolePolicyDocument;

        @NameInMap("RolePrincipalName")
        public String rolePrincipalName;

        @NameInMap("UpdateDate")
        public String updateDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("MaxSessionDuration")
        public Long maxSessionDuration;

        @NameInMap("LatestDeletionTask")
        public GetRoleResponseBodyRoleLatestDeletionTask latestDeletionTask;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("RoleId")
        public String roleId;

        @NameInMap("Arn")
        public String arn;

        @NameInMap("IsServiceLinkedRole")
        public Boolean isServiceLinkedRole;

        public static GetRoleResponseBodyRole build(java.util.Map<String, ?> map) throws Exception {
            GetRoleResponseBodyRole self = new GetRoleResponseBodyRole();
            return TeaModel.build(map, self);
        }

        public GetRoleResponseBodyRole setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
            this.assumeRolePolicyDocument = assumeRolePolicyDocument;
            return this;
        }
        public String getAssumeRolePolicyDocument() {
            return this.assumeRolePolicyDocument;
        }

        public GetRoleResponseBodyRole setRolePrincipalName(String rolePrincipalName) {
            this.rolePrincipalName = rolePrincipalName;
            return this;
        }
        public String getRolePrincipalName() {
            return this.rolePrincipalName;
        }

        public GetRoleResponseBodyRole setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public GetRoleResponseBodyRole setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRoleResponseBodyRole setMaxSessionDuration(Long maxSessionDuration) {
            this.maxSessionDuration = maxSessionDuration;
            return this;
        }
        public Long getMaxSessionDuration() {
            return this.maxSessionDuration;
        }

        public GetRoleResponseBodyRole setLatestDeletionTask(GetRoleResponseBodyRoleLatestDeletionTask latestDeletionTask) {
            this.latestDeletionTask = latestDeletionTask;
            return this;
        }
        public GetRoleResponseBodyRoleLatestDeletionTask getLatestDeletionTask() {
            return this.latestDeletionTask;
        }

        public GetRoleResponseBodyRole setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public GetRoleResponseBodyRole setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetRoleResponseBodyRole setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public GetRoleResponseBodyRole setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public GetRoleResponseBodyRole setIsServiceLinkedRole(Boolean isServiceLinkedRole) {
            this.isServiceLinkedRole = isServiceLinkedRole;
            return this;
        }
        public Boolean getIsServiceLinkedRole() {
            return this.isServiceLinkedRole;
        }

    }

}
