// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListFunctionTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFunctionTasksResponseBody body;

    public static ListFunctionTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionTasksResponse self = new ListFunctionTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListFunctionTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFunctionTasksResponse setBody(ListFunctionTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFunctionTasksResponseBody getBody() {
        return this.body;
    }

}
