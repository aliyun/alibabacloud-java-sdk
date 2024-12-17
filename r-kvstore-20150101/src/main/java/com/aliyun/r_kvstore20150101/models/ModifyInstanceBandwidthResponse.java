// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceBandwidthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceBandwidthResponseBody body;

    public static ModifyInstanceBandwidthResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceBandwidthResponse self = new ModifyInstanceBandwidthResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceBandwidthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceBandwidthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceBandwidthResponse setBody(ModifyInstanceBandwidthResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceBandwidthResponseBody getBody() {
        return this.body;
    }

}
