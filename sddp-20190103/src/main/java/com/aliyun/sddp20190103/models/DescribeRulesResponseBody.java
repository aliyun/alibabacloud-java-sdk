// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeRulesResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<DescribeRulesResponseBodyItems> items;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Category")
        public Integer category;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("Content")
        public String content;

        @NameInMap("ContentCategory")
        public String contentCategory;

        @NameInMap("CustomType")
        public Integer customType;

        @NameInMap("Description")
        public String description;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("HitTotalCount")
        public Integer hitTotalCount;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("MajorKey")
        public String majorKey;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductId")
        public Long productId;

        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        @NameInMap("RiskLevelName")
        public String riskLevelName;

        @NameInMap("StatExpress")
        public String statExpress;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Target")
        public String target;

        @NameInMap("UserId")
        public Long userId;

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

        public DescribeRulesResponseBodyItems setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
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
