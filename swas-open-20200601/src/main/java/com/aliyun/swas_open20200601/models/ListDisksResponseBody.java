// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListDisksResponseBody extends TeaModel {
    /**
     * <p>The region ID of the disks.</p>
     */
    @NameInMap("Disks")
    public java.util.List<ListDisksResponseBodyDisks> disks;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDisksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDisksResponseBody self = new ListDisksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDisksResponseBody setDisks(java.util.List<ListDisksResponseBodyDisks> disks) {
        this.disks = disks;
        return this;
    }
    public java.util.List<ListDisksResponseBodyDisks> getDisks() {
        return this.disks;
    }

    public ListDisksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDisksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDisksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDisksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDisksResponseBodyDisks extends TeaModel {
        /**
         * <p>The category of the disk. Valid values: Valid values:</p>
         * <br>
         * <p>*   ESSD: enhanced SSD (ESSD) at performance level 0 (PL0)</p>
         * <p>*   SSD: standard SSD</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The time when the disk was created. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The device name of the disk on the simple application server.</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The billing method of the disk.</p>
         */
        @NameInMap("DiskChargeType")
        public String diskChargeType;

        /**
         * <p>The ID of the disk.</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The name of the disk.</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>The type of the disk. Valid values:</p>
         * <br>
         * <p>*   System: system disk</p>
         * <p>*   Data: data disk</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The ID of the simple application server to which the disk is attached.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>轻量应用服务器名称。</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The region ID of the server.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>磁盘备注。</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The size of the disk. Unit: GB.</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The status of the disk. Valid values:</p>
         * <br>
         * <p>*   ReIniting: The disk is being initialized.</p>
         * <p>*   Creating: The disk is being created.</p>
         * <p>*   In_Use: The disk is being used.</p>
         * <p>*   Available: The disk can be attached.</p>
         * <p>*   Attaching: The disk is being attached.</p>
         * <p>*   Detaching: The disk is being detached.</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListDisksResponseBodyDisks build(java.util.Map<String, ?> map) throws Exception {
            ListDisksResponseBodyDisks self = new ListDisksResponseBodyDisks();
            return TeaModel.build(map, self);
        }

        public ListDisksResponseBodyDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListDisksResponseBodyDisks setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListDisksResponseBodyDisks setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public ListDisksResponseBodyDisks setDiskChargeType(String diskChargeType) {
            this.diskChargeType = diskChargeType;
            return this;
        }
        public String getDiskChargeType() {
            return this.diskChargeType;
        }

        public ListDisksResponseBodyDisks setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public ListDisksResponseBodyDisks setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public ListDisksResponseBodyDisks setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public ListDisksResponseBodyDisks setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDisksResponseBodyDisks setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListDisksResponseBodyDisks setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListDisksResponseBodyDisks setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListDisksResponseBodyDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListDisksResponseBodyDisks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
