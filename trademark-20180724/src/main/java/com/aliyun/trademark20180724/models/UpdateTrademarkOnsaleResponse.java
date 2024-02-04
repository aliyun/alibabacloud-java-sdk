// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UpdateTrademarkOnsaleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTrademarkOnsaleResponseBody body;

    public static UpdateTrademarkOnsaleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrademarkOnsaleResponse self = new UpdateTrademarkOnsaleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTrademarkOnsaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTrademarkOnsaleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTrademarkOnsaleResponse setBody(UpdateTrademarkOnsaleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTrademarkOnsaleResponseBody getBody() {
        return this.body;
    }

}
