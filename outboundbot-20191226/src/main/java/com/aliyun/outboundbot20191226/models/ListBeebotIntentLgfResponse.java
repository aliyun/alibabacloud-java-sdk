// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListBeebotIntentLgfResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBeebotIntentLgfResponseBody body;

    public static ListBeebotIntentLgfResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBeebotIntentLgfResponse self = new ListBeebotIntentLgfResponse();
        return TeaModel.build(map, self);
    }

    public ListBeebotIntentLgfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBeebotIntentLgfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBeebotIntentLgfResponse setBody(ListBeebotIntentLgfResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBeebotIntentLgfResponseBody getBody() {
        return this.body;
    }

}
