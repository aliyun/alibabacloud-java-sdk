// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListBeebotIntentUserSayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBeebotIntentUserSayResponseBody body;

    public static ListBeebotIntentUserSayResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBeebotIntentUserSayResponse self = new ListBeebotIntentUserSayResponse();
        return TeaModel.build(map, self);
    }

    public ListBeebotIntentUserSayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBeebotIntentUserSayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBeebotIntentUserSayResponse setBody(ListBeebotIntentUserSayResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBeebotIntentUserSayResponseBody getBody() {
        return this.body;
    }

}
