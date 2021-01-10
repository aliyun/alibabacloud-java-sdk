// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchDeleteTSJobRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobIds")
    public String jobIds;

    public static BatchDeleteTSJobRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteTSJobRequest self = new BatchDeleteTSJobRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteTSJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchDeleteTSJobRequest setJobIds(String jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public String getJobIds() {
        return this.jobIds;
    }

}
