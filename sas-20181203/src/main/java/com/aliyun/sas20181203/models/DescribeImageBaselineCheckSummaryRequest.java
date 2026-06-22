// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBaselineCheckSummaryRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster to query.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c60b77fe62093480db6164a3c2fa5****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The query condition of the baseline.</p>
     * 
     * <strong>example:</strong>
     * <p>Unauthorized access</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The query type of the baselines to query. Valid values:</p>
     * <ul>
     * <li><p><strong>BaselineNameAlias</strong>: baseline name</p>
     * </li>
     * <li><p><strong>BaselineClassAlias</strong>: baseline category.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BaselineNameAlias</p>
     */
    @NameInMap("CriteriaType")
    public String criteriaType;

    /**
     * <p>The page number to display from the returned results. Minimum value: <strong>1</strong>. Default value: <strong>1</strong>, which indicates that the first page is displayed.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language type for requests and responses. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries per page in a paged query. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The risk level of the baselines to query. Separate multiple levels with commas (,). Valid values:</p>
     * <ul>
     * <li><p><strong>high</strong>: high risk</p>
     * </li>
     * <li><p><strong>medium</strong>: medium risk</p>
     * </li>
     * <li><p><strong>low</strong>: low risk.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <p>The collection of scan ranges.</p>
     */
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
