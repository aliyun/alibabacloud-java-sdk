// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeEmgVulItemRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("RiskStatus")
    public String riskStatus;

    @NameInMap("ScanType")
    public String scanType;

    @NameInMap("VulName")
    public String vulName;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeEmgVulItemRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEmgVulItemRequest self = new DescribeEmgVulItemRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEmgVulItemRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
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

    public DescribeEmgVulItemRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeEmgVulItemRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
