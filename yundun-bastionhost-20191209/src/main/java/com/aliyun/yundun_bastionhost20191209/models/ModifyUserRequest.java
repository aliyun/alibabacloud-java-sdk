// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyUserRequest extends TeaModel {
    /**
     * <p>The new remarks of the user. The remarks can be up to 500 characters in length.</p>
     * <blockquote>
     * <p> Leave this parameter empty if you do not want to change the remarks of the user.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The new display name of the user. The display name can be up to 128 characters in length.</p>
     * <blockquote>
     * <p> Leave this parameter empty if you do not want to change the display name of the user.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Bob</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The end time of the validity period of the user. Specify a UNIX timestamp. Unit: seconds.</p>
     * <blockquote>
     * <p> Leave this parameter empty if you do not want to change the end time of the validity period.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1672502400</p>
     */
    @NameInMap("EffectiveEndTime")
    public Long effectiveEndTime;

    /**
     * <p>The start time of the validity period of the user. Specify a UNIX timestamp. Unit: seconds.</p>
     * <blockquote>
     * <p> Leave this parameter empty if you do not want to change the start time of the validity period.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1669630029</p>
     */
    @NameInMap("EffectiveStartTime")
    public Long effectiveStartTime;

    /**
     * <p>The new email address of the user.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is required if TwoFactorStatus is set to Enable and TwoFactorMethods is set to email, or if TwoFactorStatus is set to Global and TwoFactorMethods is set to email in the global two-factor authentication settings.</p>
     * </li>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/462968.html">GetInstanceTwoFactor</a> operation to query the global two-factor authentication settings.</p>
     * </li>
     * <li><p>Leave this parameter empty if you do not want to change the email address of the user.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The ID of the bastion host on which you want to modify the information about the user.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required if LanguageStatus is set to Custom.</p>
     * <ul>
     * <li><strong>zh-cn</strong>: simplified Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>Specifies whether to send notifications in the language specified in the global settings or a custom language.</p>
     * <ul>
     * <li><strong>Global</strong></li>
     * <li><strong>Custom</strong></li>
     * </ul>
     * <blockquote>
     * <p> Leave this parameter empty if you do not want to change the natural language used to notify the user.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("LanguageStatus")
    public String languageStatus;

    /**
     * <p>The new mobile phone number of the user.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is required if TwoFactorStatus is set to Enable and TwoFactorMethods is set to sms or dingtalk, or if TwoFactorStatus is set to Global and TwoFactorMethods is set to sms or dingtalk in the global two-factor authentication settings.</p>
     * </li>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/462968.html">GetInstanceTwoFactor</a> operation to query the global two-factor authentication settings.</p>
     * </li>
     * <li><p>Leave this parameter empty if you do not want to change the mobile phone number of the user.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1358888****</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>The country where the new mobile number of the user is registered. Valid values:</p>
     * <ul>
     * <li><strong>CN:</strong> the Chinese mainland, whose country calling code is +86</li>
     * <li><strong>HK:</strong> Hong Kong (China), whose country calling code is +852</li>
     * <li><strong>MO:</strong> Macao (China), whose country calling code is +853</li>
     * <li><strong>TW:</strong> Taiwan (China), whose country calling code is +886</li>
     * <li><strong>RU:</strong> Russia, whose country calling code is +7</li>
     * <li><strong>SG:</strong> Singapore, whose country calling code is +65</li>
     * <li><strong>MY:</strong> Malaysia, whose country calling code is +60</li>
     * <li><strong>ID:</strong> Indonesia, whose country calling code is +62</li>
     * <li><strong>DE:</strong> Germany, whose country calling code is +49</li>
     * <li><strong>AU:</strong> Australia, whose country calling code is +61</li>
     * <li><strong>US:</strong> US, whose country calling code is +1</li>
     * <li><strong>AE:</strong> United Arab Emirates, whose country calling code is +971</li>
     * <li><strong>JP:</strong> Japan, whose country calling code is +81</li>
     * <li><strong>GB:</strong> UK, whose country calling code is +44</li>
     * <li><strong>IN:</strong> India, whose country calling code is +91</li>
     * <li><strong>KR:</strong> Republic of Korea, whose country calling code is +82</li>
     * <li><strong>PH:</strong> Philippines, whose country calling code is +63</li>
     * <li><strong>CH:</strong> Switzerland, whose country calling code is +41</li>
     * <li><strong>SE:</strong> Sweden, whose country calling code is +46</li>
     * <li><strong>SA:</strong> Saudi Arabia, whose country calling code is +966</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("MobileCountryCode")
    public String mobileCountryCode;

    /**
     * <p>Specifies whether password reset is required upon the next logon. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <blockquote>
     * <p> Leave this parameter empty if you do not want to change the password reset settings for the user.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedResetPassword")
    public Boolean needResetPassword;

    /**
     * <p>The new password of the user. The password must be 8 to 128 characters in length. It must contain uppercase letters, lowercase letters, digits, and special characters.</p>
     * <blockquote>
     * <p>Leave this parameter empty if you do not want to change the password of the user.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>321****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The region ID of the bastion host on which you want to modify the information about the user.</p>
     * <blockquote>
     * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The two-factor authentication method. You can select only one method. Valid values:</p>
     * <ul>
     * <li><strong>sms</strong>: text message-based two-factor authentication.</li>
     * <li><strong>email</strong>: email-based two-factor authentication.</li>
     * <li><strong>dingtalk</strong>: DingTalk-based two-factor authentication.</li>
     * <li><strong>totp OTP:</strong> one-time password (OTP) token-based two-factor authentication.</li>
     * </ul>
     * <blockquote>
     * <p> If TwoFactorStatus is set to Enable, you must specify one of the valid values as TwoFactorMethods.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sms</p>
     */
    @NameInMap("TwoFactorMethods")
    public String twoFactorMethods;

    /**
     * <p>Specifies whether two-factor authentication is enabled for the user. Valid values:</p>
     * <ul>
     * <li><strong>Global</strong>: The global settings apply.</li>
     * <li><strong>Disable</strong>: Two-factor authentication is disabled.</li>
     * <li><strong>Enable</strong>: Two-factor authentication is enabled and user-specific settings apply.</li>
     * </ul>
     * <blockquote>
     * <p> Leave this parameter empty if you do not want to change the two-factory authentication settings for the user.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("TwoFactorStatus")
    public String twoFactorStatus;

    /**
     * <p>The ID of the user whose information you want to modify.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/204522.html">ListUsers</a> operation to query the user ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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

    public ModifyUserRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ModifyUserRequest setLanguageStatus(String languageStatus) {
        this.languageStatus = languageStatus;
        return this;
    }
    public String getLanguageStatus() {
        return this.languageStatus;
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
