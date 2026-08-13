// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SyncOrgStructureRequest extends TeaModel {
    /**
     * <p>企业标识（必须与 listAvailableConfigs 返回的 corpId 一致）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleCorpId</p>
     */
    @NameInMap("corpId")
    public String corpId;

    /**
     * <p>部门列表（至少包含一个根部门）</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("departments")
    public java.util.List<SyncOrgStructureRequestDepartments> departments;

    /**
     * <p>成员列表（syncMembers=true 时必须提供）</p>
     */
    @NameInMap("members")
    public java.util.List<SyncOrgStructureRequestMembers> members;

    /**
     * <p>平台类型: saml / oauth2 / custom</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>saml</p>
     */
    @NameInMap("platformType")
    public String platformType;

    /**
     * <p>SSO 配置 ID（SAML/OAuth2 可选：不传时按 corpId 自动推导；若存在多个 IdP 使用相同 corpId 则必须显式传入，否则报 AMBIGUOUS 错误；custom 不需要）</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSsoSettingsId</p>
     */
    @NameInMap("ssoSettingsId")
    public String ssoSettingsId;

    /**
     * <p>是否同步成员关系（custom 模式强制为 false）</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("syncMembers")
    public Boolean syncMembers;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
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
         * <p>部门 ID（外部标识，客户端自行保证唯一性）</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDeptId</p>
         */
        @NameInMap("deptId")
        public String deptId;

        /**
         * <p>部门名称</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("deptName")
        public String deptName;

        /**
         * <p>排序号（数值越小越靠前）</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order")
        public Long order;

        /**
         * <p>父部门 ID（null 表示一级部门/根部门）</p>
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
         * <p>用户标识（SAML 场景为邮箱/UPN，需与 rbj_user_account.account_id 匹配）</p>
         * 
         * <strong>example:</strong>
         * <p>exampleAccountId</p>
         */
        @NameInMap("accountId")
        public String accountId;

        /**
         * <p>所属部门 ID（必须与 departments 中的 deptId 对应）</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDeptId</p>
         */
        @NameInMap("deptId")
        public String deptId;

        /**
         * <p>用户姓名（展示用，可选）</p>
         * 
         * <strong>example:</strong>
         * <p>示例名称.pdf</p>
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
