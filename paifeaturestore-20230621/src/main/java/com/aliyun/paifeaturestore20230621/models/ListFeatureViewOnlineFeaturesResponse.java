// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListFeatureViewOnlineFeaturesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFeatureViewOnlineFeaturesResponseBody body;

    public static ListFeatureViewOnlineFeaturesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureViewOnlineFeaturesResponse self = new ListFeatureViewOnlineFeaturesResponse();
        return TeaModel.build(map, self);
    }

    public ListFeatureViewOnlineFeaturesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFeatureViewOnlineFeaturesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFeatureViewOnlineFeaturesResponse setBody(ListFeatureViewOnlineFeaturesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFeatureViewOnlineFeaturesResponseBody getBody() {
        return this.body;
    }

}
