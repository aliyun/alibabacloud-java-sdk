// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class ResetMainPasswordResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Account")
    @Validation(required = true)
    public ResetMainPasswordResponseAccount account;

    public static ResetMainPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetMainPasswordResponse self = new ResetMainPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetMainPasswordResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetMainPasswordResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResetMainPasswordResponse setAccount(ResetMainPasswordResponseAccount account) {
        this.account = account;
        return this;
    }
    public ResetMainPasswordResponseAccount getAccount() {
        return this.account;
    }

    public static class ResetMainPasswordResponseAccount extends TeaModel {
        @NameInMap("UserName")
        @Validation(required = true)
        public String userName;

        @NameInMap("Password")
        @Validation(required = true)
        public String password;

        public static ResetMainPasswordResponseAccount build(java.util.Map<String, ?> map) throws Exception {
            ResetMainPasswordResponseAccount self = new ResetMainPasswordResponseAccount();
            return TeaModel.build(map, self);
        }

        public ResetMainPasswordResponseAccount setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ResetMainPasswordResponseAccount setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

    }

}
