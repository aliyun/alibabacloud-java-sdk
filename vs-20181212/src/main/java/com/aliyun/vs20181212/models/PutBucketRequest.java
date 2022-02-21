// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class PutBucketRequest extends TeaModel {
    @NameInMap("BucketAcl")
    public String bucketAcl;

    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("DataRedundancyType")
    public String dataRedundancyType;

    @NameInMap("DispatcherType")
    public String dispatcherType;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("StorageClass")
    public String storageClass;

    public static PutBucketRequest build(java.util.Map<String, ?> map) throws Exception {
        PutBucketRequest self = new PutBucketRequest();
        return TeaModel.build(map, self);
    }

    public PutBucketRequest setBucketAcl(String bucketAcl) {
        this.bucketAcl = bucketAcl;
        return this;
    }
    public String getBucketAcl() {
        return this.bucketAcl;
    }

    public PutBucketRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public PutBucketRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public PutBucketRequest setDataRedundancyType(String dataRedundancyType) {
        this.dataRedundancyType = dataRedundancyType;
        return this;
    }
    public String getDataRedundancyType() {
        return this.dataRedundancyType;
    }

    public PutBucketRequest setDispatcherType(String dispatcherType) {
        this.dispatcherType = dispatcherType;
        return this;
    }
    public String getDispatcherType() {
        return this.dispatcherType;
    }

    public PutBucketRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public PutBucketRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public PutBucketRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public PutBucketRequest setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

}
