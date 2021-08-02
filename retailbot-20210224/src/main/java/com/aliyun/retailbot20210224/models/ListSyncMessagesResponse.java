// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListSyncMessagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSyncMessagesResponseBody body;

    public static ListSyncMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSyncMessagesResponse self = new ListSyncMessagesResponse();
        return TeaModel.build(map, self);
    }

    public ListSyncMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSyncMessagesResponse setBody(ListSyncMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSyncMessagesResponseBody getBody() {
        return this.body;
    }

}
