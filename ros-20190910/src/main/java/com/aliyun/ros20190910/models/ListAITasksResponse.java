// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListAITasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAITasksResponseBody body;

    public static ListAITasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAITasksResponse self = new ListAITasksResponse();
        return TeaModel.build(map, self);
    }

    public ListAITasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAITasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAITasksResponse setBody(ListAITasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAITasksResponseBody getBody() {
        return this.body;
    }

}
