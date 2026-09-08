// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListDataAssetAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataAssetAccountsResponseBody body;

    public static ListDataAssetAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataAssetAccountsResponse self = new ListDataAssetAccountsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataAssetAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataAssetAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataAssetAccountsResponse setBody(ListDataAssetAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataAssetAccountsResponseBody getBody() {
        return this.body;
    }

}
