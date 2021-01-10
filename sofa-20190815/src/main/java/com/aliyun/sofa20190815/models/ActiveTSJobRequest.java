// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ActiveTSJobRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobIds")
    public String jobIds;

    public static ActiveTSJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ActiveTSJobRequest self = new ActiveTSJobRequest();
        return TeaModel.build(map, self);
    }

    public ActiveTSJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ActiveTSJobRequest setJobIds(String jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public String getJobIds() {
        return this.jobIds;
    }

}
