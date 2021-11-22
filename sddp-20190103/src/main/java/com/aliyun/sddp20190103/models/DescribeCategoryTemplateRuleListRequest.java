// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeCategoryTemplateRuleListRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RiskLevelId")
    public Long riskLevelId;

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
