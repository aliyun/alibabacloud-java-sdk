// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateRoleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Role")
    @Validation(required = true)
    public UpdateRoleResponseRole role;

    public static UpdateRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoleResponse self = new UpdateRoleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRoleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRoleResponse setRole(UpdateRoleResponseRole role) {
        this.role = role;
        return this;
    }
    public UpdateRoleResponseRole getRole() {
        return this.role;
    }

    public static class UpdateRoleResponseRole extends TeaModel {
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

        public static UpdateRoleResponseRole build(java.util.Map<String, ?> map) throws Exception {
            UpdateRoleResponseRole self = new UpdateRoleResponseRole();
            return TeaModel.build(map, self);
        }

        public UpdateRoleResponseRole setMaxSessionDuration(Long maxSessionDuration) {
            this.maxSessionDuration = maxSessionDuration;
            return this;
        }
        public Long getMaxSessionDuration() {
            return this.maxSessionDuration;
        }

        public UpdateRoleResponseRole setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public UpdateRoleResponseRole setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public UpdateRoleResponseRole setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateRoleResponseRole setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
            this.assumeRolePolicyDocument = assumeRolePolicyDocument;
            return this;
        }
        public String getAssumeRolePolicyDocument() {
            return this.assumeRolePolicyDocument;
        }

        public UpdateRoleResponseRole setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public UpdateRoleResponseRole setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public UpdateRoleResponseRole setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public UpdateRoleResponseRole setRolePrincipalName(String rolePrincipalName) {
            this.rolePrincipalName = rolePrincipalName;
            return this;
        }
        public String getRolePrincipalName() {
            return this.rolePrincipalName;
        }

    }

}
