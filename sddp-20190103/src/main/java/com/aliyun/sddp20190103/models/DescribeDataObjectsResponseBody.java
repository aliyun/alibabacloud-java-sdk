// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataObjectsResponseBody extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>A list of data objects.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDataObjectsResponseBodyItems> items;

    /**
     * <p>The number of data asset instances to return on each page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique ID of the request. Alibaba Cloud generates this ID to help you troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>E6F6460E-4330-549A-BD89-C183FB17571E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries that match the query.</p>
     * 
     * <strong>example:</strong>
     * <p>21</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDataObjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataObjectsResponseBody self = new DescribeDataObjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataObjectsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataObjectsResponseBody setItems(java.util.List<DescribeDataObjectsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDataObjectsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDataObjectsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataObjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataObjectsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDataObjectsResponseBodyItemsModelTags extends TeaModel {
        /**
         * <p>The ID of the data tag. Valid values:</p>
         * <ul>
         * <li><p><strong>101</strong>: Personal sensitive information</p>
         * </li>
         * <li><p><strong>102</strong>: Personal information</p>
         * </li>
         * <li><p><strong>107</strong>: General information</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the data tag. Valid values:</p>
         * <ul>
         * <li><p><strong>Personal sensitive information</strong></p>
         * </li>
         * <li><p><strong>Personal information</strong></p>
         * </li>
         * <li><p><strong>General information</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Personal sensitive information</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeDataObjectsResponseBodyItemsModelTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataObjectsResponseBodyItemsModelTags self = new DescribeDataObjectsResponseBodyItemsModelTags();
            return TeaModel.build(map, self);
        }

        public DescribeDataObjectsResponseBodyItemsModelTags setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDataObjectsResponseBodyItemsModelTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDataObjectsResponseBodyItemsRuleList extends TeaModel {
        /**
         * <p>The ID of the risk level. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: N/A - No sensitive data is detected</p>
         * </li>
         * <li><p><strong>2</strong>: S1 - Level-1 sensitive data</p>
         * </li>
         * <li><p><strong>3</strong>: S2 - Level-2 sensitive data</p>
         * </li>
         * <li><p><strong>4</strong>: S3 - Level-3 sensitive data</p>
         * </li>
         * <li><p><strong>5</strong>: S4 - Level-4 sensitive data</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        /**
         * <p>The name of the risk level. Valid values:</p>
         * <ul>
         * <li><p><strong>N/A</strong>: No sensitive data is detected</p>
         * </li>
         * <li><p><strong>S1</strong>: Level-1 sensitive data</p>
         * </li>
         * <li><p><strong>S2</strong>: Level-2 sensitive data</p>
         * </li>
         * <li><p><strong>S3</strong>: Level-3 sensitive data</p>
         * </li>
         * <li><p><strong>S4</strong>: Level-4 sensitive data</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S1</p>
         */
        @NameInMap("RiskLevelName")
        public String riskLevelName;

        /**
         * <p>The hierarchical category of the rule, from the top-level to the leaf-level category in the template.</p>
         * 
         * <strong>example:</strong>
         * <p>Personal sensitive information-ID card</p>
         */
        @NameInMap("RuleCategoryNameList")
        public String ruleCategoryNameList;

        /**
         * <p>The number of matched detection models.</p>
         * 
         * <strong>example:</strong>
         * <p>590</p>
         */
        @NameInMap("RuleCount")
        public Integer ruleCount;

        /**
         * <p>The ID of the detection model.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The name of the detection model.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The sample data.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Lucy&quot;，&quot;Tom&quot;]</p>
         */
        @NameInMap("SampleList")
        public String sampleList;

        public static DescribeDataObjectsResponseBodyItemsRuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataObjectsResponseBodyItemsRuleList self = new DescribeDataObjectsResponseBodyItemsRuleList();
            return TeaModel.build(map, self);
        }

        public DescribeDataObjectsResponseBodyItemsRuleList setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribeDataObjectsResponseBodyItemsRuleList setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribeDataObjectsResponseBodyItemsRuleList setRuleCategoryNameList(String ruleCategoryNameList) {
            this.ruleCategoryNameList = ruleCategoryNameList;
            return this;
        }
        public String getRuleCategoryNameList() {
            return this.ruleCategoryNameList;
        }

        public DescribeDataObjectsResponseBodyItemsRuleList setRuleCount(Integer ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Integer getRuleCount() {
            return this.ruleCount;
        }

        public DescribeDataObjectsResponseBodyItemsRuleList setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeDataObjectsResponseBodyItemsRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeDataObjectsResponseBodyItemsRuleList setSampleList(String sampleList) {
            this.sampleList = sampleList;
            return this;
        }
        public String getSampleList() {
            return this.sampleList;
        }

    }

    public static class DescribeDataObjectsResponseBodyItems extends TeaModel {
        /**
         * <p>An array of industry categories to which the sensitive data belongs.</p>
         */
        @NameInMap("Categories")
        public java.util.List<String> categories;

        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>The comment on the column.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The data type of the database column.</p>
         * 
         * <strong>example:</strong>
         * <p>varchar</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>DataBaseName</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The code for the file category.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FileCategoryCode")
        public Integer fileCategoryCode;

        /**
         * <p>The unique ID of the data object.</p>
         * 
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The description of the data asset instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instance description</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <p>The ID of the data asset instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-12*****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The revision status.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("IsRevision")
        public Integer isRevision;

        /**
         * <p>The last modification time of the file, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1687676649830</p>
         */
        @NameInMap("LastModifiedTime")
        public Long lastModifiedTime;

        /**
         * <p>The timestamp of the last scan, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1687676649830</p>
         */
        @NameInMap("LastScanTime")
        public Long lastScanTime;

        /**
         * <p>The name of the Logstore in SLS.</p>
         * 
         * <strong>example:</strong>
         * <p>logStore</p>
         */
        @NameInMap("LogStore")
        public String logStore;

        /**
         * <p>The column encryption status.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("MaskStatus")
        public Integer maskStatus;

        /**
         * <p>The ID of the member account.</p>
         * 
         * <strong>example:</strong>
         * <p>**********8103</p>
         */
        @NameInMap("MemberAccount")
        public Long memberAccount;

        /**
         * <p>A list of data tags.</p>
         */
        @NameInMap("ModelTags")
        public java.util.List<DescribeDataObjectsResponseBodyItemsModelTags> modelTags;

        /**
         * <p>The name of the data object.</p>
         * 
         * <strong>example:</strong>
         * <p>t_sddp_selfmysql_pers0</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the file category.</p>
         * 
         * <strong>example:</strong>
         * <p>text file</p>
         */
        @NameInMap("ObjectFileCategory")
        public String objectFileCategory;

        /**
         * <p>The type of the data object.</p>
         * 
         * <strong>example:</strong>
         * <p>text type</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The path of the data object.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-12**.db_***</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The name of the product to which the data object belongs. Valid values:</p>
         * <ul>
         * <li><p><strong>MaxCompute</strong></p>
         * </li>
         * <li><p><strong>OSS</strong></p>
         * </li>
         * <li><p><strong>ADB-MYSQL</strong></p>
         * </li>
         * <li><p><strong>Table Store</strong></p>
         * </li>
         * <li><p><strong>RDS</strong></p>
         * </li>
         * <li><p><strong>SELF_DB</strong></p>
         * </li>
         * <li><p><strong>PolarDB-X</strong></p>
         * </li>
         * <li><p><strong>PolarDB</strong></p>
         * </li>
         * <li><p><strong>ADB-PG</strong></p>
         * </li>
         * <li><p><strong>OceanBase</strong></p>
         * </li>
         * <li><p><strong>MongoDB</strong></p>
         * </li>
         * <li><p><strong>Redis</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID of the product to which the data object belongs. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: MaxCompute</p>
         * </li>
         * <li><p><strong>2</strong>: OSS</p>
         * </li>
         * <li><p><strong>3</strong>: ADB-MYSQL</p>
         * </li>
         * <li><p><strong>4</strong>: Table Store</p>
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
         * <p>The name of the Simple Log Service (SLS) project.</p>
         * 
         * <strong>example:</strong>
         * <p>project</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The ID of the region where the data object is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskLevelId")
        public Integer riskLevelId;

        /**
         * <p>The number of matched rules.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RuleCount")
        public Integer ruleCount;

        /**
         * <p>A list of matched detection models.</p>
         */
        @NameInMap("RuleList")
        public java.util.List<DescribeDataObjectsResponseBodyItemsRuleList> ruleList;

        /**
         * <p>The number of sensitive data fields.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SensitiveCount")
        public Integer sensitiveCount;

        /**
         * <p>The size of the file in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>A comma-separated string that specifies the count of matched rules for each risk level. The string follows the format <code>S1,S2...S10</code>, where the value at each position represents the count for the corresponding risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>1,2,3,0,0,0,0,5,0,0</p>
         */
        @NameInMap("Sx")
        public String sx;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>tableName</p>
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
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>test-task</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The task number.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("TaskNumber")
        public Long taskNumber;

        /**
         * <p>The ID of the industry template.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static DescribeDataObjectsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataObjectsResponseBodyItems self = new DescribeDataObjectsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataObjectsResponseBodyItems setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public DescribeDataObjectsResponseBodyItems setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeDataObjectsResponseBodyItems setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeDataObjectsResponseBodyItems setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public DescribeDataObjectsResponseBodyItems setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeDataObjectsResponseBodyItems setFileCategoryCode(Integer fileCategoryCode) {
            this.fileCategoryCode = fileCategoryCode;
            return this;
        }
        public Integer getFileCategoryCode() {
            return this.fileCategoryCode;
        }

        public DescribeDataObjectsResponseBodyItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDataObjectsResponseBodyItems setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public DescribeDataObjectsResponseBodyItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDataObjectsResponseBodyItems setIsRevision(Integer isRevision) {
            this.isRevision = isRevision;
            return this;
        }
        public Integer getIsRevision() {
            return this.isRevision;
        }

        public DescribeDataObjectsResponseBodyItems setLastModifiedTime(Long lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public Long getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public DescribeDataObjectsResponseBodyItems setLastScanTime(Long lastScanTime) {
            this.lastScanTime = lastScanTime;
            return this;
        }
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        public DescribeDataObjectsResponseBodyItems setLogStore(String logStore) {
            this.logStore = logStore;
            return this;
        }
        public String getLogStore() {
            return this.logStore;
        }

        public DescribeDataObjectsResponseBodyItems setMaskStatus(Integer maskStatus) {
            this.maskStatus = maskStatus;
            return this;
        }
        public Integer getMaskStatus() {
            return this.maskStatus;
        }

        public DescribeDataObjectsResponseBodyItems setMemberAccount(Long memberAccount) {
            this.memberAccount = memberAccount;
            return this;
        }
        public Long getMemberAccount() {
            return this.memberAccount;
        }

        public DescribeDataObjectsResponseBodyItems setModelTags(java.util.List<DescribeDataObjectsResponseBodyItemsModelTags> modelTags) {
            this.modelTags = modelTags;
            return this;
        }
        public java.util.List<DescribeDataObjectsResponseBodyItemsModelTags> getModelTags() {
            return this.modelTags;
        }

        public DescribeDataObjectsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDataObjectsResponseBodyItems setObjectFileCategory(String objectFileCategory) {
            this.objectFileCategory = objectFileCategory;
            return this;
        }
        public String getObjectFileCategory() {
            return this.objectFileCategory;
        }

        public DescribeDataObjectsResponseBodyItems setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public DescribeDataObjectsResponseBodyItems setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeDataObjectsResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeDataObjectsResponseBodyItems setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

        public DescribeDataObjectsResponseBodyItems setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public DescribeDataObjectsResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDataObjectsResponseBodyItems setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeDataObjectsResponseBodyItems setRiskLevelId(Integer riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Integer getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribeDataObjectsResponseBodyItems setRuleCount(Integer ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Integer getRuleCount() {
            return this.ruleCount;
        }

        public DescribeDataObjectsResponseBodyItems setRuleList(java.util.List<DescribeDataObjectsResponseBodyItemsRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<DescribeDataObjectsResponseBodyItemsRuleList> getRuleList() {
            return this.ruleList;
        }

        public DescribeDataObjectsResponseBodyItems setSensitiveCount(Integer sensitiveCount) {
            this.sensitiveCount = sensitiveCount;
            return this;
        }
        public Integer getSensitiveCount() {
            return this.sensitiveCount;
        }

        public DescribeDataObjectsResponseBodyItems setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeDataObjectsResponseBodyItems setSx(String sx) {
            this.sx = sx;
            return this;
        }
        public String getSx() {
            return this.sx;
        }

        public DescribeDataObjectsResponseBodyItems setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeDataObjectsResponseBodyItems setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public DescribeDataObjectsResponseBodyItems setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeDataObjectsResponseBodyItems setTaskNumber(Long taskNumber) {
            this.taskNumber = taskNumber;
            return this;
        }
        public Long getTaskNumber() {
            return this.taskNumber;
        }

        public DescribeDataObjectsResponseBodyItems setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public DescribeDataObjectsResponseBodyItems setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
