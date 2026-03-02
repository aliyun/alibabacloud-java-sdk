// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataObjectsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("APIVersion")
    public Integer APIVersion;

    /**
     * <strong>example:</strong>
     * <p>bucketName</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <p>Page number for the paginated query. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>dataBaseName</p>
     */
    @NameInMap("DbName")
    public String dbName;

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
     * <strong>example:</strong>
     * <p>logstore</p>
     */
    @NameInMap("LogStore")
    public String logStore;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LogStoreFlag")
    public Integer logStoreFlag;

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
     * <strong>example:</strong>
     * <p>road</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Integer productId;

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
     * <strong>example:</strong>
     * <p>project</p>
     */
    @NameInMap("Project")
    public String project;

    /**
     * <p>Keyword for the data object to be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>t_sddp_selfmysql_pers0</p>
     */
    @NameInMap("QueryName")
    public String queryName;

    /**
     * <strong>example:</strong>
     * <p>cn-zhangjiakou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("RiskLevelIdList")
    public String riskLevelIdList;

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
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("RuleIds")
    public String ruleIds;

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
     * <strong>example:</strong>
     * <p>TableName</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

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

    public DescribeDataObjectsRequest setAPIVersion(Integer APIVersion) {
        this.APIVersion = APIVersion;
        return this;
    }
    public Integer getAPIVersion() {
        return this.APIVersion;
    }

    public DescribeDataObjectsRequest setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public DescribeDataObjectsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataObjectsRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
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

    public DescribeDataObjectsRequest setLogStore(String logStore) {
        this.logStore = logStore;
        return this;
    }
    public String getLogStore() {
        return this.logStore;
    }

    public DescribeDataObjectsRequest setLogStoreFlag(Integer logStoreFlag) {
        this.logStoreFlag = logStoreFlag;
        return this;
    }
    public Integer getLogStoreFlag() {
        return this.logStoreFlag;
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

    public DescribeDataObjectsRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public DescribeDataObjectsRequest setProductId(Integer productId) {
        this.productId = productId;
        return this;
    }
    public Integer getProductId() {
        return this.productId;
    }

    public DescribeDataObjectsRequest setProductIds(String productIds) {
        this.productIds = productIds;
        return this;
    }
    public String getProductIds() {
        return this.productIds;
    }

    public DescribeDataObjectsRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DescribeDataObjectsRequest setQueryName(String queryName) {
        this.queryName = queryName;
        return this;
    }
    public String getQueryName() {
        return this.queryName;
    }

    public DescribeDataObjectsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDataObjectsRequest setRiskLevelIdList(String riskLevelIdList) {
        this.riskLevelIdList = riskLevelIdList;
        return this;
    }
    public String getRiskLevelIdList() {
        return this.riskLevelIdList;
    }

    public DescribeDataObjectsRequest setRiskLevels(String riskLevels) {
        this.riskLevels = riskLevels;
        return this;
    }
    public String getRiskLevels() {
        return this.riskLevels;
    }

    public DescribeDataObjectsRequest setRuleIds(String ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public String getRuleIds() {
        return this.ruleIds;
    }

    public DescribeDataObjectsRequest setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public DescribeDataObjectsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public DescribeDataObjectsRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public DescribeDataObjectsRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
