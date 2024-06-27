// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class RemoveTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveTemplateResponseBody body;

    public static RemoveTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveTemplateResponse self = new RemoveTemplateResponse();
        return TeaModel.build(map, self);
    }

    public RemoveTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveTemplateResponse setBody(RemoveTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveTemplateResponseBody getBody() {
        return this.body;
    }

}
