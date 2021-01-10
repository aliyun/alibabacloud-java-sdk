// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListUserAnalyzersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserAnalyzersResponseBody body;

    public static ListUserAnalyzersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserAnalyzersResponse self = new ListUserAnalyzersResponse();
        return TeaModel.build(map, self);
    }

    public ListUserAnalyzersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserAnalyzersResponse setBody(ListUserAnalyzersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserAnalyzersResponseBody getBody() {
        return this.body;
    }

}
