// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreatePolarxOrderRequest extends TeaModel {
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("NodeCount")
    public String nodeCount;

    @NameInMap("RegionId")
    public String regionId;

    public static CreatePolarxOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolarxOrderRequest self = new CreatePolarxOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolarxOrderRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreatePolarxOrderRequest setNodeCount(String nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public String getNodeCount() {
        return this.nodeCount;
    }

    public CreatePolarxOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
