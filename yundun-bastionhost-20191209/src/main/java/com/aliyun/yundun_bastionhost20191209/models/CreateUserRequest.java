// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    /**
     * <p>The remarks of the user that you want to add. The remarks can be up to 500 characters in length.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The display name of the user that you want to add. This display name can be up to 128 characters in length.</p>
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
     * <p>The email address of the user that you want to add.</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The ID of the bastion host to which you want to add a user.</p>
     * <br>
     * <p>>  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The mobile phone number of the user that you want to add.</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>The country where the mobile number of the user is registered. Default value: **CN**. Valid values:</p>
     * <br>
     * <p>*   **CN**: the Chinese mainland, whose country calling code is +86</p>
     * <p>*   **HK**: Hong Kong (China), whose country calling code is +852</p>
     * <p>*   **MO**: Macau (China), whose country calling code is +853</p>
     * <p>*   **TW**: Taiwan (China), whose country calling code is +886</p>
     * <p>*   **RU**: Russia, whose country calling code is +7</p>
     * <p>*   **SG**: Singapore, whose country calling code is +65</p>
     * <p>*   **MY**: Malaysia, whose country calling code is +60</p>
     * <p>*   **ID**: Indonesia, whose country calling code is +62</p>
     * <p>*   **DE**: Germany, whose country calling code is +49</p>
     * <p>*   **AU**: Australia, whose country calling code is +61</p>
     * <p>*   **US**: US, whose country calling code is +1</p>
     * <p>*   **AE**: United Arab Emirates, whose country calling code is +971</p>
     * <p>*   **JP**: Japan, whose country calling code is +81</p>
     * <p>*   **GB**: UK, whose country calling code is +44</p>
     * <p>*   **IN**: India, whose country calling code is +91</p>
     * <p>*   **KR**: Republic of Korea, whose country calling code is +82</p>
     * <p>*   **PH**: Philippines, whose country calling code is +63</p>
     * <p>*   **CH**: Switzerland, whose country calling code is +41</p>
     * <p>*   **SE**: Sweden, whose country calling code is +46</p>
     */
    @NameInMap("MobileCountryCode")
    public String mobileCountryCode;

    /**
     * <p>Specifies whether password reset is required upon the next logon. Valid values:</p>
     * <br>
     * <p>- true: yes</p>
     * <br>
     * <p>- false: no</p>
     */
    @NameInMap("NeedResetPassword")
    public Boolean needResetPassword;

    /**
     * <p>The logon password of the user that you want to add. The logon password can be up to 128 characters in length.</p>
     * <br>
     * <p>>  This parameter is required if the **Source** parameter is set to **Local**.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The region ID of the bastion host to which you want to add a user.</p>
     * <br>
     * <p>>  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The source of the user that you want to add. Valid values:</p>
     * <br>
     * <p>- **Local**: a local user</p>
     * <p>- **Ram**: a RAM user</p>
     * <p>- **AD** : an AD-authenticated user</p>
     * <p>- **LDAP** : an LDAP-authenticated user</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The unique identifier of the user that you want to add.</p>
     * <br>
     * <p>>  This parameter uniquely identifies a RAM user of the bastion host. This parameter is required if the **Source** parameter is set to **Ram**. You can call the [ListUsers](~~28684~~) operation to obtain the unique identifier of the user from the **UserId** response parameter.</p>
     */
    @NameInMap("SourceUserId")
    public String sourceUserId;

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
     * <p>- Global: follows the global settings</p>
     * <p>- Disable: disables two-factor authentication</p>
     * <p>- Enable: enable two-factor authentication and follows settings of the single user</p>
     */
    @NameInMap("TwoFactorStatus")
    public String twoFactorStatus;

    /**
     * <p>The logon name of the user that you want to add. The logon name can contain only letters, digits, and underscores (\_) and can be up to 128 characters in length.</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static CreateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserRequest self = new CreateUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateUserRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateUserRequest setEffectiveEndTime(Long effectiveEndTime) {
        this.effectiveEndTime = effectiveEndTime;
        return this;
    }
    public Long getEffectiveEndTime() {
        return this.effectiveEndTime;
    }

    public CreateUserRequest setEffectiveStartTime(Long effectiveStartTime) {
        this.effectiveStartTime = effectiveStartTime;
        return this;
    }
    public Long getEffectiveStartTime() {
        return this.effectiveStartTime;
    }

    public CreateUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateUserRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public CreateUserRequest setMobileCountryCode(String mobileCountryCode) {
        this.mobileCountryCode = mobileCountryCode;
        return this;
    }
    public String getMobileCountryCode() {
        return this.mobileCountryCode;
    }

    public CreateUserRequest setNeedResetPassword(Boolean needResetPassword) {
        this.needResetPassword = needResetPassword;
        return this;
    }
    public Boolean getNeedResetPassword() {
        return this.needResetPassword;
    }

    public CreateUserRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateUserRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateUserRequest setSourceUserId(String sourceUserId) {
        this.sourceUserId = sourceUserId;
        return this;
    }
    public String getSourceUserId() {
        return this.sourceUserId;
    }

    public CreateUserRequest setTwoFactorMethods(String twoFactorMethods) {
        this.twoFactorMethods = twoFactorMethods;
        return this;
    }
    public String getTwoFactorMethods() {
        return this.twoFactorMethods;
    }

    public CreateUserRequest setTwoFactorStatus(String twoFactorStatus) {
        this.twoFactorStatus = twoFactorStatus;
        return this;
    }
    public String getTwoFactorStatus() {
        return this.twoFactorStatus;
    }

    public CreateUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
