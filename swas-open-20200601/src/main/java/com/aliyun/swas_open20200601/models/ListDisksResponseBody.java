// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListDisksResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Disks")
    public java.util.List<ListDisksResponseBodyDisks> disks;

    public static ListDisksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDisksResponseBody self = new ListDisksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDisksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListDisksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDisksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDisksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDisksResponseBody setDisks(java.util.List<ListDisksResponseBodyDisks> disks) {
        this.disks = disks;
        return this;
    }
    public java.util.List<ListDisksResponseBodyDisks> getDisks() {
        return this.disks;
    }

    public static class ListDisksResponseBodyDisks extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Device")
        public String device;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("DiskChargeType")
        public String diskChargeType;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("Category")
        public String category;

        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RegionId")
        public String regionId;

        public static ListDisksResponseBodyDisks build(java.util.Map<String, ?> map) throws Exception {
            ListDisksResponseBodyDisks self = new ListDisksResponseBodyDisks();
            return TeaModel.build(map, self);
        }

        public ListDisksResponseBodyDisks setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListDisksResponseBodyDisks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDisksResponseBodyDisks setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public ListDisksResponseBodyDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListDisksResponseBodyDisks setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public ListDisksResponseBodyDisks setDiskChargeType(String diskChargeType) {
            this.diskChargeType = diskChargeType;
            return this;
        }
        public String getDiskChargeType() {
            return this.diskChargeType;
        }

        public ListDisksResponseBodyDisks setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public ListDisksResponseBodyDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListDisksResponseBodyDisks setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public ListDisksResponseBodyDisks setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDisksResponseBodyDisks setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
