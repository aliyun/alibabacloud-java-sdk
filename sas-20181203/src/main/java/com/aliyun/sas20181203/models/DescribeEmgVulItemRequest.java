// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeEmgVulItemRequest extends TeaModel {
    // The check method. Valid values:
    // 
    // *   **0**: proof of concept (POC) verification
    // *   **1**: version comparison
    @NameInMap("CheckType")
    public Integer checkType;

    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The number of entries to return on each page. Default value: **10**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // Specifies whether the vulnerability poses risks.\
    // If you do not specify this parameter, all vulnerabilities are queried regardless of whether the vulnerabilities pose risks. Valid values:
    // 
    // *   **y**: yes
    // *   **n**: no
    @NameInMap("RiskStatus")
    public String riskStatus;

    // The method that is used to detect the vulnerability.\
    // If you do not specify this parameter, all vulnerabilities are queried regardless of which method is used. Valid values:
    // 
    // *   **python**: The Version method is used. Security Center checks the software versions of your server to check whether disclosed vulnerabilities exist on your server.
    // *   **scan**: The Network Scan method is used. Security Center analyzes the access traffic to your server over the Internet to check whether vulnerabilities exist on your server.
    @NameInMap("ScanType")
    public String scanType;

    // The name of the urgent vulnerability.
    @NameInMap("VulName")
    public String vulName;

    public static DescribeEmgVulItemRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEmgVulItemRequest self = new DescribeEmgVulItemRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEmgVulItemRequest setCheckType(Integer checkType) {
        this.checkType = checkType;
        return this;
    }
    public Integer getCheckType() {
        return this.checkType;
    }

    public DescribeEmgVulItemRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeEmgVulItemRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeEmgVulItemRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEmgVulItemRequest setRiskStatus(String riskStatus) {
        this.riskStatus = riskStatus;
        return this;
    }
    public String getRiskStatus() {
        return this.riskStatus;
    }

    public DescribeEmgVulItemRequest setScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }
    public String getScanType() {
        return this.scanType;
    }

    public DescribeEmgVulItemRequest setVulName(String vulName) {
        this.vulName = vulName;
        return this;
    }
    public String getVulName() {
        return this.vulName;
    }

}
