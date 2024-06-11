// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UpdateRoleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the RAM role.</p>
     */
    @NameInMap("Role")
    public UpdateRoleResponseBodyRole role;

    public static UpdateRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoleResponseBody self = new UpdateRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRoleResponseBody setRole(UpdateRoleResponseBodyRole role) {
        this.role = role;
        return this;
    }
    public UpdateRoleResponseBodyRole getRole() {
        return this.role;
    }

    public static class UpdateRoleResponseBodyRole extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the role.</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The policy that specifies the trusted entity to assume the RAM role.</p>
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
         * <p>The time when the description of the RAM role was changed.</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static UpdateRoleResponseBodyRole build(java.util.Map<String, ?> map) throws Exception {
            UpdateRoleResponseBodyRole self = new UpdateRoleResponseBodyRole();
            return TeaModel.build(map, self);
        }

        public UpdateRoleResponseBodyRole setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public UpdateRoleResponseBodyRole setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
            this.assumeRolePolicyDocument = assumeRolePolicyDocument;
            return this;
        }
        public String getAssumeRolePolicyDocument() {
            return this.assumeRolePolicyDocument;
        }

        public UpdateRoleResponseBodyRole setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public UpdateRoleResponseBodyRole setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateRoleResponseBodyRole setMaxSessionDuration(Long maxSessionDuration) {
            this.maxSessionDuration = maxSessionDuration;
            return this;
        }
        public Long getMaxSessionDuration() {
            return this.maxSessionDuration;
        }

        public UpdateRoleResponseBodyRole setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public UpdateRoleResponseBodyRole setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public UpdateRoleResponseBodyRole setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
