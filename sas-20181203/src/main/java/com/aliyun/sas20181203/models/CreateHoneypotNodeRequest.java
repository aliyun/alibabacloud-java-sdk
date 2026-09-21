// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotNodeRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow the honeypot to access the Internet. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Allowed.</li>
     * <li><strong>false</strong>: Not allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowHoneypotAccessInternet")
    public Boolean allowHoneypotAccessInternet;

    /**
     * <p>The number of available probes. This parameter is required. If this parameter is not specified, the API returns InvalidParam (400). The minimum value is 20. If the value is less than 20, the API returns InvalidProbeNum (400).</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("AvailableProbeNum")
    public Integer availableProbeNum;

    /**
     * <p>The name of the management node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>manageNode</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The list of allowed CIDR blocks. This parameter is required. At least one allowed CIDR block must be specified, such as 0.0.0.0/0. If this parameter is not specified, the API returns InvalidParam (400).</p>
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
