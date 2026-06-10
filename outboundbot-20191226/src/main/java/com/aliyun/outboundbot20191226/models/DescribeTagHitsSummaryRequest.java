// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeTagHitsSummaryRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8fa1953f-4a84-46d8-b80c-8ce9cf684fb3</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The job group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>292eba45-df08-4065-87e7-7e587a1ce4ce</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    public static DescribeTagHitsSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagHitsSummaryRequest self = new DescribeTagHitsSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTagHitsSummaryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeTagHitsSummaryRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

}
