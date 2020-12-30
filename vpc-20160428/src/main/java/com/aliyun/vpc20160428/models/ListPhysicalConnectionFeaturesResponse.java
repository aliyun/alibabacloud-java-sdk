// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListPhysicalConnectionFeaturesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPhysicalConnectionFeaturesResponseBody body;

    public static ListPhysicalConnectionFeaturesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPhysicalConnectionFeaturesResponse self = new ListPhysicalConnectionFeaturesResponse();
        return TeaModel.build(map, self);
    }

    public ListPhysicalConnectionFeaturesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPhysicalConnectionFeaturesResponse setBody(ListPhysicalConnectionFeaturesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPhysicalConnectionFeaturesResponseBody getBody() {
        return this.body;
    }

}
