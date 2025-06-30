// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeCategoryTemplateListRequest extends TeaModel {
    /**
     * <p>Page number for paginated queries. Default value: 1.</p>
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
     * <p>2</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>Set the language type for the request and response messages, default is <strong>zh_cn</strong>.
     * Values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Chinese (Simplified)</li>
     * <li><strong>en_us</strong>: English (United States)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>When performing a paginated query, set the number of items per page. Default value is <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>API call scenario, default is <strong>null</strong>.
     * Values:</p>
     * <ul>
     * <li><strong>null</strong>: Old version</li>
     * <li><strong>0</strong>: Old version</li>
     * <li><strong>1</strong>: New version</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
