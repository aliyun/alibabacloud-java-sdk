// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListModelFeatureAvailableFeaturesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModelFeatureAvailableFeaturesResponseBody body;

    public static ListModelFeatureAvailableFeaturesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelFeatureAvailableFeaturesResponse self = new ListModelFeatureAvailableFeaturesResponse();
        return TeaModel.build(map, self);
    }

    public ListModelFeatureAvailableFeaturesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelFeatureAvailableFeaturesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModelFeatureAvailableFeaturesResponse setBody(ListModelFeatureAvailableFeaturesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelFeatureAvailableFeaturesResponseBody getBody() {
        return this.body;
    }

}
