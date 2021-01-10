// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListQueryProcessorNersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListQueryProcessorNersResponseBody body;

    public static ListQueryProcessorNersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQueryProcessorNersResponse self = new ListQueryProcessorNersResponse();
        return TeaModel.build(map, self);
    }

    public ListQueryProcessorNersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQueryProcessorNersResponse setBody(ListQueryProcessorNersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQueryProcessorNersResponseBody getBody() {
        return this.body;
    }

}
