// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSTopologyInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobRequestId")
    public String jobRequestId;

    @NameInMap("ParentActivityInstanceId")
    public Long parentActivityInstanceId;

    @NameInMap("Shardings")
    public String shardings;

    public static QueryTSTopologyInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTSTopologyInstanceRequest self = new QueryTSTopologyInstanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryTSTopologyInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTSTopologyInstanceRequest setJobRequestId(String jobRequestId) {
        this.jobRequestId = jobRequestId;
        return this;
    }
    public String getJobRequestId() {
        return this.jobRequestId;
    }

    public QueryTSTopologyInstanceRequest setParentActivityInstanceId(Long parentActivityInstanceId) {
        this.parentActivityInstanceId = parentActivityInstanceId;
        return this;
    }
    public Long getParentActivityInstanceId() {
        return this.parentActivityInstanceId;
    }

    public QueryTSTopologyInstanceRequest setShardings(String shardings) {
        this.shardings = shardings;
        return this;
    }
    public String getShardings() {
        return this.shardings;
    }

}
