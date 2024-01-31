// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListQuotaApplicationsResponseBody body;

    public static ListQuotaApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaApplicationsResponse self = new ListQuotaApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public ListQuotaApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQuotaApplicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQuotaApplicationsResponse setBody(ListQuotaApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQuotaApplicationsResponseBody getBody() {
        return this.body;
    }

}
