// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDSTBizLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDSTBizLogsResponseBody body;

    public static ListDSTBizLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDSTBizLogsResponse self = new ListDSTBizLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListDSTBizLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDSTBizLogsResponse setBody(ListDSTBizLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDSTBizLogsResponseBody getBody() {
        return this.body;
    }

}
