// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyRenderingInstanceBandwidthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRenderingInstanceBandwidthResponseBody body;

    public static ModifyRenderingInstanceBandwidthResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRenderingInstanceBandwidthResponse self = new ModifyRenderingInstanceBandwidthResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRenderingInstanceBandwidthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRenderingInstanceBandwidthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRenderingInstanceBandwidthResponse setBody(ModifyRenderingInstanceBandwidthResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRenderingInstanceBandwidthResponseBody getBody() {
        return this.body;
    }

}
