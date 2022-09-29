// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListSubscribePbcsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSubscribePbcsResponseBody body;

    public static ListSubscribePbcsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubscribePbcsResponse self = new ListSubscribePbcsResponse();
        return TeaModel.build(map, self);
    }

    public ListSubscribePbcsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubscribePbcsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSubscribePbcsResponse setBody(ListSubscribePbcsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubscribePbcsResponseBody getBody() {
        return this.body;
    }

}
