// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetGpuClusterTopologyRequest extends TeaModel {
    /**
     * <p>The ID of the channel. Used to view the collective communication topology and the topology relationships of a specified channel ID under a specified communication group, such as the communication, tree, or ring topology among ranks within a communication group. This parameter must be used together with communication_id and topo_type. You can call the GetGpuClusterArgsOptions operation with the channel filter parameter to obtain the list of channel_id values under a specified communication_id.</p>
     * 
     * <strong>example:</strong>
     * <p>communicationId =0x412523235123
     * channelId=1
     * topoType=ring</p>
     */
    @NameInMap("channelId")
    public String channelId;

    /**
     * <p>The name of the cluster. You can select a cluster from the cluster list obtained by calling the GetListGpuCluster operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;cluster1&quot;</p>
     */
    @NameInMap("clusterId")
    public String clusterId;

    /**
     * <p>The ID of the communication group. Used to view the collective communication topology and the topology relationships of a specified communication group ID, such as the communication, tree, or ring topology among ranks within a communication group. This parameter must be used together with channel_id and topo_type. You can call the GetGpuClusterArgsOptions operation with the communication filter type to obtain the list of communication_id values.</p>
     * 
     * <strong>example:</strong>
     * <p>communicationId =0x412523235123
     * channelId=1
     * topoType=ring</p>
     */
    @NameInMap("communicationId")
    public String communicationId;

    /**
     * <p>The list of instances for which to query GPU topology information.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;instance1&quot;, &quot;instance2&quot;,&quot;instance3&quot;]</p>
     */
    @NameInMap("instanceIdList")
    public Object instanceIdList;

    /**
     * <p>The list of pods for which to query GPU topology information.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;pod1&quot;, &quot;pod2&quot;,&quot;pod3&quot;]</p>
     */
    @NameInMap("podList")
    public Object podList;

    /**
     * <p>The query timestamp. Default value: the current time. The timestamp must be accurate to seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1709740800</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>The list of tasks for which to query GPU topology information.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;task1&quot;, &quot;task2&quot;]</p>
     */
    @NameInMap("taskIdList")
    public Object taskIdList;

    /**
     * <p>The topology type. Used to view the collective communication topology and the topology relationships of a specified topology type under a specified communication group and channel ID, such as the communication, tree, or ring topology among ranks within a communication group. This parameter must be used together with communication_id and channel_id. You can call the GetGpuClusterArgsOptions operation with the topoType filter parameter to obtain the list of topo_type values under a specified communication_id and channel_id.</p>
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
