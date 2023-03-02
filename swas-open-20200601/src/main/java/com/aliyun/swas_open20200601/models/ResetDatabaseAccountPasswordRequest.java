// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ResetDatabaseAccountPasswordRequest extends TeaModel {
    @NameInMap("AccountPassword")
    public String accountPassword;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DatabaseInstanceId")
    public String databaseInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static ResetDatabaseAccountPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetDatabaseAccountPasswordRequest self = new ResetDatabaseAccountPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ResetDatabaseAccountPasswordRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public ResetDatabaseAccountPasswordRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ResetDatabaseAccountPasswordRequest setDatabaseInstanceId(String databaseInstanceId) {
        this.databaseInstanceId = databaseInstanceId;
        return this;
    }
    public String getDatabaseInstanceId() {
        return this.databaseInstanceId;
    }

    public ResetDatabaseAccountPasswordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
