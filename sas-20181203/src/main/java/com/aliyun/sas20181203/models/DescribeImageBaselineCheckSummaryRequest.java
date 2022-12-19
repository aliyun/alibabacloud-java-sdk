// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBaselineCheckSummaryRequest extends TeaModel {
    // The ID of the container cluster.
    // 
    // >  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of container clusters.
    @NameInMap("ClusterId")
    public String clusterId;

    // The search condition for the image baseline.
    @NameInMap("Criteria")
    public String criteria;

    // The type of the search condition. Valid values:
    // 
    // *   **BaselineNameAlias**: baseline name
    // *   **BaselineClassAlias**: baseline category
    @NameInMap("CriteriaType")
    public String criteriaType;

    // The number of the page to return. Pages start from page **1**. Default value: **1**.
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

    // The severity of the image baseline that you want to query. Separate multiple severities with commas (,). Valid values:
    // 
    // *   **high**
    // *   **medium**
    // *   **low**
    @NameInMap("RiskLevel")
    public String riskLevel;

    // The types of the assets that you want to scan.
    @NameInMap("ScanRange")
    public java.util.List<String> scanRange;

    public static DescribeImageBaselineCheckSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageBaselineCheckSummaryRequest self = new DescribeImageBaselineCheckSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageBaselineCheckSummaryRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeImageBaselineCheckSummaryRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public DescribeImageBaselineCheckSummaryRequest setCriteriaType(String criteriaType) {
        this.criteriaType = criteriaType;
        return this;
    }
    public String getCriteriaType() {
        return this.criteriaType;
    }

    public DescribeImageBaselineCheckSummaryRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageBaselineCheckSummaryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeImageBaselineCheckSummaryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageBaselineCheckSummaryRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public DescribeImageBaselineCheckSummaryRequest setScanRange(java.util.List<String> scanRange) {
        this.scanRange = scanRange;
        return this;
    }
    public java.util.List<String> getScanRange() {
        return this.scanRange;
    }

}
