// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyExpressCloudConnectionBandwidthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyExpressCloudConnectionBandwidthResponse setBody(ModifyExpressCloudConnectionBandwidthResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyExpressCloudConnectionBandwidthResponseBody getBody() {
        return this.body;
    }

}
