// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListProductQuotaDimensionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProductQuotaDimensionsResponseBody body;

    public static ListProductQuotaDimensionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductQuotaDimensionsResponse self = new ListProductQuotaDimensionsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductQuotaDimensionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductQuotaDimensionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductQuotaDimensionsResponse setBody(ListProductQuotaDimensionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductQuotaDimensionsResponseBody getBody() {
        return this.body;
    }

}
