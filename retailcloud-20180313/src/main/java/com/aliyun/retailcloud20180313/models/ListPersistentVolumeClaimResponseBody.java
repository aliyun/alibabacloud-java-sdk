// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListPersistentVolumeClaimResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListPersistentVolumeClaimResponseBodyData> data;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListPersistentVolumeClaimResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPersistentVolumeClaimResponseBody self = new ListPersistentVolumeClaimResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPersistentVolumeClaimResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListPersistentVolumeClaimResponseBody setData(java.util.List<ListPersistentVolumeClaimResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPersistentVolumeClaimResponseBodyData> getData() {
        return this.data;
    }

    public ListPersistentVolumeClaimResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListPersistentVolumeClaimResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPersistentVolumeClaimResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPersistentVolumeClaimResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPersistentVolumeClaimResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListPersistentVolumeClaimResponseBodyData extends TeaModel {
        @NameInMap("AccessModes")
        public String accessModes;

        @NameInMap("Capacity")
        public String capacity;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        @NameInMap("StorageClass")
        public String storageClass;

        @NameInMap("VolumeName")
        public String volumeName;

        public static ListPersistentVolumeClaimResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPersistentVolumeClaimResponseBodyData self = new ListPersistentVolumeClaimResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPersistentVolumeClaimResponseBodyData setAccessModes(String accessModes) {
            this.accessModes = accessModes;
            return this;
        }
        public String getAccessModes() {
            return this.accessModes;
        }

        public ListPersistentVolumeClaimResponseBodyData setCapacity(String capacity) {
            this.capacity = capacity;
            return this;
        }
        public String getCapacity() {
            return this.capacity;
        }

        public ListPersistentVolumeClaimResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPersistentVolumeClaimResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPersistentVolumeClaimResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPersistentVolumeClaimResponseBodyData setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public ListPersistentVolumeClaimResponseBodyData setVolumeName(String volumeName) {
            this.volumeName = volumeName;
            return this;
        }
        public String getVolumeName() {
            return this.volumeName;
        }

    }

}
