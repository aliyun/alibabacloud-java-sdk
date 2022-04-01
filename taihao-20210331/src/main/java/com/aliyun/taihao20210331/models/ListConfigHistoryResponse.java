// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListConfigHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListConfigHistoryResponseBody body;

    public static ListConfigHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConfigHistoryResponse self = new ListConfigHistoryResponse();
        return TeaModel.build(map, self);
    }

    public ListConfigHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConfigHistoryResponse setBody(ListConfigHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConfigHistoryResponseBody getBody() {
        return this.body;
    }

}
