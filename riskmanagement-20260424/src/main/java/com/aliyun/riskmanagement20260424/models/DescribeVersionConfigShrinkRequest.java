// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class DescribeVersionConfigShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-guangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SdkRequest")
    public String sdkRequestShrink;

    public static DescribeVersionConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVersionConfigShrinkRequest self = new DescribeVersionConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVersionConfigShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVersionConfigShrinkRequest setSdkRequestShrink(String sdkRequestShrink) {
        this.sdkRequestShrink = sdkRequestShrink;
        return this;
    }
    public String getSdkRequestShrink() {
        return this.sdkRequestShrink;
    }

}
