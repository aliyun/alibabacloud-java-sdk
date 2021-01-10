// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSTopologyRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("ProcessId")
    public Long processId;

    public static QueryTSTopologyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTSTopologyRequest self = new QueryTSTopologyRequest();
        return TeaModel.build(map, self);
    }

    public QueryTSTopologyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTSTopologyRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public QueryTSTopologyRequest setProcessId(Long processId) {
        this.processId = processId;
        return this;
    }
    public Long getProcessId() {
        return this.processId;
    }

}
