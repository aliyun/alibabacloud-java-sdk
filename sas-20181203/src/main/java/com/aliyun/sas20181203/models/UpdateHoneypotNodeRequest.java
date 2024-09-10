// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateHoneypotNodeRequest extends TeaModel {
    /**
     * <p>The number of available probes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("AvailableProbeNum")
    public Integer availableProbeNum;

    /**
     * <p>The ID of the management node.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListHoneypotNode~~">ListHoneypotNode</a> operation to query the IDs of management nodes.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>67ab3f4c-3db5-4fc3-b51f-00f8bfabfa08</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The name of the management node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HoneypotNodeTest</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The CIDR blocks that are allowed to access the management node.</p>
     */
    @NameInMap("SecurityGroupProbeIpList")
    public java.util.List<String> securityGroupProbeIpList;

    public static UpdateHoneypotNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHoneypotNodeRequest self = new UpdateHoneypotNodeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHoneypotNodeRequest setAvailableProbeNum(Integer availableProbeNum) {
        this.availableProbeNum = availableProbeNum;
        return this;
    }
    public Integer getAvailableProbeNum() {
        return this.availableProbeNum;
    }

    public UpdateHoneypotNodeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public UpdateHoneypotNodeRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public UpdateHoneypotNodeRequest setSecurityGroupProbeIpList(java.util.List<String> securityGroupProbeIpList) {
        this.securityGroupProbeIpList = securityGroupProbeIpList;
        return this;
    }
    public java.util.List<String> getSecurityGroupProbeIpList() {
        return this.securityGroupProbeIpList;
    }

}
