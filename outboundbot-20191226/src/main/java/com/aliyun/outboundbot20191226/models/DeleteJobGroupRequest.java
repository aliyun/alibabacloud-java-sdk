// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteJobGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8fa1953f-4a84-46d8-b80c-8ce9cf684fb3</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fc1fb484-4fe8-4031-b662-5b87ea88590b</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    public static DeleteJobGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobGroupRequest self = new DeleteJobGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteJobGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteJobGroupRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

}
