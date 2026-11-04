// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeStoragePlanResponseBody extends TeaModel {
    /**
     * <p>The list of storage plans.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeStoragePlanResponseBodyItems> items;

    /**
     * <p>The page number. The value must be a positive integer that does not exceed the maximum value of the Integer data type.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><p><strong>30</strong></p>
     * </li>
     * <li><p><strong>50</strong></p>
     * </li>
     * <li><p><strong>100</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D9384D30-5C9A-11EA-BFC0-F754D2Bxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
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
        /**
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>18170112322*****</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb_package</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The expiration time of the storage plan.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-23 00:00:00</p>
         */
        @NameInMap("EndTimes")
        public String endTimes;

        /**
         * <p>The capacity unit of the storage plan.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("InitCapaCityViewUnit")
        public String initCapaCityViewUnit;

        /**
         * <p>The total capacity of the storage plan.</p>
         * 
         * <strong>example:</strong>
         * <p>500.000</p>
         */
        @NameInMap("InitCapacityViewValue")
        public String initCapacityViewValue;

        /**
         * <p>The resource instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>500072****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The period capacity unit of the storage plan.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("PeriodCapaCityViewUnit")
        public String periodCapaCityViewUnit;

        /**
         * <p>The period capacity of the storage plan. The period capacity gradually decreases as the storage plan is used.</p>
         * 
         * <strong>example:</strong>
         * <p>400.000</p>
         */
        @NameInMap("PeriodCapacityViewValue")
        public String periodCapacityViewValue;

        /**
         * <p>The period duration. This indicates that the capacity of the storage plan is measured and consumed by the hour.</p>
         * 
         * <strong>example:</strong>
         * <p>hour</p>
         */
        @NameInMap("PeriodTime")
        public String periodTime;

        /**
         * <p>The product name.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb</p>
         */
        @NameInMap("ProdCode")
        public String prodCode;

        /**
         * <p>The purchase time of the storage plan.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-22 12:03:27</p>
         */
        @NameInMap("PurchaseTimes")
        public String purchaseTimes;

        /**
         * <p>The effective period of the storage plan.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-22 12:03:25</p>
         */
        @NameInMap("StartTimes")
        public String startTimes;

        /**
         * <p>The status of the storage plan. Valid values:</p>
         * <ul>
         * <li><p><strong>Valid</strong>: Valid.</p>
         * </li>
         * <li><p><strong>Invalid</strong>: Invalid.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Valid</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the storage plan. Valid values:</p>
         * <ul>
         * <li><p><strong>Overseas</strong>: Hong Kong (China) and regions outside China</p>
         * </li>
         * <li><p><strong>Mainland</strong>: the Chinese mainland</p>
         * </li>
         * <li><p><strong>Financial</strong>: Finance Cloud</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Overseas</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The type of the resource plan. Valid values:</p>
         * <ul>
         * <li><p><strong>FPT_polardb_package_absolute_1540888383</strong>: the Chinese mainland</p>
         * </li>
         * <li><p><strong>FPT_polardb_package_absolute_1540890081</strong>: Hong Kong (China) and regions outside China</p>
         * </li>
         * <li><p><strong>FPT_polardb_package_absolute_1567151499</strong>: Finance Cloud</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FPT_polardb_package_absolute_1540890081</p>
         */
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
