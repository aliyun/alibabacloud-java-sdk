// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class GetMqConsumerTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMqConsumerTagResponseBody body;

    public static GetMqConsumerTagResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMqConsumerTagResponse self = new GetMqConsumerTagResponse();
        return TeaModel.build(map, self);
    }

    public GetMqConsumerTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMqConsumerTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMqConsumerTagResponse setBody(GetMqConsumerTagResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMqConsumerTagResponseBody getBody() {
        return this.body;
    }

}
