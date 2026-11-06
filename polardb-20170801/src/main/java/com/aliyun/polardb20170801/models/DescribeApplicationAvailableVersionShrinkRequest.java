// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationAvailableVersionShrinkRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The application type.</p>
     * 
     * <strong>example:</strong>
     * <p>supabase</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <p>The list of application subcomponents.</p>
     */
    @NameInMap("Components")
    public String componentsShrink;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeApplicationAvailableVersionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationAvailableVersionShrinkRequest self = new DescribeApplicationAvailableVersionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationAvailableVersionShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribeApplicationAvailableVersionShrinkRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public DescribeApplicationAvailableVersionShrinkRequest setComponentsShrink(String componentsShrink) {
        this.componentsShrink = componentsShrink;
        return this;
    }
    public String getComponentsShrink() {
        return this.componentsShrink;
    }

    public DescribeApplicationAvailableVersionShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
