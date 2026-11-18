// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class SwitchInstanceToTargetZoneRequest extends TeaModel {
    /**
     * <p>Instance ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/473778.html">DescribeInstances</a> operation to query instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the child node of a Cluster Edition instance.</p>
     * <blockquote>
     * <p>If this parameter is not specified, all shards are switched to the target zone.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****-db-0</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The switchover mode. Valid values:</p>
     * <ul>
     * <li><strong>ReliabilityPriority</strong> (default): Reliability priority. A primary/secondary switchover is performed only when there is no replication lag between the primary and secondary nodes to ensure zero data loss. In scenarios with heavy write traffic and continuous replication lag, the switchover may fail.</li>
     * <li><strong>AvailablePriority</strong>: Availability priority. A primary/secondary switchover is performed immediately regardless of the replication lag between the primary and secondary nodes. A small amount of data may be lost.</li>
     * </ul>
     * <blockquote>
     * <p>Select a switchover mode based on your business requirements for data and services.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ReliabilityPriority</p>
     */
    @NameInMap("SwitchType")
    public String switchType;

    /**
     * <p>The ID of the target zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-j</p>
     */
    @NameInMap("TargetZoneId")
    public String targetZoneId;

    public static SwitchInstanceToTargetZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchInstanceToTargetZoneRequest self = new SwitchInstanceToTargetZoneRequest();
        return TeaModel.build(map, self);
    }

    public SwitchInstanceToTargetZoneRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SwitchInstanceToTargetZoneRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public SwitchInstanceToTargetZoneRequest setSwitchType(String switchType) {
        this.switchType = switchType;
        return this;
    }
    public String getSwitchType() {
        return this.switchType;
    }

    public SwitchInstanceToTargetZoneRequest setTargetZoneId(String targetZoneId) {
        this.targetZoneId = targetZoneId;
        return this;
    }
    public String getTargetZoneId() {
        return this.targetZoneId;
    }

}
