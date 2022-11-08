// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class ListDataReflowDatasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDataReflowDatasResponseBody body;

    public static ListDataReflowDatasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataReflowDatasResponse self = new ListDataReflowDatasResponse();
        return TeaModel.build(map, self);
    }

    public ListDataReflowDatasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataReflowDatasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataReflowDatasResponse setBody(ListDataReflowDatasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataReflowDatasResponseBody getBody() {
        return this.body;
    }

}
