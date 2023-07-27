// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class InitiateMultipartUploadResponseBody extends TeaModel {
    /**
     * <p>The name of the bucket to which the object is uploaded by the multipart upload task.</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <p>The encoding type of the object name in the response. If the encoding-type parameter is specified in the request, the object name in the response is encoded.</p>
     */
    @NameInMap("EncodingType")
    public String encodingType;

    /**
     * <p>The name of the object that is uploaded by the multipart upload task.</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The Upload ID that uniquely identifies the multipart upload task. The Upload ID is used to call UploadPart and CompleteMultipartUpload later.</p>
     */
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
