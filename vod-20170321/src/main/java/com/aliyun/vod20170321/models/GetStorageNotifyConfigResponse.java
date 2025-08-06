// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetStorageNotifyConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStorageNotifyConfigResponseBody body;

    public static GetStorageNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStorageNotifyConfigResponse self = new GetStorageNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetStorageNotifyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStorageNotifyConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStorageNotifyConfigResponse setBody(GetStorageNotifyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStorageNotifyConfigResponseBody getBody() {
        return this.body;
    }

}
