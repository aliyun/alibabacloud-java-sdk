// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetLoginProfileResponseBody extends TeaModel {
    @NameInMap("LoginProfile")
    public GetLoginProfileResponseBodyLoginProfile loginProfile;

    @NameInMap("RequestId")
    public String requestId;

    public static GetLoginProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLoginProfileResponseBody self = new GetLoginProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLoginProfileResponseBody setLoginProfile(GetLoginProfileResponseBodyLoginProfile loginProfile) {
        this.loginProfile = loginProfile;
        return this;
    }
    public GetLoginProfileResponseBodyLoginProfile getLoginProfile() {
        return this.loginProfile;
    }

    public GetLoginProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLoginProfileResponseBodyLoginProfile extends TeaModel {
        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("MFABindRequired")
        public Boolean MFABindRequired;

        @NameInMap("PasswordResetRequired")
        public Boolean passwordResetRequired;

        @NameInMap("UserName")
        public String userName;

        public static GetLoginProfileResponseBodyLoginProfile build(java.util.Map<String, ?> map) throws Exception {
            GetLoginProfileResponseBodyLoginProfile self = new GetLoginProfileResponseBodyLoginProfile();
            return TeaModel.build(map, self);
        }

        public GetLoginProfileResponseBodyLoginProfile setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetLoginProfileResponseBodyLoginProfile setMFABindRequired(Boolean MFABindRequired) {
            this.MFABindRequired = MFABindRequired;
            return this;
        }
        public Boolean getMFABindRequired() {
            return this.MFABindRequired;
        }

        public GetLoginProfileResponseBodyLoginProfile setPasswordResetRequired(Boolean passwordResetRequired) {
            this.passwordResetRequired = passwordResetRequired;
            return this;
        }
        public Boolean getPasswordResetRequired() {
            return this.passwordResetRequired;
        }

        public GetLoginProfileResponseBodyLoginProfile setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
