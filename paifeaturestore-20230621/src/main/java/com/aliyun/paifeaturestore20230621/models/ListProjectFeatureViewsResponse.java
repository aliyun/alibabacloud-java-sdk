// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListProjectFeatureViewsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListProjectFeatureViewsResponseBody body;

    public static ListProjectFeatureViewsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectFeatureViewsResponse self = new ListProjectFeatureViewsResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectFeatureViewsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectFeatureViewsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectFeatureViewsResponse setBody(ListProjectFeatureViewsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectFeatureViewsResponseBody getBody() {
        return this.body;
    }

}
