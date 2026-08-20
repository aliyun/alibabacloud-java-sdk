// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateUserInfoResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>The current zone list is illegal.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The user information.</p>
     */
    @NameInMap("user")
    public UpdateUserInfoResponseBodyUser user;

    public static UpdateUserInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserInfoResponseBody self = new UpdateUserInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateUserInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateUserInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateUserInfoResponseBody setUser(UpdateUserInfoResponseBodyUser user) {
        this.user = user;
        return this;
    }
    public UpdateUserInfoResponseBodyUser getUser() {
        return this.user;
    }

    public static class UpdateUserInfoResponseBodyUserTenantList extends TeaModel {
        /**
         * <p>The tenant ID.</p>
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

        public static UpdateUserInfoResponseBodyUserTenantList build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserInfoResponseBodyUserTenantList self = new UpdateUserInfoResponseBodyUserTenantList();
            return TeaModel.build(map, self);
        }

        public UpdateUserInfoResponseBodyUserTenantList setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public UpdateUserInfoResponseBodyUserTenantList setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

    }

    public static class UpdateUserInfoResponseBodyUser extends TeaModel {
        /**
         * <p>The user profile picture URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/avatar.png">https://example.com/avatar.png</a></p>
         */
        @NameInMap("avatar")
        public String avatar;

        /**
         * <p>Indicates whether the user is a super administrator.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isAdmin")
        public Boolean isAdmin;

        /**
         * <p>Indicates whether the current logged-in tenant is a system tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isSystemTenant")
        public Boolean isSystemTenant;

        /**
         * <p>The user language preference.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("languagePreference")
        public String languagePreference;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleName.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The user service description.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("offering")
        public String offering;

        /**
         * <p>The parsed user service result in JSON format.</p>
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
         * <p>The user role description.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("profileRoleInfo")
        public String profileRoleInfo;

        /**
         * <p>The user self-introduction.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("selfIntroduction")
        public String selfIntroduction;

        /**
         * <p>The current tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("tenantId")
        public Long tenantId;

        /**
         * <p>The list of tenants to which the user belongs.</p>
         */
        @NameInMap("tenantList")
        public java.util.List<UpdateUserInfoResponseBodyUserTenantList> tenantList;

        /**
         * <p>The current tenant name.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("tenantName")
        public String tenantName;

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

        public static UpdateUserInfoResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserInfoResponseBodyUser self = new UpdateUserInfoResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public UpdateUserInfoResponseBodyUser setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public UpdateUserInfoResponseBodyUser setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public UpdateUserInfoResponseBodyUser setIsSystemTenant(Boolean isSystemTenant) {
            this.isSystemTenant = isSystemTenant;
            return this;
        }
        public Boolean getIsSystemTenant() {
            return this.isSystemTenant;
        }

        public UpdateUserInfoResponseBodyUser setLanguagePreference(String languagePreference) {
            this.languagePreference = languagePreference;
            return this;
        }
        public String getLanguagePreference() {
            return this.languagePreference;
        }

        public UpdateUserInfoResponseBodyUser setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateUserInfoResponseBodyUser setOffering(String offering) {
            this.offering = offering;
            return this;
        }
        public String getOffering() {
            return this.offering;
        }

        public UpdateUserInfoResponseBodyUser setParsedOffering(String parsedOffering) {
            this.parsedOffering = parsedOffering;
            return this;
        }
        public String getParsedOffering() {
            return this.parsedOffering;
        }

        public UpdateUserInfoResponseBodyUser setProfileRole(String profileRole) {
            this.profileRole = profileRole;
            return this;
        }
        public String getProfileRole() {
            return this.profileRole;
        }

        public UpdateUserInfoResponseBodyUser setProfileRoleInfo(String profileRoleInfo) {
            this.profileRoleInfo = profileRoleInfo;
            return this;
        }
        public String getProfileRoleInfo() {
            return this.profileRoleInfo;
        }

        public UpdateUserInfoResponseBodyUser setSelfIntroduction(String selfIntroduction) {
            this.selfIntroduction = selfIntroduction;
            return this;
        }
        public String getSelfIntroduction() {
            return this.selfIntroduction;
        }

        public UpdateUserInfoResponseBodyUser setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public UpdateUserInfoResponseBodyUser setTenantList(java.util.List<UpdateUserInfoResponseBodyUserTenantList> tenantList) {
            this.tenantList = tenantList;
            return this;
        }
        public java.util.List<UpdateUserInfoResponseBodyUserTenantList> getTenantList() {
            return this.tenantList;
        }

        public UpdateUserInfoResponseBodyUser setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public UpdateUserInfoResponseBodyUser setUserCode(String userCode) {
            this.userCode = userCode;
            return this;
        }
        public String getUserCode() {
            return this.userCode;
        }

        public UpdateUserInfoResponseBodyUser setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
