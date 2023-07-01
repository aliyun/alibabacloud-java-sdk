// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAgentlessTaskCountResponseBody extends TeaModel {
    @NameInMap("LastTaskTime")
    public Long lastTaskTime;

    @NameInMap("MaliciousFile")
    public Integer maliciousFile;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RiskMachine")
    public Integer riskMachine;

    @NameInMap("ScanMachine")
    public Integer scanMachine;

    @NameInMap("Vulnerability")
    public Integer vulnerability;

    public static GetAgentlessTaskCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentlessTaskCountResponseBody self = new GetAgentlessTaskCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentlessTaskCountResponseBody setLastTaskTime(Long lastTaskTime) {
        this.lastTaskTime = lastTaskTime;
        return this;
    }
    public Long getLastTaskTime() {
        return this.lastTaskTime;
    }

    public GetAgentlessTaskCountResponseBody setMaliciousFile(Integer maliciousFile) {
        this.maliciousFile = maliciousFile;
        return this;
    }
    public Integer getMaliciousFile() {
        return this.maliciousFile;
    }

    public GetAgentlessTaskCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentlessTaskCountResponseBody setRiskMachine(Integer riskMachine) {
        this.riskMachine = riskMachine;
        return this;
    }
    public Integer getRiskMachine() {
        return this.riskMachine;
    }

    public GetAgentlessTaskCountResponseBody setScanMachine(Integer scanMachine) {
        this.scanMachine = scanMachine;
        return this;
    }
    public Integer getScanMachine() {
        return this.scanMachine;
    }

    public GetAgentlessTaskCountResponseBody setVulnerability(Integer vulnerability) {
        this.vulnerability = vulnerability;
        return this;
    }
    public Integer getVulnerability() {
        return this.vulnerability;
    }

}
