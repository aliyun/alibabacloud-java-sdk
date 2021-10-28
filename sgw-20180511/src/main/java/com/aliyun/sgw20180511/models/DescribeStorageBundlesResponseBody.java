// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeStorageBundlesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StorageBundles")
    public DescribeStorageBundlesResponseBodyStorageBundles storageBundles;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeStorageBundlesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageBundlesResponseBody self = new DescribeStorageBundlesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStorageBundlesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeStorageBundlesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeStorageBundlesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStorageBundlesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStorageBundlesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStorageBundlesResponseBody setStorageBundles(DescribeStorageBundlesResponseBodyStorageBundles storageBundles) {
        this.storageBundles = storageBundles;
        return this;
    }
    public DescribeStorageBundlesResponseBodyStorageBundles getStorageBundles() {
        return this.storageBundles;
    }

    public DescribeStorageBundlesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeStorageBundlesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeStorageBundlesResponseBodyStorageBundlesStorageBundle extends TeaModel {
        @NameInMap("BackendBucketRegionId")
        public String backendBucketRegionId;

        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("StorageBundleId")
        public String storageBundleId;

        public static DescribeStorageBundlesResponseBodyStorageBundlesStorageBundle build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageBundlesResponseBodyStorageBundlesStorageBundle self = new DescribeStorageBundlesResponseBodyStorageBundlesStorageBundle();
            return TeaModel.build(map, self);
        }

        public DescribeStorageBundlesResponseBodyStorageBundlesStorageBundle setBackendBucketRegionId(String backendBucketRegionId) {
            this.backendBucketRegionId = backendBucketRegionId;
            return this;
        }
        public String getBackendBucketRegionId() {
            return this.backendBucketRegionId;
        }

        public DescribeStorageBundlesResponseBodyStorageBundlesStorageBundle setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeStorageBundlesResponseBodyStorageBundlesStorageBundle setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeStorageBundlesResponseBodyStorageBundlesStorageBundle setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeStorageBundlesResponseBodyStorageBundlesStorageBundle setStorageBundleId(String storageBundleId) {
            this.storageBundleId = storageBundleId;
            return this;
        }
        public String getStorageBundleId() {
            return this.storageBundleId;
        }

    }

    public static class DescribeStorageBundlesResponseBodyStorageBundles extends TeaModel {
        @NameInMap("StorageBundle")
        public java.util.List<DescribeStorageBundlesResponseBodyStorageBundlesStorageBundle> storageBundle;

        public static DescribeStorageBundlesResponseBodyStorageBundles build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageBundlesResponseBodyStorageBundles self = new DescribeStorageBundlesResponseBodyStorageBundles();
            return TeaModel.build(map, self);
        }

        public DescribeStorageBundlesResponseBodyStorageBundles setStorageBundle(java.util.List<DescribeStorageBundlesResponseBodyStorageBundlesStorageBundle> storageBundle) {
            this.storageBundle = storageBundle;
            return this;
        }
        public java.util.List<DescribeStorageBundlesResponseBodyStorageBundlesStorageBundle> getStorageBundle() {
            return this.storageBundle;
        }

    }

}
