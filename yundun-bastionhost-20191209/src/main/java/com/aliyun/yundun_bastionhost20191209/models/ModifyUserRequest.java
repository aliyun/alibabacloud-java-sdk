// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyUserRequest extends TeaModel {
    /**
     * <p>The new description of the user. The description can be up to 500 characters in length.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The new display name of the user. This display name can be up to 128 characters in length.</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The end of the validity period of the user. The value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("EffectiveEndTime")
    public Long effectiveEndTime;

    /**
     * <p>The beginning of the validity period of the user. The value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("EffectiveStartTime")
    public Long effectiveStartTime;

    /**
     * <p>The new email address of the user.</p>
     * <br>
     * <p>> This parameter is required when the TwoFactorStatus parameter is set to Enable and the TwoFactorMethods parameter is set to email.</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The ID of the bastion host where you want to modify user information.</p>
     * <br>
     * <p>> You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new mobile number of the user.</p>
     * <br>
     * <p>> This parameter is required when the TwoFactorStatus parameter is set to Enable and the TwoFactorMethods parameter is set to sms or dingtalk.</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>The country where the new mobile number of the user is registered. Valid values:</p>
     * <br>
     * <p>*   **CN:** the Chinese mainland, whose country calling code is +86</p>
     * <p>*   **HK:** Hong Kong (China), whose country calling code is +852</p>
     * <p>*   **MO:** Macao (China), whose country calling code is +853</p>
     * <p>*   **TW:** Taiwan (China), whose country calling code is +886</p>
     * <p>*   **RU:** Russia, whose country calling code is +7</p>
     * <p>*   **SG:** Singapore, whose country calling code is +65</p>
     * <p>*   **MY:** Malaysia, whose country calling code is +60</p>
     * <p>*   **ID:** Indonesia, whose country calling code is +62</p>
     * <p>*   **DE:** Germany, whose country calling code is +49</p>
     * <p>*   **AU:** Australia, whose country calling code is +61</p>
     * <p>*   **US:** US, whose country calling code is +1</p>
     * <p>*   **AE:** United Arab Emirates, whose country calling code is +971</p>
     * <p>*   **JP:** Japan, whose country calling code is +81</p>
     * <p>*   **GB:** UK, whose country calling code is +44</p>
     * <p>*   **IN:** India, whose country calling code is +91</p>
     * <p>*   **KR:** Republic of Korea, whose country calling code is +82</p>
     * <p>*   **PH:** Philippines, whose country calling code is +63</p>
     * <p>*   **CH:** Switzerland, whose country calling code is +41</p>
     * <p>*   **SE:** Sweden, whose country calling code is +46</p>
     * <p>*   **SA:** Saudi Arabia, whose country calling code is +966</p>
     */
    @NameInMap("MobileCountryCode")
    public String mobileCountryCode;

    /**
     * <p>Specifies whether password reset is required upon the next logon. Valid values:</p>
     * <br>
     * <p>- true: yes</p>
     * <p>- false: no</p>
     */
    @NameInMap("NeedResetPassword")
    public Boolean needResetPassword;

    /**
     * <p>The new password of the user. The password must be 8 to 128 characters in length and must contain lowercase letters, uppercase letters, digits, and special characters.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The region ID of the bastion host where you want to modify user information.</p>
     * <br>
     * <p>> For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The two-factor authentication method. You can select only one method. Valid values:</p>
     * <br>
     * <p>*   **sms:** text message</p>
     * <p>*   **email:** email</p>
     * <p>*   **dingtalk:** DingTalk</p>
     * <p>*   **totp OTP:** time-based one-time password (TOTP) app</p>
     * <br>
     * <p>> *   When the TwoFactorStatus parameter is set to Enable, you must specify one of the preceding values.</p>
     */
    @NameInMap("TwoFactorMethods")
    public String twoFactorMethods;

    /**
     * <p>The two-factor authentication status of the user. Valid values:</p>
     * <br>
     * <p>*   **Global:** follows the global settings</p>
     * <p>*   **Disable:** disables two-factor authentication</p>
     * <p>*   **Enable:** enable two-factor authentication and follows settings of the single user</p>
     */
    @NameInMap("TwoFactorStatus")
    public String twoFactorStatus;

    /**
     * <p>The ID of the user whose information you want to modify.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ModifyUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserRequest self = new ModifyUserRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ModifyUserRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ModifyUserRequest setEffectiveEndTime(Long effectiveEndTime) {
        this.effectiveEndTime = effectiveEndTime;
        return this;
    }
    public Long getEffectiveEndTime() {
        return this.effectiveEndTime;
    }

    public ModifyUserRequest setEffectiveStartTime(Long effectiveStartTime) {
        this.effectiveStartTime = effectiveStartTime;
        return this;
    }
    public Long getEffectiveStartTime() {
        return this.effectiveStartTime;
    }

    public ModifyUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ModifyUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyUserRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public ModifyUserRequest setMobileCountryCode(String mobileCountryCode) {
        this.mobileCountryCode = mobileCountryCode;
        return this;
    }
    public String getMobileCountryCode() {
        return this.mobileCountryCode;
    }

    public ModifyUserRequest setNeedResetPassword(Boolean needResetPassword) {
        this.needResetPassword = needResetPassword;
        return this;
    }
    public Boolean getNeedResetPassword() {
        return this.needResetPassword;
    }

    public ModifyUserRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyUserRequest setTwoFactorMethods(String twoFactorMethods) {
        this.twoFactorMethods = twoFactorMethods;
        return this;
    }
    public String getTwoFactorMethods() {
        return this.twoFactorMethods;
    }

    public ModifyUserRequest setTwoFactorStatus(String twoFactorStatus) {
        this.twoFactorStatus = twoFactorStatus;
        return this;
    }
    public String getTwoFactorStatus() {
        return this.twoFactorStatus;
    }

    public ModifyUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
