// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListBucketsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BucketInfos")
    public java.util.List<ListBucketsResponseBodyBucketInfos> bucketInfos;

    public static ListBucketsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBucketsResponseBody self = new ListBucketsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBucketsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListBucketsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBucketsResponseBody setBucketInfos(java.util.List<ListBucketsResponseBodyBucketInfos> bucketInfos) {
        this.bucketInfos = bucketInfos;
        return this;
    }
    public java.util.List<ListBucketsResponseBodyBucketInfos> getBucketInfos() {
        return this.bucketInfos;
    }

    public static class ListBucketsResponseBodyBucketInfos extends TeaModel {
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

        public static ListBucketsResponseBodyBucketInfos build(java.util.Map<String, ?> map) throws Exception {
            ListBucketsResponseBodyBucketInfos self = new ListBucketsResponseBodyBucketInfos();
            return TeaModel.build(map, self);
        }

        public ListBucketsResponseBodyBucketInfos setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public ListBucketsResponseBodyBucketInfos setDataRedundancyType(String dataRedundancyType) {
            this.dataRedundancyType = dataRedundancyType;
            return this;
        }
        public String getDataRedundancyType() {
            return this.dataRedundancyType;
        }

        public ListBucketsResponseBodyBucketInfos setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListBucketsResponseBodyBucketInfos setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListBucketsResponseBodyBucketInfos setDispatcherType(String dispatcherType) {
            this.dispatcherType = dispatcherType;
            return this;
        }
        public String getDispatcherType() {
            return this.dispatcherType;
        }

        public ListBucketsResponseBodyBucketInfos setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListBucketsResponseBodyBucketInfos setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListBucketsResponseBodyBucketInfos setBucketAcl(String bucketAcl) {
            this.bucketAcl = bucketAcl;
            return this;
        }
        public String getBucketAcl() {
            return this.bucketAcl;
        }

        public ListBucketsResponseBodyBucketInfos setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public ListBucketsResponseBodyBucketInfos setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
