// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataObjectsResponseBody extends TeaModel {
    /**
     * <p>When performing a paginated query, set the current page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>List of data objects.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDataObjectsResponseBodyItems> items;

    /**
     * <p>When performing a paginated query, this sets the maximum number of data asset instances to display per page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>本次调用请求的ID，是由阿里云为该请求生成的唯一标识符，可用于排查和定位问题。</p>
     * 
     * <strong>example:</strong>
     * <p>E6F6460E-4330-549A-BD89-C183FB17571E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of query results.</p>
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
         * <p>Data tag ID. Values:</p>
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
         * <p>Data tag name. Values:</p>
         * <ul>
         * <li><strong>Personal sensitive information.</strong></li>
         * <li><strong>Personal information.</strong></li>
         * <li><strong>General information.</strong></li>
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
         * <p>Risk level ID for sensitive data identification rules. Values:</p>
         * <ul>
         * <li><strong>1</strong>: N/A: No sensitive data identified.</li>
         * <li><strong>2</strong>: S1: Level 1 sensitive data.</li>
         * <li><strong>3</strong>: S2: Level 2 sensitive data.</li>
         * <li><strong>4</strong>: S3: Level 3 sensitive data.</li>
         * <li><strong>5</strong>: S4: Level 4 sensitive data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        /**
         * <p>Risk level name for the data asset table. Values:</p>
         * <ul>
         * <li><strong>N/A</strong>: No sensitive data identified.</li>
         * <li><strong>S1</strong>: Level 1 sensitive data.</li>
         * <li><strong>S2</strong>: Level 2 sensitive data.</li>
         * <li><strong>S3</strong>: Level 3 sensitive data.</li>
         * <li><strong>S4</strong>: Level 4 sensitive data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S1</p>
         */
        @NameInMap("RiskLevelName")
        public String riskLevelName;

        /**
         * <p>Number of matched identification models.</p>
         * 
         * <strong>example:</strong>
         * <p>590</p>
         */
        @NameInMap("RuleCount")
        public Integer ruleCount;

        /**
         * <p>Identification model ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>Identification model name.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

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

    }

    public static class DescribeDataObjectsResponseBodyItems extends TeaModel {
        /**
         * <p>List of industry categories for the sensitive data.</p>
         */
        @NameInMap("Categories")
        public java.util.List<String> categories;

        /**
         * <p>The unique identifier ID of the data object.</p>
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
         * <p>Data asset instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-12*****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Latest file modification time, in milliseconds.</p>
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
         * <p>Member account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>**********8103</p>
         */
        @NameInMap("MemberAccount")
        public Long memberAccount;

        /**
         * <p>List of data tags.</p>
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
         * <p>File category name.</p>
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
         * <p>The product name that the data object belongs to. Values:</p>
         * <ul>
         * <li><strong>MaxCompute</strong></li>
         * <li><strong>OSS</strong></li>
         * <li><strong>ADB-MYSQL</strong></li>
         * <li><strong>TableStore</strong></li>
         * <li><strong>RDS</strong></li>
         * <li><strong>SELF_DB</strong></li>
         * <li><strong>PolarDB-X</strong></li>
         * <li><strong>PolarDB</strong></li>
         * <li><strong>ADB-PG</strong></li>
         * <li><strong>OceanBase</strong></li>
         * <li><strong>MongoDB</strong></li>
         * <li><strong>Redis</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID corresponding to the product name that the data object belongs to. Values:</p>
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
         * <p>OSS存储对象所属区域ID。</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Region name.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>List of matched identification models.</p>
         */
        @NameInMap("RuleList")
        public java.util.List<DescribeDataObjectsResponseBodyItemsRuleList> ruleList;

        /**
         * <p>Number of sensitive data items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SensitiveCount")
        public Integer sensitiveCount;

        /**
         * <p>Industry template ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

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

        public DescribeDataObjectsResponseBodyItems setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

}
