// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class AbortMultipartUploadResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static AbortMultipartUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        AbortMultipartUploadResponse self = new AbortMultipartUploadResponse();
        return TeaModel.build(map, self);
    }

    public AbortMultipartUploadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
