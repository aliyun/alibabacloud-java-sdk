// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeOssBucketInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IsArchive")
    public Boolean isArchive;

    @NameInMap("IsBackToResource")
    public Boolean isBackToResource;

    @NameInMap("IsColdArchive")
    public Boolean isColdArchive;

    @NameInMap("IsFresh")
    public Boolean isFresh;

    @NameInMap("IsSupportServerSideEncryption")
    public Boolean isSupportServerSideEncryption;

    @NameInMap("IsVersioning")
    public Boolean isVersioning;

    @NameInMap("Message")
    public String message;

    @NameInMap("PollingInterval")
    public Integer pollingInterval;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StorageSize")
    public Long storageSize;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeOssBucketInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssBucketInfoResponseBody self = new DescribeOssBucketInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssBucketInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeOssBucketInfoResponseBody setIsArchive(Boolean isArchive) {
        this.isArchive = isArchive;
        return this;
    }
    public Boolean getIsArchive() {
        return this.isArchive;
    }

    public DescribeOssBucketInfoResponseBody setIsBackToResource(Boolean isBackToResource) {
        this.isBackToResource = isBackToResource;
        return this;
    }
    public Boolean getIsBackToResource() {
        return this.isBackToResource;
    }

    public DescribeOssBucketInfoResponseBody setIsColdArchive(Boolean isColdArchive) {
        this.isColdArchive = isColdArchive;
        return this;
    }
    public Boolean getIsColdArchive() {
        return this.isColdArchive;
    }

    public DescribeOssBucketInfoResponseBody setIsFresh(Boolean isFresh) {
        this.isFresh = isFresh;
        return this;
    }
    public Boolean getIsFresh() {
        return this.isFresh;
    }

    public DescribeOssBucketInfoResponseBody setIsSupportServerSideEncryption(Boolean isSupportServerSideEncryption) {
        this.isSupportServerSideEncryption = isSupportServerSideEncryption;
        return this;
    }
    public Boolean getIsSupportServerSideEncryption() {
        return this.isSupportServerSideEncryption;
    }

    public DescribeOssBucketInfoResponseBody setIsVersioning(Boolean isVersioning) {
        this.isVersioning = isVersioning;
        return this;
    }
    public Boolean getIsVersioning() {
        return this.isVersioning;
    }

    public DescribeOssBucketInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeOssBucketInfoResponseBody setPollingInterval(Integer pollingInterval) {
        this.pollingInterval = pollingInterval;
        return this;
    }
    public Integer getPollingInterval() {
        return this.pollingInterval;
    }

    public DescribeOssBucketInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssBucketInfoResponseBody setStorageSize(Long storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public Long getStorageSize() {
        return this.storageSize;
    }

    public DescribeOssBucketInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
