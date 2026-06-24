// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataObjectColumnDetailRequest extends TeaModel {
    /**
     * <p>The page number to return. Default value: <strong>1</strong>.</p>
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
     * <p>The unique ID of the data object that you want to query.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/2399253.html">DescribeDataObjects</a> operation to obtain the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>318248</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh_cn</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en_us</strong>: English</p>
     * </li>
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
     * <p>The ID of the service to which the data object belongs. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: MaxCompute</p>
     * </li>
     * <li><p><strong>2</strong>: OSS</p>
     * </li>
     * <li><p><strong>3</strong>: ADB-MYSQL</p>
     * </li>
     * <li><p><strong>4</strong>: Tablestore</p>
     * </li>
     * <li><p><strong>5</strong>: RDS</p>
     * </li>
     * <li><p><strong>6</strong>: SELF_DB</p>
     * </li>
     * <li><p><strong>7</strong>: PolarDB-X</p>
     * </li>
     * <li><p><strong>8</strong>: PolarDB</p>
     * </li>
     * <li><p><strong>9</strong>: ADB-PG</p>
     * </li>
     * <li><p><strong>10</strong>: OceanBase</p>
     * </li>
     * <li><p><strong>11</strong>: MongoDB</p>
     * </li>
     * <li><p><strong>25</strong>: Redis</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <p>The ID of the industry-specific template.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/2399253.html">DescribeDataObjects</a> operation to obtain the ID of the industry-specific template.</p>
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
