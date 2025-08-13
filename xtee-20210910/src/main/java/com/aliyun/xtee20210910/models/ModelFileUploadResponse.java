// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModelFileUploadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelFileUploadResponseBody body;

    public static ModelFileUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelFileUploadResponse self = new ModelFileUploadResponse();
        return TeaModel.build(map, self);
    }

    public ModelFileUploadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelFileUploadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelFileUploadResponse setBody(ModelFileUploadResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelFileUploadResponseBody getBody() {
        return this.body;
    }

}
