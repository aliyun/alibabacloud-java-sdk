// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class CompleteMultipartUploadRequest extends TeaModel {
    @NameInMap("CompleteMultipartUpload")
    public CompleteMultipartUpload body;

    @NameInMap("encoding-type")
    public String encodingType;

    @NameInMap("uploadId")
    public String uploadId;

    public static CompleteMultipartUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        CompleteMultipartUploadRequest self = new CompleteMultipartUploadRequest();
        return TeaModel.build(map, self);
    }

    public CompleteMultipartUploadRequest setBody(CompleteMultipartUpload body) {
        this.body = body;
        return this;
    }
    public CompleteMultipartUpload getBody() {
        return this.body;
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
