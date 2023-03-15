// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPdpHistoryConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PdpHistoryConfigPageResult body;

    public static ListPdpHistoryConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPdpHistoryConfigsResponse self = new ListPdpHistoryConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListPdpHistoryConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPdpHistoryConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPdpHistoryConfigsResponse setBody(PdpHistoryConfigPageResult body) {
        this.body = body;
        return this;
    }
    public PdpHistoryConfigPageResult getBody() {
        return this.body;
    }

}
