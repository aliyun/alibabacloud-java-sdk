// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationAvailableModelsRequest extends TeaModel {
    /**
     * <p>The application engine filter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mem0</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <p>The region ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeApplicationAvailableModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationAvailableModelsRequest self = new DescribeApplicationAvailableModelsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationAvailableModelsRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public DescribeApplicationAvailableModelsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
