// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListCustomScriptTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomScriptTemplatesResponseBody body;

    public static ListCustomScriptTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomScriptTemplatesResponse self = new ListCustomScriptTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomScriptTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomScriptTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomScriptTemplatesResponse setBody(ListCustomScriptTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomScriptTemplatesResponseBody getBody() {
        return this.body;
    }

}
