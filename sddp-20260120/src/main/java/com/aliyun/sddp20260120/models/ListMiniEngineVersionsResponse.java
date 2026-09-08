// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListMiniEngineVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMiniEngineVersionsResponseBody body;

    public static ListMiniEngineVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMiniEngineVersionsResponse self = new ListMiniEngineVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListMiniEngineVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMiniEngineVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMiniEngineVersionsResponse setBody(ListMiniEngineVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMiniEngineVersionsResponseBody getBody() {
        return this.body;
    }

}
