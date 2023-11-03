// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeQuickSaleConfigRequest extends TeaModel {
    /**
     * <p>Product code.</p>
     */
    @NameInMap("Commodity")
    public String commodity;

    /**
     * <p>The database engine that is run by the instance. Valid values:</p>
     * <br>
     * <p>* **MySQL**</p>
     * <p>* **SQLServer**</p>
     * <p>* **PostgreSQL**</p>
     * <p>* **MariaDB**</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeQuickSaleConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeQuickSaleConfigRequest self = new DescribeQuickSaleConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeQuickSaleConfigRequest setCommodity(String commodity) {
        this.commodity = commodity;
        return this;
    }
    public String getCommodity() {
        return this.commodity;
    }

    public DescribeQuickSaleConfigRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeQuickSaleConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
