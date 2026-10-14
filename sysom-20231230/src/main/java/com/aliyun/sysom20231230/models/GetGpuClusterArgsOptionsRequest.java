// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetGpuClusterArgsOptionsRequest extends TeaModel {
    /**
     * <ol>
     * <li><p>Query the machine list of a cluster
     * Set the retrieval type to comm_instance_id_list or instance_id_list.
     * comm_instance_id_list: retrieves only the machines that participate in collective communication in the specified cluster.
     * instance_id_list: retrieves all machines in the specified cluster.</p>
     * </li>
     * <li><p>Query the AI task list of a cluster
     * Set the retrieval type to comm_task_id_list or task_id_list.
     * comm_task_id_list: retrieves only the tasks that involve collective communication in the specified cluster.
     * task_id_list: retrieves all tasks in the specified cluster.</p>
     * </li>
     * <li><p>Query the AI job pod list of a cluster
     * Set the retrieval type to comm_pod_list or pod_list.
     * comm_pod_list: retrieves only the pods that participate in collective communication in the specified cluster.
     * pod_list: retrieves all pods in the specified cluster.</p>
     * </li>
     * <li><p>Query the collective communication topology
     * communication: retrieves all communication group IDs.
     * channel: retrieves the channel list under the specified communication group ID.
     * topoType: retrieves the topology type under the specified channel of the specified communication group ID.</p>
     * </li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance_id_list</p>
     */
    @NameInMap("filterType")
    public String filterType;

    /**
     * <p>The filter conditions. The value is a JSON object. The cluster_id field is required. The following optional filter conditions are supported:</p>
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
