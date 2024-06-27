// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeCategoryTemplateRuleListRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Simplified Chinese</li>
     * <li><strong>en_us</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sensitivity level of the data that is not compliant with the rule. Valid values: <strong>1</strong> to <strong>11</strong>. Default value: <strong>null</strong>.</p>
     * <ul>
     * <li><strong>1</strong>: No sensitive data is detected.</li>
     * <li><strong>2</strong>: specifies the S1 sensitivity level.</li>
     * <li><strong>3</strong>: specifies the S2 sensitivity level.</li>
     * <li><strong>4</strong>: specifies the S3 sensitivity level.</li>
     * <li><strong>5</strong>: specifies the S4 sensitivity level.</li>
     * <li><strong>6</strong>: specifies the S5 sensitivity level.</li>
     * <li><strong>7</strong>: specifies the S6 sensitivity level.</li>
     * <li><strong>8</strong>: specifies the S7 sensitivity level.</li>
     * <li><strong>9</strong>: specifies the S8 sensitivity level.</li>
     * <li><strong>10</strong>: specifies the S9 sensitivity level.</li>
     * <li><strong>11</strong>: specifies the S10 sensitivity level.</li>
     * <li><strong>null</strong>: specifies all preceding sensitivity levels.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RiskLevelId")
    public Long riskLevelId;

    /**
     * <p>The status of the rule. Default value: <strong>null</strong>. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disabled</li>
     * <li><strong>1</strong>: enabled</li>
     * <li><strong>null</strong>: all states</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static DescribeCategoryTemplateRuleListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCategoryTemplateRuleListRequest self = new DescribeCategoryTemplateRuleListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCategoryTemplateRuleListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCategoryTemplateRuleListRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public DescribeCategoryTemplateRuleListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCategoryTemplateRuleListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCategoryTemplateRuleListRequest setRiskLevelId(Long riskLevelId) {
        this.riskLevelId = riskLevelId;
        return this;
    }
    public Long getRiskLevelId() {
        return this.riskLevelId;
    }

    public DescribeCategoryTemplateRuleListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
