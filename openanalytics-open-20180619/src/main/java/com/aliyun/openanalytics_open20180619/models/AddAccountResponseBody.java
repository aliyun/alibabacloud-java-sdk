// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class AddAccountResponseBody extends TeaModel {
    @NameInMap("Account")
    public AddAccountResponseBodyAccount account;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RegionId")
    public String regionId;

    public static AddAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAccountResponseBody self = new AddAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAccountResponseBody setAccount(AddAccountResponseBodyAccount account) {
        this.account = account;
        return this;
    }
    public AddAccountResponseBodyAccount getAccount() {
        return this.account;
    }

    public AddAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddAccountResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class AddAccountResponseBodyAccount extends TeaModel {
        @NameInMap("Password")
        public String password;

        @NameInMap("UserName")
        public String userName;

        public static AddAccountResponseBodyAccount build(java.util.Map<String, ?> map) throws Exception {
            AddAccountResponseBodyAccount self = new AddAccountResponseBodyAccount();
            return TeaModel.build(map, self);
        }

        public AddAccountResponseBodyAccount setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public AddAccountResponseBodyAccount setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
