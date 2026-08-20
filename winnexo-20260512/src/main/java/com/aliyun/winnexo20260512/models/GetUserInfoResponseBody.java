// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetUserInfoResponseBody extends TeaModel {
    /**
     * <p>The profile picture URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/avatar.png">https://example.com/avatar.png</a></p>
     */
    @NameInMap("avatar")
    public String avatar;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The CRM type.</p>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("crmType")
    public String crmType;

    /**
     * <p>Indicates whether the user is an enterprise administrator.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isAdmin")
    public Boolean isAdmin;

    /**
     * <p>Indicates whether the current logon tenant is the system tenant (tenantId=10000).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isSystemTenant")
    public Boolean isSystemTenant;

    /**
     * <p>The language preference.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("languagePreference")
    public String languagePreference;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The username.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleName.pdf</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The user service description. Maximum length: 1000 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("offering")
    public String offering;

    /**
     * <p>The parsed result of the user service (JSON format).</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("parsedOffering")
    public String parsedOffering;

    /**
     * <p>The user role.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("profileRole")
    public String profileRole;

    /**
     * <p>The personal profile.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("profileRoleInfo")
    public String profileRoleInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The user self-introduction. Maximum length: 1000 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("selfIntroduction")
    public String selfIntroduction;

    /**
     * <p>The effective tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public Long tenantId;

    /**
     * <p>The tenant list.</p>
     */
    @NameInMap("tenantList")
    public java.util.List<GetUserInfoResponseBodyTenantList> tenantList;

    /**
     * <p>The current tenant name.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("tenantName")
    public String tenantName;

    /**
     * <p>The tenant type. Valid values:</p>
     * <ul>
     * <li>user: individual.</li>
     * <li>org: enterprise.</li>
     * <li>group: group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("tenantType")
    public String tenantType;

    /**
     * <p>The user code.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("userCode")
    public String userCode;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("userId")
    public Long userId;

    public static GetUserInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserInfoResponseBody self = new GetUserInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserInfoResponseBody setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public GetUserInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserInfoResponseBody setCrmType(String crmType) {
        this.crmType = crmType;
        return this;
    }
    public String getCrmType() {
        return this.crmType;
    }

    public GetUserInfoResponseBody setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    public GetUserInfoResponseBody setIsSystemTenant(Boolean isSystemTenant) {
        this.isSystemTenant = isSystemTenant;
        return this;
    }
    public Boolean getIsSystemTenant() {
        return this.isSystemTenant;
    }

    public GetUserInfoResponseBody setLanguagePreference(String languagePreference) {
        this.languagePreference = languagePreference;
        return this;
    }
    public String getLanguagePreference() {
        return this.languagePreference;
    }

    public GetUserInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserInfoResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetUserInfoResponseBody setOffering(String offering) {
        this.offering = offering;
        return this;
    }
    public String getOffering() {
        return this.offering;
    }

    public GetUserInfoResponseBody setParsedOffering(String parsedOffering) {
        this.parsedOffering = parsedOffering;
        return this;
    }
    public String getParsedOffering() {
        return this.parsedOffering;
    }

    public GetUserInfoResponseBody setProfileRole(String profileRole) {
        this.profileRole = profileRole;
        return this;
    }
    public String getProfileRole() {
        return this.profileRole;
    }

    public GetUserInfoResponseBody setProfileRoleInfo(String profileRoleInfo) {
        this.profileRoleInfo = profileRoleInfo;
        return this;
    }
    public String getProfileRoleInfo() {
        return this.profileRoleInfo;
    }

    public GetUserInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserInfoResponseBody setSelfIntroduction(String selfIntroduction) {
        this.selfIntroduction = selfIntroduction;
        return this;
    }
    public String getSelfIntroduction() {
        return this.selfIntroduction;
    }

    public GetUserInfoResponseBody setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public GetUserInfoResponseBody setTenantList(java.util.List<GetUserInfoResponseBodyTenantList> tenantList) {
        this.tenantList = tenantList;
        return this;
    }
    public java.util.List<GetUserInfoResponseBodyTenantList> getTenantList() {
        return this.tenantList;
    }

    public GetUserInfoResponseBody setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public GetUserInfoResponseBody setTenantType(String tenantType) {
        this.tenantType = tenantType;
        return this;
    }
    public String getTenantType() {
        return this.tenantType;
    }

    public GetUserInfoResponseBody setUserCode(String userCode) {
        this.userCode = userCode;
        return this;
    }
    public String getUserCode() {
        return this.userCode;
    }

    public GetUserInfoResponseBody setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public static class GetUserInfoResponseBodyTenantList extends TeaModel {
        /**
         * <p>The CRM type.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("crmType")
        public String crmType;

        /**
         * <p>The ID of the tenant to which the task belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("tenantId")
        public Long tenantId;

        /**
         * <p>The tenant name.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("tenantName")
        public String tenantName;

        /**
         * <p>The tenant type. Valid values:</p>
         * <ul>
         * <li>user: individual.</li>
         * <li>org: enterprise.</li>
         * <li>group: group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("tenantType")
        public String tenantType;

        public static GetUserInfoResponseBodyTenantList build(java.util.Map<String, ?> map) throws Exception {
            GetUserInfoResponseBodyTenantList self = new GetUserInfoResponseBodyTenantList();
            return TeaModel.build(map, self);
        }

        public GetUserInfoResponseBodyTenantList setCrmType(String crmType) {
            this.crmType = crmType;
            return this;
        }
        public String getCrmType() {
            return this.crmType;
        }

        public GetUserInfoResponseBodyTenantList setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetUserInfoResponseBodyTenantList setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public GetUserInfoResponseBodyTenantList setTenantType(String tenantType) {
            this.tenantType = tenantType;
            return this;
        }
        public String getTenantType() {
            return this.tenantType;
        }

    }

}
