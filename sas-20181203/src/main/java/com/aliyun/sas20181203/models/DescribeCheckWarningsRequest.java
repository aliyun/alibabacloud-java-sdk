// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningsRequest extends TeaModel {
    // The ID of the check item.
    @NameInMap("CheckId")
    public Long checkId;

    // The type of the check item. Valid values:
    // 
    // *   **hc.check.type.identity_auth**: identity authentication
    // *   **hc.check.type.access_control**: access control
    // *   **hc.check.type.network_service**: network and service
    // *   **hc.check.type.service_conf**: service configuration
    // *   **hc.check.type.file_rights**: file permission
    // *   **hc.check.type.security_audit**: security audit
    // *   **hc.check.type.attack_defense**: intrusion prevention
    // *   **hc.check.type.others**: others
    @NameInMap("CheckType")
    public String checkType;

    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The number of entries to return on each page. Default value: **20**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the risk item.
    // 
    // >  To query specified risk items and the check items of a specified server, you must provide the IDs of the risk items. You can call the [DescribeCheckWarningSummary](~~DescribeCheckWarningSummary~~) operation to query the IDs of risk items.
    @NameInMap("RiskId")
    public Long riskId;

    // The status of the check item. Valid values:
    // 
    // *   **1**: failed
    // *   **2**: verifying
    // *   **3**: passed
    // *   **5**: expired
    // *   **6**: ignored
    @NameInMap("RiskStatus")
    public Integer riskStatus;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The UUID of the server on which the baseline check is performed.
    // 
    // >  To query specified risk items and the check items of a specified server, you must provide the ID of the server on which the baseline check is performed. You can call the [DescribeWarningMachines](~~DescribeWarningMachines~~) operation to query the IDs of servers.
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
