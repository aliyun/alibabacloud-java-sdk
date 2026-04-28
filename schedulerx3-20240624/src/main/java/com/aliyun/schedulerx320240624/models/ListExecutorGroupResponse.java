// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListExecutorGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExecutorGroupResponseBody body;

    public static ListExecutorGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExecutorGroupResponse self = new ListExecutorGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListExecutorGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExecutorGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExecutorGroupResponse setBody(ListExecutorGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExecutorGroupResponseBody getBody() {
        return this.body;
    }

}
