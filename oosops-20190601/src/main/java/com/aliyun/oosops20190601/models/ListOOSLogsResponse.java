// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListOOSLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOOSLogsResponseBody body;

    public static ListOOSLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOOSLogsResponse self = new ListOOSLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListOOSLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOOSLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOOSLogsResponse setBody(ListOOSLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOOSLogsResponseBody getBody() {
        return this.body;
    }

}
