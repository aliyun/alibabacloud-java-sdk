// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCClusterNodesRequest extends TeaModel {
    /**
     * <p>The instance IDs.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The node information.</p>
     */
    @NameInMap("Nodes")
    public java.util.List<String> nodes;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The virtual private cloud (VPC) ID.</p>
     * <blockquote>
     * <p> This is a reserved parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DeleteRCClusterNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRCClusterNodesRequest self = new DeleteRCClusterNodesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRCClusterNodesRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DeleteRCClusterNodesRequest setNodes(java.util.List<String> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<String> getNodes() {
        return this.nodes;
    }

    public DeleteRCClusterNodesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteRCClusterNodesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
