// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class CancelYydTaskByBcIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelYydTaskByBcIdResponseBody body;

    public static CancelYydTaskByBcIdResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelYydTaskByBcIdResponse self = new CancelYydTaskByBcIdResponse();
        return TeaModel.build(map, self);
    }

    public CancelYydTaskByBcIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelYydTaskByBcIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelYydTaskByBcIdResponse setBody(CancelYydTaskByBcIdResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelYydTaskByBcIdResponseBody getBody() {
        return this.body;
    }

}
