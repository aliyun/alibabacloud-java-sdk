// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SubmitBatchJobsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6b3ea2a1-32b3-4041-842b-9bde5de9dda0</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    public static SubmitBatchJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitBatchJobsRequest self = new SubmitBatchJobsRequest();
        return TeaModel.build(map, self);
    }

    public SubmitBatchJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SubmitBatchJobsRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

}
