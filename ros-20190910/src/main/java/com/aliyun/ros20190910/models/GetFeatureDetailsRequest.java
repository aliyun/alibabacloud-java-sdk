// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetFeatureDetailsRequest extends TeaModel {
    /**
     * <p>The resource types that support the scenario feature.</p>
     */
    @NameInMap("Feature")
    public String feature;

    /**
     * <p>The resource types that support the system tag `acs:ros:stackId`.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetFeatureDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFeatureDetailsRequest self = new GetFeatureDetailsRequest();
        return TeaModel.build(map, self);
    }

    public GetFeatureDetailsRequest setFeature(String feature) {
        this.feature = feature;
        return this;
    }
    public String getFeature() {
        return this.feature;
    }

    public GetFeatureDetailsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
