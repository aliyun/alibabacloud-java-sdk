// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetSyncRefreshRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetSyncRefreshRegionResponseBody body;

    public static SetSyncRefreshRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        SetSyncRefreshRegionResponse self = new SetSyncRefreshRegionResponse();
        return TeaModel.build(map, self);
    }

    public SetSyncRefreshRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetSyncRefreshRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetSyncRefreshRegionResponse setBody(SetSyncRefreshRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSyncRefreshRegionResponseBody getBody() {
        return this.body;
    }

}
