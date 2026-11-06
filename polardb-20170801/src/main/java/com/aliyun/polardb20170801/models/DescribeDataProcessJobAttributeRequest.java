// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDataProcessJobAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the data processing job to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job-123456</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The ID of the region where the job is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDataProcessJobAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataProcessJobAttributeRequest self = new DescribeDataProcessJobAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataProcessJobAttributeRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribeDataProcessJobAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
