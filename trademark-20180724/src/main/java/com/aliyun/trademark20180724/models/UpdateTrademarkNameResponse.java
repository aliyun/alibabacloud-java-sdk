// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UpdateTrademarkNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTrademarkNameResponseBody body;

    public static UpdateTrademarkNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrademarkNameResponse self = new UpdateTrademarkNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTrademarkNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTrademarkNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTrademarkNameResponse setBody(UpdateTrademarkNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTrademarkNameResponseBody getBody() {
        return this.body;
    }

}
