// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataObjectsRequest extends TeaModel {
    /**
     * <p>The version of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("APIVersion")
    public Integer APIVersion;

    /**
     * <p>The name of the OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>bucketName</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <p>The page number of the returned page. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>dataBaseName</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of the data domain to which the data asset belongs.</p>
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
     * <p>The code of the file category.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FileCategoryCode")
    public Long fileCategoryCode;

    /**
     * <p>The type of the OSS file.</p>
     * <blockquote>
     * <p>This parameter is valid only for querying data assets of the OSS type. You can call the <a href="https://help.aliyun.com/document_detail/2536492.html">DescribeDocTypes</a> operation to obtain the supported OSS file types. Use the value of the <code>Code</code> parameter in the response.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100001</p>
     */
    @NameInMap("FileType")
    public Long fileType;

    /**
     * <p>The keyword of the instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8vb54hn2g9j191ddz</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh_cn</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en_us</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the Logstore.</p>
     * 
     * <strong>example:</strong>
     * <p>logstore</p>
     */
    @NameInMap("LogStore")
    public String logStore;

    /**
     * <p>Specifies whether to query data at the Logstore level. The Simple Log Service data catalog has two layers. Set this parameter to 1 to query data at the Logstore level.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LogStoreFlag")
    public Integer logStoreFlag;

    /**
     * <p>The ID of the member.</p>
     * 
     * <strong>example:</strong>
     * <p>**********8103</p>
     */
    @NameInMap("MemberAccount")
    public Long memberAccount;

    /**
     * <p>The model ID of the industry-specific rule template. You can specify multiple IDs. Separate them with commas (,).</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2536491.html">DescribeTemplateAllRules</a> operation to obtain the model ID of the industry-specific rule template.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("ModelIds")
    public String modelIds;

    /**
     * <p>The data labels to be queried. You can specify multiple data labels. Separate them with commas (,). Valid values:</p>
     * <ul>
     * <li><p><strong>101</strong>: personal sensitive information</p>
     * </li>
     * <li><p><strong>102</strong>: personal information</p>
     * </li>
     * <li><p><strong>107</strong>: general information</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>101,102</p>
     */
    @NameInMap("ModelTagIds")
    public String modelTagIds;

    /**
     * <p>The number of data assets to return on each page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The IDs of the parent asset categories to be queried. You can specify multiple IDs. Separate them with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>234,236,238</p>
     */
    @NameInMap("ParentCategoryIds")
    public String parentCategoryIds;

    /**
     * <p>The path of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>road</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The ID of the product.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Integer productId;

    /**
     * <p>The IDs of the products to which the data assets to be queried belong. You can specify multiple product IDs. Separate them with commas (,). We recommend that you specify this parameter. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: MaxCompute</p>
     * </li>
     * <li><p><strong>2</strong>: OSS</p>
     * </li>
     * <li><p><strong>3</strong>: ADB-MYSQL</p>
     * </li>
     * <li><p><strong>4</strong>: TableStore</p>
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
     * <blockquote>
     * <p>If you want to query data assets that belong to OSS, you cannot query data assets of other products. By default, data assets of products other than OSS are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1,5</p>
     */
    @NameInMap("ProductIds")
    public String productIds;

    /**
     * <p>The name of the Simple Log Service project.</p>
     * 
     * <strong>example:</strong>
     * <p>project</p>
     */
    @NameInMap("Project")
    public String project;

    /**
     * <p>The keyword of the data asset to be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>t_sddp_selfmysql_pers0</p>
     */
    @NameInMap("QueryName")
    public String queryName;

    /**
     * <p>The region in which the data asset catalog resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-zhangjiakou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the sensitivity levels. You can specify multiple sensitivity level IDs. Separate them with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("RiskLevelIdList")
    public String riskLevelIdList;

    /**
     * <p>The sensitivity level of the data asset. You can specify multiple sensitivity levels. Separate them with commas (,).</p>
     * <ul>
     * <li><p><strong>2</strong>: S1, low sensitivity level</p>
     * </li>
     * <li><p><strong>3</strong>: S2, medium sensitivity level</p>
     * </li>
     * <li><p><strong>4</strong>: S3, high sensitivity level</p>
     * </li>
     * <li><p><strong>5</strong>: S4, highest sensitivity level</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RiskLevels")
    public String riskLevels;

    /**
     * <p>The IDs of the rules. You can specify multiple rule IDs. Separate them with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("RuleIds")
    public String ruleIds;

    /**
     * <p>The region where the data asset resides. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-beijing</strong>: China (Beijing)</p>
     * </li>
     * <li><p><strong>cn-zhangjiakou</strong>: China (Zhangjiakou)</p>
     * </li>
     * <li><p><strong>cn-huhehaote</strong>: China (Hohhot)</p>
     * </li>
     * <li><p><strong>cn-hangzhou</strong>: China (Hangzhou)</p>
     * </li>
     * <li><p><strong>cn-shanghai</strong>: China (Shanghai)</p>
     * </li>
     * <li><p><strong>cn-shenzhen</strong>: China (Shenzhen)</p>
     * </li>
     * <li><p><strong>cn-hongkong</strong>: China (Hong Kong)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    /**
     * <p>The name of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>TableName</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The ID of the industry-specific rule template.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2399296.html">DescribeCategoryTemplateList</a> operation to obtain the ID of the industry-specific rule template.</p>
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
