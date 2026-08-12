// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class CreateSasTrialShrinkRequest extends TeaModel {
    /**
     * <p>The region ID of the access control instance. You can call the DescribeRegions operation to query the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Security Center SDK request.</p>
     */
    @NameInMap("SdkRequest")
    public String sdkRequestShrink;

    public static CreateSasTrialShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSasTrialShrinkRequest self = new CreateSasTrialShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSasTrialShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSasTrialShrinkRequest setSdkRequestShrink(String sdkRequestShrink) {
        this.sdkRequestShrink = sdkRequestShrink;
        return this;
    }
    public String getSdkRequestShrink() {
        return this.sdkRequestShrink;
    }

}
