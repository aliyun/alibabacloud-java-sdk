// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAssetCleanConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAssetCleanConfigResponseBody body;

    public static ListAssetCleanConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAssetCleanConfigResponse self = new ListAssetCleanConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListAssetCleanConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAssetCleanConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAssetCleanConfigResponse setBody(ListAssetCleanConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAssetCleanConfigResponseBody getBody() {
        return this.body;
    }

}
