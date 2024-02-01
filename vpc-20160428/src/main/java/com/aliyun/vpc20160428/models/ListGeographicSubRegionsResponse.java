// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListGeographicSubRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGeographicSubRegionsResponseBody body;

    public static ListGeographicSubRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGeographicSubRegionsResponse self = new ListGeographicSubRegionsResponse();
        return TeaModel.build(map, self);
    }

    public ListGeographicSubRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGeographicSubRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGeographicSubRegionsResponse setBody(ListGeographicSubRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGeographicSubRegionsResponseBody getBody() {
        return this.body;
    }

}
