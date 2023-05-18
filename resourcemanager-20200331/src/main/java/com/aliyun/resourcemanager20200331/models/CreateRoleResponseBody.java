// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateRoleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the RAM role.</p>
     */
    @NameInMap("Role")
    public CreateRoleResponseBodyRole role;

    public static CreateRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRoleResponseBody self = new CreateRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRoleResponseBody setRole(CreateRoleResponseBodyRole role) {
        this.role = role;
        return this;
    }
    public CreateRoleResponseBodyRole getRole() {
        return this.role;
    }

    public static class CreateRoleResponseBodyRole extends TeaModel {
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

        public static CreateRoleResponseBodyRole build(java.util.Map<String, ?> map) throws Exception {
            CreateRoleResponseBodyRole self = new CreateRoleResponseBodyRole();
            return TeaModel.build(map, self);
        }

        public CreateRoleResponseBodyRole setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public CreateRoleResponseBodyRole setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
            this.assumeRolePolicyDocument = assumeRolePolicyDocument;
            return this;
        }
        public String getAssumeRolePolicyDocument() {
            return this.assumeRolePolicyDocument;
        }

        public CreateRoleResponseBodyRole setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateRoleResponseBodyRole setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateRoleResponseBodyRole setMaxSessionDuration(Long maxSessionDuration) {
            this.maxSessionDuration = maxSessionDuration;
            return this;
        }
        public Long getMaxSessionDuration() {
            return this.maxSessionDuration;
        }

        public CreateRoleResponseBodyRole setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public CreateRoleResponseBodyRole setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public CreateRoleResponseBodyRole setRolePrincipalName(String rolePrincipalName) {
            this.rolePrincipalName = rolePrincipalName;
            return this;
        }
        public String getRolePrincipalName() {
            return this.rolePrincipalName;
        }

    }

}
