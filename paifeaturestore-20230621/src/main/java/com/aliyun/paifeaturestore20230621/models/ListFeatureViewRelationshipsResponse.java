// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListFeatureViewRelationshipsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListFeatureViewRelationshipsResponseBody body;

    public static ListFeatureViewRelationshipsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureViewRelationshipsResponse self = new ListFeatureViewRelationshipsResponse();
        return TeaModel.build(map, self);
    }

    public ListFeatureViewRelationshipsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFeatureViewRelationshipsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFeatureViewRelationshipsResponse setBody(ListFeatureViewRelationshipsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFeatureViewRelationshipsResponseBody getBody() {
        return this.body;
    }

}
