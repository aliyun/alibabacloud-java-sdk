// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the role.</p>
     */
    @NameInMap("Role")
    public CreateServiceLinkedRoleResponseBodyRole role;

    public static CreateServiceLinkedRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceLinkedRoleResponseBody self = new CreateServiceLinkedRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceLinkedRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceLinkedRoleResponseBody setRole(CreateServiceLinkedRoleResponseBodyRole role) {
        this.role = role;
        return this;
    }
    public CreateServiceLinkedRoleResponseBodyRole getRole() {
        return this.role;
    }

    public static class CreateServiceLinkedRoleResponseBodyRole extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the role.</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The document of the trust policy for the role.</p>
         */
        @NameInMap("AssumeRolePolicyDocument")
        public String assumeRolePolicyDocument;

        /**
         * <p>The time when the role was created. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The description of the role.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the role is a service-linked role. Valid values:</p>
         * <br>
         * <p>*   true: The role is a service-linked role.</p>
         * <p>*   false: The role is not a service-linked role.</p>
         */
        @NameInMap("IsServiceLinkedRole")
        public Boolean isServiceLinkedRole;

        /**
         * <p>The ID of the role.</p>
         */
        @NameInMap("RoleId")
        public String roleId;

        /**
         * <p>The name of the role.</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <p>The role name that uses a domain name as the suffix.</p>
         */
        @NameInMap("RolePrincipalName")
        public String rolePrincipalName;

        public static CreateServiceLinkedRoleResponseBodyRole build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceLinkedRoleResponseBodyRole self = new CreateServiceLinkedRoleResponseBodyRole();
            return TeaModel.build(map, self);
        }

        public CreateServiceLinkedRoleResponseBodyRole setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public CreateServiceLinkedRoleResponseBodyRole setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
            this.assumeRolePolicyDocument = assumeRolePolicyDocument;
            return this;
        }
        public String getAssumeRolePolicyDocument() {
            return this.assumeRolePolicyDocument;
        }

        public CreateServiceLinkedRoleResponseBodyRole setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateServiceLinkedRoleResponseBodyRole setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateServiceLinkedRoleResponseBodyRole setIsServiceLinkedRole(Boolean isServiceLinkedRole) {
            this.isServiceLinkedRole = isServiceLinkedRole;
            return this;
        }
        public Boolean getIsServiceLinkedRole() {
            return this.isServiceLinkedRole;
        }

        public CreateServiceLinkedRoleResponseBodyRole setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public CreateServiceLinkedRoleResponseBodyRole setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public CreateServiceLinkedRoleResponseBodyRole setRolePrincipalName(String rolePrincipalName) {
            this.rolePrincipalName = rolePrincipalName;
            return this;
        }
        public String getRolePrincipalName() {
            return this.rolePrincipalName;
        }

    }

}
