// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ConfigDataSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigDataSetResponseBody body;

    public static ConfigDataSetResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigDataSetResponse self = new ConfigDataSetResponse();
        return TeaModel.build(map, self);
    }

    public ConfigDataSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigDataSetResponse setBody(ConfigDataSetResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigDataSetResponseBody getBody() {
        return this.body;
    }

}
