// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListJobGroupsAsyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListJobGroupsAsyncResponseBody body;

    public static ListJobGroupsAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobGroupsAsyncResponse self = new ListJobGroupsAsyncResponse();
        return TeaModel.build(map, self);
    }

    public ListJobGroupsAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobGroupsAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListJobGroupsAsyncResponse setBody(ListJobGroupsAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobGroupsAsyncResponseBody getBody() {
        return this.body;
    }

}
