// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeStorageBundleResponseBody extends TeaModel {
    @NameInMap("BackendBucketRegionId")
    public String backendBucketRegionId;

    @NameInMap("Code")
    public String code;

    @NameInMap("CreatedTime")
    public Long createdTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("Message")
    public String message;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StorageBundleId")
    public String storageBundleId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeStorageBundleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageBundleResponseBody self = new DescribeStorageBundleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStorageBundleResponseBody setBackendBucketRegionId(String backendBucketRegionId) {
        this.backendBucketRegionId = backendBucketRegionId;
        return this;
    }
    public String getBackendBucketRegionId() {
        return this.backendBucketRegionId;
    }

    public DescribeStorageBundleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeStorageBundleResponseBody setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public Long getCreatedTime() {
        return this.createdTime;
    }

    public DescribeStorageBundleResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeStorageBundleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeStorageBundleResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeStorageBundleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStorageBundleResponseBody setStorageBundleId(String storageBundleId) {
        this.storageBundleId = storageBundleId;
        return this;
    }
    public String getStorageBundleId() {
        return this.storageBundleId;
    }

    public DescribeStorageBundleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
