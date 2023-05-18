// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetRoleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the RAM role.</p>
     */
    @NameInMap("Role")
    public GetRoleResponseBodyRole role;

    public static GetRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRoleResponseBody self = new GetRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRoleResponseBody setRole(GetRoleResponseBodyRole role) {
        this.role = role;
        return this;
    }
    public GetRoleResponseBodyRole getRole() {
        return this.role;
    }

    public static class GetRoleResponseBodyRoleLatestDeletionTask extends TeaModel {
        /**
         * <p>The time when the deletion task was created.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The ID of the deletion task.</p>
         */
        @NameInMap("DeletionTaskId")
        public String deletionTaskId;

        public static GetRoleResponseBodyRoleLatestDeletionTask build(java.util.Map<String, ?> map) throws Exception {
            GetRoleResponseBodyRoleLatestDeletionTask self = new GetRoleResponseBodyRoleLatestDeletionTask();
            return TeaModel.build(map, self);
        }

        public GetRoleResponseBodyRoleLatestDeletionTask setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetRoleResponseBodyRoleLatestDeletionTask setDeletionTaskId(String deletionTaskId) {
            this.deletionTaskId = deletionTaskId;
            return this;
        }
        public String getDeletionTaskId() {
            return this.deletionTaskId;
        }

    }

    public static class GetRoleResponseBodyRole extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role.</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The document of the policy that specifies the trusted entity to assume the RAM role.</p>
         */
        @NameInMap("AssumeRolePolicyDocument")
        public String assumeRolePolicyDocument;

        /**
         * <p>The time when the RAM role was created.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The description of the RAM role.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the RAM role is a service linked role.</p>
         */
        @NameInMap("IsServiceLinkedRole")
        public Boolean isServiceLinkedRole;

        /**
         * <p>The information of the most recent deletion task.</p>
         */
        @NameInMap("LatestDeletionTask")
        public GetRoleResponseBodyRoleLatestDeletionTask latestDeletionTask;

        /**
         * <p>The maximum session duration of the RAM role.</p>
         */
        @NameInMap("MaxSessionDuration")
        public Long maxSessionDuration;

        /**
         * <p>The ID of the RAM role.</p>
         */
        @NameInMap("RoleId")
        public String roleId;

        /**
         * <p>The name of the RAM role.</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <p>The name of the RAM role after authorization.</p>
         */
        @NameInMap("RolePrincipalName")
        public String rolePrincipalName;

        /**
         * <p>The time when the RAM role was updated.</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static GetRoleResponseBodyRole build(java.util.Map<String, ?> map) throws Exception {
            GetRoleResponseBodyRole self = new GetRoleResponseBodyRole();
            return TeaModel.build(map, self);
        }

        public GetRoleResponseBodyRole setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public GetRoleResponseBodyRole setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
            this.assumeRolePolicyDocument = assumeRolePolicyDocument;
            return this;
        }
        public String getAssumeRolePolicyDocument() {
            return this.assumeRolePolicyDocument;
        }

        public GetRoleResponseBodyRole setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetRoleResponseBodyRole setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRoleResponseBodyRole setIsServiceLinkedRole(Boolean isServiceLinkedRole) {
            this.isServiceLinkedRole = isServiceLinkedRole;
            return this;
        }
        public Boolean getIsServiceLinkedRole() {
            return this.isServiceLinkedRole;
        }

        public GetRoleResponseBodyRole setLatestDeletionTask(GetRoleResponseBodyRoleLatestDeletionTask latestDeletionTask) {
            this.latestDeletionTask = latestDeletionTask;
            return this;
        }
        public GetRoleResponseBodyRoleLatestDeletionTask getLatestDeletionTask() {
            return this.latestDeletionTask;
        }

        public GetRoleResponseBodyRole setMaxSessionDuration(Long maxSessionDuration) {
            this.maxSessionDuration = maxSessionDuration;
            return this;
        }
        public Long getMaxSessionDuration() {
            return this.maxSessionDuration;
        }

        public GetRoleResponseBodyRole setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public GetRoleResponseBodyRole setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
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

    }

}
