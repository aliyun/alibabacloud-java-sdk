// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ListPolarClawDevicePairsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPolarClawDevicePairsResponseBody body;

    public static ListPolarClawDevicePairsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPolarClawDevicePairsResponse self = new ListPolarClawDevicePairsResponse();
        return TeaModel.build(map, self);
    }

    public ListPolarClawDevicePairsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPolarClawDevicePairsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPolarClawDevicePairsResponse setBody(ListPolarClawDevicePairsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPolarClawDevicePairsResponseBody getBody() {
        return this.body;
    }

}
