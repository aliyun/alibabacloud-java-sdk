// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetFeatureDetailsRequest extends TeaModel {
    /**
     * <p>The one or more features that you want to query. Valid values:</p>
     * <br>
     * <p>*   Terraform: the Terraform hosting feature.</p>
     * <p>*   ResourceCleaner: the resource cleaner feature. You can use ALIYUN::ROS::ResourceCleaner to create a resource cleaner.</p>
     * <p>*   TemplateScratch: the scenario feature.</p>
     * <p>*   All: all features that are supported by ROS.</p>
     */
    @NameInMap("Feature")
    public String feature;

    /**
     * <p>The region ID of the stack. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
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
