// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeCategoryTemplateRuleListRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>This parameter is deprecated.</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The language of the content within the request and response. Default value: **zh_cn**. Valid values:</p>
     * <br>
     * <p>*   **zh_cn**: Simplified Chinese</p>
     * <p>*   **en_us**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sensitivity level of the data that is not compliant with the rule. Valid values: **1** to **11**. Default value: **null**.</p>
     * <br>
     * <p>*   **1**: No sensitive data is detected.</p>
     * <p>*   **2**: specifies the S1 sensitivity level.</p>
     * <p>*   **3**: specifies the S2 sensitivity level.</p>
     * <p>*   **4**: specifies the S3 sensitivity level.</p>
     * <p>*   **5**: specifies the S4 sensitivity level.</p>
     * <p>*   **6**: specifies the S5 sensitivity level.</p>
     * <p>*   **7**: specifies the S6 sensitivity level.</p>
     * <p>*   **8**: specifies the S7 sensitivity level.</p>
     * <p>*   **9**: specifies the S8 sensitivity level.</p>
     * <p>*   **10**: specifies the S9 sensitivity level.</p>
     * <p>*   **11**: specifies the S10 sensitivity level.</p>
     * <p>*   **null**: specifies all preceding sensitivity levels.</p>
     */
    @NameInMap("RiskLevelId")
    public Long riskLevelId;

    /**
     * <p>The status of the rule. Default value: **null**. Valid values:</p>
     * <br>
     * <p>*   **0**: disabled</p>
     * <p>*   **1**: enabled</p>
     * <p>*   **null**: all states</p>
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
