// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class SetSecurityPreferenceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SecurityPreference")
    @Validation(required = true)
    public SetSecurityPreferenceResponseSecurityPreference securityPreference;

    public static SetSecurityPreferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        SetSecurityPreferenceResponse self = new SetSecurityPreferenceResponse();
        return TeaModel.build(map, self);
    }

    public static class SetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference extends TeaModel {
        @NameInMap("EnableSaveMFATicket")
        @Validation(required = true)
        public Boolean enableSaveMFATicket;

        @NameInMap("AllowUserToChangePassword")
        @Validation(required = true)
        public Boolean allowUserToChangePassword;

        @NameInMap("LoginSessionDuration")
        @Validation(required = true)
        public Integer loginSessionDuration;

        @NameInMap("LoginNetworkMasks")
        @Validation(required = true)
        public String loginNetworkMasks;

        public static SetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference build(java.util.Map<String, ?> map) throws Exception {
            SetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference self = new SetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference();
            return TeaModel.build(map, self);
        }

    }

    public static class SetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference extends TeaModel {
        @NameInMap("AllowUserToManageAccessKeys")
        @Validation(required = true)
        public Boolean allowUserToManageAccessKeys;

        public static SetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference build(java.util.Map<String, ?> map) throws Exception {
            SetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference self = new SetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference();
            return TeaModel.build(map, self);
        }

    }

    public static class SetSecurityPreferenceResponseSecurityPreferencePublicKeyPreference extends TeaModel {
        @NameInMap("AllowUserToManagePublicKeys")
        @Validation(required = true)
        public Boolean allowUserToManagePublicKeys;

        public static SetSecurityPreferenceResponseSecurityPreferencePublicKeyPreference build(java.util.Map<String, ?> map) throws Exception {
            SetSecurityPreferenceResponseSecurityPreferencePublicKeyPreference self = new SetSecurityPreferenceResponseSecurityPreferencePublicKeyPreference();
            return TeaModel.build(map, self);
        }

    }

    public static class SetSecurityPreferenceResponseSecurityPreferenceMFAPreference extends TeaModel {
        @NameInMap("AllowUserToManageMFADevices")
        @Validation(required = true)
        public Boolean allowUserToManageMFADevices;

        public static SetSecurityPreferenceResponseSecurityPreferenceMFAPreference build(java.util.Map<String, ?> map) throws Exception {
            SetSecurityPreferenceResponseSecurityPreferenceMFAPreference self = new SetSecurityPreferenceResponseSecurityPreferenceMFAPreference();
            return TeaModel.build(map, self);
        }

    }

    public static class SetSecurityPreferenceResponseSecurityPreference extends TeaModel {
        @NameInMap("LoginProfilePreference")
        @Validation(required = true)
        public SetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference loginProfilePreference;

        @NameInMap("AccessKeyPreference")
        @Validation(required = true)
        public SetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference accessKeyPreference;

        @NameInMap("PublicKeyPreference")
        @Validation(required = true)
        public SetSecurityPreferenceResponseSecurityPreferencePublicKeyPreference publicKeyPreference;

        @NameInMap("MFAPreference")
        @Validation(required = true)
        public SetSecurityPreferenceResponseSecurityPreferenceMFAPreference MFAPreference;

        public static SetSecurityPreferenceResponseSecurityPreference build(java.util.Map<String, ?> map) throws Exception {
            SetSecurityPreferenceResponseSecurityPreference self = new SetSecurityPreferenceResponseSecurityPreference();
            return TeaModel.build(map, self);
        }

    }

}
