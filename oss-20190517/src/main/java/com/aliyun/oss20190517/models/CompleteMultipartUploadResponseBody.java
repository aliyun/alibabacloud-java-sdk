// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class CompleteMultipartUploadResponseBody extends TeaModel {
    @NameInMap("Bucket")
    public String bucket;

    @NameInMap("ETag")
    public String ETag;

    @NameInMap("EncodingType")
    public String encodingType;

    @NameInMap("Key")
    public String key;

    @NameInMap("Location")
    public String location;

    public static CompleteMultipartUploadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompleteMultipartUploadResponseBody self = new CompleteMultipartUploadResponseBody();
        return TeaModel.build(map, self);
    }

    public CompleteMultipartUploadResponseBody setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public CompleteMultipartUploadResponseBody setETag(String ETag) {
        this.ETag = ETag;
        return this;
    }
    public String getETag() {
        return this.ETag;
    }

    public CompleteMultipartUploadResponseBody setEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }
    public String getEncodingType() {
        return this.encodingType;
    }

    public CompleteMultipartUploadResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public CompleteMultipartUploadResponseBody setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

}
