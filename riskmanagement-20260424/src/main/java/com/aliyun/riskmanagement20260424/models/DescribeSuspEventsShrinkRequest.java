// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class DescribeSuspEventsShrinkRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-guangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Security Center SDK request parameters.</p>
     */
    @NameInMap("SdkRequest")
    public String sdkRequestShrink;

    public static DescribeSuspEventsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventsShrinkRequest self = new DescribeSuspEventsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSuspEventsShrinkRequest setSdkRequestShrink(String sdkRequestShrink) {
        this.sdkRequestShrink = sdkRequestShrink;
        return this;
    }
    public String getSdkRequestShrink() {
        return this.sdkRequestShrink;
    }

}
