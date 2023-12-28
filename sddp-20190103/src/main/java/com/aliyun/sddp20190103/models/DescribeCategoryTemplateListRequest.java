// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeCategoryTemplateListRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("FeatureType")
    public Integer featureType;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("UsageScenario")
    public Integer usageScenario;

    public static DescribeCategoryTemplateListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCategoryTemplateListRequest self = new DescribeCategoryTemplateListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCategoryTemplateListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCategoryTemplateListRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public DescribeCategoryTemplateListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCategoryTemplateListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCategoryTemplateListRequest setUsageScenario(Integer usageScenario) {
        this.usageScenario = usageScenario;
        return this;
    }
    public Integer getUsageScenario() {
        return this.usageScenario;
    }

}
