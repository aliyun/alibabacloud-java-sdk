// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class ListSummaryAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSummaryAppsResponseBody body;

    public static ListSummaryAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSummaryAppsResponse self = new ListSummaryAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListSummaryAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSummaryAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSummaryAppsResponse setBody(ListSummaryAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSummaryAppsResponseBody getBody() {
        return this.body;
    }

}
