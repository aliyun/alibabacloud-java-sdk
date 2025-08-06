// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetStorageListResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StorageList")
    public GetStorageListResponseBodyStorageList storageList;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetStorageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStorageListResponseBody self = new GetStorageListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStorageListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetStorageListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetStorageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStorageListResponseBody setStorageList(GetStorageListResponseBodyStorageList storageList) {
        this.storageList = storageList;
        return this;
    }
    public GetStorageListResponseBodyStorageList getStorageList() {
        return this.storageList;
    }

    public GetStorageListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetStorageListResponseBodyStorageListStorage extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("DefaultUpload")
        public Boolean defaultUpload;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Location")
        public String location;

        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("StorageUsage")
        public Integer storageUsage;

        @NameInMap("Type")
        public Integer type;

        public static GetStorageListResponseBodyStorageListStorage build(java.util.Map<String, ?> map) throws Exception {
            GetStorageListResponseBodyStorageListStorage self = new GetStorageListResponseBodyStorageListStorage();
            return TeaModel.build(map, self);
        }

        public GetStorageListResponseBodyStorageListStorage setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetStorageListResponseBodyStorageListStorage setDefaultUpload(Boolean defaultUpload) {
            this.defaultUpload = defaultUpload;
            return this;
        }
        public Boolean getDefaultUpload() {
            return this.defaultUpload;
        }

        public GetStorageListResponseBodyStorageListStorage setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetStorageListResponseBodyStorageListStorage setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetStorageListResponseBodyStorageListStorage setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetStorageListResponseBodyStorageListStorage setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetStorageListResponseBodyStorageListStorage setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetStorageListResponseBodyStorageListStorage setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetStorageListResponseBodyStorageListStorage setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetStorageListResponseBodyStorageListStorage setStorageUsage(Integer storageUsage) {
            this.storageUsage = storageUsage;
            return this;
        }
        public Integer getStorageUsage() {
            return this.storageUsage;
        }

        public GetStorageListResponseBodyStorageListStorage setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class GetStorageListResponseBodyStorageList extends TeaModel {
        @NameInMap("Storage")
        public java.util.List<GetStorageListResponseBodyStorageListStorage> storage;

        public static GetStorageListResponseBodyStorageList build(java.util.Map<String, ?> map) throws Exception {
            GetStorageListResponseBodyStorageList self = new GetStorageListResponseBodyStorageList();
            return TeaModel.build(map, self);
        }

        public GetStorageListResponseBodyStorageList setStorage(java.util.List<GetStorageListResponseBodyStorageListStorage> storage) {
            this.storage = storage;
            return this;
        }
        public java.util.List<GetStorageListResponseBodyStorageListStorage> getStorage() {
            return this.storage;
        }

    }

}
