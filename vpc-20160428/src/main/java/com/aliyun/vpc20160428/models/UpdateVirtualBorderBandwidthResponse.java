// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateVirtualBorderBandwidthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateVirtualBorderBandwidthResponseBody body;

    public static UpdateVirtualBorderBandwidthResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVirtualBorderBandwidthResponse self = new UpdateVirtualBorderBandwidthResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVirtualBorderBandwidthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVirtualBorderBandwidthResponse setBody(UpdateVirtualBorderBandwidthResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVirtualBorderBandwidthResponseBody getBody() {
        return this.body;
    }

}
