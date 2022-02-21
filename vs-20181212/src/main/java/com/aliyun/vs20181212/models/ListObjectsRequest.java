// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListObjectsRequest extends TeaModel {
    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("ContinuationToken")
    public String continuationToken;

    @NameInMap("Delimiter")
    public String delimiter;

    @NameInMap("EncodingType")
    public String encodingType;

    @NameInMap("Marker")
    public String marker;

    @NameInMap("MaxKeys")
    public Integer maxKeys;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Prefix")
    public String prefix;

    @NameInMap("StartAfter")
    public String startAfter;

    public static ListObjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListObjectsRequest self = new ListObjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListObjectsRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public ListObjectsRequest setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }
    public String getContinuationToken() {
        return this.continuationToken;
    }

    public ListObjectsRequest setDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }
    public String getDelimiter() {
        return this.delimiter;
    }

    public ListObjectsRequest setEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }
    public String getEncodingType() {
        return this.encodingType;
    }

    public ListObjectsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListObjectsRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }
    public Integer getMaxKeys() {
        return this.maxKeys;
    }

    public ListObjectsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListObjectsRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListObjectsRequest setStartAfter(String startAfter) {
        this.startAfter = startAfter;
        return this;
    }
    public String getStartAfter() {
        return this.startAfter;
    }

}
