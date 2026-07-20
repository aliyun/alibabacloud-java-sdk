// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class BindAuthToMachineShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SdkRequest")
    public String sdkRequestShrink;

    public static BindAuthToMachineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAuthToMachineShrinkRequest self = new BindAuthToMachineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BindAuthToMachineShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public BindAuthToMachineShrinkRequest setSdkRequestShrink(String sdkRequestShrink) {
        this.sdkRequestShrink = sdkRequestShrink;
        return this;
    }
    public String getSdkRequestShrink() {
        return this.sdkRequestShrink;
    }

}
