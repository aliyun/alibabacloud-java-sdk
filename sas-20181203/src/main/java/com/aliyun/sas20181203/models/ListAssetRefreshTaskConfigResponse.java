// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAssetRefreshTaskConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAssetRefreshTaskConfigResponseBody body;

    public static ListAssetRefreshTaskConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAssetRefreshTaskConfigResponse self = new ListAssetRefreshTaskConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListAssetRefreshTaskConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAssetRefreshTaskConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAssetRefreshTaskConfigResponse setBody(ListAssetRefreshTaskConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAssetRefreshTaskConfigResponseBody getBody() {
        return this.body;
    }

}
