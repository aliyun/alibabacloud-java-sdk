// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class TaskPreparingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>33040b9a-b04b-452f-b554-cd6f3a15f850</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1971226538081821</p>
     */
    @NameInMap("InstanceOwnerId")
    public Long instanceOwnerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c9e42cd7-ba99-4872-9802-e05719ab051c</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static TaskPreparingRequest build(java.util.Map<String, ?> map) throws Exception {
        TaskPreparingRequest self = new TaskPreparingRequest();
        return TeaModel.build(map, self);
    }

    public TaskPreparingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TaskPreparingRequest setInstanceOwnerId(Long instanceOwnerId) {
        this.instanceOwnerId = instanceOwnerId;
        return this;
    }
    public Long getInstanceOwnerId() {
        return this.instanceOwnerId;
    }

    public TaskPreparingRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
