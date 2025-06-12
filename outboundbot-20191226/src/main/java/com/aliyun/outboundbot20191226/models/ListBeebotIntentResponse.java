// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListBeebotIntentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBeebotIntentResponseBody body;

    public static ListBeebotIntentResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBeebotIntentResponse self = new ListBeebotIntentResponse();
        return TeaModel.build(map, self);
    }

    public ListBeebotIntentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBeebotIntentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBeebotIntentResponse setBody(ListBeebotIntentResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBeebotIntentResponseBody getBody() {
        return this.body;
    }

}
