// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListFullNatEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListFullNatEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFullNatEntriesResponse setBody(ListFullNatEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFullNatEntriesResponseBody getBody() {
        return this.body;
    }

}
