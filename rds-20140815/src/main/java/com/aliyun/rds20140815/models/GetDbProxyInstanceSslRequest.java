// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class GetDbProxyInstanceSslRequest extends TeaModel {
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetDbProxyInstanceSslRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDbProxyInstanceSslRequest self = new GetDbProxyInstanceSslRequest();
        return TeaModel.build(map, self);
    }

    public GetDbProxyInstanceSslRequest setDBProxyEngineType(String DBProxyEngineType) {
        this.DBProxyEngineType = DBProxyEngineType;
        return this;
    }
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    public GetDbProxyInstanceSslRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public GetDbProxyInstanceSslRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
