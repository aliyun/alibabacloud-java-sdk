// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreateLoginProfileResponseBody extends TeaModel {
    /**
     * <p>The logon configurations of the RAM user.</p>
     */
    @NameInMap("LoginProfile")
    public CreateLoginProfileResponseBodyLoginProfile loginProfile;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLoginProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLoginProfileResponseBody self = new CreateLoginProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLoginProfileResponseBody setLoginProfile(CreateLoginProfileResponseBodyLoginProfile loginProfile) {
        this.loginProfile = loginProfile;
        return this;
    }
    public CreateLoginProfileResponseBodyLoginProfile getLoginProfile() {
        return this.loginProfile;
    }

    public CreateLoginProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateLoginProfileResponseBodyLoginProfile extends TeaModel {
        /**
         * <p>The time when the logon configurations were created.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>Indicates whether an MFA device must be attached to the RAM user upon logon.</p>
         */
        @NameInMap("MFABindRequired")
        public Boolean MFABindRequired;

        /**
         * <p>Indicates whether the RAM user must change the password upon logon.</p>
         */
        @NameInMap("PasswordResetRequired")
        public Boolean passwordResetRequired;

        /**
         * <p>The name of the RAM user.</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static CreateLoginProfileResponseBodyLoginProfile build(java.util.Map<String, ?> map) throws Exception {
            CreateLoginProfileResponseBodyLoginProfile self = new CreateLoginProfileResponseBodyLoginProfile();
            return TeaModel.build(map, self);
        }

        public CreateLoginProfileResponseBodyLoginProfile setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateLoginProfileResponseBodyLoginProfile setMFABindRequired(Boolean MFABindRequired) {
            this.MFABindRequired = MFABindRequired;
            return this;
        }
        public Boolean getMFABindRequired() {
            return this.MFABindRequired;
        }

        public CreateLoginProfileResponseBodyLoginProfile setPasswordResetRequired(Boolean passwordResetRequired) {
            this.passwordResetRequired = passwordResetRequired;
            return this;
        }
        public Boolean getPasswordResetRequired() {
            return this.passwordResetRequired;
        }

        public CreateLoginProfileResponseBodyLoginProfile setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
