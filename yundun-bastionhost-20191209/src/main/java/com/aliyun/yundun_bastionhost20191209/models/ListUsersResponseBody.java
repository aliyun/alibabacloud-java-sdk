// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of users that were queried.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of users that were queried.</p>
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
         * <p>The description of the user.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The display name of the user.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("EffectiveEndTime")
        public Long effectiveEndTime;

        @NameInMap("EffectiveStartTime")
        public Long effectiveStartTime;

        /**
         * <p>The email address of the user.</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The mobile number of the user.</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>The country where the mobile number of the user is registered. Valid values:</p>
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
         * <p>*   **US**: United States, whose country calling code is +1</p>
         * <p>*   **AE**: United Arab Emirates, whose country calling code is +971</p>
         * <p>*   **JP**: Japan, whose country calling code is +81</p>
         * <p>*   **GB**: United Kingdom, whose country calling code is +44</p>
         * <p>*   **IN**: India, whose country calling code is +91</p>
         * <p>*   **KR**: South Korea, whose country calling code is +82</p>
         * <p>*   **PH**: Philippines, whose country calling code is +63</p>
         * <p>*   **CH**: Switzerland, whose country calling code is +41</p>
         * <p>*   **SE**: Sweden, whose country calling code is +46</p>
         */
        @NameInMap("MobileCountryCode")
        public String mobileCountryCode;

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
         * <p>>  This parameter uniquely identifies a RAM user of the Bastionhost instance. A value is returned for this parameter if the **Source** parameter is set to **Ram**. No value is returned for this parameter if the **Source** parameter is set to **Local**.</p>
         */
        @NameInMap("SourceUserId")
        public String sourceUserId;

        @NameInMap("TwoFactorMethods")
        public java.util.List<String> twoFactorMethods;

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
         * <p>The statuses of the user.</p>
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
