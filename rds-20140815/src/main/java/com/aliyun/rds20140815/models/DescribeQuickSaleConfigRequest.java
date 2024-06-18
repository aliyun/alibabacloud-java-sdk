// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeQuickSaleConfigRequest extends TeaModel {
    /**
     * <p>The product code. Valid values:</p>
     * <ul>
     * <li>rds: The instance is a subscription instance.</li>
     * <li>bards: The instance is a pay-as-you-go instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("Commodity")
    public String commodity;

    /**
     * <p>The database engine of the instance. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong></li>
     * <li><strong>SQLServer</strong></li>
     * <li><strong>PostgreSQL</strong></li>
     * <li><strong>MariaDB</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/26243.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
