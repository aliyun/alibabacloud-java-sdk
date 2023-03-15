// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetHistoryDeveloperResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public Developer body;

    public static GetHistoryDeveloperResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHistoryDeveloperResponse self = new GetHistoryDeveloperResponse();
        return TeaModel.build(map, self);
    }

    public GetHistoryDeveloperResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHistoryDeveloperResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHistoryDeveloperResponse setBody(Developer body) {
        this.body = body;
        return this;
    }
    public Developer getBody() {
        return this.body;
    }

}
