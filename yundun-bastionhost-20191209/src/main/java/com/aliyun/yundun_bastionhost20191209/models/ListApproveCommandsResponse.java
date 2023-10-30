// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListApproveCommandsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListApproveCommandsResponseBody body;

    public static ListApproveCommandsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApproveCommandsResponse self = new ListApproveCommandsResponse();
        return TeaModel.build(map, self);
    }

    public ListApproveCommandsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApproveCommandsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApproveCommandsResponse setBody(ListApproveCommandsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApproveCommandsResponseBody getBody() {
        return this.body;
    }

}
