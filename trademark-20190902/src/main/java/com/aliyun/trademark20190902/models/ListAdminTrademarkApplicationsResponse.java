// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListAdminTrademarkApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAdminTrademarkApplicationsResponseBody body;

    public static ListAdminTrademarkApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAdminTrademarkApplicationsResponse self = new ListAdminTrademarkApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public ListAdminTrademarkApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAdminTrademarkApplicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAdminTrademarkApplicationsResponse setBody(ListAdminTrademarkApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAdminTrademarkApplicationsResponseBody getBody() {
        return this.body;
    }

}
