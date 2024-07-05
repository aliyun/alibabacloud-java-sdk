// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateCloudAppInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCloudAppInfoResponseBody body;

    public static UpdateCloudAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudAppInfoResponse self = new UpdateCloudAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCloudAppInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCloudAppInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCloudAppInfoResponse setBody(UpdateCloudAppInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCloudAppInfoResponseBody getBody() {
        return this.body;
    }

}
