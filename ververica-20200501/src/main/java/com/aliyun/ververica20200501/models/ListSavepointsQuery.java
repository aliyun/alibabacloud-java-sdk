// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class ListSavepointsQuery extends TeaModel {
    @NameInMap("deploymentId")
    @Validation(required = true)
    public String deploymentId;

    @NameInMap("jobId")
    public String jobId;

    public static ListSavepointsQuery build(java.util.Map<String, ?> map) throws Exception {
        ListSavepointsQuery self = new ListSavepointsQuery();
        return TeaModel.build(map, self);
    }

    public ListSavepointsQuery setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public ListSavepointsQuery setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
