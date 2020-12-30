// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIPv6TranslatorBandwidthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyIPv6TranslatorBandwidthResponseBody body;

    public static ModifyIPv6TranslatorBandwidthResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIPv6TranslatorBandwidthResponse self = new ModifyIPv6TranslatorBandwidthResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIPv6TranslatorBandwidthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIPv6TranslatorBandwidthResponse setBody(ModifyIPv6TranslatorBandwidthResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIPv6TranslatorBandwidthResponseBody getBody() {
        return this.body;
    }

}
