// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeCategoryTemplateListRequest extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
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
     * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh_cn</strong>: Simplified Chinese</p>
     * </li>
     * <li><p><strong>en_us</strong>: U.S. English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The scenario in which the operation is called. Default value: <strong>null</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>null</strong>: an earlier version</p>
     * </li>
     * <li><p><strong>0</strong>: an earlier version</p>
     * </li>
     * <li><p><strong>1</strong>: the latest version</p>
     * </li>
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
