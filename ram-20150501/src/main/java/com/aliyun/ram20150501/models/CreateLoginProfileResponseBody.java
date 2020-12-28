// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreateLoginProfileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LoginProfile")
    public CreateLoginProfileResponseBodyLoginProfile loginProfile;

    public static CreateLoginProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLoginProfileResponseBody self = new CreateLoginProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLoginProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLoginProfileResponseBody setLoginProfile(CreateLoginProfileResponseBodyLoginProfile loginProfile) {
        this.loginProfile = loginProfile;
        return this;
    }
    public CreateLoginProfileResponseBodyLoginProfile getLoginProfile() {
        return this.loginProfile;
    }

    public static class CreateLoginProfileResponseBodyLoginProfile extends TeaModel {
        @NameInMap("PasswordResetRequired")
        public Boolean passwordResetRequired;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("MFABindRequired")
        public Boolean MFABindRequired;

        public static CreateLoginProfileResponseBodyLoginProfile build(java.util.Map<String, ?> map) throws Exception {
            CreateLoginProfileResponseBodyLoginProfile self = new CreateLoginProfileResponseBodyLoginProfile();
            return TeaModel.build(map, self);
        }

        public CreateLoginProfileResponseBodyLoginProfile setPasswordResetRequired(Boolean passwordResetRequired) {
            this.passwordResetRequired = passwordResetRequired;
            return this;
        }
        public Boolean getPasswordResetRequired() {
            return this.passwordResetRequired;
        }

        public CreateLoginProfileResponseBodyLoginProfile setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateLoginProfileResponseBodyLoginProfile setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public CreateLoginProfileResponseBodyLoginProfile setMFABindRequired(Boolean MFABindRequired) {
            this.MFABindRequired = MFABindRequired;
            return this;
        }
        public Boolean getMFABindRequired() {
            return this.MFABindRequired;
        }

    }

}
