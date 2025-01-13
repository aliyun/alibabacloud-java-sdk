// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeRulesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>An array that consists of the sensitive data detection rules.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeRulesResponseBodyItems> items;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>769FB3C1-F4C9-42DF-9B72-7077A8989C13</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRulesResponseBody self = new DescribeRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRulesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeRulesResponseBody setItems(java.util.List<DescribeRulesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeRulesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRulesResponseBodyItems extends TeaModel {
        /**
         * <p>The content type of the sensitive data detection rule. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: keyword</li>
         * <li><strong>2</strong>: regular expression</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Category")
        public Integer category;

        /**
         * <p>The name of the content type of the sensitive data detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Regular expression</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The content in the sensitive data detection rule.</p>
         * <blockquote>
         * <p> A built-in detection rule whose CustomType is 0 does not return the content of the rule.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>(?:\\D|^)((?:(?:25[0-4]|2[0-4]\\d|1\\d{2}|[1-9]\\d{1})\\.)(?:(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d)\\.){2}(?:25[0-5]|2[0-4]\\d|1[0-9]\\d|[1-9]\\d|[1-9]))(?:\\D|$)</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The type of the content in the sensitive data detection rule. Valid values include <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates attempts to exploit SQL injections. The value 2 indicates bypass by using SQL injections. The value 3 indicates abuse of stored procedures. The value 4 indicates buffer overflow. The value 5 indicates SQL injections based on errors.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ContentCategory")
        public String contentCategory;

        /**
         * <p>The type of the sensitive data detection rule.</p>
         * <ul>
         * <li>0: built-in rule</li>
         * <li>1: custom rule</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CustomType")
        public Integer customType;

        /**
         * <p>The description of the sensitive data detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>The sensitive data detection rule is used to detect IP addresses.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the account that is used to create the sensitive data detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>****test</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The time when the sensitive data detection rule is created. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1545277010000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The time when the sensitive data detection rule is modified. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1545277010000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The parent group type of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>4_1</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The number of times that the sensitive data detection rule is hit.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HitTotalCount")
        public Integer hitTotalCount;

        /**
         * <p>The ID of the sensitive data detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The username of the account that is used to create the sensitive data detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>det1111</p>
         */
        @NameInMap("LoginName")
        public String loginName;

        /**
         * <p>The key of the primary dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("MajorKey")
        public String majorKey;

        /**
         * <p>The match type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: rule-based match</li>
         * <li><strong>2</strong>: dictionary-based match</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MatchType")
        public Integer matchType;

        @NameInMap("ModelRuleIds")
        public String modelRuleIds;

        /**
         * <p>The name of the sensitive data detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>IP address</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the service to which the data asset belongs. Valid values include <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID of the service to which the sensitive data detection rule is applied. Valid values include <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates MaxCompute. The value 2 indicates OSS. The value 3 indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ProductId")
        public Long productId;

        /**
         * <p>The sensitivity level of the sensitive data that hits the sensitive data detection rule. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: N/A, which indicates that no sensitive data is detected.</li>
         * <li><strong>2</strong>: S1, which indicates the low sensitivity level.</li>
         * <li><strong>3</strong>: S2, which indicates the medium sensitivity level.</li>
         * <li><strong>4</strong>: S3, which indicates the high sensitivity level.</li>
         * <li><strong>5</strong>: S4, which indicates the highest sensitivity level.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        /**
         * <p>The sensitivity level of data that hits the sensitive data detection rule. Valid values:</p>
         * <ul>
         * <li><strong>N/A</strong>: indicates that no sensitive data is detected.</li>
         * <li><strong>S1</strong>: indicates the low sensitivity level.</li>
         * <li><strong>S2</strong>: indicates the medium sensitivity level.</li>
         * <li><strong>S3</strong>: indicates the high sensitivity level.</li>
         * <li><strong>S4</strong>: indicates the highest sensitivity level.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S2</p>
         */
        @NameInMap("RiskLevelName")
        public String riskLevelName;

        /**
         * <p>The statistical expression.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StatExpress")
        public String statExpress;

        /**
         * <p>The status of the sensitive data detection rule. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The data asset type that is supported by the sensitive data detection rule. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: all data assets</li>
         * <li><strong>1</strong>: structured data assets</li>
         * <li><strong>2</strong>: unstructured data assets</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SupportForm")
        public Integer supportForm;

        /**
         * <p>The name of the service to which the data asset belongs. Valid values include <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("Target")
        public String target;

        @NameInMap("TemplateRuleIds")
        public String templateRuleIds;

        /**
         * <p>The ID of the account that is used to create the sensitive data detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UserId")
        public Long userId;

        /**
         * <p>The severity level. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: low</li>
         * <li><strong>2</strong>: medium</li>
         * <li><strong>3</strong>: high</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("WarnLevel")
        public Integer warnLevel;

        public static DescribeRulesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeRulesResponseBodyItems self = new DescribeRulesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeRulesResponseBodyItems setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public DescribeRulesResponseBodyItems setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeRulesResponseBodyItems setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeRulesResponseBodyItems setContentCategory(String contentCategory) {
            this.contentCategory = contentCategory;
            return this;
        }
        public String getContentCategory() {
            return this.contentCategory;
        }

        public DescribeRulesResponseBodyItems setCustomType(Integer customType) {
            this.customType = customType;
            return this;
        }
        public Integer getCustomType() {
            return this.customType;
        }

        public DescribeRulesResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRulesResponseBodyItems setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeRulesResponseBodyItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeRulesResponseBodyItems setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeRulesResponseBodyItems setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeRulesResponseBodyItems setHitTotalCount(Integer hitTotalCount) {
            this.hitTotalCount = hitTotalCount;
            return this;
        }
        public Integer getHitTotalCount() {
            return this.hitTotalCount;
        }

        public DescribeRulesResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeRulesResponseBodyItems setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public DescribeRulesResponseBodyItems setMajorKey(String majorKey) {
            this.majorKey = majorKey;
            return this;
        }
        public String getMajorKey() {
            return this.majorKey;
        }

        public DescribeRulesResponseBodyItems setMatchType(Integer matchType) {
            this.matchType = matchType;
            return this;
        }
        public Integer getMatchType() {
            return this.matchType;
        }

        public DescribeRulesResponseBodyItems setModelRuleIds(String modelRuleIds) {
            this.modelRuleIds = modelRuleIds;
            return this;
        }
        public String getModelRuleIds() {
            return this.modelRuleIds;
        }

        public DescribeRulesResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeRulesResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeRulesResponseBodyItems setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

        public DescribeRulesResponseBodyItems setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribeRulesResponseBodyItems setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribeRulesResponseBodyItems setStatExpress(String statExpress) {
            this.statExpress = statExpress;
            return this;
        }
        public String getStatExpress() {
            return this.statExpress;
        }

        public DescribeRulesResponseBodyItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeRulesResponseBodyItems setSupportForm(Integer supportForm) {
            this.supportForm = supportForm;
            return this;
        }
        public Integer getSupportForm() {
            return this.supportForm;
        }

        public DescribeRulesResponseBodyItems setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeRulesResponseBodyItems setTemplateRuleIds(String templateRuleIds) {
            this.templateRuleIds = templateRuleIds;
            return this;
        }
        public String getTemplateRuleIds() {
            return this.templateRuleIds;
        }

        public DescribeRulesResponseBodyItems setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public DescribeRulesResponseBodyItems setWarnLevel(Integer warnLevel) {
            this.warnLevel = warnLevel;
            return this;
        }
        public Integer getWarnLevel() {
            return this.warnLevel;
        }

    }

}
