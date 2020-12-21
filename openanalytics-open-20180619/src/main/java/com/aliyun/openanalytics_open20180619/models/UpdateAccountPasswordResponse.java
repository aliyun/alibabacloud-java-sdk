// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class UpdateAccountPasswordResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Account")
    @Validation(required = true)
    public UpdateAccountPasswordResponseAccount account;

    public static UpdateAccountPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccountPasswordResponse self = new UpdateAccountPasswordResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAccountPasswordResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAccountPasswordResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateAccountPasswordResponse setAccount(UpdateAccountPasswordResponseAccount account) {
        this.account = account;
        return this;
    }
    public UpdateAccountPasswordResponseAccount getAccount() {
        return this.account;
    }

    public static class UpdateAccountPasswordResponseAccount extends TeaModel {
        @NameInMap("UserName")
        @Validation(required = true)
        public String userName;

        @NameInMap("Password")
        @Validation(required = true)
        public String password;

        public static UpdateAccountPasswordResponseAccount build(java.util.Map<String, ?> map) throws Exception {
            UpdateAccountPasswordResponseAccount self = new UpdateAccountPasswordResponseAccount();
            return TeaModel.build(map, self);
        }

        public UpdateAccountPasswordResponseAccount setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public UpdateAccountPasswordResponseAccount setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

    }

}
