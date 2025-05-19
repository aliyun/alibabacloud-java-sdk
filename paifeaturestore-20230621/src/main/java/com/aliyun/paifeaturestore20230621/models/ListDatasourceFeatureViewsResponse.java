// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListDatasourceFeatureViewsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDatasourceFeatureViewsResponseBody body;

    public static ListDatasourceFeatureViewsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatasourceFeatureViewsResponse self = new ListDatasourceFeatureViewsResponse();
        return TeaModel.build(map, self);
    }

    public ListDatasourceFeatureViewsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatasourceFeatureViewsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDatasourceFeatureViewsResponse setBody(ListDatasourceFeatureViewsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatasourceFeatureViewsResponseBody getBody() {
        return this.body;
    }

}
