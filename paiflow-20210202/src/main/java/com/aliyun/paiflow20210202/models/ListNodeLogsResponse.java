// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListNodeLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNodeLogsResponseBody body;

    public static ListNodeLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodeLogsResponse self = new ListNodeLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListNodeLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodeLogsResponse setBody(ListNodeLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodeLogsResponseBody getBody() {
        return this.body;
    }

}
