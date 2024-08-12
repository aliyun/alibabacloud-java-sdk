// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetDeviceUpgradeStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeviceUpgradeStatusResponseBody body;

    public static GetDeviceUpgradeStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceUpgradeStatusResponse self = new GetDeviceUpgradeStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceUpgradeStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceUpgradeStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeviceUpgradeStatusResponse setBody(GetDeviceUpgradeStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceUpgradeStatusResponseBody getBody() {
        return this.body;
    }

}
