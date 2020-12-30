// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class UpdateAccountPasswordResponseBody extends TeaModel {
    @NameInMap("Account")
    public UpdateAccountPasswordResponseBodyAccount account;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateAccountPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccountPasswordResponseBody self = new UpdateAccountPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAccountPasswordResponseBody setAccount(UpdateAccountPasswordResponseBodyAccount account) {
        this.account = account;
        return this;
    }
    public UpdateAccountPasswordResponseBodyAccount getAccount() {
        return this.account;
    }

    public UpdateAccountPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAccountPasswordResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class UpdateAccountPasswordResponseBodyAccount extends TeaModel {
        @NameInMap("Password")
        public String password;

        @NameInMap("UserName")
        public String userName;

        public static UpdateAccountPasswordResponseBodyAccount build(java.util.Map<String, ?> map) throws Exception {
            UpdateAccountPasswordResponseBodyAccount self = new UpdateAccountPasswordResponseBodyAccount();
            return TeaModel.build(map, self);
        }

        public UpdateAccountPasswordResponseBodyAccount setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public UpdateAccountPasswordResponseBodyAccount setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
