// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListTodoOpsTaskApprovalsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTodoOpsTaskApprovalsResponseBody body;

    public static ListTodoOpsTaskApprovalsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTodoOpsTaskApprovalsResponse self = new ListTodoOpsTaskApprovalsResponse();
        return TeaModel.build(map, self);
    }

    public ListTodoOpsTaskApprovalsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTodoOpsTaskApprovalsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTodoOpsTaskApprovalsResponse setBody(ListTodoOpsTaskApprovalsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTodoOpsTaskApprovalsResponseBody getBody() {
        return this.body;
    }

}
