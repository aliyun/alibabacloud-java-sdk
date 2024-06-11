// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class SetSecurityPreferenceRequest extends TeaModel {
    /**
     * <p>Specifies whether RAM users can change their passwords. Valid values:</p>
     * <br>
     * <p>*   true: RAM users can change their passwords. This is the default value.</p>
     * <p>*   false: RAM users cannot change their passwords.</p>
     */
    @NameInMap("AllowUserToChangePassword")
    public Boolean allowUserToChangePassword;

    /**
     * <p>Specifies whether RAM users can manage their AccessKey pairs. Valid values:</p>
     * <br>
     * <p>*   true: RAM users can manage their AccessKey pairs.</p>
     * <p>*   false: RAM users cannot manage their AccessKey pairs. This is the default value.</p>
     */
    @NameInMap("AllowUserToManageAccessKeys")
    public Boolean allowUserToManageAccessKeys;

    /**
     * <p>Specifies whether RAM users can manage their MFA devices. Valid values:</p>
     * <br>
     * <p>*   true: RAM users can manage their MFA devices. This is the default value.</p>
     * <p>*   false: RAM users cannot manage their MFA devices.</p>
     */
    @NameInMap("AllowUserToManageMFADevices")
    public Boolean allowUserToManageMFADevices;

    /**
     * <p>Specifies whether RAM users can manage their public keys. Valid values:</p>
     * <br>
     * <p>*   true: RAM users can manage their public keys.</p>
     * <p>*   false: RAM users cannot manage their public keys. This is the default value.</p>
     * <br>
     * <p>>  This parameter is valid only for the Japan site.</p>
     */
    @NameInMap("AllowUserToManagePublicKeys")
    public Boolean allowUserToManagePublicKeys;

    /**
     * <p>Specifies whether to remember the multi-factor authentication (MFA) devices of Resource Access Management (RAM) users for seven days. Valid values:</p>
     * <br>
     * <p>*   true: remembers the MFA devices of RAM users for seven days.</p>
     * <p>*   false: does not remember the MFA devices of RAM users for seven days.</p>
     */
    @NameInMap("EnableSaveMFATicket")
    public Boolean enableSaveMFATicket;

    /**
     * <p>The subnet mask that specifies the IP addresses from which you can log on to the Alibaba Cloud Management Console. This parameter takes effect on password-based logon and single sign-on (SSO). However, this parameter does not take effect on API calls that are authenticated by using AccessKey pairs.</p>
     * <br>
     * <p>*   If you specify a subnet mask, RAM users can use only the IP addresses in the subnet mask to log on to the Alibaba Cloud Management Console.</p>
     * <p>*   If you do not specify a subnet mask, RAM users can use all IP addresses to log on to the Alibaba Cloud Management Console.</p>
     * <br>
     * <p>If you need to specify multiple subnet masks, separate the subnet masks with semicolons (;). Example: 192.168.0.0/16;10.0.0.0/8.</p>
     * <br>
     * <p>You can specify up to 25 subnet masks. The total length of the subnet masks can be a maximum of 512 characters.</p>
     */
    @NameInMap("LoginNetworkMasks")
    public String loginNetworkMasks;

    /**
     * <p>The validity period of the logon session of RAM users.</p>
     * <br>
     * <p>Valid values: 1 to 24. Default value: 6. Unit: hours.</p>
     */
    @NameInMap("LoginSessionDuration")
    public Integer loginSessionDuration;

    public static SetSecurityPreferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSecurityPreferenceRequest self = new SetSecurityPreferenceRequest();
        return TeaModel.build(map, self);
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

    public SetSecurityPreferenceRequest setAllowUserToManageMFADevices(Boolean allowUserToManageMFADevices) {
        this.allowUserToManageMFADevices = allowUserToManageMFADevices;
        return this;
    }
    public Boolean getAllowUserToManageMFADevices() {
        return this.allowUserToManageMFADevices;
    }

    public SetSecurityPreferenceRequest setAllowUserToManagePublicKeys(Boolean allowUserToManagePublicKeys) {
        this.allowUserToManagePublicKeys = allowUserToManagePublicKeys;
        return this;
    }
    public Boolean getAllowUserToManagePublicKeys() {
        return this.allowUserToManagePublicKeys;
    }

    public SetSecurityPreferenceRequest setEnableSaveMFATicket(Boolean enableSaveMFATicket) {
        this.enableSaveMFATicket = enableSaveMFATicket;
        return this;
    }
    public Boolean getEnableSaveMFATicket() {
        return this.enableSaveMFATicket;
    }

    public SetSecurityPreferenceRequest setLoginNetworkMasks(String loginNetworkMasks) {
        this.loginNetworkMasks = loginNetworkMasks;
        return this;
    }
    public String getLoginNetworkMasks() {
        return this.loginNetworkMasks;
    }

    public SetSecurityPreferenceRequest setLoginSessionDuration(Integer loginSessionDuration) {
        this.loginSessionDuration = loginSessionDuration;
        return this;
    }
    public Integer getLoginSessionDuration() {
        return this.loginSessionDuration;
    }

}
