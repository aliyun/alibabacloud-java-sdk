// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataObjectColumnDetailV2ResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<DescribeDataObjectColumnDetailV2ResponseBodyItems> items;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDataObjectColumnDetailV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataObjectColumnDetailV2ResponseBody self = new DescribeDataObjectColumnDetailV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataObjectColumnDetailV2ResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataObjectColumnDetailV2ResponseBody setItems(java.util.List<DescribeDataObjectColumnDetailV2ResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDataObjectColumnDetailV2ResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDataObjectColumnDetailV2ResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataObjectColumnDetailV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataObjectColumnDetailV2ResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDataObjectColumnDetailV2ResponseBodyItemsModelTags extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static DescribeDataObjectColumnDetailV2ResponseBodyItemsModelTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataObjectColumnDetailV2ResponseBodyItemsModelTags self = new DescribeDataObjectColumnDetailV2ResponseBodyItemsModelTags();
            return TeaModel.build(map, self);
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItemsModelTags setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItemsModelTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDataObjectColumnDetailV2ResponseBodyItems extends TeaModel {
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
        public java.util.List<DescribeDataObjectColumnDetailV2ResponseBodyItemsModelTags> modelTags;

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

        public static DescribeDataObjectColumnDetailV2ResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataObjectColumnDetailV2ResponseBodyItems self = new DescribeDataObjectColumnDetailV2ResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setColumnComment(String columnComment) {
            this.columnComment = columnComment;
            return this;
        }
        public String getColumnComment() {
            return this.columnComment;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setModelTags(java.util.List<DescribeDataObjectColumnDetailV2ResponseBodyItemsModelTags> modelTags) {
            this.modelTags = modelTags;
            return this;
        }
        public java.util.List<DescribeDataObjectColumnDetailV2ResponseBodyItemsModelTags> getModelTags() {
            return this.modelTags;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setPrimaryKey(Boolean primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public Boolean getPrimaryKey() {
            return this.primaryKey;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}
