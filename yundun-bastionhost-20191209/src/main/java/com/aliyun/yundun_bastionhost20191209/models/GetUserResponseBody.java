// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetUserResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the user that was queried.</p>
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
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The display name of the user.</p>
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
         * <p>The email address of the user.</p>
         */
        @NameInMap("Email")
        public String email;

        @NameInMap("Language")
        public String language;

        @NameInMap("LanguageStatus")
        public String languageStatus;

        /**
         * <p>The mobile phone number of the user.</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>The location in which the mobile number of the user is registered. Valid values:</p>
         * <br>
         * <p>*   **CN**: the Chinese mainland, whose country calling code is +86</p>
         * <p>*   **HK**: Hong Kong (China), whose country calling code is +852</p>
         * <p>*   **MO**: Macao (China), whose country calling code is +853</p>
         * <p>*   **TW**: Taiwan (China), whose country calling code is +886</p>
         * <p>*   **RU**: Russia, whose country calling code is +7</p>
         * <p>*   **SG**: Singapore, whose country calling code is +65</p>
         * <p>*   **MY**: Malaysia, whose country calling code is +60</p>
         * <p>*   **ID**: Indonesia, whose country calling code is +62</p>
         * <p>*   **DE**: Germany, whose country calling code is +49</p>
         * <p>*   **AU**: Australia, whose country calling code is +61</p>
         * <p>*   **US**: US, whose country calling code is +1</p>
         * <p>*   **AE**: United Arab Emirates, whose country calling code is +971</p>
         * <p>*   **JP:** Japan, whose country calling code is +81</p>
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
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("NeedResetPassword")
        public Boolean needResetPassword;

        /**
         * <p>The source of the user. Valid values:</p>
         * <br>
         * <p>*   **Local**: a local user</p>
         * <p>*   **Ram**: a RAM user</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The unique ID of the user.</p>
         * <br>
         * <p>> This parameter uniquely identifies a RAM user of the bastion host. A value is returned for this parameter if the **Source** parameter is set to **Ram**. No value is returned for this parameter if the **Source** parameter is set to **Local**.</p>
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
         * <br>
         * <p>*   **Global**: The global settings are used.</p>
         * <p>*   **Disable**: The two-factor authentication is disabled.</p>
         * <p>*   **Enable**: The two-factor authentication is enabled and the user-specific setting is used.</p>
         */
        @NameInMap("TwoFactorStatus")
        public String twoFactorStatus;

        /**
         * <p>The ID of the user.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The logon name of the user.</p>
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
