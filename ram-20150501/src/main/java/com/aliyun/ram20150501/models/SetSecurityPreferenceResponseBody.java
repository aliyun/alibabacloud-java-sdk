// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class SetSecurityPreferenceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The security preferences.</p>
     */
    @NameInMap("SecurityPreference")
    public SetSecurityPreferenceResponseBodySecurityPreference securityPreference;

    public static SetSecurityPreferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetSecurityPreferenceResponseBody self = new SetSecurityPreferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public SetSecurityPreferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetSecurityPreferenceResponseBody setSecurityPreference(SetSecurityPreferenceResponseBodySecurityPreference securityPreference) {
        this.securityPreference = securityPreference;
        return this;
    }
    public SetSecurityPreferenceResponseBodySecurityPreference getSecurityPreference() {
        return this.securityPreference;
    }

    public static class SetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference extends TeaModel {
        /**
         * <p>Indicates whether RAM users can manage their AccessKey pairs.</p>
         */
        @NameInMap("AllowUserToManageAccessKeys")
        public Boolean allowUserToManageAccessKeys;

        public static SetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference build(java.util.Map<String, ?> map) throws Exception {
            SetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference self = new SetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference();
            return TeaModel.build(map, self);
        }

        public SetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference setAllowUserToManageAccessKeys(Boolean allowUserToManageAccessKeys) {
            this.allowUserToManageAccessKeys = allowUserToManageAccessKeys;
            return this;
        }
        public Boolean getAllowUserToManageAccessKeys() {
            return this.allowUserToManageAccessKeys;
        }

    }

    public static class SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference extends TeaModel {
        /**
         * <p>Indicates whether RAM users can change their passwords.</p>
         */
        @NameInMap("AllowUserToChangePassword")
        public Boolean allowUserToChangePassword;

        /**
         * <p>Indicates whether the MFA devices of RAM users are remembered.</p>
         */
        @NameInMap("EnableSaveMFATicket")
        public Boolean enableSaveMFATicket;

        /**
         * <p>The subnet mask.</p>
         */
        @NameInMap("LoginNetworkMasks")
        public String loginNetworkMasks;

        /**
         * <p>The validity period of the logon session of RAM users.</p>
         */
        @NameInMap("LoginSessionDuration")
        public Integer loginSessionDuration;

        public static SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference build(java.util.Map<String, ?> map) throws Exception {
            SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference self = new SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference();
            return TeaModel.build(map, self);
        }

        public SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setAllowUserToChangePassword(Boolean allowUserToChangePassword) {
            this.allowUserToChangePassword = allowUserToChangePassword;
            return this;
        }
        public Boolean getAllowUserToChangePassword() {
            return this.allowUserToChangePassword;
        }

        public SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setEnableSaveMFATicket(Boolean enableSaveMFATicket) {
            this.enableSaveMFATicket = enableSaveMFATicket;
            return this;
        }
        public Boolean getEnableSaveMFATicket() {
            return this.enableSaveMFATicket;
        }

        public SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setLoginNetworkMasks(String loginNetworkMasks) {
            this.loginNetworkMasks = loginNetworkMasks;
            return this;
        }
        public String getLoginNetworkMasks() {
            return this.loginNetworkMasks;
        }

        public SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setLoginSessionDuration(Integer loginSessionDuration) {
            this.loginSessionDuration = loginSessionDuration;
            return this;
        }
        public Integer getLoginSessionDuration() {
            return this.loginSessionDuration;
        }

    }

    public static class SetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference extends TeaModel {
        /**
         * <p>Indicates whether RAM users can manage their MFA devices.</p>
         */
        @NameInMap("AllowUserToManageMFADevices")
        public Boolean allowUserToManageMFADevices;

        public static SetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference build(java.util.Map<String, ?> map) throws Exception {
            SetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference self = new SetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference();
            return TeaModel.build(map, self);
        }

        public SetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference setAllowUserToManageMFADevices(Boolean allowUserToManageMFADevices) {
            this.allowUserToManageMFADevices = allowUserToManageMFADevices;
            return this;
        }
        public Boolean getAllowUserToManageMFADevices() {
            return this.allowUserToManageMFADevices;
        }

    }

    public static class SetSecurityPreferenceResponseBodySecurityPreferencePublicKeyPreference extends TeaModel {
        /**
         * <p>Indicates whether RAM users can manage their public keys.</p>
         */
        @NameInMap("AllowUserToManagePublicKeys")
        public Boolean allowUserToManagePublicKeys;

        public static SetSecurityPreferenceResponseBodySecurityPreferencePublicKeyPreference build(java.util.Map<String, ?> map) throws Exception {
            SetSecurityPreferenceResponseBodySecurityPreferencePublicKeyPreference self = new SetSecurityPreferenceResponseBodySecurityPreferencePublicKeyPreference();
            return TeaModel.build(map, self);
        }

        public SetSecurityPreferenceResponseBodySecurityPreferencePublicKeyPreference setAllowUserToManagePublicKeys(Boolean allowUserToManagePublicKeys) {
            this.allowUserToManagePublicKeys = allowUserToManagePublicKeys;
            return this;
        }
        public Boolean getAllowUserToManagePublicKeys() {
            return this.allowUserToManagePublicKeys;
        }

    }

    public static class SetSecurityPreferenceResponseBodySecurityPreference extends TeaModel {
        /**
         * <p>The AccessKey pair preference.</p>
         */
        @NameInMap("AccessKeyPreference")
        public SetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference accessKeyPreference;

        /**
         * <p>The logon preference.</p>
         */
        @NameInMap("LoginProfilePreference")
        public SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference loginProfilePreference;

        /**
         * <p>The MFA preference.</p>
         */
        @NameInMap("MFAPreference")
        public SetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference MFAPreference;

        /**
         * <p>The public key preference.</p>
         * <br>
         * <p>>  This parameter is valid only for the Japan site.</p>
         */
        @NameInMap("PublicKeyPreference")
        public SetSecurityPreferenceResponseBodySecurityPreferencePublicKeyPreference publicKeyPreference;

        public static SetSecurityPreferenceResponseBodySecurityPreference build(java.util.Map<String, ?> map) throws Exception {
            SetSecurityPreferenceResponseBodySecurityPreference self = new SetSecurityPreferenceResponseBodySecurityPreference();
            return TeaModel.build(map, self);
        }

        public SetSecurityPreferenceResponseBodySecurityPreference setAccessKeyPreference(SetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference accessKeyPreference) {
            this.accessKeyPreference = accessKeyPreference;
            return this;
        }
        public SetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference getAccessKeyPreference() {
            return this.accessKeyPreference;
        }

        public SetSecurityPreferenceResponseBodySecurityPreference setLoginProfilePreference(SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference loginProfilePreference) {
            this.loginProfilePreference = loginProfilePreference;
            return this;
        }
        public SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference getLoginProfilePreference() {
            return this.loginProfilePreference;
        }

        public SetSecurityPreferenceResponseBodySecurityPreference setMFAPreference(SetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference MFAPreference) {
            this.MFAPreference = MFAPreference;
            return this;
        }
        public SetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference getMFAPreference() {
            return this.MFAPreference;
        }

        public SetSecurityPreferenceResponseBodySecurityPreference setPublicKeyPreference(SetSecurityPreferenceResponseBodySecurityPreferencePublicKeyPreference publicKeyPreference) {
            this.publicKeyPreference = publicKeyPreference;
            return this;
        }
        public SetSecurityPreferenceResponseBodySecurityPreferencePublicKeyPreference getPublicKeyPreference() {
            return this.publicKeyPreference;
        }

    }

}
