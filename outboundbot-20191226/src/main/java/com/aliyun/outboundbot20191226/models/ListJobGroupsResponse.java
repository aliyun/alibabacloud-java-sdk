// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListJobGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListJobGroupsResponseBody body;

    public static ListJobGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobGroupsResponse self = new ListJobGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListJobGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListJobGroupsResponse setBody(ListJobGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobGroupsResponseBody getBody() {
        return this.body;
    }

}
