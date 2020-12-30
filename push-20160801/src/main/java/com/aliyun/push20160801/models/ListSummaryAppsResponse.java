// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class ListSummaryAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public ListSummaryAppsResponse setBody(ListSummaryAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSummaryAppsResponseBody getBody() {
        return this.body;
    }

}
