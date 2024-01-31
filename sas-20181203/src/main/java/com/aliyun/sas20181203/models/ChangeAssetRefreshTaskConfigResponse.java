// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeAssetRefreshTaskConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeAssetRefreshTaskConfigResponseBody body;

    public static ChangeAssetRefreshTaskConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeAssetRefreshTaskConfigResponse self = new ChangeAssetRefreshTaskConfigResponse();
        return TeaModel.build(map, self);
    }

    public ChangeAssetRefreshTaskConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeAssetRefreshTaskConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeAssetRefreshTaskConfigResponse setBody(ChangeAssetRefreshTaskConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeAssetRefreshTaskConfigResponseBody getBody() {
        return this.body;
    }

}
