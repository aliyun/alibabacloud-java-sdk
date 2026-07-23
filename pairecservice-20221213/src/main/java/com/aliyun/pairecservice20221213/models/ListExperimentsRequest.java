// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListExperimentsRequest extends TeaModel {
    /**
     * <p>The ID of the experiment group.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ExperimentGroupId")
    public String experimentGroupId;

    /**
     * <p>The instance ID. You can call the ListInstances operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-abcdefg1234</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The filter parameter for quick search. All experiments that match the names or tags are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>experiment_test1</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The status of the experiment. Valid values:</p>
     * <ul>
     * <li><p>Offline</p>
     * </li>
     * <li><p>Online</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Offline</p>
     */
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
