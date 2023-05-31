// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotNodeRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow honeypots to access the Internet. Valid values:</p>
     * <br>
     * <p>*   **true**: allows honeypots to access the Internet.</p>
     * <p>*   **false**: does not allow honeypots to access the Internet.</p>
     */
    @NameInMap("AllowHoneypotAccessInternet")
    public Boolean allowHoneypotAccessInternet;

    /**
     * <p>The number of available probes.</p>
     */
    @NameInMap("AvailableProbeNum")
    public Integer availableProbeNum;

    /**
     * <p>The name of the management node.</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The CIDR blocks that are allowed to access the management node.</p>
     */
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
