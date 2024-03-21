// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListTrademarkApplicationLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTrademarkApplicationLogsResponseBody body;

    public static ListTrademarkApplicationLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrademarkApplicationLogsResponse self = new ListTrademarkApplicationLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListTrademarkApplicationLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrademarkApplicationLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTrademarkApplicationLogsResponse setBody(ListTrademarkApplicationLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrademarkApplicationLogsResponseBody getBody() {
        return this.body;
    }

}
