// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeRegionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsRequest self = new DescribeRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeRegionsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
