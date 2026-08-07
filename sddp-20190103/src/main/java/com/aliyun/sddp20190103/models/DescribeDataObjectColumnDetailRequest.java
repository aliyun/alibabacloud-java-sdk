// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataObjectColumnDetailRequest extends TeaModel {
    /**
     * <p>The page number of the current page in a paged query. Settings this parameter for paging. Default value: <strong>1</strong>.</p>
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
     * <p>The unique ID of the data object to query.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/2399253.html">DescribeDataObjects</a> to obtain the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>318248</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Chinese.</li>
     * <li><strong>en_us</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of data asset instances to display on each page in a paged query. Settings this parameter for paging. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the product to which the data object belongs. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: MaxCompute</li>
     * <li><strong>2</strong>: OSS</li>
     * <li><strong>3</strong>: ADB-MYSQL</li>
     * <li><strong>4</strong>: TableStore</li>
     * <li><strong>5</strong>: RDS</li>
     * <li><strong>6</strong>: SELF_DB</li>
     * <li><strong>7</strong>: PolarDB-X</li>
     * <li><strong>8</strong>: PolarDB</li>
     * <li><strong>9</strong>: ADB-PG</li>
     * <li><strong>10</strong>: OceanBase</li>
     * <li><strong>11</strong>: MongoDB</li>
     * <li><strong>25</strong>: Redis</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <p>The industry template ID.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/2399253.html">DescribeDataObjects</a> to obtain the industry template ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static DescribeDataObjectColumnDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataObjectColumnDetailRequest self = new DescribeDataObjectColumnDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataObjectColumnDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataObjectColumnDetailRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public DescribeDataObjectColumnDetailRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeDataObjectColumnDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDataObjectColumnDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataObjectColumnDetailRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public DescribeDataObjectColumnDetailRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
