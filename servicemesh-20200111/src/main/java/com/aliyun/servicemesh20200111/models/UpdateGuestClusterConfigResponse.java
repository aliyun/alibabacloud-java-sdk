// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateGuestClusterConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGuestClusterConfigResponseBody body;

    public static UpdateGuestClusterConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGuestClusterConfigResponse self = new UpdateGuestClusterConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGuestClusterConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGuestClusterConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGuestClusterConfigResponse setBody(UpdateGuestClusterConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGuestClusterConfigResponseBody getBody() {
        return this.body;
    }

}
