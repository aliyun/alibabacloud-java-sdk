// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DeleteCustomImagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomImagesResponseBody body;

    public static DeleteCustomImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomImagesResponse self = new DeleteCustomImagesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomImagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomImagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomImagesResponse setBody(DeleteCustomImagesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomImagesResponseBody getBody() {
        return this.body;
    }

}
