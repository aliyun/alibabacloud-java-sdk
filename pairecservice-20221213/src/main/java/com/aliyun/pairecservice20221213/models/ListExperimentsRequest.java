// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListExperimentsRequest extends TeaModel {
    @NameInMap("ExperimentGroupId")
    public String experimentGroupId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Query")
    public String query;

    @NameInMap("Status")
    public String status;

    public static ListExperimentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentsRequest self = new ListExperimentsRequest();
        return TeaModel.build(map, self);
    }

    public ListExperimentsRequest setExperimentGroupId(String experimentGroupId) {
        this.experimentGroupId = experimentGroupId;
        return this;
    }
    public String getExperimentGroupId() {
        return this.experimentGroupId;
    }

    public ListExperimentsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListExperimentsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListExperimentsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
