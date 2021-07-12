// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class GetBucketInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BucketInfo")
    public GetBucketInfoResponseBodyBucketInfo bucketInfo;

    public static GetBucketInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketInfoResponseBody self = new GetBucketInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBucketInfoResponseBody setBucketInfo(GetBucketInfoResponseBodyBucketInfo bucketInfo) {
        this.bucketInfo = bucketInfo;
        return this;
    }
    public GetBucketInfoResponseBodyBucketInfo getBucketInfo() {
        return this.bucketInfo;
    }

    public static class GetBucketInfoResponseBodyBucketInfo extends TeaModel {
        @NameInMap("StorageClass")
        public String storageClass;

        @NameInMap("DataRedundancyType")
        public String dataRedundancyType;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("DispatcherType")
        public String dispatcherType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("BucketAcl")
        public String bucketAcl;

        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("ModifyTime")
        public String modifyTime;

        public static GetBucketInfoResponseBodyBucketInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBucketInfoResponseBodyBucketInfo self = new GetBucketInfoResponseBodyBucketInfo();
            return TeaModel.build(map, self);
        }

        public GetBucketInfoResponseBodyBucketInfo setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public GetBucketInfoResponseBodyBucketInfo setDataRedundancyType(String dataRedundancyType) {
            this.dataRedundancyType = dataRedundancyType;
            return this;
        }
        public String getDataRedundancyType() {
            return this.dataRedundancyType;
        }

        public GetBucketInfoResponseBodyBucketInfo setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetBucketInfoResponseBodyBucketInfo setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetBucketInfoResponseBodyBucketInfo setDispatcherType(String dispatcherType) {
            this.dispatcherType = dispatcherType;
            return this;
        }
        public String getDispatcherType() {
            return this.dispatcherType;
        }

        public GetBucketInfoResponseBodyBucketInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetBucketInfoResponseBodyBucketInfo setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetBucketInfoResponseBodyBucketInfo setBucketAcl(String bucketAcl) {
            this.bucketAcl = bucketAcl;
            return this;
        }
        public String getBucketAcl() {
            return this.bucketAcl;
        }

        public GetBucketInfoResponseBodyBucketInfo setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetBucketInfoResponseBodyBucketInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
