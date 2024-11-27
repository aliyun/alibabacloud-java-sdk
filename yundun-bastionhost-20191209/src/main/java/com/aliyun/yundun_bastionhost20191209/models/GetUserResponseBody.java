// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetUserResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The detailed information about the queried user.</p>
     */
    @NameInMap("User")
    public GetUserResponseBodyUser user;

    public static GetUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserResponseBody self = new GetUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserResponseBody setUser(GetUserResponseBodyUser user) {
        this.user = user;
        return this;
    }
    public GetUserResponseBodyUser getUser() {
        return this.user;
    }

    public static class GetUserResponseBodyUser extends TeaModel {
        /**
         * <p>The description of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The display name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>Bob</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The end of the validity period of the user. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1672502400</p>
         */
        @NameInMap("EffectiveEndTime")
        public Long effectiveEndTime;

        /**
         * <p>The beginning of the validity period of the user. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1669630029</p>
         */
        @NameInMap("EffectiveStartTime")
        public Long effectiveStartTime;

        /**
         * <p>The email address of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>1099**@qq.com</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>This parameter is required if LanguageStatus is set to Custom.</p>
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
         * <p>Indicates whether notifications are sent in the language specified in the global settings or a custom language.</p>
         * <ul>
         * <li><strong>Global</strong>: Global</li>
         * <li><strong>Custom</strong>: Custom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("LanguageStatus")
        public String languageStatus;

        /**
         * <p>The mobile phone number of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>1359999****</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>The location in which the mobile number of the user is registered. Valid values:</p>
         * <ul>
         * <li><strong>CN</strong>: the Chinese mainland, whose country calling code is +86</li>
         * <li><strong>HK</strong>: Hong Kong (China), whose country calling code is +852</li>
         * <li><strong>MO</strong>: Macao (China), whose country calling code is +853</li>
         * <li><strong>TW</strong>: Taiwan (China), whose country calling code is +886</li>
         * <li><strong>RU</strong>: Russia, whose country calling code is +7</li>
         * <li><strong>SG</strong>: Singapore, whose country calling code is +65</li>
         * <li><strong>MY</strong>: Malaysia, whose country calling code is +60</li>
         * <li><strong>ID</strong>: Indonesia, whose country calling code is +62</li>
         * <li><strong>DE</strong>: Germany, whose country calling code is +49</li>
         * <li><strong>AU</strong>: Australia, whose country calling code is +61</li>
         * <li><strong>US</strong>: US, whose country calling code is +1</li>
         * <li><strong>AE</strong>: United Arab Emirates, whose country calling code is +971</li>
         * <li><strong>JP:</strong> Japan, whose country calling code is +81</li>
         * <li><strong>GB</strong>: UK, whose country calling code is +44</li>
         * <li><strong>IN</strong>: India, whose country calling code is +91</li>
         * <li><strong>KR</strong>: Republic of Korea, whose country calling code is +82</li>
         * <li><strong>PH</strong>: Philippines, whose country calling code is +63</li>
         * <li><strong>CH</strong>: Switzerland, whose country calling code is +41</li>
         * <li><strong>SE</strong>: Sweden, whose country calling code is +46</li>
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
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedResetPassword")
        public Boolean needResetPassword;

        /**
         * <p>The source of the user. Valid values:</p>
         * <ul>
         * <li><strong>Local</strong>: a local user</li>
         * <li><strong>Ram</strong>: a RAM user</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Local</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The unique ID of the user.</p>
         * <blockquote>
         * <p>This parameter uniquely identifies a RAM user of the bastion host. A value is returned for this parameter if the <strong>Source</strong> parameter is set to <strong>Ram</strong>. No value is returned for this parameter if the <strong>Source</strong> parameter is set to <strong>Local</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>122748924538****</p>
         */
        @NameInMap("SourceUserId")
        public String sourceUserId;

        /**
         * <p>An array that consists of the details of the two-factor authentication method.</p>
         */
        @NameInMap("TwoFactorMethods")
        public java.util.List<String> twoFactorMethods;

        /**
         * <p>The two-factor authentication status of the user. Valid values:</p>
         * <ul>
         * <li><strong>Global</strong>: The global settings are used.</li>
         * <li><strong>Disable</strong>: The two-factor authentication is disabled.</li>
         * <li><strong>Enable</strong>: The two-factor authentication is enabled and the user-specific setting is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("TwoFactorStatus")
        public String twoFactorStatus;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The logon name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>abcabc_def</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>An array that consists of the details of the user status.</p>
         */
        @NameInMap("UserState")
        public java.util.List<String> userState;

        public static GetUserResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUser self = new GetUserResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUser setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetUserResponseBodyUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetUserResponseBodyUser setEffectiveEndTime(Long effectiveEndTime) {
            this.effectiveEndTime = effectiveEndTime;
            return this;
        }
        public Long getEffectiveEndTime() {
            return this.effectiveEndTime;
        }

        public GetUserResponseBodyUser setEffectiveStartTime(Long effectiveStartTime) {
            this.effectiveStartTime = effectiveStartTime;
            return this;
        }
        public Long getEffectiveStartTime() {
            return this.effectiveStartTime;
        }

        public GetUserResponseBodyUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetUserResponseBodyUser setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GetUserResponseBodyUser setLanguageStatus(String languageStatus) {
            this.languageStatus = languageStatus;
            return this;
        }
        public String getLanguageStatus() {
            return this.languageStatus;
        }

        public GetUserResponseBodyUser setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetUserResponseBodyUser setMobileCountryCode(String mobileCountryCode) {
            this.mobileCountryCode = mobileCountryCode;
            return this;
        }
        public String getMobileCountryCode() {
            return this.mobileCountryCode;
        }

        public GetUserResponseBodyUser setNeedResetPassword(Boolean needResetPassword) {
            this.needResetPassword = needResetPassword;
            return this;
        }
        public Boolean getNeedResetPassword() {
            return this.needResetPassword;
        }

        public GetUserResponseBodyUser setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetUserResponseBodyUser setSourceUserId(String sourceUserId) {
            this.sourceUserId = sourceUserId;
            return this;
        }
        public String getSourceUserId() {
            return this.sourceUserId;
        }

        public GetUserResponseBodyUser setTwoFactorMethods(java.util.List<String> twoFactorMethods) {
            this.twoFactorMethods = twoFactorMethods;
            return this;
        }
        public java.util.List<String> getTwoFactorMethods() {
            return this.twoFactorMethods;
        }

        public GetUserResponseBodyUser setTwoFactorStatus(String twoFactorStatus) {
            this.twoFactorStatus = twoFactorStatus;
            return this;
        }
        public String getTwoFactorStatus() {
            return this.twoFactorStatus;
        }

        public GetUserResponseBodyUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetUserResponseBodyUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public GetUserResponseBodyUser setUserState(java.util.List<String> userState) {
            this.userState = userState;
            return this;
        }
        public java.util.List<String> getUserState() {
            return this.userState;
        }

    }

}
