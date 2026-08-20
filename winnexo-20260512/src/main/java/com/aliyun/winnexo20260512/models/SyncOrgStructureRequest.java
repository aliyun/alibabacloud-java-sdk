// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SyncOrgStructureRequest extends TeaModel {
    /**
     * <p>The enterprise identifier. This value must match the corpId returned by listAvailableConfigs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleCorpId</p>
     */
    @NameInMap("corpId")
    public String corpId;

    /**
     * <p>The department list. At least one root department must be included.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("departments")
    public java.util.List<SyncOrgStructureRequestDepartments> departments;

    /**
     * <p>The member list. This parameter is required when syncMembers is set to true.</p>
     */
    @NameInMap("members")
    public java.util.List<SyncOrgStructureRequestMembers> members;

    /**
     * <p>The platform type. Valid values: saml, oauth2, or custom.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>saml</p>
     */
    @NameInMap("platformType")
    public String platformType;

    /**
     * <p>The SSO configuration ID. For SAML/OAuth2, this parameter is optional. If not specified, the value is automatically derived based on corpId. If multiple IdPs use the same corpId, you must explicitly specify this parameter. Otherwise, an AMBIGUOUS error is returned. This parameter is not required for custom.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSsoSettingsId</p>
     */
    @NameInMap("ssoSettingsId")
    public String ssoSettingsId;

    /**
     * <p>Specifies whether to synchronize member relationships. In custom mode, this parameter is forced to false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("syncMembers")
    public Boolean syncMembers;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static SyncOrgStructureRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncOrgStructureRequest self = new SyncOrgStructureRequest();
        return TeaModel.build(map, self);
    }

    public SyncOrgStructureRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public SyncOrgStructureRequest setDepartments(java.util.List<SyncOrgStructureRequestDepartments> departments) {
        this.departments = departments;
        return this;
    }
    public java.util.List<SyncOrgStructureRequestDepartments> getDepartments() {
        return this.departments;
    }

    public SyncOrgStructureRequest setMembers(java.util.List<SyncOrgStructureRequestMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<SyncOrgStructureRequestMembers> getMembers() {
        return this.members;
    }

    public SyncOrgStructureRequest setPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }
    public String getPlatformType() {
        return this.platformType;
    }

    public SyncOrgStructureRequest setSsoSettingsId(String ssoSettingsId) {
        this.ssoSettingsId = ssoSettingsId;
        return this;
    }
    public String getSsoSettingsId() {
        return this.ssoSettingsId;
    }

    public SyncOrgStructureRequest setSyncMembers(Boolean syncMembers) {
        this.syncMembers = syncMembers;
        return this;
    }
    public Boolean getSyncMembers() {
        return this.syncMembers;
    }

    public SyncOrgStructureRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public static class SyncOrgStructureRequestDepartments extends TeaModel {
        /**
         * <p>The department ID. This is an external identifier. The client is responsible for ensuring uniqueness.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDeptId</p>
         */
        @NameInMap("deptId")
        public String deptId;

        /**
         * <p>The department name.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("deptName")
        public String deptName;

        /**
         * <p>The sort order. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order")
        public Long order;

        /**
         * <p>The parent department ID. A value of null indicates a top-level department or root department.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleParentDeptId</p>
         */
        @NameInMap("parentDeptId")
        public String parentDeptId;

        public static SyncOrgStructureRequestDepartments build(java.util.Map<String, ?> map) throws Exception {
            SyncOrgStructureRequestDepartments self = new SyncOrgStructureRequestDepartments();
            return TeaModel.build(map, self);
        }

        public SyncOrgStructureRequestDepartments setDeptId(String deptId) {
            this.deptId = deptId;
            return this;
        }
        public String getDeptId() {
            return this.deptId;
        }

        public SyncOrgStructureRequestDepartments setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }
        public String getDeptName() {
            return this.deptName;
        }

        public SyncOrgStructureRequestDepartments setOrder(Long order) {
            this.order = order;
            return this;
        }
        public Long getOrder() {
            return this.order;
        }

        public SyncOrgStructureRequestDepartments setParentDeptId(String parentDeptId) {
            this.parentDeptId = parentDeptId;
            return this;
        }
        public String getParentDeptId() {
            return this.parentDeptId;
        }

    }

    public static class SyncOrgStructureRequestMembers extends TeaModel {
        /**
         * <p>The user identifier. In the SAML scenario, this is an email address or UPN, which must match rbj_user_account.account_id.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleAccountId</p>
         */
        @NameInMap("accountId")
        public String accountId;

        /**
         * <p>The department ID to which the member belongs. This value must correspond to a deptId in the departments list.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDeptId</p>
         */
        @NameInMap("deptId")
        public String deptId;

        /**
         * <p>The username for display purposes. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleName.pdf</p>
         */
        @NameInMap("name")
        public String name;

        public static SyncOrgStructureRequestMembers build(java.util.Map<String, ?> map) throws Exception {
            SyncOrgStructureRequestMembers self = new SyncOrgStructureRequestMembers();
            return TeaModel.build(map, self);
        }

        public SyncOrgStructureRequestMembers setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public SyncOrgStructureRequestMembers setDeptId(String deptId) {
            this.deptId = deptId;
            return this;
        }
        public String getDeptId() {
            return this.deptId;
        }

        public SyncOrgStructureRequestMembers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
