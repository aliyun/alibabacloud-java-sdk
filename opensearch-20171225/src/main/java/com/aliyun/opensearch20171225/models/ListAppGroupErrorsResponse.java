// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListAppGroupErrorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppGroupErrorsResponseBody body;

    public static ListAppGroupErrorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppGroupErrorsResponse self = new ListAppGroupErrorsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppGroupErrorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppGroupErrorsResponse setBody(ListAppGroupErrorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppGroupErrorsResponseBody getBody() {
        return this.body;
    }

}
