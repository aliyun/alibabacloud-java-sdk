// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceTypeFamiliesRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeRCInstanceTypeFamiliesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstanceTypeFamiliesRequest self = new DescribeRCInstanceTypeFamiliesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstanceTypeFamiliesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
