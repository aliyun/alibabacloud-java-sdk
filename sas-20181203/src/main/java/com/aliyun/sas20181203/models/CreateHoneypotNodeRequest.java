// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotNodeRequest extends TeaModel {
    /**
     * <p>Creates a management node.</p>
     */
    @NameInMap("AllowHoneypotAccessInternet")
    public Boolean allowHoneypotAccessInternet;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("AvailableProbeNum")
    public Integer availableProbeNum;

    /**
     * <p>The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

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
