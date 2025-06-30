// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataObjectsRequest extends TeaModel {
    /**
     * <p>Page number for the paginated query. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>ID of the data domain to which the data asset belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DomainId")
    public Long domainId;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>File category code.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FileCategoryCode")
    public Long fileCategoryCode;

    /**
     * <p>OSS file types that are supported for recognition.</p>
     * <blockquote>
     * <p>You can obtain the supported OSS file types by calling <a href="https://help.aliyun.com/document_detail/2536492.html">DescribeDocTypes</a>, using the Code field value from the response. This parameter is only valid for querying OSS-type assets.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100001</p>
     */
    @NameInMap("FileType")
    public Long fileType;

    /**
     * <p>Keyword for the asset instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8vb54hn2g9j191ddz</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language type for request and response messages, default is <strong>zh_cn</strong>. Values:</p>
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
     * <p>Member account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>**********8103</p>
     */
    @NameInMap("MemberAccount")
    public Long memberAccount;

    /**
     * <p>Model IDs of the industry template, separated by commas.</p>
     * <blockquote>
     * <p>You can obtain the industry template model identifier ID by calling <a href="https://help.aliyun.com/document_detail/2536491.html">DescribeTemplateAllRules</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("ModelIds")
    public String modelIds;

    /**
     * <p>Data labels to be queried, separated by commas. Values:</p>
     * <ul>
     * <li><strong>101</strong>: Personal Sensitive Information.</li>
     * <li><strong>102</strong>: Personal Information.</li>
     * <li><strong>107</strong>: General Information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>101,102</p>
     */
    @NameInMap("ModelTagIds")
    public String modelTagIds;

    /**
     * <p>When performing a paginated query, set the maximum number of data asset instances to display per page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>List of parent category IDs for the template to be queried, separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>234,236,238</p>
     */
    @NameInMap("ParentCategoryIds")
    public String parentCategoryIds;

    /**
     * <p>It is recommended to fill in the list of product IDs to be queried, separated by commas. Values:</p>
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
     * <blockquote>
     * <p>OSS is mutually exclusive with other products, meaning if OSS is included in the query, no other products can be listed; by default, non-OSS products are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1,5</p>
     */
    @NameInMap("ProductIds")
    public String productIds;

    /**
     * <p>Keyword for the data object to be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>t_sddp_selfmysql_pers0</p>
     */
    @NameInMap("QueryName")
    public String queryName;

    /**
     * <p>Specify the risk levels of the data assets to be queried, separated by commas if multiple.</p>
     * <ul>
     * <li><strong>2</strong>: S1, low risk level.</li>
     * <li><strong>3</strong>: S2, medium risk level.</li>
     * <li><strong>4</strong>: S3, high risk level.</li>
     * <li><strong>5</strong>: S4, highest risk level.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RiskLevels")
    public String riskLevels;

    /**
     * <p>Region where the asset is located. Values:</p>
     * <ul>
     * <li><strong>cn-beijing</strong>: North China 2 (Beijing).</li>
     * <li><strong>cn-zhangjiakou</strong>: North China 3 (Zhangjiakou).</li>
     * <li><strong>cn-huhehaote</strong>: North China 5 (Hohhot).</li>
     * <li><strong>cn-hangzhou</strong>: East China 1 (Hangzhou).</li>
     * <li><strong>cn-shanghai</strong>: East China 2 (Shanghai).</li>
     * <li><strong>cn-shenzhen</strong>: South China 1 (Shenzhen).</li>
     * <li><strong>cn-hongkong</strong>: Hong Kong, China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    /**
     * <p>Industry template ID.</p>
     * <blockquote>
     * <p>You can obtain the industry template identifier ID by calling <a href="https://help.aliyun.com/document_detail/2399296.html">DescribeCategoryTemplateList</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static DescribeDataObjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataObjectsRequest self = new DescribeDataObjectsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataObjectsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataObjectsRequest setDomainId(Long domainId) {
        this.domainId = domainId;
        return this;
    }
    public Long getDomainId() {
        return this.domainId;
    }

    public DescribeDataObjectsRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public DescribeDataObjectsRequest setFileCategoryCode(Long fileCategoryCode) {
        this.fileCategoryCode = fileCategoryCode;
        return this;
    }
    public Long getFileCategoryCode() {
        return this.fileCategoryCode;
    }

    public DescribeDataObjectsRequest setFileType(Long fileType) {
        this.fileType = fileType;
        return this;
    }
    public Long getFileType() {
        return this.fileType;
    }

    public DescribeDataObjectsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDataObjectsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDataObjectsRequest setMemberAccount(Long memberAccount) {
        this.memberAccount = memberAccount;
        return this;
    }
    public Long getMemberAccount() {
        return this.memberAccount;
    }

    public DescribeDataObjectsRequest setModelIds(String modelIds) {
        this.modelIds = modelIds;
        return this;
    }
    public String getModelIds() {
        return this.modelIds;
    }

    public DescribeDataObjectsRequest setModelTagIds(String modelTagIds) {
        this.modelTagIds = modelTagIds;
        return this;
    }
    public String getModelTagIds() {
        return this.modelTagIds;
    }

    public DescribeDataObjectsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataObjectsRequest setParentCategoryIds(String parentCategoryIds) {
        this.parentCategoryIds = parentCategoryIds;
        return this;
    }
    public String getParentCategoryIds() {
        return this.parentCategoryIds;
    }

    public DescribeDataObjectsRequest setProductIds(String productIds) {
        this.productIds = productIds;
        return this;
    }
    public String getProductIds() {
        return this.productIds;
    }

    public DescribeDataObjectsRequest setQueryName(String queryName) {
        this.queryName = queryName;
        return this;
    }
    public String getQueryName() {
        return this.queryName;
    }

    public DescribeDataObjectsRequest setRiskLevels(String riskLevels) {
        this.riskLevels = riskLevels;
        return this;
    }
    public String getRiskLevels() {
        return this.riskLevels;
    }

    public DescribeDataObjectsRequest setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public DescribeDataObjectsRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
