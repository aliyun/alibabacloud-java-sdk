// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListSystemLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSystemLogsResponseBody body;

    public static ListSystemLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSystemLogsResponse self = new ListSystemLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListSystemLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSystemLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSystemLogsResponse setBody(ListSystemLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSystemLogsResponseBody getBody() {
        return this.body;
    }

}
