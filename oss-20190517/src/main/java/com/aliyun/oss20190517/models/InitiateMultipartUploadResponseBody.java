// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class InitiateMultipartUploadResponseBody extends TeaModel {
    @NameInMap("Bucket")
    public String bucket;

    @NameInMap("EncodingType")
    public String encodingType;

    @NameInMap("Key")
    public String key;

    @NameInMap("UploadId")
    public String uploadId;

    public static InitiateMultipartUploadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitiateMultipartUploadResponseBody self = new InitiateMultipartUploadResponseBody();
        return TeaModel.build(map, self);
    }

    public InitiateMultipartUploadResponseBody setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public InitiateMultipartUploadResponseBody setEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }
    public String getEncodingType() {
        return this.encodingType;
    }

    public InitiateMultipartUploadResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public InitiateMultipartUploadResponseBody setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

}
