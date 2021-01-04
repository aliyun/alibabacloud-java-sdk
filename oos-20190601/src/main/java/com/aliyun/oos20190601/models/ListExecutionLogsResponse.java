// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListExecutionLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListExecutionLogsResponseBody body;

    public static ListExecutionLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExecutionLogsResponse self = new ListExecutionLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListExecutionLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExecutionLogsResponse setBody(ListExecutionLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExecutionLogsResponseBody getBody() {
        return this.body;
    }

}
