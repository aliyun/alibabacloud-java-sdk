// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAITemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAITemplateResponseBody body;

    public static ListAITemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAITemplateResponse self = new ListAITemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListAITemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAITemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAITemplateResponse setBody(ListAITemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAITemplateResponseBody getBody() {
        return this.body;
    }

}
