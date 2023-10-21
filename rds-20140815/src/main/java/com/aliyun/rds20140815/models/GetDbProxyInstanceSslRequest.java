// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class GetDbProxyInstanceSslRequest extends TeaModel {
    /**
     * <p>A reserved parameter. You do not need to specify this parameter.</p>
     */
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    /**
     * <p>The instance ID. You can call the [DescribeDBInstances](~~610396~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~610399~~) operation to query the most recent region list.</p>
     */
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
