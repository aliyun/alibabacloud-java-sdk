// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListObjectsResponseBody extends TeaModel {
    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("CommonPrefixes")
    public java.util.List<String> commonPrefixes;

    @NameInMap("Contents")
    public java.util.List<ListObjectsResponseBodyContents> contents;

    @NameInMap("ContinuationToken")
    public String continuationToken;

    @NameInMap("Delimiter")
    public String delimiter;

    @NameInMap("EncodingType")
    public String encodingType;

    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    @NameInMap("KeyCount")
    public Integer keyCount;

    @NameInMap("Marker")
    public String marker;

    @NameInMap("MaxKeys")
    public Integer maxKeys;

    @NameInMap("NextContinuationToken")
    public String nextContinuationToken;

    @NameInMap("NextMarker")
    public String nextMarker;

    @NameInMap("Prefix")
    public String prefix;

    @NameInMap("RequestId")
    public String requestId;

    public static ListObjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListObjectsResponseBody self = new ListObjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListObjectsResponseBody setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public ListObjectsResponseBody setCommonPrefixes(java.util.List<String> commonPrefixes) {
        this.commonPrefixes = commonPrefixes;
        return this;
    }
    public java.util.List<String> getCommonPrefixes() {
        return this.commonPrefixes;
    }

    public ListObjectsResponseBody setContents(java.util.List<ListObjectsResponseBodyContents> contents) {
        this.contents = contents;
        return this;
    }
    public java.util.List<ListObjectsResponseBodyContents> getContents() {
        return this.contents;
    }

    public ListObjectsResponseBody setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }
    public String getContinuationToken() {
        return this.continuationToken;
    }

    public ListObjectsResponseBody setDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }
    public String getDelimiter() {
        return this.delimiter;
    }

    public ListObjectsResponseBody setEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }
    public String getEncodingType() {
        return this.encodingType;
    }

    public ListObjectsResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListObjectsResponseBody setKeyCount(Integer keyCount) {
        this.keyCount = keyCount;
        return this;
    }
    public Integer getKeyCount() {
        return this.keyCount;
    }

    public ListObjectsResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListObjectsResponseBody setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }
    public Integer getMaxKeys() {
        return this.maxKeys;
    }

    public ListObjectsResponseBody setNextContinuationToken(String nextContinuationToken) {
        this.nextContinuationToken = nextContinuationToken;
        return this;
    }
    public String getNextContinuationToken() {
        return this.nextContinuationToken;
    }

    public ListObjectsResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public ListObjectsResponseBody setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListObjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListObjectsResponseBodyContents extends TeaModel {
        @NameInMap("ETag")
        public String ETag;

        @NameInMap("Key")
        public String key;

        @NameInMap("LastModified")
        public String lastModified;

        @NameInMap("Size")
        public Long size;

        @NameInMap("StorageClass")
        public String storageClass;

        public static ListObjectsResponseBodyContents build(java.util.Map<String, ?> map) throws Exception {
            ListObjectsResponseBodyContents self = new ListObjectsResponseBodyContents();
            return TeaModel.build(map, self);
        }

        public ListObjectsResponseBodyContents setETag(String ETag) {
            this.ETag = ETag;
            return this;
        }
        public String getETag() {
            return this.ETag;
        }

        public ListObjectsResponseBodyContents setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListObjectsResponseBodyContents setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public ListObjectsResponseBodyContents setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListObjectsResponseBodyContents setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

    }

}
