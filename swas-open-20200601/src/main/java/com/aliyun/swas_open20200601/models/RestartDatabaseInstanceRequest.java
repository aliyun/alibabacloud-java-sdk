// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class RestartDatabaseInstanceRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DatabaseInstanceId")
    public String databaseInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static RestartDatabaseInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartDatabaseInstanceRequest self = new RestartDatabaseInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RestartDatabaseInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RestartDatabaseInstanceRequest setDatabaseInstanceId(String databaseInstanceId) {
        this.databaseInstanceId = databaseInstanceId;
        return this;
    }
    public String getDatabaseInstanceId() {
        return this.databaseInstanceId;
    }

    public RestartDatabaseInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
