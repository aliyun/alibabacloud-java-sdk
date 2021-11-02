// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeOssObjectsResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<DescribeOssObjectsResponseBodyItems> items;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeOssObjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssObjectsResponseBody self = new DescribeOssObjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssObjectsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOssObjectsResponseBody setItems(java.util.List<DescribeOssObjectsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeOssObjectsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeOssObjectsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOssObjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssObjectsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOssObjectsResponseBodyItemsRuleList extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Name")
        public String name;

        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        public static DescribeOssObjectsResponseBodyItemsRuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssObjectsResponseBodyItemsRuleList self = new DescribeOssObjectsResponseBodyItemsRuleList();
            return TeaModel.build(map, self);
        }

        public DescribeOssObjectsResponseBodyItemsRuleList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeOssObjectsResponseBodyItemsRuleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeOssObjectsResponseBodyItemsRuleList setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

    }

    public static class DescribeOssObjectsResponseBodyItems extends TeaModel {
        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("Category")
        public Long category;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("FileId")
        public String fileId;

        @NameInMap("Id")
        public String id;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        @NameInMap("RiskLevelName")
        public String riskLevelName;

        @NameInMap("RuleCount")
        public Integer ruleCount;

        @NameInMap("RuleList")
        public java.util.List<DescribeOssObjectsResponseBodyItemsRuleList> ruleList;

        @NameInMap("SensitiveCount")
        public Integer sensitiveCount;

        @NameInMap("Size")
        public Long size;

        public static DescribeOssObjectsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssObjectsResponseBodyItems self = new DescribeOssObjectsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeOssObjectsResponseBodyItems setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeOssObjectsResponseBodyItems setCategory(Long category) {
            this.category = category;
            return this;
        }
        public Long getCategory() {
            return this.category;
        }

        public DescribeOssObjectsResponseBodyItems setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeOssObjectsResponseBodyItems setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public DescribeOssObjectsResponseBodyItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeOssObjectsResponseBodyItems setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public DescribeOssObjectsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeOssObjectsResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeOssObjectsResponseBodyItems setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribeOssObjectsResponseBodyItems setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribeOssObjectsResponseBodyItems setRuleCount(Integer ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Integer getRuleCount() {
            return this.ruleCount;
        }

        public DescribeOssObjectsResponseBodyItems setRuleList(java.util.List<DescribeOssObjectsResponseBodyItemsRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<DescribeOssObjectsResponseBodyItemsRuleList> getRuleList() {
            return this.ruleList;
        }

        public DescribeOssObjectsResponseBodyItems setSensitiveCount(Integer sensitiveCount) {
            this.sensitiveCount = sensitiveCount;
            return this;
        }
        public Integer getSensitiveCount() {
            return this.sensitiveCount;
        }

        public DescribeOssObjectsResponseBodyItems setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

}
