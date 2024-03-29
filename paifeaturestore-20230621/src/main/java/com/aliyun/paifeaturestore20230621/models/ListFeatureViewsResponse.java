// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListFeatureViewsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFeatureViewsResponseBody body;

    public static ListFeatureViewsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureViewsResponse self = new ListFeatureViewsResponse();
        return TeaModel.build(map, self);
    }

    public ListFeatureViewsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFeatureViewsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFeatureViewsResponse setBody(ListFeatureViewsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFeatureViewsResponseBody getBody() {
        return this.body;
    }

}
