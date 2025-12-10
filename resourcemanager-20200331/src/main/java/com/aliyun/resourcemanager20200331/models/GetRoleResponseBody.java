// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetRoleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the role.</p>
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
         * 
         * <strong>example:</strong>
         * <p>2018-10-23T12:33:18Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The ID of the deletion task.</p>
         * 
         * <strong>example:</strong>
         * <p>ECSAdmin/cc61514b-26eb-4453-ab53-b142eb702a3d</p>
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
         * <p>The Alibaba Cloud Resource Name (ARN) of the role.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:role/ECSAdmin</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The document of the policy in which the identity that can assume the role is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>{ \&quot;Statement\&quot;: [ { \&quot;Action\&quot;: \&quot;sts:AssumeRole\&quot;, \&quot;Effect\&quot;: \&quot;Allow\&quot;, \&quot;Principal\&quot;: { \&quot;RAM\&quot;: \&quot;acs:ram::12345678901234****:root\&quot; } } ], \&quot;Version\&quot;: \&quot;1\&quot; }</p>
         */
        @NameInMap("AssumeRolePolicyDocument")
        public String assumeRolePolicyDocument;

        /**
         * <p>The time when the role was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-01-23T12:33:18Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The description of the role.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS administrator</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the role is a service-linked role.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsServiceLinkedRole")
        public Boolean isServiceLinkedRole;

        /**
         * <p>The information of the most recent deletion task.</p>
         */
        @NameInMap("LatestDeletionTask")
        public GetRoleResponseBodyRoleLatestDeletionTask latestDeletionTask;

        /**
         * <p>The maximum session duration of the role.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("MaxSessionDuration")
        public Long maxSessionDuration;

        /**
         * <p>The ID of the role.</p>
         * 
         * <strong>example:</strong>
         * <p>90123456789****</p>
         */
        @NameInMap("RoleId")
        public String roleId;

        /**
         * <p>The name of the role.</p>
         * 
         * <strong>example:</strong>
         * <p>ECSAdmin</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <p>The name of the role after authorization.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:ECSAdmin@role.123456.onaliyunservice.com">ECSAdmin@role.123456.onaliyunservice.com</a></p>
         */
        @NameInMap("RolePrincipalName")
        public String rolePrincipalName;

        /**
         * <p>The time when the role was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-01-23T12:33:18Z</p>
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
