// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DownloadVpnConnectionConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadVpnConnectionConfigResponseBody body;

    public static DownloadVpnConnectionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadVpnConnectionConfigResponse self = new DownloadVpnConnectionConfigResponse();
        return TeaModel.build(map, self);
    }

    public DownloadVpnConnectionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadVpnConnectionConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadVpnConnectionConfigResponse setBody(DownloadVpnConnectionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadVpnConnectionConfigResponseBody getBody() {
        return this.body;
    }

}
