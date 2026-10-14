// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetGpuClusterTopologyRequest extends TeaModel {
    /**
     * <p>Used when viewing collective communication topology. Specifies the topology relationship for a given channel ID within a communication group, such as the inter-rank communication topology (tree or ring topology). Must be used together with communication_id and topo_type.</p>
     * <p>⚠️ Use the channel filter parameter of the GetGpuClusterArgsOptions operation to retrieve the list of channel_id values for a specified communication_id.</p>
     * 
     * <strong>example:</strong>
     * <p>communicationId =0x412523235123
     * channelId=1
     * topoType=ring</p>
     */
    @NameInMap("channelId")
    public String channelId;

    /**
     * <p>The cluster name. Select a cluster from the cluster list returned by the GetListGpuCluster operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;cluster1&quot;</p>
     */
    @NameInMap("clusterId")
    public String clusterId;

    /**
     * <p>Used when viewing collective communication topology. Specifies the topology relationship for a given communication group ID, such as the inter-rank communication topology (tree or ring topology) within a communication group. Must be used together with channel_id and topo_type.</p>
     * <p>⚠️ Use the communication filter type of the GetGpuClusterArgsOptions operation to retrieve the list of communication_id values.</p>
     * 
     * <strong>example:</strong>
     * <p>communicationId =0x412523235123
     * channelId=1
     * topoType=ring</p>
     */
    @NameInMap("communicationId")
    public String communicationId;

    /**
     * <p>The GPU topology information for the specified list of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;instance1&quot;, &quot;instance2&quot;,&quot;instance3&quot;]</p>
     */
    @NameInMap("instanceIdList")
    public Object instanceIdList;

    /**
     * <p>The GPU topology information for the specified list of pods.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;pod1&quot;, &quot;pod2&quot;,&quot;pod3&quot;]</p>
     */
    @NameInMap("podList")
    public Object podList;

    /**
     * <p>The timestamp for the query. Defaults to the current time. Must be a second-level timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1709740800</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>The GPU topology information for the specified list of nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;task1&quot;, &quot;task2&quot;]</p>
     */
    @NameInMap("taskIdList")
    public Object taskIdList;

    /**
     * <p>Used when viewing collective communication topology. Specifies the topology relationship for a given topology type within a communication group and channel, such as the inter-rank communication topology (tree or ring topology). Must be used together with communication_id and channel_id.</p>
     * <p>⚠️ Use the topoType filter parameter of the GetGpuClusterArgsOptions operation to retrieve the list of topo_type values for a specified communication_id and channel_id.</p>
     * 
     * <strong>example:</strong>
     * <p>communicationId =0x412523235123
     * channelId=1
     * topoType=ring</p>
     */
    @NameInMap("topoType")
    public String topoType;

    public static GetGpuClusterTopologyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGpuClusterTopologyRequest self = new GetGpuClusterTopologyRequest();
        return TeaModel.build(map, self);
    }

    public GetGpuClusterTopologyRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public GetGpuClusterTopologyRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetGpuClusterTopologyRequest setCommunicationId(String communicationId) {
        this.communicationId = communicationId;
        return this;
    }
    public String getCommunicationId() {
        return this.communicationId;
    }

    public GetGpuClusterTopologyRequest setInstanceIdList(Object instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public Object getInstanceIdList() {
        return this.instanceIdList;
    }

    public GetGpuClusterTopologyRequest setPodList(Object podList) {
        this.podList = podList;
        return this;
    }
    public Object getPodList() {
        return this.podList;
    }

    public GetGpuClusterTopologyRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetGpuClusterTopologyRequest setTaskIdList(Object taskIdList) {
        this.taskIdList = taskIdList;
        return this;
    }
    public Object getTaskIdList() {
        return this.taskIdList;
    }

    public GetGpuClusterTopologyRequest setTopoType(String topoType) {
        this.topoType = topoType;
        return this;
    }
    public String getTopoType() {
        return this.topoType;
    }

}
