// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListStatisticLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListStatisticLogsResponseBody body;

    public static ListStatisticLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStatisticLogsResponse self = new ListStatisticLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListStatisticLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStatisticLogsResponse setBody(ListStatisticLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStatisticLogsResponseBody getBody() {
        return this.body;
    }

}
