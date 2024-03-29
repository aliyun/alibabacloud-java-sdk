// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class CancelByMsgIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelByMsgIdResponseBody body;

    public static CancelByMsgIdResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelByMsgIdResponse self = new CancelByMsgIdResponse();
        return TeaModel.build(map, self);
    }

    public CancelByMsgIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelByMsgIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelByMsgIdResponse setBody(CancelByMsgIdResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelByMsgIdResponseBody getBody() {
        return this.body;
    }

}
