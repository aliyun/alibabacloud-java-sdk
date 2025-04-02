// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListMultiAccountResourceRelationshipsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMultiAccountResourceRelationshipsResponseBody body;

    public static ListMultiAccountResourceRelationshipsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMultiAccountResourceRelationshipsResponse self = new ListMultiAccountResourceRelationshipsResponse();
        return TeaModel.build(map, self);
    }

    public ListMultiAccountResourceRelationshipsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMultiAccountResourceRelationshipsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMultiAccountResourceRelationshipsResponse setBody(ListMultiAccountResourceRelationshipsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMultiAccountResourceRelationshipsResponseBody getBody() {
        return this.body;
    }

}
