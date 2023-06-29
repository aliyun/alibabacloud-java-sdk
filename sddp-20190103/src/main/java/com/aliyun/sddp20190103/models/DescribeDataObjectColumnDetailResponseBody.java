// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataObjectColumnDetailResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<DescribeDataObjectColumnDetailResponseBodyItems> items;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDataObjectColumnDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataObjectColumnDetailResponseBody self = new DescribeDataObjectColumnDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataObjectColumnDetailResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataObjectColumnDetailResponseBody setItems(java.util.List<DescribeDataObjectColumnDetailResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDataObjectColumnDetailResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDataObjectColumnDetailResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataObjectColumnDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataObjectColumnDetailResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDataObjectColumnDetailResponseBodyItemsModelTags extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static DescribeDataObjectColumnDetailResponseBodyItemsModelTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataObjectColumnDetailResponseBodyItemsModelTags self = new DescribeDataObjectColumnDetailResponseBodyItemsModelTags();
            return TeaModel.build(map, self);
        }

        public DescribeDataObjectColumnDetailResponseBodyItemsModelTags setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDataObjectColumnDetailResponseBodyItemsModelTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDataObjectColumnDetailResponseBodyItems extends TeaModel {
        @NameInMap("Categories")
        public java.util.List<String> categories;

        @NameInMap("ColumnComment")
        public String columnComment;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("Id")
        public String id;

        @NameInMap("ModelTags")
        public java.util.List<DescribeDataObjectColumnDetailResponseBodyItemsModelTags> modelTags;

        @NameInMap("PrimaryKey")
        public Boolean primaryKey;

        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        @NameInMap("RiskLevelName")
        public String riskLevelName;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        public static DescribeDataObjectColumnDetailResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataObjectColumnDetailResponseBodyItems self = new DescribeDataObjectColumnDetailResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setColumnComment(String columnComment) {
            this.columnComment = columnComment;
            return this;
        }
        public String getColumnComment() {
            return this.columnComment;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setModelTags(java.util.List<DescribeDataObjectColumnDetailResponseBodyItemsModelTags> modelTags) {
            this.modelTags = modelTags;
            return this;
        }
        public java.util.List<DescribeDataObjectColumnDetailResponseBodyItemsModelTags> getModelTags() {
            return this.modelTags;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setPrimaryKey(Boolean primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public Boolean getPrimaryKey() {
            return this.primaryKey;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}
