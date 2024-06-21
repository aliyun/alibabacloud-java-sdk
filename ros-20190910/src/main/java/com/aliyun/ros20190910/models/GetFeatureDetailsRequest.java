// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetFeatureDetailsRequest extends TeaModel {
    /**
     * <p>The one or more features that you want to query. Valid values:</p>
     * <ul>
     * <li>Terraform: the Terraform hosting feature.</li>
     * <li>ResourceCleaner: the resource cleaner feature. You can use ALIYUN::ROS::ResourceCleaner to create a resource cleaner.</li>
     * <li>TemplateScratch: the scenario feature.</li>
     * <li>All: all features that are supported by ROS.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Terraform</p>
     */
    @NameInMap("Feature")
    public String feature;

    /**
     * <p>The region ID of the stack. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
