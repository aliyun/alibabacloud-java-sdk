// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeCategoryTemplateRuleListRequest extends TeaModel {
    /**
     * <p>The page number. The default value is <strong>1</strong>.</p>
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
     * <p>The language of the request and response. The default value is <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh_cn</strong>: Simplified Chinese.</p>
     * </li>
     * <li><p><strong>en_us</strong>: US English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of template rules to return on each page. The default value is <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The risk level of the template rule. The value ranges from <strong>1</strong> to <strong>11</strong>. The default value is <strong>null</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: No risk.</p>
     * </li>
     * <li><p><strong>2</strong>: S1.</p>
     * </li>
     * <li><p><strong>3</strong>: S2.</p>
     * </li>
     * <li><p><strong>4</strong>: S3.</p>
     * </li>
     * <li><p><strong>5</strong>: S4.</p>
     * </li>
     * <li><p><strong>6</strong>: S5.</p>
     * </li>
     * <li><p><strong>7</strong>: S6.</p>
     * </li>
     * <li><p><strong>8</strong>: S7.</p>
     * </li>
     * <li><p><strong>9</strong>: S8.</p>
     * </li>
     * <li><p><strong>10</strong>: S9.</p>
     * </li>
     * <li><p><strong>11</strong>: S10.</p>
     * </li>
     * <li><p><strong>null</strong>: All risk levels, including No risk, S1, S2, S3, S4, S5, S6, S7, S8, S9, and S10.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RiskLevelId")
    public Long riskLevelId;

    /**
     * <p>The status of the template rule. The default value is <strong>null</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: The rule is disabled.</p>
     * </li>
     * <li><p><strong>1</strong>: The rule is enabled.</p>
     * </li>
     * <li><p><strong>null</strong>: All rules are returned, regardless of their status.</p>
     * </li>
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
