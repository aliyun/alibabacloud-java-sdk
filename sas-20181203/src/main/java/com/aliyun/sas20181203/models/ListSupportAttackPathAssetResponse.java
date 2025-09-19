// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListSupportAttackPathAssetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSupportAttackPathAssetResponseBody body;

    public static ListSupportAttackPathAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSupportAttackPathAssetResponse self = new ListSupportAttackPathAssetResponse();
        return TeaModel.build(map, self);
    }

    public ListSupportAttackPathAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSupportAttackPathAssetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSupportAttackPathAssetResponse setBody(ListSupportAttackPathAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSupportAttackPathAssetResponseBody getBody() {
        return this.body;
    }

}
