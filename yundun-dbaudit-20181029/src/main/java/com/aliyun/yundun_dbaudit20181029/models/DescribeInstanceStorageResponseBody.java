// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20181029.models;

import com.aliyun.tea.*;

public class DescribeInstanceStorageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceStorages")
    public java.util.List<DescribeInstanceStorageResponseBodyInstanceStorages> instanceStorages;

    public static DescribeInstanceStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStorageResponseBody self = new DescribeInstanceStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceStorageResponseBody setInstanceStorages(java.util.List<DescribeInstanceStorageResponseBodyInstanceStorages> instanceStorages) {
        this.instanceStorages = instanceStorages;
        return this;
    }
    public java.util.List<DescribeInstanceStorageResponseBodyInstanceStorages> getInstanceStorages() {
        return this.instanceStorages;
    }

    public static class DescribeInstanceStorageResponseBodyInstanceStorages extends TeaModel {
        @NameInMap("StorageTime")
        public Long storageTime;

        @NameInMap("StorageCapacity")
        public Long storageCapacity;

        @NameInMap("StorageCategory")
        public String storageCategory;

        @NameInMap("StorageSpace")
        public String storageSpace;

        @NameInMap("StorageUsed")
        public Long storageUsed;

        public static DescribeInstanceStorageResponseBodyInstanceStorages build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceStorageResponseBodyInstanceStorages self = new DescribeInstanceStorageResponseBodyInstanceStorages();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceStorageResponseBodyInstanceStorages setStorageTime(Long storageTime) {
            this.storageTime = storageTime;
            return this;
        }
        public Long getStorageTime() {
            return this.storageTime;
        }

        public DescribeInstanceStorageResponseBodyInstanceStorages setStorageCapacity(Long storageCapacity) {
            this.storageCapacity = storageCapacity;
            return this;
        }
        public Long getStorageCapacity() {
            return this.storageCapacity;
        }

        public DescribeInstanceStorageResponseBodyInstanceStorages setStorageCategory(String storageCategory) {
            this.storageCategory = storageCategory;
            return this;
        }
        public String getStorageCategory() {
            return this.storageCategory;
        }

        public DescribeInstanceStorageResponseBodyInstanceStorages setStorageSpace(String storageSpace) {
            this.storageSpace = storageSpace;
            return this;
        }
        public String getStorageSpace() {
            return this.storageSpace;
        }

        public DescribeInstanceStorageResponseBodyInstanceStorages setStorageUsed(Long storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }
        public Long getStorageUsed() {
            return this.storageUsed;
        }

    }

}
