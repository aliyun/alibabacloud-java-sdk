// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class ListDatasetDatasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDatasetDatasResponseBody body;

    public static ListDatasetDatasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetDatasResponse self = new ListDatasetDatasResponse();
        return TeaModel.build(map, self);
    }

    public ListDatasetDatasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatasetDatasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDatasetDatasResponse setBody(ListDatasetDatasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatasetDatasResponseBody getBody() {
        return this.body;
    }

}
