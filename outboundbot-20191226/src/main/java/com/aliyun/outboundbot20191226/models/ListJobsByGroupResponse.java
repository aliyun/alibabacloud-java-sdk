// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListJobsByGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListJobsByGroupResponseBody body;

    public static ListJobsByGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobsByGroupResponse self = new ListJobsByGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListJobsByGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobsByGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListJobsByGroupResponse setBody(ListJobsByGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobsByGroupResponseBody getBody() {
        return this.body;
    }

}
