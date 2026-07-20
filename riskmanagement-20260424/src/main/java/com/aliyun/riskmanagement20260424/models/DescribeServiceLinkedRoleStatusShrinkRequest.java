// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class DescribeServiceLinkedRoleStatusShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SdkRequest")
    public String sdkRequestShrink;

    public static DescribeServiceLinkedRoleStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceLinkedRoleStatusShrinkRequest self = new DescribeServiceLinkedRoleStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceLinkedRoleStatusShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeServiceLinkedRoleStatusShrinkRequest setSdkRequestShrink(String sdkRequestShrink) {
        this.sdkRequestShrink = sdkRequestShrink;
        return this;
    }
    public String getSdkRequestShrink() {
        return this.sdkRequestShrink;
    }

}
