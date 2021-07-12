// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsStorageUsageDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StorageUsage")
    public DescribeVsStorageUsageDataResponseBodyStorageUsage storageUsage;

    public static DescribeVsStorageUsageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsStorageUsageDataResponseBody self = new DescribeVsStorageUsageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsStorageUsageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVsStorageUsageDataResponseBody setStorageUsage(DescribeVsStorageUsageDataResponseBodyStorageUsage storageUsage) {
        this.storageUsage = storageUsage;
        return this;
    }
    public DescribeVsStorageUsageDataResponseBodyStorageUsage getStorageUsage() {
        return this.storageUsage;
    }

    public static class DescribeVsStorageUsageDataResponseBodyStorageUsageStorageUsageDataModule extends TeaModel {
        @NameInMap("StorageDataValue")
        public Integer storageDataValue;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("Bucket")
        public String bucket;

        public static DescribeVsStorageUsageDataResponseBodyStorageUsageStorageUsageDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsStorageUsageDataResponseBodyStorageUsageStorageUsageDataModule self = new DescribeVsStorageUsageDataResponseBodyStorageUsageStorageUsageDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeVsStorageUsageDataResponseBodyStorageUsageStorageUsageDataModule setStorageDataValue(Integer storageDataValue) {
            this.storageDataValue = storageDataValue;
            return this;
        }
        public Integer getStorageDataValue() {
            return this.storageDataValue;
        }

        public DescribeVsStorageUsageDataResponseBodyStorageUsageStorageUsageDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeVsStorageUsageDataResponseBodyStorageUsageStorageUsageDataModule setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class DescribeVsStorageUsageDataResponseBodyStorageUsage extends TeaModel {
        @NameInMap("StorageUsageDataModule")
        public java.util.List<DescribeVsStorageUsageDataResponseBodyStorageUsageStorageUsageDataModule> storageUsageDataModule;

        public static DescribeVsStorageUsageDataResponseBodyStorageUsage build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsStorageUsageDataResponseBodyStorageUsage self = new DescribeVsStorageUsageDataResponseBodyStorageUsage();
            return TeaModel.build(map, self);
        }

        public DescribeVsStorageUsageDataResponseBodyStorageUsage setStorageUsageDataModule(java.util.List<DescribeVsStorageUsageDataResponseBodyStorageUsageStorageUsageDataModule> storageUsageDataModule) {
            this.storageUsageDataModule = storageUsageDataModule;
            return this;
        }
        public java.util.List<DescribeVsStorageUsageDataResponseBodyStorageUsageStorageUsageDataModule> getStorageUsageDataModule() {
            return this.storageUsageDataModule;
        }

    }

}
