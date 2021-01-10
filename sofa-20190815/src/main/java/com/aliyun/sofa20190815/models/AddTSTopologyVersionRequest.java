// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddTSTopologyVersionRequest extends TeaModel {
    @NameInMap("BaseVersion")
    public Long baseVersion;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobId")
    public Long jobId;

    public static AddTSTopologyVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTSTopologyVersionRequest self = new AddTSTopologyVersionRequest();
        return TeaModel.build(map, self);
    }

    public AddTSTopologyVersionRequest setBaseVersion(Long baseVersion) {
        this.baseVersion = baseVersion;
        return this;
    }
    public Long getBaseVersion() {
        return this.baseVersion;
    }

    public AddTSTopologyVersionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddTSTopologyVersionRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

}
