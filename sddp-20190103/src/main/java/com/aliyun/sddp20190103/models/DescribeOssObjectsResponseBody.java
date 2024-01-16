// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeOssObjectsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>A list of OSS objects.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeOssObjectsResponseBodyItems> items;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>The number of times that the rule is hit.</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The search keyword. Fuzzy match is supported.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the sensitivity level of the OSS object. Valid values:</p>
         * <br>
         * <p>*   **1**: N/A, which indicates that no sensitive data is detected.</p>
         * <p>*   **2**: S1, which indicates the low sensitivity level.</p>
         * <p>*   **3**: S2, which indicates the medium sensitivity level.</p>
         * <p>*   **4**: S3, which indicates the high sensitivity level.</p>
         * <p>*   **5**: S4, which indicates the highest sensitivity level.</p>
         */
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
        /**
         * <p>The name of the bucket.</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The type of the OSS object. Valid values include **900001**, **800015**, or **800005**, which indicates the MP4 file, PDF file, or OSS configuration file, respectively.</p>
         */
        @NameInMap("Category")
        public Long category;

        /**
         * <p>The name of the file type.</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The code of the file type.</p>
         */
        @NameInMap("FileCategoryCode")
        public Long fileCategoryCode;

        /**
         * <p>The name of the file type.</p>
         */
        @NameInMap("FileCategoryName")
        public String fileCategoryName;

        /**
         * <p>The file ID of the OSS object.</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The ID of the OSS object.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the instance to which the OSS object belongs.</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The name of the OSS object.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The region ID of the OSS object.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the sensitivity level of the OSS object. Valid values:</p>
         * <br>
         * <p>*   **1**: N/A, which indicates that no sensitive data is detected.</p>
         * <p>*   **2**: S1, which indicates the low sensitivity level.</p>
         * <p>*   **3**: S2, which indicates the medium sensitivity level.</p>
         * <p>*   **4**: S3, which indicates the high sensitivity level.</p>
         * <p>*   **5**: S4, which indicates the highest sensitivity level.</p>
         */
        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        /**
         * <p>The name of the sensitivity level for the OSS object.</p>
         */
        @NameInMap("RiskLevelName")
        public String riskLevelName;

        /**
         * <p>The number of rules that are hit.</p>
         */
        @NameInMap("RuleCount")
        public Integer ruleCount;

        /**
         * <p>A list of rules.</p>
         */
        @NameInMap("RuleList")
        public java.util.List<DescribeOssObjectsResponseBodyItemsRuleList> ruleList;

        /**
         * <p>The number of fields that are hit.</p>
         */
        @NameInMap("SensitiveCount")
        public Integer sensitiveCount;

        /**
         * <p>The size of the file. Unit: bytes.</p>
         */
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

        public DescribeOssObjectsResponseBodyItems setFileCategoryCode(Long fileCategoryCode) {
            this.fileCategoryCode = fileCategoryCode;
            return this;
        }
        public Long getFileCategoryCode() {
            return this.fileCategoryCode;
        }

        public DescribeOssObjectsResponseBodyItems setFileCategoryName(String fileCategoryName) {
            this.fileCategoryName = fileCategoryName;
            return this;
        }
        public String getFileCategoryName() {
            return this.fileCategoryName;
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
