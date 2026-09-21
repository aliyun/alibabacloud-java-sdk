// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DataValue extends TeaModel {
    /**
     * <p>The number of risky hosts.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskMachine")
    public Integer riskMachine;

    /**
     * <p>The number of scanned hosts.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScanMachine")
    public Integer scanMachine;

    /**
     * <p>The total number of malicious sample files.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaliciousFile")
    public Integer maliciousFile;

    /**
     * <p>The number of vulnerability risks.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Vulnerability")
    public Integer vulnerability;

    /**
     * <p>The timestamp of the last scan time. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1682577532318</p>
     */
    @NameInMap("LastTaskTime")
    public Long lastTaskTime;

    /**
     * <p>The total number of baseline check items.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BaselineCheckCount")
    public Integer baselineCheckCount;

    /**
     * <p>The total number of application vulnerabilities.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScaVulCount")
    public Integer scaVulCount;

    /**
     * <p>The total number of system vulnerabilities.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CveVulCount")
    public Integer cveVulCount;

    /**
     * <p>The total number of Windows system vulnerabilities.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SysVulCount")
    public Integer sysVulCount;

    /**
     * <p>The total number of sensitive files.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SensitiveFileCount")
    public Integer sensitiveFileCount;

    /**
     * <p>The estimated detection volume. Unit: GB. This field is not returned by the batch statistics operation.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("EstimateUsedSize")
    public Long estimateUsedSize;

    /**
     * <p>The number of Linux software vulnerabilities.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CveNum")
    public Integer cveNum;

    /**
     * <p>The number of emergency vulnerabilities. This field is 0 when ImageVul is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EmgNum")
    public Integer emgNum;

    /**
     * <p>The number of Windows system vulnerabilities. This field is 0 when ImageVul is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SysNum")
    public Integer sysNum;

    /**
     * <p>The number of Web-CMS vulnerabilities. This field is 0 when ImageVul is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CmsNum")
    public Integer cmsNum;

    /**
     * <p>The number of application vulnerabilities. This field is 0 when ImageVul is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AppNum")
    public Integer appNum;

    /**
     * <p>The number of software composition analysis (SCA) vulnerabilities.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ScaNum")
    public Integer scaNum;

    /**
     * <p>The number of high-priority vulnerabilities.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VulAsapSum")
    public Integer vulAsapSum;

    /**
     * <p>The number of medium-priority vulnerabilities.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VulLaterSum")
    public Integer vulLaterSum;

    /**
     * <p>The number of low-priority vulnerabilities.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VulNntfSum")
    public Integer vulNntfSum;

    /**
     * <p>The number of high-priority system vulnerabilities among Linux software vulnerabilities and Windows system vulnerabilities.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SysAsapNum")
    public Integer sysAsapNum;

    public static DataValue build(java.util.Map<String, ?> map) throws Exception {
        DataValue self = new DataValue();
        return TeaModel.build(map, self);
    }

    public DataValue setRiskMachine(Integer riskMachine) {
        this.riskMachine = riskMachine;
        return this;
    }
    public Integer getRiskMachine() {
        return this.riskMachine;
    }

    public DataValue setScanMachine(Integer scanMachine) {
        this.scanMachine = scanMachine;
        return this;
    }
    public Integer getScanMachine() {
        return this.scanMachine;
    }

    public DataValue setMaliciousFile(Integer maliciousFile) {
        this.maliciousFile = maliciousFile;
        return this;
    }
    public Integer getMaliciousFile() {
        return this.maliciousFile;
    }

    public DataValue setVulnerability(Integer vulnerability) {
        this.vulnerability = vulnerability;
        return this;
    }
    public Integer getVulnerability() {
        return this.vulnerability;
    }

    public DataValue setLastTaskTime(Long lastTaskTime) {
        this.lastTaskTime = lastTaskTime;
        return this;
    }
    public Long getLastTaskTime() {
        return this.lastTaskTime;
    }

    public DataValue setBaselineCheckCount(Integer baselineCheckCount) {
        this.baselineCheckCount = baselineCheckCount;
        return this;
    }
    public Integer getBaselineCheckCount() {
        return this.baselineCheckCount;
    }

    public DataValue setScaVulCount(Integer scaVulCount) {
        this.scaVulCount = scaVulCount;
        return this;
    }
    public Integer getScaVulCount() {
        return this.scaVulCount;
    }

    public DataValue setCveVulCount(Integer cveVulCount) {
        this.cveVulCount = cveVulCount;
        return this;
    }
    public Integer getCveVulCount() {
        return this.cveVulCount;
    }

    public DataValue setSysVulCount(Integer sysVulCount) {
        this.sysVulCount = sysVulCount;
        return this;
    }
    public Integer getSysVulCount() {
        return this.sysVulCount;
    }

    public DataValue setSensitiveFileCount(Integer sensitiveFileCount) {
        this.sensitiveFileCount = sensitiveFileCount;
        return this;
    }
    public Integer getSensitiveFileCount() {
        return this.sensitiveFileCount;
    }

    public DataValue setEstimateUsedSize(Long estimateUsedSize) {
        this.estimateUsedSize = estimateUsedSize;
        return this;
    }
    public Long getEstimateUsedSize() {
        return this.estimateUsedSize;
    }

    public DataValue setCveNum(Integer cveNum) {
        this.cveNum = cveNum;
        return this;
    }
    public Integer getCveNum() {
        return this.cveNum;
    }

    public DataValue setEmgNum(Integer emgNum) {
        this.emgNum = emgNum;
        return this;
    }
    public Integer getEmgNum() {
        return this.emgNum;
    }

    public DataValue setSysNum(Integer sysNum) {
        this.sysNum = sysNum;
        return this;
    }
    public Integer getSysNum() {
        return this.sysNum;
    }

    public DataValue setCmsNum(Integer cmsNum) {
        this.cmsNum = cmsNum;
        return this;
    }
    public Integer getCmsNum() {
        return this.cmsNum;
    }

    public DataValue setAppNum(Integer appNum) {
        this.appNum = appNum;
        return this;
    }
    public Integer getAppNum() {
        return this.appNum;
    }

    public DataValue setScaNum(Integer scaNum) {
        this.scaNum = scaNum;
        return this;
    }
    public Integer getScaNum() {
        return this.scaNum;
    }

    public DataValue setVulAsapSum(Integer vulAsapSum) {
        this.vulAsapSum = vulAsapSum;
        return this;
    }
    public Integer getVulAsapSum() {
        return this.vulAsapSum;
    }

    public DataValue setVulLaterSum(Integer vulLaterSum) {
        this.vulLaterSum = vulLaterSum;
        return this;
    }
    public Integer getVulLaterSum() {
        return this.vulLaterSum;
    }

    public DataValue setVulNntfSum(Integer vulNntfSum) {
        this.vulNntfSum = vulNntfSum;
        return this;
    }
    public Integer getVulNntfSum() {
        return this.vulNntfSum;
    }

    public DataValue setSysAsapNum(Integer sysAsapNum) {
        this.sysAsapNum = sysAsapNum;
        return this;
    }
    public Integer getSysAsapNum() {
        return this.sysAsapNum;
    }

}
