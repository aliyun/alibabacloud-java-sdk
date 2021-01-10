// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSJobItemByNameRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobNames")
    public java.util.List<String> jobNames;

    public static QueryTSJobItemByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTSJobItemByNameRequest self = new QueryTSJobItemByNameRequest();
        return TeaModel.build(map, self);
    }

    public QueryTSJobItemByNameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTSJobItemByNameRequest setJobNames(java.util.List<String> jobNames) {
        this.jobNames = jobNames;
        return this;
    }
    public java.util.List<String> getJobNames() {
        return this.jobNames;
    }

}
