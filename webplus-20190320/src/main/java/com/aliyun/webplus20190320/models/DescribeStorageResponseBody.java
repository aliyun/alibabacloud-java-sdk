// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeStorageResponseBody extends TeaModel {
    @NameInMap("Storage")
    public DescribeStorageResponseBodyStorage storage;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static DescribeStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageResponseBody self = new DescribeStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStorageResponseBody setStorage(DescribeStorageResponseBodyStorage storage) {
        this.storage = storage;
        return this;
    }
    public DescribeStorageResponseBodyStorage getStorage() {
        return this.storage;
    }

    public DescribeStorageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStorageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DescribeStorageResponseBodyStorage extends TeaModel {
        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("KeyPrefix")
        public String keyPrefix;

        @NameInMap("PkgKeyPrefix")
        public String pkgKeyPrefix;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("BucketName")
        public String bucketName;

        public static DescribeStorageResponseBodyStorage build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageResponseBodyStorage self = new DescribeStorageResponseBodyStorage();
            return TeaModel.build(map, self);
        }

        public DescribeStorageResponseBodyStorage setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribeStorageResponseBodyStorage setKeyPrefix(String keyPrefix) {
            this.keyPrefix = keyPrefix;
            return this;
        }
        public String getKeyPrefix() {
            return this.keyPrefix;
        }

        public DescribeStorageResponseBodyStorage setPkgKeyPrefix(String pkgKeyPrefix) {
            this.pkgKeyPrefix = pkgKeyPrefix;
            return this;
        }
        public String getPkgKeyPrefix() {
            return this.pkgKeyPrefix;
        }

        public DescribeStorageResponseBodyStorage setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeStorageResponseBodyStorage setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

    }

}
