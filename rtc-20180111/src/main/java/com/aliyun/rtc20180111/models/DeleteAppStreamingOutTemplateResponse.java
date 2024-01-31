// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteAppStreamingOutTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAppStreamingOutTemplateResponseBody body;

    public static DeleteAppStreamingOutTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppStreamingOutTemplateResponse self = new DeleteAppStreamingOutTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppStreamingOutTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppStreamingOutTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppStreamingOutTemplateResponse setBody(DeleteAppStreamingOutTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppStreamingOutTemplateResponseBody getBody() {
        return this.body;
    }

}
