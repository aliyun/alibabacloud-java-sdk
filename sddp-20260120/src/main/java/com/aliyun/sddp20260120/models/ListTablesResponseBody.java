// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListTablesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of records returned by the query.</p>
     */
    @NameInMap("Items")
    public java.util.List<ListTablesResponseBodyItems> items;

    /**
     * <p>The pagination cursor used for the current query.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The cursor used to query the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("NextMarker")
    public String nextMarker;

    /**
     * <p>The number of entries returned per page for the current query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request. You can use the ID to locate the API call.</p>
     * 
     * <strong>example:</strong>
     * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries that meet the current statistical or query scope.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>Indicates whether more pages exist. A value of true indicates that more data exists. A value of false indicates that no more data exists.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Truncated")
    public String truncated;

    public static ListTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTablesResponseBody self = new ListTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTablesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListTablesResponseBody setItems(java.util.List<ListTablesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListTablesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListTablesResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListTablesResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public ListTablesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTablesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTablesResponseBody setTruncated(String truncated) {
        this.truncated = truncated;
        return this;
    }
    public String getTruncated() {
        return this.truncated;
    }

    public static class ListTablesResponseBodyItemsRuleList extends TeaModel {
        /**
         * <p>The number of hits for the detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The name of the detection model or rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Phone number</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the sensitivity level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        public static ListTablesResponseBodyItemsRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListTablesResponseBodyItemsRuleList self = new ListTablesResponseBodyItemsRuleList();
            return TeaModel.build(map, self);
        }

        public ListTablesResponseBodyItemsRuleList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListTablesResponseBodyItemsRuleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTablesResponseBodyItemsRuleList setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

    }

    public static class ListTablesResponseBodyItems extends TeaModel {
        /**
         * <p>The description of the database table.</p>
         * 
         * <strong>example:</strong>
         * <p>Customer contact information</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The time when the data object was created. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1788566400000</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <p>The instance identity of the cloud instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1abcdefgh****</p>
         */
        @NameInMap("DataAssetSourceId")
        public String dataAssetSourceId;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>business_db</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The description of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Business database instance</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <p>The name of the database table. Some engines return the name in the schema.table format.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the Alibaba Cloud account that owns the database table.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789012****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The code of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID of the sensitivity level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        /**
         * <p>The name of the sensitivity level.</p>
         * 
         * <strong>example:</strong>
         * <p>S2</p>
         */
        @NameInMap("RiskLevelName")
        public String riskLevelName;

        /**
         * <p>The list of detection models or rules.</p>
         */
        @NameInMap("RuleList")
        public java.util.List<ListTablesResponseBodyItemsRuleList> ruleList;

        /**
         * <p>Indicates whether the data is detected as sensitive data.</p>
         */
        @NameInMap("Sensitive")
        public Boolean sensitive;

        /**
         * <p>The number of sensitive data entries within the current statistical scope.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("SensitiveCount")
        public Integer sensitiveCount;

        /**
         * <p>The proportion of sensitive data.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("SensitiveRatio")
        public String sensitiveRatio;

        /**
         * <p>The name of the tenant to which the data asset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Business tenant</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        /**
         * <p>The total number of entries that meet the current statistical or query scope.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListTablesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListTablesResponseBodyItems self = new ListTablesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListTablesResponseBodyItems setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListTablesResponseBodyItems setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public ListTablesResponseBodyItems setDataAssetSourceId(String dataAssetSourceId) {
            this.dataAssetSourceId = dataAssetSourceId;
            return this;
        }
        public String getDataAssetSourceId() {
            return this.dataAssetSourceId;
        }

        public ListTablesResponseBodyItems setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public ListTablesResponseBodyItems setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public ListTablesResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTablesResponseBodyItems setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListTablesResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListTablesResponseBodyItems setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public ListTablesResponseBodyItems setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public ListTablesResponseBodyItems setRuleList(java.util.List<ListTablesResponseBodyItemsRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<ListTablesResponseBodyItemsRuleList> getRuleList() {
            return this.ruleList;
        }

        public ListTablesResponseBodyItems setSensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }
        public Boolean getSensitive() {
            return this.sensitive;
        }

        public ListTablesResponseBodyItems setSensitiveCount(Integer sensitiveCount) {
            this.sensitiveCount = sensitiveCount;
            return this;
        }
        public Integer getSensitiveCount() {
            return this.sensitiveCount;
        }

        public ListTablesResponseBodyItems setSensitiveRatio(String sensitiveRatio) {
            this.sensitiveRatio = sensitiveRatio;
            return this;
        }
        public String getSensitiveRatio() {
            return this.sensitiveRatio;
        }

        public ListTablesResponseBodyItems setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public ListTablesResponseBodyItems setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
