// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageListByBuildRiskRequest extends TeaModel {
    /**
     * <p>The value of the condition parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The name of the condition parameter. Valid values:</p>
     * <ul>
     * <li><strong>RepoNamespace</strong>: namespace.</li>
     * <li><strong>RepoName</strong>: repository name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RepoNamespace</p>
     */
    @NameInMap("CriteriaType")
    public String criteriaType;

    /**
     * <p>The page number of the current page in paging query. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
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
     * <p>The maximum number of entries per page in paging query. Default value: 20. If you leave this parameter empty, 20 entries are returned.</p>
     * <blockquote>
     * <p>Do not leave PageSize empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The key of the build risk rule. You can call the <a href="~~~~">DescribeImageBuildRiskList</a> operation to obtain the RiskKey.</p>
     * 
     * <strong>example:</strong>
     * <p>no_user</p>
     */
    @NameInMap("RiskKey")
    public String riskKey;

    /**
     * <p>The risk level. Valid values:</p>
     * <ul>
     * <li><strong>high</strong></li>
     * <li><strong>medium</strong></li>
     * <li><strong>low</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>medium</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <p>The status of the alert event to query. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Unhandled.</li>
     * <li><strong>1</strong>: Ignored.</li>
     * <li><strong>2</strong>: False positive.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static DescribeImageListByBuildRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageListByBuildRiskRequest self = new DescribeImageListByBuildRiskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageListByBuildRiskRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public DescribeImageListByBuildRiskRequest setCriteriaType(String criteriaType) {
        this.criteriaType = criteriaType;
        return this;
    }
    public String getCriteriaType() {
        return this.criteriaType;
    }

    public DescribeImageListByBuildRiskRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageListByBuildRiskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeImageListByBuildRiskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageListByBuildRiskRequest setRiskKey(String riskKey) {
        this.riskKey = riskKey;
        return this;
    }
    public String getRiskKey() {
        return this.riskKey;
    }

    public DescribeImageListByBuildRiskRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public DescribeImageListByBuildRiskRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
