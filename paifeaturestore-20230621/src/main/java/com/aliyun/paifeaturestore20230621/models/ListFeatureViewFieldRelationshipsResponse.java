// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListFeatureViewFieldRelationshipsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFeatureViewFieldRelationshipsResponseBody body;

    public static ListFeatureViewFieldRelationshipsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureViewFieldRelationshipsResponse self = new ListFeatureViewFieldRelationshipsResponse();
        return TeaModel.build(map, self);
    }

    public ListFeatureViewFieldRelationshipsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFeatureViewFieldRelationshipsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFeatureViewFieldRelationshipsResponse setBody(ListFeatureViewFieldRelationshipsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFeatureViewFieldRelationshipsResponseBody getBody() {
        return this.body;
    }

}
