// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UploadSampleFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadSampleFileResponseBody body;

    public static UploadSampleFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadSampleFileResponse self = new UploadSampleFileResponse();
        return TeaModel.build(map, self);
    }

    public UploadSampleFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadSampleFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadSampleFileResponse setBody(UploadSampleFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadSampleFileResponseBody getBody() {
        return this.body;
    }

}
