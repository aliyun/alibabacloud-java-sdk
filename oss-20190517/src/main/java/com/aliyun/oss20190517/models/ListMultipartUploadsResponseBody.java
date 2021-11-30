// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListMultipartUploadsResponseBody extends TeaModel {
    @NameInMap("Bucket")
    public String bucket;

    @NameInMap("EncodingType")
    public String encodingType;

    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    @NameInMap("KeyMarker")
    public String keyMarker;

    @NameInMap("MaxUploads")
    public Long maxUploads;

    @NameInMap("NextKeyMarker")
    public String nextKeyMarker;

    @NameInMap("NextUploadMarker")
    public String nextUploadMarker;

    @NameInMap("Upload")
    public java.util.List<Upload> upload;

    @NameInMap("UploadIdMarker")
    public String uploadIdMarker;

    public static ListMultipartUploadsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMultipartUploadsResponseBody self = new ListMultipartUploadsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMultipartUploadsResponseBody setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public ListMultipartUploadsResponseBody setEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }
    public String getEncodingType() {
        return this.encodingType;
    }

    public ListMultipartUploadsResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListMultipartUploadsResponseBody setKeyMarker(String keyMarker) {
        this.keyMarker = keyMarker;
        return this;
    }
    public String getKeyMarker() {
        return this.keyMarker;
    }

    public ListMultipartUploadsResponseBody setMaxUploads(Long maxUploads) {
        this.maxUploads = maxUploads;
        return this;
    }
    public Long getMaxUploads() {
        return this.maxUploads;
    }

    public ListMultipartUploadsResponseBody setNextKeyMarker(String nextKeyMarker) {
        this.nextKeyMarker = nextKeyMarker;
        return this;
    }
    public String getNextKeyMarker() {
        return this.nextKeyMarker;
    }

    public ListMultipartUploadsResponseBody setNextUploadMarker(String nextUploadMarker) {
        this.nextUploadMarker = nextUploadMarker;
        return this;
    }
    public String getNextUploadMarker() {
        return this.nextUploadMarker;
    }

    public ListMultipartUploadsResponseBody setUpload(java.util.List<Upload> upload) {
        this.upload = upload;
        return this;
    }
    public java.util.List<Upload> getUpload() {
        return this.upload;
    }

    public ListMultipartUploadsResponseBody setUploadIdMarker(String uploadIdMarker) {
        this.uploadIdMarker = uploadIdMarker;
        return this;
    }
    public String getUploadIdMarker() {
        return this.uploadIdMarker;
    }

}
