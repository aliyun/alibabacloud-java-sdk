// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class ListYydComputeTaskListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListYydComputeTaskListResponseBody body;

    public static ListYydComputeTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        ListYydComputeTaskListResponse self = new ListYydComputeTaskListResponse();
        return TeaModel.build(map, self);
    }

    public ListYydComputeTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListYydComputeTaskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListYydComputeTaskListResponse setBody(ListYydComputeTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public ListYydComputeTaskListResponseBody getBody() {
        return this.body;
    }

}
