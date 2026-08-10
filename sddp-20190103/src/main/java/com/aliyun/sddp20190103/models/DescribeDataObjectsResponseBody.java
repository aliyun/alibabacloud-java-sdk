// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataObjectsResponseBody extends TeaModel {
    /**
     * <p>The page number of the current page in a paged query. Settings the current page number for paging. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HasNext")
    public Boolean hasNext;

    @NameInMap("HasPrevious")
    public Boolean hasPrevious;

    /**
     * <p>The list of data objects.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDataObjectsResponseBodyItems> items;

    @NameInMap("NextCursor")
    public String nextCursor;

    /**
     * <p>The maximum number of data asset instances to return per page in a paged query. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PreviousCursor")
    public String previousCursor;

    /**
     * <p>The ID of the request. The ID is a unique identifier that Alibaba Cloud generates for the request and can be used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>E6F6460E-4330-549A-BD89-C183FB17571E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SyncStatus")
    public String syncStatus;

    /**
     * <p>The total number of entries returned.</p>
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

    public DescribeDataObjectsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeDataObjectsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeDataObjectsResponseBody setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
        return this;
    }
    public Boolean getHasNext() {
        return this.hasNext;
    }

    public DescribeDataObjectsResponseBody setHasPrevious(Boolean hasPrevious) {
        this.hasPrevious = hasPrevious;
        return this;
    }
    public Boolean getHasPrevious() {
        return this.hasPrevious;
    }

    public DescribeDataObjectsResponseBody setItems(java.util.List<DescribeDataObjectsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDataObjectsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDataObjectsResponseBody setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }
    public String getNextCursor() {
        return this.nextCursor;
    }

    public DescribeDataObjectsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataObjectsResponseBody setPreviousCursor(String previousCursor) {
        this.previousCursor = previousCursor;
        return this;
    }
    public String getPreviousCursor() {
        return this.previousCursor;
    }

    public DescribeDataObjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataObjectsResponseBody setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }
    public String getSyncStatus() {
        return this.syncStatus;
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
         * <p>The data label ID. Valid values:</p>
         * <ul>
         * <li><strong>101</strong>: Personal sensitive information.</li>
         * <li><strong>102</strong>: Personal information.</li>
         * <li><strong>107</strong>: General information.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The data tag name. Valid values:</p>
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
         * <p>The risk level ID of the sensitive data detection rule. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        /**
         * <p>The risk level name of the data asset table. Valid values:</p>
         * <ul>
         * <li><strong>N/A</strong>: No sensitive data is detected.</li>
         * <li><strong>S1</strong>: Level-1 sensitive data.</li>
         * <li><strong>S2</strong>: Level-2 sensitive data.</li>
         * <li><strong>S3</strong>: Level-3 sensitive data.</li>
         * <li><strong>S4</strong>: Level-4 sensitive data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S1</p>
         */
        @NameInMap("RiskLevelName")
        public String riskLevelName;

        /**
         * <p>The rule information described from the top to the bottom of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>Personal sensitive information-ID card</p>
         */
        @NameInMap("RuleCategoryNameList")
        public String ruleCategoryNameList;

        /**
         * <p>The number of detection models that are hit.</p>
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
         * <p>The list of industry categories to which the sensitive data belongs.</p>
         */
        @NameInMap("Categories")
        public java.util.List<String> categories;

        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>The column comment.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The database column type.</p>
         * 
         * <strong>example:</strong>
         * <p>varchar</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>DataBaseName</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        /**
         * <p>The file type.</p>
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
         * <p>The instance description of the data object.</p>
         * 
         * <strong>example:</strong>
         * <p>instance description</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <p>The data asset instance ID.</p>
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
         * <p>The SLS Logstore.</p>
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
         * <p>The member accounts ID.</p>
         * 
         * <strong>example:</strong>
         * <p>**********8103</p>
         */
        @NameInMap("MemberAccount")
        public Long memberAccount;

        /**
         * <p>The list of data tags.</p>
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
         * <p>The file category name.</p>
         * 
         * <strong>example:</strong>
         * <p>text file</p>
         */
        @NameInMap("ObjectFileCategory")
        public String objectFileCategory;

        /**
         * <p>The data object type.</p>
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
         * <p>The product name to which the data object belongs. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID that corresponds to the product name to which the data object belongs. Valid values:</p>
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
         * <p>The Simple Log Service (SLS) project.</p>
         * 
         * <strong>example:</strong>
         * <p>project</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The region ID to which the data object belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The region name.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The sensitivity level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskLevelId")
        public Integer riskLevelId;

        /**
         * <p>The number of rules that are hit.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RuleCount")
        public Integer ruleCount;

        /**
         * <p>The list of detection models that are hit.</p>
         */
        @NameInMap("RuleList")
        public java.util.List<DescribeDataObjectsResponseBodyItemsRuleList> ruleList;

        /**
         * <p>The number of sensitive data entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SensitiveCount")
        public Integer sensitiveCount;

        /**
         * <p>The file size.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>An array that consists of the number of rules hit for each sensitivity level, in the format &quot;S1,S2,S3,S4,S5,S6,S7,S8,S9,S10&quot;, where S1 represents the number of rules hit at sensitivity level S1.</p>
         * 
         * <strong>example:</strong>
         * <p>1,2,3,0,0,0,0,5,0,0</p>
         */
        @NameInMap("Sx")
        public String sx;

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>tableName</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-task</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The user task number.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("TaskNumber")
        public Long taskNumber;

        /**
         * <p>The industry template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <p>The template name.</p>
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

        public DescribeDataObjectsResponseBodyItems setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
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
