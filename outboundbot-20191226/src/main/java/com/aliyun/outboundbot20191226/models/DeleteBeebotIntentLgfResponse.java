// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteBeebotIntentLgfResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBeebotIntentLgfResponseBody body;

    public static DeleteBeebotIntentLgfResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBeebotIntentLgfResponse self = new DeleteBeebotIntentLgfResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBeebotIntentLgfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBeebotIntentLgfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBeebotIntentLgfResponse setBody(DeleteBeebotIntentLgfResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBeebotIntentLgfResponseBody getBody() {
        return this.body;
    }

}
