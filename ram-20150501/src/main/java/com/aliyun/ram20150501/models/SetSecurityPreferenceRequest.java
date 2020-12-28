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

    public SetSecurityPreferenceRequest setEnableSaveMFATicket(Boolean enableSaveMFATicket) {
        this.enableSaveMFATicket = enableSaveMFATicket;
        return this;
    }
    public Boolean getEnableSaveMFATicket() {
        return this.enableSaveMFATicket;
    }

    public SetSecurityPreferenceRequest setAllowUserToChangePassword(Boolean allowUserToChangePassword) {
        this.allowUserToChangePassword = allowUserToChangePassword;
        return this;
    }
    public Boolean getAllowUserToChangePassword() {
        return this.allowUserToChangePassword;
    }

    public SetSecurityPreferenceRequest setAllowUserToManageAccessKeys(Boolean allowUserToManageAccessKeys) {
        this.allowUserToManageAccessKeys = allowUserToManageAccessKeys;
        return this;
    }
    public Boolean getAllowUserToManageAccessKeys() {
        return this.allowUserToManageAccessKeys;
    }

    public SetSecurityPreferenceRequest setAllowUserToManagePublicKeys(Boolean allowUserToManagePublicKeys) {
        this.allowUserToManagePublicKeys = allowUserToManagePublicKeys;
        return this;
    }
    public Boolean getAllowUserToManagePublicKeys() {
        return this.allowUserToManagePublicKeys;
    }

    public SetSecurityPreferenceRequest setAllowUserToManageMFADevices(Boolean allowUserToManageMFADevices) {
        this.allowUserToManageMFADevices = allowUserToManageMFADevices;
        return this;
    }
    public Boolean getAllowUserToManageMFADevices() {
        return this.allowUserToManageMFADevices;
    }

    public SetSecurityPreferenceRequest setLoginSessionDuration(Integer loginSessionDuration) {
        this.loginSessionDuration = loginSessionDuration;
        return this;
    }
    public Integer getLoginSessionDuration() {
        return this.loginSessionDuration;
    }

    public SetSecurityPreferenceRequest setLoginNetworkMasks(String loginNetworkMasks) {
        this.loginNetworkMasks = loginNetworkMasks;
        return this;
    }
    public String getLoginNetworkMasks() {
        return this.loginNetworkMasks;
    }

}
