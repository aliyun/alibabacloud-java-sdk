// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeStoragePlanResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeStoragePlanResponseBodyItems> items;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    public static DescribeStoragePlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStoragePlanResponseBody self = new DescribeStoragePlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStoragePlanResponseBody setItems(java.util.List<DescribeStoragePlanResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeStoragePlanResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeStoragePlanResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStoragePlanResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeStoragePlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStoragePlanResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeStoragePlanResponseBodyItems extends TeaModel {
        @NameInMap("AliUid")
        public String aliUid;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("EndTimes")
        public String endTimes;

        @NameInMap("InitCapaCityViewUnit")
        public String initCapaCityViewUnit;

        @NameInMap("InitCapacityViewValue")
        public String initCapacityViewValue;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("PeriodCapaCityViewUnit")
        public String periodCapaCityViewUnit;

        @NameInMap("PeriodCapacityViewValue")
        public String periodCapacityViewValue;

        @NameInMap("PeriodTime")
        public String periodTime;

        @NameInMap("ProdCode")
        public String prodCode;

        @NameInMap("PurchaseTimes")
        public String purchaseTimes;

        @NameInMap("StartTimes")
        public String startTimes;

        @NameInMap("Status")
        public String status;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("TemplateName")
        public String templateName;

        public static DescribeStoragePlanResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeStoragePlanResponseBodyItems self = new DescribeStoragePlanResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeStoragePlanResponseBodyItems setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribeStoragePlanResponseBodyItems setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeStoragePlanResponseBodyItems setEndTimes(String endTimes) {
            this.endTimes = endTimes;
            return this;
        }
        public String getEndTimes() {
            return this.endTimes;
        }

        public DescribeStoragePlanResponseBodyItems setInitCapaCityViewUnit(String initCapaCityViewUnit) {
            this.initCapaCityViewUnit = initCapaCityViewUnit;
            return this;
        }
        public String getInitCapaCityViewUnit() {
            return this.initCapaCityViewUnit;
        }

        public DescribeStoragePlanResponseBodyItems setInitCapacityViewValue(String initCapacityViewValue) {
            this.initCapacityViewValue = initCapacityViewValue;
            return this;
        }
        public String getInitCapacityViewValue() {
            return this.initCapacityViewValue;
        }

        public DescribeStoragePlanResponseBodyItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeStoragePlanResponseBodyItems setPeriodCapaCityViewUnit(String periodCapaCityViewUnit) {
            this.periodCapaCityViewUnit = periodCapaCityViewUnit;
            return this;
        }
        public String getPeriodCapaCityViewUnit() {
            return this.periodCapaCityViewUnit;
        }

        public DescribeStoragePlanResponseBodyItems setPeriodCapacityViewValue(String periodCapacityViewValue) {
            this.periodCapacityViewValue = periodCapacityViewValue;
            return this;
        }
        public String getPeriodCapacityViewValue() {
            return this.periodCapacityViewValue;
        }

        public DescribeStoragePlanResponseBodyItems setPeriodTime(String periodTime) {
            this.periodTime = periodTime;
            return this;
        }
        public String getPeriodTime() {
            return this.periodTime;
        }

        public DescribeStoragePlanResponseBodyItems setProdCode(String prodCode) {
            this.prodCode = prodCode;
            return this;
        }
        public String getProdCode() {
            return this.prodCode;
        }

        public DescribeStoragePlanResponseBodyItems setPurchaseTimes(String purchaseTimes) {
            this.purchaseTimes = purchaseTimes;
            return this;
        }
        public String getPurchaseTimes() {
            return this.purchaseTimes;
        }

        public DescribeStoragePlanResponseBodyItems setStartTimes(String startTimes) {
            this.startTimes = startTimes;
            return this;
        }
        public String getStartTimes() {
            return this.startTimes;
        }

        public DescribeStoragePlanResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeStoragePlanResponseBodyItems setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeStoragePlanResponseBodyItems setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
