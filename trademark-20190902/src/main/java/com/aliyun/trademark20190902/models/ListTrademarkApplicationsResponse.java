// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListTrademarkApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTrademarkApplicationsResponseBody body;

    public static ListTrademarkApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrademarkApplicationsResponse self = new ListTrademarkApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public ListTrademarkApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrademarkApplicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTrademarkApplicationsResponse setBody(ListTrademarkApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrademarkApplicationsResponseBody getBody() {
        return this.body;
    }

}
