// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListAdminTrademarkApplicationLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAdminTrademarkApplicationLogsResponseBody body;

    public static ListAdminTrademarkApplicationLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAdminTrademarkApplicationLogsResponse self = new ListAdminTrademarkApplicationLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListAdminTrademarkApplicationLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAdminTrademarkApplicationLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAdminTrademarkApplicationLogsResponse setBody(ListAdminTrademarkApplicationLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAdminTrademarkApplicationLogsResponseBody getBody() {
        return this.body;
    }

}
