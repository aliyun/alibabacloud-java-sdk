// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of users returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The users returned.</p>
     */
    @NameInMap("Users")
    public java.util.List<ListUsersResponseBodyUsers> users;

    public static ListUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponseBody self = new ListUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListUsersResponseBody setUsers(java.util.List<ListUsersResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListUsersResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class ListUsersResponseBodyUsers extends TeaModel {
        /**
         * <p>The remarks of the user.</p>
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
         * <p>The end time of the validity period of the user. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1672502400</p>
         */
        @NameInMap("EffectiveEndTime")
        public Long effectiveEndTime;

        /**
         * <p>The start time of the validity period of the user. The value is a UNIX timestamp. Unit: seconds.</p>
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
         * <p>Indicates whether notifications are sent in the language specified in the global settings or a custom language.</p>
         * <ul>
         * <li><strong>Global</strong></li>
         * <li><strong>Custom</strong></li>
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
         * <p>The location where the mobile phone number of the user is registered. Valid values:</p>
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
         * <li><strong>JP:</strong> Japan, whose international dialing code is +81.</li>
         * <li><strong>GB</strong>: UK, whose international dialing code is +44.</li>
         * <li><strong>IN</strong>: India, whose international dialing code is +91.</li>
         * <li><strong>KR</strong>: Republic of Korea, whose international dialing code is +82.</li>
         * <li><strong>PH</strong>: Philippines, whose international dialing code is +63.</li>
         * <li><strong>CH</strong>: Switzerland, whose international dialing code is +41.</li>
         * <li><strong>SE</strong>: Sweden, whose international dialing code is +46.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("MobileCountryCode")
        public String mobileCountryCode;

        /**
         * <p>Indicates whether password reset is required upon the next logon. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedResetPassword")
        public Boolean needResetPassword;

        /**
         * <p>The type of the user. Valid values:</p>
         * <ul>
         * <li><strong>Local</strong>: a local user.</li>
         * <li><strong>Ram</strong>: a RAM user.</li>
         * <li><strong>AD</strong>: an AD-authenticated user.</li>
         * <li><strong>LDAP</strong>: an LDAP-authenticated user.</li>
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
         * <p> This parameter uniquely identifies a RAM user of the bastion host. A value is returned for this parameter if <strong>Source</strong> is set to <strong>Ram</strong>. No value is returned for this parameter if <strong>Source</strong> is set to <strong>Local</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>122748924538****</p>
         */
        @NameInMap("SourceUserId")
        public String sourceUserId;

        /**
         * <p>An array of the enabled two-factor authentication methods.</p>
         */
        @NameInMap("TwoFactorMethods")
        public java.util.List<String> twoFactorMethods;

        /**
         * <p>Indicates whether two-factor authentication is enabled for the user. Valid values:</p>
         * <ul>
         * <li><strong>Global</strong>: The global setting applies.</li>
         * <li><strong>Disable</strong>: Two-factor authentication is disabled.</li>
         * <li><strong>Enable</strong>: Two-factor authentication is enabled. The user-specific setting for the authentication method applies.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("TwoFactorStatus")
        public String twoFactorStatus;

        /**
         * <p>The user ID.</p>
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
         * <p>abc_def</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>An array that lists the states of users.</p>
         */
        @NameInMap("UserState")
        public java.util.List<String> userState;

        public static ListUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUsers self = new ListUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUsers setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListUsersResponseBodyUsers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUsersResponseBodyUsers setEffectiveEndTime(Long effectiveEndTime) {
            this.effectiveEndTime = effectiveEndTime;
            return this;
        }
        public Long getEffectiveEndTime() {
            return this.effectiveEndTime;
        }

        public ListUsersResponseBodyUsers setEffectiveStartTime(Long effectiveStartTime) {
            this.effectiveStartTime = effectiveStartTime;
            return this;
        }
        public Long getEffectiveStartTime() {
            return this.effectiveStartTime;
        }

        public ListUsersResponseBodyUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListUsersResponseBodyUsers setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListUsersResponseBodyUsers setLanguageStatus(String languageStatus) {
            this.languageStatus = languageStatus;
            return this;
        }
        public String getLanguageStatus() {
            return this.languageStatus;
        }

        public ListUsersResponseBodyUsers setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListUsersResponseBodyUsers setMobileCountryCode(String mobileCountryCode) {
            this.mobileCountryCode = mobileCountryCode;
            return this;
        }
        public String getMobileCountryCode() {
            return this.mobileCountryCode;
        }

        public ListUsersResponseBodyUsers setNeedResetPassword(Boolean needResetPassword) {
            this.needResetPassword = needResetPassword;
            return this;
        }
        public Boolean getNeedResetPassword() {
            return this.needResetPassword;
        }

        public ListUsersResponseBodyUsers setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListUsersResponseBodyUsers setSourceUserId(String sourceUserId) {
            this.sourceUserId = sourceUserId;
            return this;
        }
        public String getSourceUserId() {
            return this.sourceUserId;
        }

        public ListUsersResponseBodyUsers setTwoFactorMethods(java.util.List<String> twoFactorMethods) {
            this.twoFactorMethods = twoFactorMethods;
            return this;
        }
        public java.util.List<String> getTwoFactorMethods() {
            return this.twoFactorMethods;
        }

        public ListUsersResponseBodyUsers setTwoFactorStatus(String twoFactorStatus) {
            this.twoFactorStatus = twoFactorStatus;
            return this;
        }
        public String getTwoFactorStatus() {
            return this.twoFactorStatus;
        }

        public ListUsersResponseBodyUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListUsersResponseBodyUsers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListUsersResponseBodyUsers setUserState(java.util.List<String> userState) {
            this.userState = userState;
            return this;
        }
        public java.util.List<String> getUserState() {
            return this.userState;
        }

    }

}
