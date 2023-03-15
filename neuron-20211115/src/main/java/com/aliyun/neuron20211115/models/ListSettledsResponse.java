// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListSettledsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SettledPageResult body;

    public static ListSettledsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSettledsResponse self = new ListSettledsResponse();
        return TeaModel.build(map, self);
    }

    public ListSettledsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSettledsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSettledsResponse setBody(SettledPageResult body) {
        this.body = body;
        return this;
    }
    public SettledPageResult getBody() {
        return this.body;
    }

}
