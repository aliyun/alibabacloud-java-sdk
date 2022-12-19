// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateHoneypotNodeRequest extends TeaModel {
    @NameInMap("AvailableProbeNum")
    public Integer availableProbeNum;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("NodeName")
    public String nodeName;

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
