// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPdpLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPdpLogsResponseBody body;

    public static ListPdpLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPdpLogsResponse self = new ListPdpLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListPdpLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPdpLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPdpLogsResponse setBody(ListPdpLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPdpLogsResponseBody getBody() {
        return this.body;
    }

}
