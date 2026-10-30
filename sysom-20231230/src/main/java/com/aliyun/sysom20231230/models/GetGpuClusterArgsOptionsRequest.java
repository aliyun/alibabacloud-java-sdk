// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetGpuClusterArgsOptionsRequest extends TeaModel {
    /**
     * <ol>
     * <li>Query cluster machine list scenario: Set the retrieval type to comm_instance_id_list or instance_id_list. comm_instance_id_list: Retrieves only the list of machines in the specified cluster that participate in collective communication. instance_id_list: Retrieves the list of all machines in the specified cluster.</li>
     * <li>Query cluster AI task list scenario: Set the retrieval type to comm_task_id_list or task_id_list. comm_task_id_list: Retrieves only the list of tasks in the specified cluster that involve collective communication. task_id_list: Retrieves the list of all tasks in the specified cluster.</li>
     * <li>Query cluster AI job pod list scenario: Set the retrieval type to comm_pod_list or pod_list. comm_pod_list: Retrieves only the list of pods in the specified cluster that participate in collective communication. pod_list: Retrieves the list of all pods in the specified cluster.</li>
     * <li>Query collective communication topology scenario: communication: Retrieves all communication group IDs. channel: Retrieves the channel list under the specified communication group ID. topoType: Retrieves the topology type under the specified channel of the specified communication group ID.</li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance_id_list</p>
     */
    @NameInMap("filterType")
    public String filterType;

    /**
     * <p>The filter conditions, which is a JSON object. The cluster_id field is required. Other filter conditions support the following values:</p>
     * <ul>
     * <li>instance_id_list</li>
     * <li>comm_instance_id_list</li>
     * <li>pod_list</li>
     * <li>comm_pod_list</li>
     * <li>communication</li>
     * <li>task_id_list</li>
     * <li>comm_task_id_list</li>
     * <li>channel</li>
     * <li>topoType</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     * &quot;cluster_id&quot;: &quot;cluster1&quot;
     * }</p>
     */
    @NameInMap("filterValues")
    public Object filterValues;

    public static GetGpuClusterArgsOptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGpuClusterArgsOptionsRequest self = new GetGpuClusterArgsOptionsRequest();
        return TeaModel.build(map, self);
    }

    public GetGpuClusterArgsOptionsRequest setFilterType(String filterType) {
        this.filterType = filterType;
        return this;
    }
    public String getFilterType() {
        return this.filterType;
    }

    public GetGpuClusterArgsOptionsRequest setFilterValues(Object filterValues) {
        this.filterValues = filterValues;
        return this;
    }
    public Object getFilterValues() {
        return this.filterValues;
    }

}
