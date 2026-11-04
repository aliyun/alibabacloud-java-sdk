// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKVCacheInstancesResponseBody extends TeaModel {
    @NameInMap("Items")
    public DescribeKVCacheInstancesResponseBodyItems items;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of instances returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of instances that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeKVCacheInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKVCacheInstancesResponseBody self = new DescribeKVCacheInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKVCacheInstancesResponseBody setItems(DescribeKVCacheInstancesResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeKVCacheInstancesResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeKVCacheInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeKVCacheInstancesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeKVCacheInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKVCacheInstancesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeKVCacheInstancesResponseBodyItemsKVCacheItem extends TeaModel {
        @NameInMap("AIDBClusterId")
        public String AIDBClusterId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Expired")
        public String expired;

        @NameInMap("KVCacheInstanceId")
        public String KVCacheInstanceId;

        @NameInMap("KVCacheInstanceStatus")
        public String KVCacheInstanceStatus;

        @NameInMap("KVCacheSpace")
        public Integer KVCacheSpace;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("VPCId")
        public String VPCId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeKVCacheInstancesResponseBodyItemsKVCacheItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeKVCacheInstancesResponseBodyItemsKVCacheItem self = new DescribeKVCacheInstancesResponseBodyItemsKVCacheItem();
            return TeaModel.build(map, self);
        }

        public DescribeKVCacheInstancesResponseBodyItemsKVCacheItem setAIDBClusterId(String AIDBClusterId) {
            this.AIDBClusterId = AIDBClusterId;
            return this;
        }
        public String getAIDBClusterId() {
            return this.AIDBClusterId;
        }

        public DescribeKVCacheInstancesResponseBodyItemsKVCacheItem setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeKVCacheInstancesResponseBodyItemsKVCacheItem setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeKVCacheInstancesResponseBodyItemsKVCacheItem setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeKVCacheInstancesResponseBodyItemsKVCacheItem setExpired(String expired) {
            this.expired = expired;
            return this;
        }
        public String getExpired() {
            return this.expired;
        }

        public DescribeKVCacheInstancesResponseBodyItemsKVCacheItem setKVCacheInstanceId(String KVCacheInstanceId) {
            this.KVCacheInstanceId = KVCacheInstanceId;
            return this;
        }
        public String getKVCacheInstanceId() {
            return this.KVCacheInstanceId;
        }

        public DescribeKVCacheInstancesResponseBodyItemsKVCacheItem setKVCacheInstanceStatus(String KVCacheInstanceStatus) {
            this.KVCacheInstanceStatus = KVCacheInstanceStatus;
            return this;
        }
        public String getKVCacheInstanceStatus() {
            return this.KVCacheInstanceStatus;
        }

        public DescribeKVCacheInstancesResponseBodyItemsKVCacheItem setKVCacheSpace(Integer KVCacheSpace) {
            this.KVCacheSpace = KVCacheSpace;
            return this;
        }
        public Integer getKVCacheSpace() {
            return this.KVCacheSpace;
        }

        public DescribeKVCacheInstancesResponseBodyItemsKVCacheItem setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeKVCacheInstancesResponseBodyItemsKVCacheItem setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeKVCacheInstancesResponseBodyItemsKVCacheItem setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeKVCacheInstancesResponseBodyItemsKVCacheItem setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeKVCacheInstancesResponseBodyItemsKVCacheItem setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeKVCacheInstancesResponseBodyItems extends TeaModel {
        @NameInMap("KVCacheItem")
        public java.util.List<DescribeKVCacheInstancesResponseBodyItemsKVCacheItem> KVCacheItem;

        public static DescribeKVCacheInstancesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeKVCacheInstancesResponseBodyItems self = new DescribeKVCacheInstancesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeKVCacheInstancesResponseBodyItems setKVCacheItem(java.util.List<DescribeKVCacheInstancesResponseBodyItemsKVCacheItem> KVCacheItem) {
            this.KVCacheItem = KVCacheItem;
            return this;
        }
        public java.util.List<DescribeKVCacheInstancesResponseBodyItemsKVCacheItem> getKVCacheItem() {
            return this.KVCacheItem;
        }

    }

}
