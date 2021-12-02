// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListPersistentVolumeResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListPersistentVolumeResponseBodyData> data;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListPersistentVolumeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPersistentVolumeResponseBody self = new ListPersistentVolumeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPersistentVolumeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListPersistentVolumeResponseBody setData(java.util.List<ListPersistentVolumeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPersistentVolumeResponseBodyData> getData() {
        return this.data;
    }

    public ListPersistentVolumeResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ListPersistentVolumeResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPersistentVolumeResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPersistentVolumeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPersistentVolumeResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListPersistentVolumeResponseBodyData extends TeaModel {
        @NameInMap("AccessModes")
        public String accessModes;

        @NameInMap("Capacity")
        public String capacity;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("MountDir")
        public String mountDir;

        @NameInMap("Name")
        public String name;

        @NameInMap("PvcName")
        public String pvcName;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("ReclaimPolicy")
        public String reclaimPolicy;

        @NameInMap("Status")
        public String status;

        @NameInMap("StorageClass")
        public String storageClass;

        public static ListPersistentVolumeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPersistentVolumeResponseBodyData self = new ListPersistentVolumeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPersistentVolumeResponseBodyData setAccessModes(String accessModes) {
            this.accessModes = accessModes;
            return this;
        }
        public String getAccessModes() {
            return this.accessModes;
        }

        public ListPersistentVolumeResponseBodyData setCapacity(String capacity) {
            this.capacity = capacity;
            return this;
        }
        public String getCapacity() {
            return this.capacity;
        }

        public ListPersistentVolumeResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPersistentVolumeResponseBodyData setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public ListPersistentVolumeResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPersistentVolumeResponseBodyData setPvcName(String pvcName) {
            this.pvcName = pvcName;
            return this;
        }
        public String getPvcName() {
            return this.pvcName;
        }

        public ListPersistentVolumeResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListPersistentVolumeResponseBodyData setReclaimPolicy(String reclaimPolicy) {
            this.reclaimPolicy = reclaimPolicy;
            return this;
        }
        public String getReclaimPolicy() {
            return this.reclaimPolicy;
        }

        public ListPersistentVolumeResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPersistentVolumeResponseBodyData setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

    }

}
