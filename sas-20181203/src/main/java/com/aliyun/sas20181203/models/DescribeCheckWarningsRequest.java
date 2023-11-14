// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningsRequest extends TeaModel {
    /**
     * <p>The ID of the check item.</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The type of the check item. Valid values:</p>
     * <br>
     * <p>*   **hc.check.type.identity_auth**: identity authentication</p>
     * <p>*   **hc.check.type.access_control**: access control</p>
     * <p>*   **hc.check.type.network_service**: network and service</p>
     * <p>*   **hc.check.type.service_conf**: service configuration</p>
     * <p>*   **hc.check.type.file_rights**: file permission</p>
     * <p>*   **hc.check.type.security_audit**: security audit</p>
     * <p>*   **hc.check.type.attack_defense**: intrusion prevention</p>
     * <p>*   **hc.check.type.others**: others</p>
     */
    @NameInMap("CheckType")
    public String checkType;

    /**
     * <p>The name of the container.</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The ID of the risk item.</p>
     * <br>
     * <p>>  To query the information about the risk items and check items of a server, you must provide the IDs of risk items. You can call the [DescribeCheckWarningSummary](~~DescribeCheckWarningSummary~~) operation to query the IDs.</p>
     */
    @NameInMap("RiskId")
    public Long riskId;

    /**
     * <p>The status of the check item. Valid values:</p>
     * <br>
     * <p>*   **1**: failed</p>
     * <p>*   **2**: verifying</p>
     * <p>*   **3**: passed</p>
     * <p>*   **5**: expired</p>
     * <p>*   **6**: ignored</p>
     */
    @NameInMap("RiskStatus")
    public Integer riskStatus;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The UUID of the server on which the baseline check is performed.</p>
     * <br>
     * <p>> To query specified risk items and the check items of a specified server, you must provide the ID of the server on which the baseline check is performed. You can call the [DescribeWarningMachines](~~DescribeWarningMachines~~) operation to query the IDs of servers.</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribeCheckWarningsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckWarningsRequest self = new DescribeCheckWarningsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCheckWarningsRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public DescribeCheckWarningsRequest setCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }
    public String getCheckType() {
        return this.checkType;
    }

    public DescribeCheckWarningsRequest setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public DescribeCheckWarningsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCheckWarningsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCheckWarningsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCheckWarningsRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeCheckWarningsRequest setRiskId(Long riskId) {
        this.riskId = riskId;
        return this;
    }
    public Long getRiskId() {
        return this.riskId;
    }

    public DescribeCheckWarningsRequest setRiskStatus(Integer riskStatus) {
        this.riskStatus = riskStatus;
        return this;
    }
    public Integer getRiskStatus() {
        return this.riskStatus;
    }

    public DescribeCheckWarningsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeCheckWarningsRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
