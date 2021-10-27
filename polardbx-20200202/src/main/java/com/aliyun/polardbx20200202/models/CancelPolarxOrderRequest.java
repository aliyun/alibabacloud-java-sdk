// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CancelPolarxOrderRequest extends TeaModel {
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ScaleOutToken")
    public String scaleOutToken;

    public static CancelPolarxOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelPolarxOrderRequest self = new CancelPolarxOrderRequest();
        return TeaModel.build(map, self);
    }

    public CancelPolarxOrderRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CancelPolarxOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CancelPolarxOrderRequest setScaleOutToken(String scaleOutToken) {
        this.scaleOutToken = scaleOutToken;
        return this;
    }
    public String getScaleOutToken() {
        return this.scaleOutToken;
    }

}
