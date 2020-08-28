// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class SetSecurityPreferenceRequest extends TeaModel {
    @NameInMap("EnableSaveMFATicket")
    public Boolean enableSaveMFATicket;

    @NameInMap("AllowUserToChangePassword")
    public Boolean allowUserToChangePassword;

    @NameInMap("AllowUserToManageAccessKeys")
    public Boolean allowUserToManageAccessKeys;

    @NameInMap("AllowUserToManagePublicKeys")
    public Boolean allowUserToManagePublicKeys;

    @NameInMap("AllowUserToManageMFADevices")
    public Boolean allowUserToManageMFADevices;

    @NameInMap("LoginSessionDuration")
    public Integer loginSessionDuration;

    @NameInMap("LoginNetworkMasks")
    public String loginNetworkMasks;

    public static SetSecurityPreferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSecurityPreferenceRequest self = new SetSecurityPreferenceRequest();
        return TeaModel.build(map, self);
    }

}
