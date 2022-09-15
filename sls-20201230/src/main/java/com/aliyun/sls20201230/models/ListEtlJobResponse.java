// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListEtlJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListEtlJobResponseBody body;

    public static ListEtlJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEtlJobResponse self = new ListEtlJobResponse();
        return TeaModel.build(map, self);
    }

    public ListEtlJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEtlJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEtlJobResponse setBody(ListEtlJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEtlJobResponseBody getBody() {
        return this.body;
    }

}
