// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UploadSampleApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadSampleApiResponseBody body;

    public static UploadSampleApiResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadSampleApiResponse self = new UploadSampleApiResponse();
        return TeaModel.build(map, self);
    }

    public UploadSampleApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadSampleApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadSampleApiResponse setBody(UploadSampleApiResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadSampleApiResponseBody getBody() {
        return this.body;
    }

}
