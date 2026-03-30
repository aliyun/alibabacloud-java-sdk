// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListScriptProfileTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListScriptProfileTemplatesResponseBody body;

    public static ListScriptProfileTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScriptProfileTemplatesResponse self = new ListScriptProfileTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListScriptProfileTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScriptProfileTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListScriptProfileTemplatesResponse setBody(ListScriptProfileTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScriptProfileTemplatesResponseBody getBody() {
        return this.body;
    }

}
