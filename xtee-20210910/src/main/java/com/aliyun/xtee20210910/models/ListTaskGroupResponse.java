// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ListTaskGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTaskGroupResponseBody body;

    public static ListTaskGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskGroupResponse self = new ListTaskGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTaskGroupResponse setBody(ListTaskGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskGroupResponseBody getBody() {
        return this.body;
    }

}
