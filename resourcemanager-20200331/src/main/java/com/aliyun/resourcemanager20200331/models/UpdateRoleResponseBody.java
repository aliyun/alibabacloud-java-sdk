// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Arn")
        public String arn;

        @NameInMap("AssumeRolePolicyDocument")
        public String assumeRolePolicyDocument;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("MaxSessionDuration")
        public Long maxSessionDuration;

        @NameInMap("RoleId")
        public String roleId;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("RolePrincipalName")
        public String rolePrincipalName;

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

        public UpdateRoleResponseBodyRole setRolePrincipalName(String rolePrincipalName) {
            this.rolePrincipalName = rolePrincipalName;
            return this;
        }
        public String getRolePrincipalName() {
            return this.rolePrincipalName;
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
