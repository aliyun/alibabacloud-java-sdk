// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyExpressCloudConnectionBandwidthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyExpressCloudConnectionBandwidthResponseBody body;

    public static ModifyExpressCloudConnectionBandwidthResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressCloudConnectionBandwidthResponse self = new ModifyExpressCloudConnectionBandwidthResponse();
        return TeaModel.build(map, self);
    }

    public ModifyExpressCloudConnectionBandwidthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyExpressCloudConnectionBandwidthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyExpressCloudConnectionBandwidthResponse setBody(ModifyExpressCloudConnectionBandwidthResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyExpressCloudConnectionBandwidthResponseBody getBody() {
        return this.body;
    }

}
