// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleShrinkRequest extends TeaModel {
    /**
     * <p>The region ID of the Smart Access Gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Security Center SDK request.</p>
     */
    @NameInMap("SdkRequest")
    public String sdkRequestShrink;

    public static CreateServiceLinkedRoleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceLinkedRoleShrinkRequest self = new CreateServiceLinkedRoleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceLinkedRoleShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateServiceLinkedRoleShrinkRequest setSdkRequestShrink(String sdkRequestShrink) {
        this.sdkRequestShrink = sdkRequestShrink;
        return this;
    }
    public String getSdkRequestShrink() {
        return this.sdkRequestShrink;
    }

}
