// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSTopologyBaseVersionsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobId")
    public Long jobId;

    public static QueryTSTopologyBaseVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTSTopologyBaseVersionsRequest self = new QueryTSTopologyBaseVersionsRequest();
        return TeaModel.build(map, self);
    }

    public QueryTSTopologyBaseVersionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTSTopologyBaseVersionsRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

}
