// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class GetTaskWorkforceStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTaskWorkforceStatisticResponseBody body;

    public static GetTaskWorkforceStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskWorkforceStatisticResponse self = new GetTaskWorkforceStatisticResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskWorkforceStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskWorkforceStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskWorkforceStatisticResponse setBody(GetTaskWorkforceStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskWorkforceStatisticResponseBody getBody() {
        return this.body;
    }

}
