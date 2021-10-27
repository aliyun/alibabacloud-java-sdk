// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class GetPolarxCommodityRequest extends TeaModel {
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("RegionId")
    public String regionId;

    public static GetPolarxCommodityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPolarxCommodityRequest self = new GetPolarxCommodityRequest();
        return TeaModel.build(map, self);
    }

    public GetPolarxCommodityRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public GetPolarxCommodityRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public GetPolarxCommodityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
