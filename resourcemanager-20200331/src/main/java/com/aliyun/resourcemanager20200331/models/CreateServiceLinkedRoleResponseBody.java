// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE58D7CF-03BC-432A-B42D-BC3390C8C2E1</p>
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
         * 
         * <strong>example:</strong>
         * <p>acs:ram::177242285274****:role/aliyunserviceroleforpolardb</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The document of the trust policy for the role.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Statement\&quot;:[{\&quot;Action\&quot;:\&quot;sts:AssumeRole\&quot;,\&quot;Effect\&quot;:\&quot;Allow\&quot;,\&quot;Principal\&quot;:{\&quot;Service\&quot;:[\&quot;polardb.aliyuncs.com\&quot;]}}],\&quot;Version\&quot;:\&quot;1\&quot;}</p>
         */
        @NameInMap("AssumeRolePolicyDocument")
        public String assumeRolePolicyDocument;

        /**
         * <p>The time when the role was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-30T08:14:16Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The description of the role.</p>
         * 
         * <strong>example:</strong>
         * <p>Service Linked Role for PolarDB. PolarDB will use this role to access your resources in other services.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the role is a service-linked role. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsServiceLinkedRole")
        public Boolean isServiceLinkedRole;

        /**
         * <p>The ID of the role.</p>
         * 
         * <strong>example:</strong>
         * <p>32833240981067****</p>
         */
        @NameInMap("RoleId")
        public String roleId;

        /**
         * <p>The name of the role.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunServiceRoleForPolarDB</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <p>The role name that uses a domain name as the suffix.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:AliyunServiceRoleForPolarDB@role.test.onaliyunservice.com">AliyunServiceRoleForPolarDB@role.test.onaliyunservice.com</a></p>
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
