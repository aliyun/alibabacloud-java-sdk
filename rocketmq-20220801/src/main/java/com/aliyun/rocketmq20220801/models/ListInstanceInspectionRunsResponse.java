// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListInstanceInspectionRunsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceInspectionRunsResponseBody body;

    public static ListInstanceInspectionRunsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceInspectionRunsResponse self = new ListInstanceInspectionRunsResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceInspectionRunsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceInspectionRunsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceInspectionRunsResponse setBody(ListInstanceInspectionRunsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceInspectionRunsResponseBody getBody() {
        return this.body;
    }

}
