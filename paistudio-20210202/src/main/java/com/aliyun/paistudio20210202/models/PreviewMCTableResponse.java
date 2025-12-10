// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class PreviewMCTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreviewMCTableResponseBody body;

    public static PreviewMCTableResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewMCTableResponse self = new PreviewMCTableResponse();
        return TeaModel.build(map, self);
    }

    public PreviewMCTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreviewMCTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreviewMCTableResponse setBody(PreviewMCTableResponseBody body) {
        this.body = body;
        return this;
    }
    public PreviewMCTableResponseBody getBody() {
        return this.body;
    }

}
