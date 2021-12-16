// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class UploadPartRequest extends TeaModel {
    @NameInMap("body")
    public java.io.InputStream body;

    @NameInMap("partNumber")
    public Long partNumber;

    @NameInMap("uploadId")
    public String uploadId;

    public static UploadPartRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadPartRequest self = new UploadPartRequest();
        return TeaModel.build(map, self);
    }

    public UploadPartRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

    public UploadPartRequest setPartNumber(Long partNumber) {
        this.partNumber = partNumber;
        return this;
    }
    public Long getPartNumber() {
        return this.partNumber;
    }

    public UploadPartRequest setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

}
