// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class CompleteMultipartUploadRequest extends TeaModel {
    @NameInMap("completeMultipartUpload")
    public CompleteMultipartUpload completeMultipartUpload;

    @NameInMap("encoding-type")
    public String encodingType;

    @NameInMap("uploadId")
    public String uploadId;

    public static CompleteMultipartUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        CompleteMultipartUploadRequest self = new CompleteMultipartUploadRequest();
        return TeaModel.build(map, self);
    }

    public CompleteMultipartUploadRequest setCompleteMultipartUpload(CompleteMultipartUpload completeMultipartUpload) {
        this.completeMultipartUpload = completeMultipartUpload;
        return this;
    }
    public CompleteMultipartUpload getCompleteMultipartUpload() {
        return this.completeMultipartUpload;
    }

    public CompleteMultipartUploadRequest setEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }
    public String getEncodingType() {
        return this.encodingType;
    }

    public CompleteMultipartUploadRequest setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

}
