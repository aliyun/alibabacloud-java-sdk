// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModelSampleDownloadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelSampleDownloadResponseBody body;

    public static ModelSampleDownloadResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelSampleDownloadResponse self = new ModelSampleDownloadResponse();
        return TeaModel.build(map, self);
    }

    public ModelSampleDownloadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelSampleDownloadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelSampleDownloadResponse setBody(ModelSampleDownloadResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelSampleDownloadResponseBody getBody() {
        return this.body;
    }

}
