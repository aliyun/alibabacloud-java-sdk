// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListTaskLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTaskLogsResponseBody body;

    public static ListTaskLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskLogsResponse self = new ListTaskLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTaskLogsResponse setBody(ListTaskLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskLogsResponseBody getBody() {
        return this.body;
    }

}
