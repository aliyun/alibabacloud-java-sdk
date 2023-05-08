// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeVpcsRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeVpcsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcsRequest self = new DescribeVpcsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
