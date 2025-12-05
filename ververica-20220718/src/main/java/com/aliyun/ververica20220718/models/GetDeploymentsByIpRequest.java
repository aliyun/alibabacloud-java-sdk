// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetDeploymentsByIpRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10.100.2.200</p>
     */
    @NameInMap("dstIp")
    public String dstIp;

    /**
     * <strong>example:</strong>
     * <p>9092</p>
     */
    @NameInMap("dstPort")
    public String dstPort;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ignoreJobSummary")
    public Boolean ignoreJobSummary;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ignoreResourceSetting")
    public Boolean ignoreResourceSetting;

    /**
     * <strong>example:</strong>
     * <p>192.168.1.100</p>
     */
    @NameInMap("srcIp")
    public String srcIp;

    /**
     * <strong>example:</strong>
     * <p>54321</p>
     */
    @NameInMap("srcPort")
    public String srcPort;

    public static GetDeploymentsByIpRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentsByIpRequest self = new GetDeploymentsByIpRequest();
        return TeaModel.build(map, self);
    }

    public GetDeploymentsByIpRequest setDstIp(String dstIp) {
        this.dstIp = dstIp;
        return this;
    }
    public String getDstIp() {
        return this.dstIp;
    }

    public GetDeploymentsByIpRequest setDstPort(String dstPort) {
        this.dstPort = dstPort;
        return this;
    }
    public String getDstPort() {
        return this.dstPort;
    }

    public GetDeploymentsByIpRequest setIgnoreJobSummary(Boolean ignoreJobSummary) {
        this.ignoreJobSummary = ignoreJobSummary;
        return this;
    }
    public Boolean getIgnoreJobSummary() {
        return this.ignoreJobSummary;
    }

    public GetDeploymentsByIpRequest setIgnoreResourceSetting(Boolean ignoreResourceSetting) {
        this.ignoreResourceSetting = ignoreResourceSetting;
        return this;
    }
    public Boolean getIgnoreResourceSetting() {
        return this.ignoreResourceSetting;
    }

    public GetDeploymentsByIpRequest setSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }
    public String getSrcIp() {
        return this.srcIp;
    }

    public GetDeploymentsByIpRequest setSrcPort(String srcPort) {
        this.srcPort = srcPort;
        return this;
    }
    public String getSrcPort() {
        return this.srcPort;
    }

}
