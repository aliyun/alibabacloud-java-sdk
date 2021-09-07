// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class GetPolarXPriceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("NodeCount")
    public String nodeCount;

    public static GetPolarXPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPolarXPriceRequest self = new GetPolarXPriceRequest();
        return TeaModel.build(map, self);
    }

    public GetPolarXPriceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetPolarXPriceRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public GetPolarXPriceRequest setNodeCount(String nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public String getNodeCount() {
        return this.nodeCount;
    }

}
