// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Role")
    @Validation(required = true)
    public CreateServiceLinkedRoleResponseRole role;

    public static CreateServiceLinkedRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceLinkedRoleResponse self = new CreateServiceLinkedRoleResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceLinkedRoleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceLinkedRoleResponse setRole(CreateServiceLinkedRoleResponseRole role) {
        this.role = role;
        return this;
    }
    public CreateServiceLinkedRoleResponseRole getRole() {
        return this.role;
    }

    public static class CreateServiceLinkedRoleResponseRole extends TeaModel {
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

        public static CreateServiceLinkedRoleResponseRole build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceLinkedRoleResponseRole self = new CreateServiceLinkedRoleResponseRole();
            return TeaModel.build(map, self);
        }

        public CreateServiceLinkedRoleResponseRole setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public CreateServiceLinkedRoleResponseRole setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateServiceLinkedRoleResponseRole setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
            this.assumeRolePolicyDocument = assumeRolePolicyDocument;
            return this;
        }
        public String getAssumeRolePolicyDocument() {
            return this.assumeRolePolicyDocument;
        }

        public CreateServiceLinkedRoleResponseRole setIsServiceLinkedRole(Boolean isServiceLinkedRole) {
            this.isServiceLinkedRole = isServiceLinkedRole;
            return this;
        }
        public Boolean getIsServiceLinkedRole() {
            return this.isServiceLinkedRole;
        }

        public CreateServiceLinkedRoleResponseRole setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public CreateServiceLinkedRoleResponseRole setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public CreateServiceLinkedRoleResponseRole setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateServiceLinkedRoleResponseRole setRolePrincipalName(String rolePrincipalName) {
            this.rolePrincipalName = rolePrincipalName;
            return this;
        }
        public String getRolePrincipalName() {
            return this.rolePrincipalName;
        }

    }

}
