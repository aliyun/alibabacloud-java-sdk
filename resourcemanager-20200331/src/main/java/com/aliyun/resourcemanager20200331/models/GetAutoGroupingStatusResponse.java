// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetAutoGroupingStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAutoGroupingStatusResponseBody body;

    public static GetAutoGroupingStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutoGroupingStatusResponse self = new GetAutoGroupingStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetAutoGroupingStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutoGroupingStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAutoGroupingStatusResponse setBody(GetAutoGroupingStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutoGroupingStatusResponseBody getBody() {
        return this.body;
    }

}
