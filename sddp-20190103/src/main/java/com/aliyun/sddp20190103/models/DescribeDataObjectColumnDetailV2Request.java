// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataObjectColumnDetailV2Request extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("FeatureType")
    public Integer featureType;

    @NameInMap("Id")
    public String id;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("TemplateId")
    public Long templateId;

    public static DescribeDataObjectColumnDetailV2Request build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataObjectColumnDetailV2Request self = new DescribeDataObjectColumnDetailV2Request();
        return TeaModel.build(map, self);
    }

    public DescribeDataObjectColumnDetailV2Request setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataObjectColumnDetailV2Request setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public DescribeDataObjectColumnDetailV2Request setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeDataObjectColumnDetailV2Request setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDataObjectColumnDetailV2Request setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataObjectColumnDetailV2Request setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public DescribeDataObjectColumnDetailV2Request setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
