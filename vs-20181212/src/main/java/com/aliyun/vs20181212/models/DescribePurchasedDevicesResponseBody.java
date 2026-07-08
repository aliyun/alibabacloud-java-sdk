// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribePurchasedDevicesResponseBody extends TeaModel {
    /**
     * <p>The list of devices.</p>
     */
    @NameInMap("Devices")
    public java.util.List<DescribePurchasedDevicesResponseBodyDevices> devices;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageCount")
    public Long pageCount;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of devices.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribePurchasedDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePurchasedDevicesResponseBody self = new DescribePurchasedDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePurchasedDevicesResponseBody setDevices(java.util.List<DescribePurchasedDevicesResponseBodyDevices> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.List<DescribePurchasedDevicesResponseBodyDevices> getDevices() {
        return this.devices;
    }

    public DescribePurchasedDevicesResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public DescribePurchasedDevicesResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribePurchasedDevicesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePurchasedDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePurchasedDevicesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePurchasedDevicesResponseBodyDevices extends TeaModel {
        /**
         * <p>The time the device was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-28T17:00:17Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The device description.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx路口摄像头</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the group to which the device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>348*****174-cn-qingdao</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>Group name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试空间</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The device ID.</p>
         * 
         * <strong>example:</strong>
         * <p>348*****380-cn-qingdao</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The device name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx路口摄像头</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2117*****0447</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <p>The region to which the space belongs. This is the service center.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The device registration code.</p>
         * 
         * <strong>example:</strong>
         * <p>1234*****67890</p>
         */
        @NameInMap("RegisterCode")
        public String registerCode;

        /**
         * <p>The device subtype. Valid values:</p>
         * <ul>
         * <li><p>bullet (bullet camera)</p>
         * </li>
         * <li><p>dome (dome camera)</p>
         * </li>
         * <li><p>ptz (PTZ camera)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dome</p>
         */
        @NameInMap("SubType")
        public String subType;

        /**
         * <p>The device type. Valid values:</p>
         * <ul>
         * <li><p>ipc (camera)</p>
         * </li>
         * <li><p>platform (platform)</p>
         * </li>
         * <li><p>ied (intelligent edge device)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipc</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The device vendor.</p>
         * 
         * <strong>example:</strong>
         * <p>公司A</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        public static DescribePurchasedDevicesResponseBodyDevices build(java.util.Map<String, ?> map) throws Exception {
            DescribePurchasedDevicesResponseBodyDevices self = new DescribePurchasedDevicesResponseBodyDevices();
            return TeaModel.build(map, self);
        }

        public DescribePurchasedDevicesResponseBodyDevices setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribePurchasedDevicesResponseBodyDevices setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePurchasedDevicesResponseBodyDevices setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribePurchasedDevicesResponseBodyDevices setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribePurchasedDevicesResponseBodyDevices setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribePurchasedDevicesResponseBodyDevices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePurchasedDevicesResponseBodyDevices setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public DescribePurchasedDevicesResponseBodyDevices setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribePurchasedDevicesResponseBodyDevices setRegisterCode(String registerCode) {
            this.registerCode = registerCode;
            return this;
        }
        public String getRegisterCode() {
            return this.registerCode;
        }

        public DescribePurchasedDevicesResponseBodyDevices setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public DescribePurchasedDevicesResponseBodyDevices setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribePurchasedDevicesResponseBodyDevices setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
