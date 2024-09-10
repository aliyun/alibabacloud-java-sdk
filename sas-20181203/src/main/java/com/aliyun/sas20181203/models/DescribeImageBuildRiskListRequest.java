// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBuildRiskListRequest extends TeaModel {
    /**
     * <p>The <strong>rule name</strong> or <strong>type name</strong> of the risk. You can call the <a href="~~~~">DescribeImageBuildRiskList</a> operation to obtain the name. Optional parameters:</p>
     * <ul>
     * <li>If <strong>CriteriaType</strong> is set to <strong>RiskKeyName</strong>, you must specify a <strong>rule name</strong> for this parameter.</li>
     * <li>If <strong>CriteriaType</strong> is set to<strong>RiskClassName</strong>, you must specify a <strong>type name</strong> for this parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>no_user</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The query type.of the risk. Valid values:</p>
     * <ul>
     * <li><strong>RiskKeyName</strong>: the rule name of the risk</li>
     * <li><strong>RiskClassName</strong>: the type name of the risk</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RiskKeyName</p>
     */
    @NameInMap("CriteriaType")
    public String criteriaType;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <blockquote>
     * <p> We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The risk level. Valid values:</p>
     * <ul>
     * <li><strong>high</strong></li>
     * <li><strong>medium</strong></li>
     * <li><strong>low</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>medium</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    public static DescribeImageBuildRiskListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageBuildRiskListRequest self = new DescribeImageBuildRiskListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageBuildRiskListRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public DescribeImageBuildRiskListRequest setCriteriaType(String criteriaType) {
        this.criteriaType = criteriaType;
        return this;
    }
    public String getCriteriaType() {
        return this.criteriaType;
    }

    public DescribeImageBuildRiskListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageBuildRiskListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeImageBuildRiskListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageBuildRiskListRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

}
