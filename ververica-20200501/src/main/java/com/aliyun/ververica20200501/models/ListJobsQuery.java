// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class ListJobsQuery extends TeaModel {
    @NameInMap("deploymentId")
    @Validation(required = true)
    public String deploymentId;

    public static ListJobsQuery build(java.util.Map<String, ?> map) throws Exception {
        ListJobsQuery self = new ListJobsQuery();
        return TeaModel.build(map, self);
    }

    public ListJobsQuery setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

}
