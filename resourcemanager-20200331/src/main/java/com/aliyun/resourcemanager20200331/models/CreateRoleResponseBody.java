// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateRoleResponseBody extends TeaModel {
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
         * <p>The Alibaba Cloud Resource Name (ARN) of the role.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:role/ECSAdmin</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The document of the policy in which the entity that can assume the role is specified.</p>
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
