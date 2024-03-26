// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateAppInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAppInfoResponseBody body;

    public static UpdateAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppInfoResponse self = new UpdateAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppInfoResponse setBody(UpdateAppInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppInfoResponseBody getBody() {
        return this.body;
    }

}
