// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    /**
     * <p>The remarks of the user that you want to add. The remarks can be up to 500 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The display name of the user that you want to add. The display name can be up to 128 characters in length.</p>
     * <blockquote>
     * <p> If you leave this parameter empty, the logon name is used as the display name.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Bob</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The end time of the validity period of the user. Specify a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1672502400</p>
     */
    @NameInMap("EffectiveEndTime")
    public Long effectiveEndTime;

    /**
     * <p>The start time of the validity period of the user. Specify a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1669630029</p>
     */
    @NameInMap("EffectiveStartTime")
    public Long effectiveStartTime;

    /**
     * <p>The email address of the user that you want to add.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is required if TwoFactorStatus is set to Enable and TwoFactorMethods is set to email, or if TwoFactorStatus is set to Global and TwoFactorMethods is set to email in the global two-factor authentication settings.</p>
     * </li>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/462968.html">GetInstanceTwoFactor</a> operation to query the global two-factor authentication settings.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The ID of the bastion host to which you want to add a user.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required if LanguageStatus is set to Custom. Valid values:</p>
     * <ul>
     * <li><strong>zh-cn</strong>: simplified Chinese.</li>
     * <li><strong>en</strong>: English.</li>
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
     * <p> If you leave this parameter empty, the default value Global is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("LanguageStatus")
    public String languageStatus;

    /**
     * <p>The mobile phone number of the user that you want to add.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is required if TwoFactorStatus is set to Enable and TwoFactorMethods is set to sms or dingtalk, or if TwoFactorStatus is set to Global and TwoFactorMethods is set to sms or dingtalk in the global two-factor authentication settings.</p>
     * </li>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/462968.html">GetInstanceTwoFactor</a> operation to query the global two-factor authentication settings.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1359999****</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>The location where the mobile phone number of the user is registered. Default value: CN. Valid values:</p>
     * <ul>
     * <li><strong>CN</strong>: the Chinese mainland, whose international dialing code is +86.</li>
     * <li><strong>HK</strong>: Hong Kong (China), whose international dialing code is +852.</li>
     * <li><strong>MO</strong>: Macao (China), whose international dialing code is +853.</li>
     * <li><strong>TW</strong>: Taiwan (China), whose international dialing code is +886.</li>
     * <li><strong>RU</strong>: Russia, whose international dialing code is +7.</li>
     * <li><strong>SG</strong>: Singapore, whose international dialing code is +65.</li>
     * <li><strong>MY</strong>: Malaysia, whose international dialing code is +60.</li>
     * <li><strong>ID</strong>: Indonesia, whose international dialing code is +62.</li>
     * <li><strong>DE</strong>: Germany, whose international dialing code is +49.</li>
     * <li><strong>AU</strong>: Australia, whose international dialing code is +61.</li>
     * <li><strong>US</strong>: US, whose international dialing code is +1.</li>
     * <li><strong>AE</strong>: United Arab Emirates, whose international dialing code is +971.</li>
     * <li><strong>JP</strong>: Japan, whose international dialing code is +81.</li>
     * <li><strong>GB</strong>: UK, whose international dialing code is +44.</li>
     * <li><strong>IN</strong>: India, whose international dialing code is +91.</li>
     * <li><strong>KR</strong>: Republic of Korea, whose international dialing code is +82.</li>
     * <li><strong>PH</strong>: Philippines, whose international dialing code is +63.</li>
     * <li><strong>CH</strong>: Switzerland, whose international dialing code is +41.</li>
     * <li><strong>SE:</strong> Sweden, whose international dialing code is +46.</li>
     * <li><strong>SA:</strong> Saudi Arabia, whose international dialing code is +966.</li>
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
     * <p> If you leave this parameter empty, the default value false is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedResetPassword")
    public Boolean needResetPassword;

    /**
     * <p>The logon password of the user that you want to add. The logon password must be 8 to 128 characters in length. It must contain uppercase letters, lowercase letters, digits, and special characters.</p>
     * <blockquote>
     * <p>This parameter is required if Source is set to Local.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>213****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The region ID of the bastion host to which you want to add a user.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the user that you want to add. Valid values:</p>
     * <ul>
     * <li><strong>Local</strong>: a local user.</li>
     * <li><strong>Ram</strong>: a RAM user.</li>
     * <li><strong>AD</strong>: an AD-authenticated user.</li>
     * <li><strong>LDAP</strong>: an LDAP-authenticated user.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>local</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The unique ID of the user that you want to add.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter uniquely identifies a RAM user of the bastion host. This parameter is required if Source is set to Ram. You can call the <a href="https://help.aliyun.com/document_detail/28684.html">ListUsers</a> operation in RAM to obtain the unique ID of the user from the UserId response parameter.</p>
     * </li>
     * <li><p>This parameter is required if Source is set to AD or LDAP. Specify the distinguished name (DN) of the Active Directory (AD)-authenticated user or Lightweight Directory Access Protocol (LDAP)-authenticated user that you want to add.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>122748924538****</p>
     */
    @NameInMap("SourceUserId")
    public String sourceUserId;

    /**
     * <p>The two-factor authentication method. You can select only one method. Valid values:</p>
     * <ul>
     * <li><strong>sms</strong>: text message-based two-factor authentication.</li>
     * <li><strong>email</strong>: email-based two-factor authentication.</li>
     * <li><strong>dingtalk</strong>: DingTalk-based two-factor authentication.</li>
     * <li><strong>totp OTP</strong>: one-time password (OTP) token-based two-factor authentication.</li>
     * </ul>
     * <blockquote>
     * <p> If TwoFactorStatus is set to Enable, you must select one of the preceding values for TwoFactorMethods.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;sms&quot;]</p>
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
     * <p> If you leave this parameter empty, the default value Global is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("TwoFactorStatus")
    public String twoFactorStatus;

    /**
     * <p>The logon name of the user that you want to add. The logon name must be 1 to 128 characters in length and can contain only letters, digits, and underscores (_).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc_def</p>
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

    public CreateUserRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateUserRequest setLanguageStatus(String languageStatus) {
        this.languageStatus = languageStatus;
        return this;
    }
    public String getLanguageStatus() {
        return this.languageStatus;
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
