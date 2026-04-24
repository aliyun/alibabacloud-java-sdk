// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetModelOperatorOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetModelOperatorOrderResponseBody body;

    public static GetModelOperatorOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelOperatorOrderResponse self = new GetModelOperatorOrderResponse();
        return TeaModel.build(map, self);
    }

    public GetModelOperatorOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelOperatorOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModelOperatorOrderResponse setBody(GetModelOperatorOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelOperatorOrderResponseBody getBody() {
        return this.body;
    }

}
