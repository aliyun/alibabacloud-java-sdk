// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeRulesResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Items")
    public java.util.List<DescribeRulesResponseBodyItems> items;

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

    public DescribeRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeRulesResponseBody setItems(java.util.List<DescribeRulesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeRulesResponseBodyItems> getItems() {
        return this.items;
    }

    public static class DescribeRulesResponseBodyItems extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("WarnLevel")
        public Integer warnLevel;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("StatExpress")
        public String statExpress;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        @NameInMap("Description")
        public String description;

        @NameInMap("ProductId")
        public Long productId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Content")
        public String content;

        @NameInMap("Target")
        public String target;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("ContentCategory")
        public String contentCategory;

        @NameInMap("HitTotalCount")
        public Integer hitTotalCount;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("CustomType")
        public Integer customType;

        @NameInMap("RiskLevelName")
        public String riskLevelName;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Category")
        public Integer category;

        @NameInMap("MajorKey")
        public String majorKey;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ProductCode")
        public String productCode;

        public static DescribeRulesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeRulesResponseBodyItems self = new DescribeRulesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeRulesResponseBodyItems setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeRulesResponseBodyItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeRulesResponseBodyItems setWarnLevel(Integer warnLevel) {
            this.warnLevel = warnLevel;
            return this;
        }
        public Integer getWarnLevel() {
            return this.warnLevel;
        }

        public DescribeRulesResponseBodyItems setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public DescribeRulesResponseBodyItems setStatExpress(String statExpress) {
            this.statExpress = statExpress;
            return this;
        }
        public String getStatExpress() {
            return this.statExpress;
        }

        public DescribeRulesResponseBodyItems setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeRulesResponseBodyItems setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribeRulesResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRulesResponseBodyItems setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

        public DescribeRulesResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeRulesResponseBodyItems setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeRulesResponseBodyItems setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeRulesResponseBodyItems setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public DescribeRulesResponseBodyItems setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeRulesResponseBodyItems setContentCategory(String contentCategory) {
            this.contentCategory = contentCategory;
            return this;
        }
        public String getContentCategory() {
            return this.contentCategory;
        }

        public DescribeRulesResponseBodyItems setHitTotalCount(Integer hitTotalCount) {
            this.hitTotalCount = hitTotalCount;
            return this;
        }
        public Integer getHitTotalCount() {
            return this.hitTotalCount;
        }

        public DescribeRulesResponseBodyItems setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeRulesResponseBodyItems setCustomType(Integer customType) {
            this.customType = customType;
            return this;
        }
        public Integer getCustomType() {
            return this.customType;
        }

        public DescribeRulesResponseBodyItems setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribeRulesResponseBodyItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeRulesResponseBodyItems setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public DescribeRulesResponseBodyItems setMajorKey(String majorKey) {
            this.majorKey = majorKey;
            return this;
        }
        public String getMajorKey() {
            return this.majorKey;
        }

        public DescribeRulesResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeRulesResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

}
