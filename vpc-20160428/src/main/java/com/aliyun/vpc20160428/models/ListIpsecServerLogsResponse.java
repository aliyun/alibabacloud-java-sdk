// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListIpsecServerLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIpsecServerLogsResponseBody body;

    public static ListIpsecServerLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIpsecServerLogsResponse self = new ListIpsecServerLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListIpsecServerLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIpsecServerLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIpsecServerLogsResponse setBody(ListIpsecServerLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIpsecServerLogsResponseBody getBody() {
        return this.body;
    }

}
