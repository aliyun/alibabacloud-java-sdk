// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class DeleteTrademarkApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTrademarkApplicationResponseBody body;

    public static DeleteTrademarkApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrademarkApplicationResponse self = new DeleteTrademarkApplicationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTrademarkApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTrademarkApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTrademarkApplicationResponse setBody(DeleteTrademarkApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTrademarkApplicationResponseBody getBody() {
        return this.body;
    }

}
