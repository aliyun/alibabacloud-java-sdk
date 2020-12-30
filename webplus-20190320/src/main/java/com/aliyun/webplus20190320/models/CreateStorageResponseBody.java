// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class CreateStorageResponseBody extends TeaModel {
    @NameInMap("Storage")
    public CreateStorageResponseBodyStorage storage;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static CreateStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageResponseBody self = new CreateStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStorageResponseBody setStorage(CreateStorageResponseBodyStorage storage) {
        this.storage = storage;
        return this;
    }
    public CreateStorageResponseBodyStorage getStorage() {
        return this.storage;
    }

    public CreateStorageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStorageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class CreateStorageResponseBodyStorage extends TeaModel {
        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("BucketName")
        public String bucketName;

        public static CreateStorageResponseBodyStorage build(java.util.Map<String, ?> map) throws Exception {
            CreateStorageResponseBodyStorage self = new CreateStorageResponseBodyStorage();
            return TeaModel.build(map, self);
        }

        public CreateStorageResponseBodyStorage setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public CreateStorageResponseBodyStorage setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateStorageResponseBodyStorage setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

    }

}
