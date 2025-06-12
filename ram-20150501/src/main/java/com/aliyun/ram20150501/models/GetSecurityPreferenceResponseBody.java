// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetSecurityPreferenceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DC1213F1-A9D5-4A01-A996-44983689126C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The security preferences.</p>
     */
    @NameInMap("SecurityPreference")
    public GetSecurityPreferenceResponseBodySecurityPreference securityPreference;

    public static GetSecurityPreferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityPreferenceResponseBody self = new GetSecurityPreferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecurityPreferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSecurityPreferenceResponseBody setSecurityPreference(GetSecurityPreferenceResponseBodySecurityPreference securityPreference) {
        this.securityPreference = securityPreference;
        return this;
    }
    public GetSecurityPreferenceResponseBodySecurityPreference getSecurityPreference() {
        return this.securityPreference;
    }

    public static class GetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference extends TeaModel {
        /**
         * <p>Indicates whether Resource Access Management (RAM) users can manage their AccessKey pairs. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AllowUserToManageAccessKeys")
        public Boolean allowUserToManageAccessKeys;

        public static GetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference self = new GetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference();
            return TeaModel.build(map, self);
        }

        public GetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference setAllowUserToManageAccessKeys(Boolean allowUserToManageAccessKeys) {
            this.allowUserToManageAccessKeys = allowUserToManageAccessKeys;
            return this;
        }
        public Boolean getAllowUserToManageAccessKeys() {
            return this.allowUserToManageAccessKeys;
        }

    }

    public static class GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference extends TeaModel {
        /**
         * <p>Indicates whether RAM users can change their passwords. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowUserToChangePassword")
        public Boolean allowUserToChangePassword;

        /**
         * <p>Indicates whether RAM users can save security codes for MFA during logon. Each security code is valid for seven days. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableSaveMFATicket")
        public Boolean enableSaveMFATicket;

        /**
         * <p>The subnet mask that indicates the IP addresses from which logon to the Alibaba Cloud Management Console is allowed. This parameter applies to password-based logon and single sign-on (SSO). However, this parameter does not apply to API calls that are authenticated based on AccessKey pairs.</p>
         * <ul>
         * <li>If you specify a subnet mask, RAM users can use only the IP addresses in the subnet mask to log on to the Alibaba Cloud Management Console.</li>
         * <li>If you do not specify a subnet mask, RAM users can use all IP addresses to log on to the Alibaba Cloud Management Console.</li>
         * </ul>
         * <p>If you want to specify more than one subnet mask, separate the masks with semicolons (;). Example: 192.168.0.0/16;10.0.0.0/8.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        @NameInMap("LoginNetworkMasks")
        public String loginNetworkMasks;

        /**
         * <p>The validity period of the logon session of RAM users. Unit: hours.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("LoginSessionDuration")
        public Integer loginSessionDuration;

        public static GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference self = new GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference();
            return TeaModel.build(map, self);
        }

        public GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setAllowUserToChangePassword(Boolean allowUserToChangePassword) {
            this.allowUserToChangePassword = allowUserToChangePassword;
            return this;
        }
        public Boolean getAllowUserToChangePassword() {
            return this.allowUserToChangePassword;
        }

        public GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setEnableSaveMFATicket(Boolean enableSaveMFATicket) {
            this.enableSaveMFATicket = enableSaveMFATicket;
            return this;
        }
        public Boolean getEnableSaveMFATicket() {
            return this.enableSaveMFATicket;
        }

        public GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setLoginNetworkMasks(String loginNetworkMasks) {
            this.loginNetworkMasks = loginNetworkMasks;
            return this;
        }
        public String getLoginNetworkMasks() {
            return this.loginNetworkMasks;
        }

        public GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setLoginSessionDuration(Integer loginSessionDuration) {
            this.loginSessionDuration = loginSessionDuration;
            return this;
        }
        public Integer getLoginSessionDuration() {
            return this.loginSessionDuration;
        }

    }

    public static class GetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference extends TeaModel {
        /**
         * <p>Indicates whether RAM users can manage their MFA devices. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowUserToManageMFADevices")
        public Boolean allowUserToManageMFADevices;

        public static GetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference self = new GetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference();
            return TeaModel.build(map, self);
        }

        public GetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference setAllowUserToManageMFADevices(Boolean allowUserToManageMFADevices) {
            this.allowUserToManageMFADevices = allowUserToManageMFADevices;
            return this;
        }
        public Boolean getAllowUserToManageMFADevices() {
            return this.allowUserToManageMFADevices;
        }

    }

    public static class GetSecurityPreferenceResponseBodySecurityPreferencePublicKeyPreference extends TeaModel {
        /**
         * <p>Indicates whether RAM users can manage their public keys. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AllowUserToManagePublicKeys")
        public Boolean allowUserToManagePublicKeys;

        public static GetSecurityPreferenceResponseBodySecurityPreferencePublicKeyPreference build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityPreferenceResponseBodySecurityPreferencePublicKeyPreference self = new GetSecurityPreferenceResponseBodySecurityPreferencePublicKeyPreference();
            return TeaModel.build(map, self);
        }

        public GetSecurityPreferenceResponseBodySecurityPreferencePublicKeyPreference setAllowUserToManagePublicKeys(Boolean allowUserToManagePublicKeys) {
            this.allowUserToManagePublicKeys = allowUserToManagePublicKeys;
            return this;
        }
        public Boolean getAllowUserToManagePublicKeys() {
            return this.allowUserToManagePublicKeys;
        }

    }

    public static class GetSecurityPreferenceResponseBodySecurityPreference extends TeaModel {
        /**
         * <p>The AccessKey pair preference.</p>
         */
        @NameInMap("AccessKeyPreference")
        public GetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference accessKeyPreference;

        /**
         * <p>The logon preference.</p>
         */
        @NameInMap("LoginProfilePreference")
        public GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference loginProfilePreference;

        /**
         * <p>The multi-factor authentication (MFA) preference.</p>
         */
        @NameInMap("MFAPreference")
        public GetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference MFAPreference;

        /**
         * <p>The public key preference.</p>
         * <blockquote>
         * <p> This parameter is valid only for the Japan site.</p>
         * </blockquote>
         */
        @NameInMap("PublicKeyPreference")
        public GetSecurityPreferenceResponseBodySecurityPreferencePublicKeyPreference publicKeyPreference;

        public static GetSecurityPreferenceResponseBodySecurityPreference build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityPreferenceResponseBodySecurityPreference self = new GetSecurityPreferenceResponseBodySecurityPreference();
            return TeaModel.build(map, self);
        }

        public GetSecurityPreferenceResponseBodySecurityPreference setAccessKeyPreference(GetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference accessKeyPreference) {
            this.accessKeyPreference = accessKeyPreference;
            return this;
        }
        public GetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference getAccessKeyPreference() {
            return this.accessKeyPreference;
        }

        public GetSecurityPreferenceResponseBodySecurityPreference setLoginProfilePreference(GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference loginProfilePreference) {
            this.loginProfilePreference = loginProfilePreference;
            return this;
        }
        public GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference getLoginProfilePreference() {
            return this.loginProfilePreference;
        }

        public GetSecurityPreferenceResponseBodySecurityPreference setMFAPreference(GetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference MFAPreference) {
            this.MFAPreference = MFAPreference;
            return this;
        }
        public GetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference getMFAPreference() {
            return this.MFAPreference;
        }

        public GetSecurityPreferenceResponseBodySecurityPreference setPublicKeyPreference(GetSecurityPreferenceResponseBodySecurityPreferencePublicKeyPreference publicKeyPreference) {
            this.publicKeyPreference = publicKeyPreference;
            return this;
        }
        public GetSecurityPreferenceResponseBodySecurityPreferencePublicKeyPreference getPublicKeyPreference() {
            return this.publicKeyPreference;
        }

    }

}
