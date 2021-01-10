// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ResumeTSTriggerInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobRequestId")
    public String jobRequestId;

    public static ResumeTSTriggerInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeTSTriggerInstanceRequest self = new ResumeTSTriggerInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ResumeTSTriggerInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ResumeTSTriggerInstanceRequest setJobRequestId(String jobRequestId) {
        this.jobRequestId = jobRequestId;
        return this;
    }
    public String getJobRequestId() {
        return this.jobRequestId;
    }

}
