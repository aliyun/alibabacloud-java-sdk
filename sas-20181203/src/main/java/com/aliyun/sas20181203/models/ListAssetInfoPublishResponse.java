// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAssetInfoPublishResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAssetInfoPublishResponseBody body;

    public static ListAssetInfoPublishResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAssetInfoPublishResponse self = new ListAssetInfoPublishResponse();
        return TeaModel.build(map, self);
    }

    public ListAssetInfoPublishResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAssetInfoPublishResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAssetInfoPublishResponse setBody(ListAssetInfoPublishResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAssetInfoPublishResponseBody getBody() {
        return this.body;
    }

}
