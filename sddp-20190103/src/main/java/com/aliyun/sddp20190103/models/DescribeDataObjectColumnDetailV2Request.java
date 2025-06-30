// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataObjectColumnDetailV2Request extends TeaModel {
    /**
     * <p>When performing a paginated query, set the current page number. Default value: <strong>1</strong>.</p>
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
     * <p>Set the unique identifier ID of the data object to be queried.</p>
     * <blockquote>
     * <p>You can obtain the identifier ID by calling <a href="https://help.aliyun.com/document_detail/2399253.html">DescribeDataObjects</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13456723343</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The language type for the request and response messages, default is <strong>zh_cn</strong>. Values:</p>
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
     * <p>When performing a paginated query, set the maximum number of data asset instances to display per page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID corresponding to the product name of the data object. Values:</p>
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
     * <p>Industry template ID.</p>
     * <blockquote>
     * <p>You can obtain the industry template identifier ID by calling <a href="https://help.aliyun.com/document_detail/2399253.html">DescribeDataObjects</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
