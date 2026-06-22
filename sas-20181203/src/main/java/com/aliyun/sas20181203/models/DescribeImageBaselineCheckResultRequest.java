// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBaselineCheckResultRequest extends TeaModel {
    /**
     * <p>The query condition for the baseline.</p>
     * 
     * <strong>example:</strong>
     * <p>ak_leak</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The query type of the baseline to query. Valid values:</p>
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
     * <p>The page number of the current page when using paging. Default value: 20, which indicates the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The UUID of the image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a910053dd4710173ecc9e9d8931f****</p>
     */
    @NameInMap("ImageUuid")
    public String imageUuid;

    /**
     * <p>The language type for the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The number of entries per page when using paging. Default value: <strong>20</strong>, which indicates that 20 logon configuration entries are displayed per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The risk level of the baseline to query. Separate multiple levels with commas (,). By default, all levels are included. Valid values:</p>
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
     * <p>high,medium,low</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <p>The scan scope.</p>
     */
    @NameInMap("ScanRange")
    public java.util.List<String> scanRange;

    public static DescribeImageBaselineCheckResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageBaselineCheckResultRequest self = new DescribeImageBaselineCheckResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageBaselineCheckResultRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public DescribeImageBaselineCheckResultRequest setCriteriaType(String criteriaType) {
        this.criteriaType = criteriaType;
        return this;
    }
    public String getCriteriaType() {
        return this.criteriaType;
    }

    public DescribeImageBaselineCheckResultRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageBaselineCheckResultRequest setImageUuid(String imageUuid) {
        this.imageUuid = imageUuid;
        return this;
    }
    public String getImageUuid() {
        return this.imageUuid;
    }

    public DescribeImageBaselineCheckResultRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeImageBaselineCheckResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageBaselineCheckResultRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public DescribeImageBaselineCheckResultRequest setScanRange(java.util.List<String> scanRange) {
        this.scanRange = scanRange;
        return this;
    }
    public java.util.List<String> getScanRange() {
        return this.scanRange;
    }

}
