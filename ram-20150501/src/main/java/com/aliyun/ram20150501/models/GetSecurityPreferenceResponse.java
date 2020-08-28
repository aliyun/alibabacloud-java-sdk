// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetSecurityPreferenceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SecurityPreference")
    @Validation(required = true)
    public GetSecurityPreferenceResponseSecurityPreference securityPreference;

    public static GetSecurityPreferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityPreferenceResponse self = new GetSecurityPreferenceResponse();
        return TeaModel.build(map, self);
    }

    public static class GetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference extends TeaModel {
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

        public static GetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference self = new GetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference();
            return TeaModel.build(map, self);
        }

    }

    public static class GetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference extends TeaModel {
        @NameInMap("AllowUserToManageAccessKeys")
        @Validation(required = true)
        public Boolean allowUserToManageAccessKeys;

        public static GetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference self = new GetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference();
            return TeaModel.build(map, self);
        }

    }

    public static class GetSecurityPreferenceResponseSecurityPreferencePublicKeyPreference extends TeaModel {
        @NameInMap("AllowUserToManagePublicKeys")
        @Validation(required = true)
        public Boolean allowUserToManagePublicKeys;

        public static GetSecurityPreferenceResponseSecurityPreferencePublicKeyPreference build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityPreferenceResponseSecurityPreferencePublicKeyPreference self = new GetSecurityPreferenceResponseSecurityPreferencePublicKeyPreference();
            return TeaModel.build(map, self);
        }

    }

    public static class GetSecurityPreferenceResponseSecurityPreferenceMFAPreference extends TeaModel {
        @NameInMap("AllowUserToManageMFADevices")
        @Validation(required = true)
        public Boolean allowUserToManageMFADevices;

        public static GetSecurityPreferenceResponseSecurityPreferenceMFAPreference build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityPreferenceResponseSecurityPreferenceMFAPreference self = new GetSecurityPreferenceResponseSecurityPreferenceMFAPreference();
            return TeaModel.build(map, self);
        }

    }

    public static class GetSecurityPreferenceResponseSecurityPreference extends TeaModel {
        @NameInMap("LoginProfilePreference")
        @Validation(required = true)
        public GetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference loginProfilePreference;

        @NameInMap("AccessKeyPreference")
        @Validation(required = true)
        public GetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference accessKeyPreference;

        @NameInMap("PublicKeyPreference")
        @Validation(required = true)
        public GetSecurityPreferenceResponseSecurityPreferencePublicKeyPreference publicKeyPreference;

        @NameInMap("MFAPreference")
        @Validation(required = true)
        public GetSecurityPreferenceResponseSecurityPreferenceMFAPreference MFAPreference;

        public static GetSecurityPreferenceResponseSecurityPreference build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityPreferenceResponseSecurityPreference self = new GetSecurityPreferenceResponseSecurityPreference();
            return TeaModel.build(map, self);
        }

    }

}
