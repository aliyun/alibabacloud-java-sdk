// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class DescribeCloudCenterInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the region in which the instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Security Center SDK request.</p>
     */
    @NameInMap("SdkRequest")
    public String sdkRequestShrink;

    public static DescribeCloudCenterInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudCenterInstancesShrinkRequest self = new DescribeCloudCenterInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudCenterInstancesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCloudCenterInstancesShrinkRequest setSdkRequestShrink(String sdkRequestShrink) {
        this.sdkRequestShrink = sdkRequestShrink;
        return this;
    }
    public String getSdkRequestShrink() {
        return this.sdkRequestShrink;
    }

}
