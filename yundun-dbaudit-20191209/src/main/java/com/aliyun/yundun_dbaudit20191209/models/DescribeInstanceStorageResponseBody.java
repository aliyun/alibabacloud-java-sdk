// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20191209.models;

import com.aliyun.tea.*;

public class DescribeInstanceStorageResponseBody extends TeaModel {
    @NameInMap("InstanceStorages")
    public java.util.List<DescribeInstanceStorageResponseBodyInstanceStorages> instanceStorages;

    /**
     * <strong>example:</strong>
     * <p>4226E2BB-EED8-4067-B31B-7F02966765B2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStorageResponseBody self = new DescribeInstanceStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStorageResponseBody setInstanceStorages(java.util.List<DescribeInstanceStorageResponseBodyInstanceStorages> instanceStorages) {
        this.instanceStorages = instanceStorages;
        return this;
    }
    public java.util.List<DescribeInstanceStorageResponseBodyInstanceStorages> getInstanceStorages() {
        return this.instanceStorages;
    }

    public DescribeInstanceStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceStorageResponseBodyInstanceStorages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>6047313952768</p>
         */
        @NameInMap("StorageCapacity")
        public Long storageCapacity;

        /**
         * <strong>example:</strong>
         * <p>dbaudit-audit-dbaudit-cn-78v1gc****</p>
         */
        @NameInMap("StorageCategory")
        public String storageCategory;

        /**
         * <strong>example:</strong>
         * <p>dbaudit-cn-78v1gc****</p>
         */
        @NameInMap("StorageSpace")
        public String storageSpace;

        /**
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("StorageTime")
        public Long storageTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StorageUsed")
        public Long storageUsed;

        public static DescribeInstanceStorageResponseBodyInstanceStorages build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceStorageResponseBodyInstanceStorages self = new DescribeInstanceStorageResponseBodyInstanceStorages();
            return TeaModel.build(map, self);
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

        public DescribeInstanceStorageResponseBodyInstanceStorages setStorageTime(Long storageTime) {
            this.storageTime = storageTime;
            return this;
        }
        public Long getStorageTime() {
            return this.storageTime;
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
