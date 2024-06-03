// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataObjectsResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<DescribeDataObjectsResponseBodyItems> items;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Id")
        public Long id;

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
        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        @NameInMap("RiskLevelName")
        public String riskLevelName;

        @NameInMap("RuleCount")
        public Integer ruleCount;

        @NameInMap("RuleId")
        public Long ruleId;

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
        @NameInMap("Categories")
        public java.util.List<String> categories;

        @NameInMap("Id")
        public String id;

        @NameInMap("InstanceDescription")
        public String instanceDescription;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LastModifiedTime")
        public Long lastModifiedTime;

        @NameInMap("LastScanTime")
        public Long lastScanTime;

        @NameInMap("MemberAccount")
        public Long memberAccount;

        @NameInMap("ModelTags")
        public java.util.List<DescribeDataObjectsResponseBodyItemsModelTags> modelTags;

        @NameInMap("Name")
        public String name;

        @NameInMap("ObjectFileCategory")
        public String objectFileCategory;

        @NameInMap("ObjectType")
        public String objectType;

        @NameInMap("Path")
        public String path;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductId")
        public Long productId;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("RuleList")
        public java.util.List<DescribeDataObjectsResponseBodyItemsRuleList> ruleList;

        @NameInMap("SensitiveCount")
        public Integer sensitiveCount;

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
