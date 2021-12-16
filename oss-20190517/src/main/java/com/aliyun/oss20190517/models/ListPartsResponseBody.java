// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListPartsResponseBody extends TeaModel {
    @NameInMap("Bucket")
    public String bucket;

    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    @NameInMap("Key")
    public String key;

    @NameInMap("MaxParts")
    public Long maxParts;

    @NameInMap("NextPartNumberMarker")
    public Long nextPartNumberMarker;

    @NameInMap("Part")
    public java.util.List<Part> part;

    @NameInMap("PartNumberMarker")
    public Long partNumberMarker;

    @NameInMap("UploadId")
    public String uploadId;

    public static ListPartsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPartsResponseBody self = new ListPartsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPartsResponseBody setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public ListPartsResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListPartsResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ListPartsResponseBody setMaxParts(Long maxParts) {
        this.maxParts = maxParts;
        return this;
    }
    public Long getMaxParts() {
        return this.maxParts;
    }

    public ListPartsResponseBody setNextPartNumberMarker(Long nextPartNumberMarker) {
        this.nextPartNumberMarker = nextPartNumberMarker;
        return this;
    }
    public Long getNextPartNumberMarker() {
        return this.nextPartNumberMarker;
    }

    public ListPartsResponseBody setPart(java.util.List<Part> part) {
        this.part = part;
        return this;
    }
    public java.util.List<Part> getPart() {
        return this.part;
    }

    public ListPartsResponseBody setPartNumberMarker(Long partNumberMarker) {
        this.partNumberMarker = partNumberMarker;
        return this;
    }
    public Long getPartNumberMarker() {
        return this.partNumberMarker;
    }

    public ListPartsResponseBody setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

}
