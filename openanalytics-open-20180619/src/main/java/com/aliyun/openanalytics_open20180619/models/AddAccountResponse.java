// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class AddAccountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Account")
    @Validation(required = true)
    public AddAccountResponseAccount account;

    public static AddAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAccountResponse self = new AddAccountResponse();
        return TeaModel.build(map, self);
    }

    public AddAccountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddAccountResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddAccountResponse setAccount(AddAccountResponseAccount account) {
        this.account = account;
        return this;
    }
    public AddAccountResponseAccount getAccount() {
        return this.account;
    }

    public static class AddAccountResponseAccount extends TeaModel {
        @NameInMap("UserName")
        @Validation(required = true)
        public String userName;

        @NameInMap("Password")
        @Validation(required = true)
        public String password;

        public static AddAccountResponseAccount build(java.util.Map<String, ?> map) throws Exception {
            AddAccountResponseAccount self = new AddAccountResponseAccount();
            return TeaModel.build(map, self);
        }

        public AddAccountResponseAccount setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public AddAccountResponseAccount setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

    }

}
