// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAgentlessTaskCountResponseBody extends TeaModel {
    /**
     * <p>The number of baseline checks.</p>
     */
    @NameInMap("BaselineCheckCount")
    public Integer baselineCheckCount;

    /**
     * <p>The number of system vulnerabilities.</p>
     */
    @NameInMap("CveVulCount")
    public Integer cveVulCount;

    /**
     * <p>The timestamp generated when the last detection is performed.</p>
     */
    @NameInMap("LastTaskTime")
    public Long lastTaskTime;

    /**
     * <p>The number of malicious files.</p>
     */
    @NameInMap("MaliciousFile")
    public Integer maliciousFile;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of risky hosts.</p>
     */
    @NameInMap("RiskMachine")
    public Integer riskMachine;

    /**
     * <p>The number of application vulnerabilities.</p>
     */
    @NameInMap("ScaVulCount")
    public Integer scaVulCount;

    /**
     * <p>The number of hosts that are scanned.</p>
     */
    @NameInMap("ScanMachine")
    public Integer scanMachine;

    /**
     * <p>The total number of Windows system vulnerabilities.</p>
     */
    @NameInMap("SysVulCount")
    public String sysVulCount;

    /**
     * <p>The number of vulnerabilities.</p>
     */
    @NameInMap("Vulnerability")
    public Integer vulnerability;

    public static GetAgentlessTaskCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentlessTaskCountResponseBody self = new GetAgentlessTaskCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentlessTaskCountResponseBody setBaselineCheckCount(Integer baselineCheckCount) {
        this.baselineCheckCount = baselineCheckCount;
        return this;
    }
    public Integer getBaselineCheckCount() {
        return this.baselineCheckCount;
    }

    public GetAgentlessTaskCountResponseBody setCveVulCount(Integer cveVulCount) {
        this.cveVulCount = cveVulCount;
        return this;
    }
    public Integer getCveVulCount() {
        return this.cveVulCount;
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

    public GetAgentlessTaskCountResponseBody setScaVulCount(Integer scaVulCount) {
        this.scaVulCount = scaVulCount;
        return this;
    }
    public Integer getScaVulCount() {
        return this.scaVulCount;
    }

    public GetAgentlessTaskCountResponseBody setScanMachine(Integer scanMachine) {
        this.scanMachine = scanMachine;
        return this;
    }
    public Integer getScanMachine() {
        return this.scanMachine;
    }

    public GetAgentlessTaskCountResponseBody setSysVulCount(String sysVulCount) {
        this.sysVulCount = sysVulCount;
        return this;
    }
    public String getSysVulCount() {
        return this.sysVulCount;
    }

    public GetAgentlessTaskCountResponseBody setVulnerability(Integer vulnerability) {
        this.vulnerability = vulnerability;
        return this;
    }
    public Integer getVulnerability() {
        return this.vulnerability;
    }

}
