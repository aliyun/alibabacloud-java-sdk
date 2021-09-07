// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class RetryPolarxOrderRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("ScaleOutToken")
    public String scaleOutToken;

    public static RetryPolarxOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryPolarxOrderRequest self = new RetryPolarxOrderRequest();
        return TeaModel.build(map, self);
    }

    public RetryPolarxOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RetryPolarxOrderRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public RetryPolarxOrderRequest setScaleOutToken(String scaleOutToken) {
        this.scaleOutToken = scaleOutToken;
        return this;
    }
    public String getScaleOutToken() {
        return this.scaleOutToken;
    }

}
