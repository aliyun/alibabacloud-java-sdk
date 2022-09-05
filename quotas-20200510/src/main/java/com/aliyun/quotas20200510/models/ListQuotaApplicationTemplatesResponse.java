// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListQuotaApplicationTemplatesResponseBody body;

    public static ListQuotaApplicationTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaApplicationTemplatesResponse self = new ListQuotaApplicationTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListQuotaApplicationTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQuotaApplicationTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQuotaApplicationTemplatesResponse setBody(ListQuotaApplicationTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQuotaApplicationTemplatesResponseBody getBody() {
        return this.body;
    }

}
