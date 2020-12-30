// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class ResetMainPasswordResponseBody extends TeaModel {
    @NameInMap("Account")
    public ResetMainPasswordResponseBodyAccount account;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RegionId")
    public String regionId;

    public static ResetMainPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetMainPasswordResponseBody self = new ResetMainPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetMainPasswordResponseBody setAccount(ResetMainPasswordResponseBodyAccount account) {
        this.account = account;
        return this;
    }
    public ResetMainPasswordResponseBodyAccount getAccount() {
        return this.account;
    }

    public ResetMainPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetMainPasswordResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ResetMainPasswordResponseBodyAccount extends TeaModel {
        @NameInMap("Password")
        public String password;

        @NameInMap("UserName")
        public String userName;

        public static ResetMainPasswordResponseBodyAccount build(java.util.Map<String, ?> map) throws Exception {
            ResetMainPasswordResponseBodyAccount self = new ResetMainPasswordResponseBodyAccount();
            return TeaModel.build(map, self);
        }

        public ResetMainPasswordResponseBodyAccount setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ResetMainPasswordResponseBodyAccount setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
