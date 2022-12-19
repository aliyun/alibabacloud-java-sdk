// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotNodeRequest extends TeaModel {
    // Specifies whether to allow the honeypots to access the Internet. Valid values:
    // 
    // *   **true**: allows the honeypots to access the Internet.
    // *   **false**: does not allow the honeypots to access the Internet.
    @NameInMap("AllowHoneypotAccessInternet")
    public Boolean allowHoneypotAccessInternet;

    // The number of probes that you want to allocate for the management node.
    @NameInMap("AvailableProbeNum")
    public Integer availableProbeNum;

    // The name of the management node.
    @NameInMap("NodeName")
    public String nodeName;

    // The CIDR blocks that are allowed to access the management node.
    @NameInMap("SecurityGroupProbeIpList")
    public java.util.List<String> securityGroupProbeIpList;

    public static CreateHoneypotNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHoneypotNodeRequest self = new CreateHoneypotNodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateHoneypotNodeRequest setAllowHoneypotAccessInternet(Boolean allowHoneypotAccessInternet) {
        this.allowHoneypotAccessInternet = allowHoneypotAccessInternet;
        return this;
    }
    public Boolean getAllowHoneypotAccessInternet() {
        return this.allowHoneypotAccessInternet;
    }

    public CreateHoneypotNodeRequest setAvailableProbeNum(Integer availableProbeNum) {
        this.availableProbeNum = availableProbeNum;
        return this;
    }
    public Integer getAvailableProbeNum() {
        return this.availableProbeNum;
    }

    public CreateHoneypotNodeRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public CreateHoneypotNodeRequest setSecurityGroupProbeIpList(java.util.List<String> securityGroupProbeIpList) {
        this.securityGroupProbeIpList = securityGroupProbeIpList;
        return this;
    }
    public java.util.List<String> getSecurityGroupProbeIpList() {
        return this.securityGroupProbeIpList;
    }

}
