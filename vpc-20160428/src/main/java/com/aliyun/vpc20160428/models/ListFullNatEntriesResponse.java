// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListFullNatEntriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFullNatEntriesResponseBody body;

    public static ListFullNatEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFullNatEntriesResponse self = new ListFullNatEntriesResponse();
        return TeaModel.build(map, self);
    }

    public ListFullNatEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFullNatEntriesResponse setBody(ListFullNatEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFullNatEntriesResponseBody getBody() {
        return this.body;
    }

}
