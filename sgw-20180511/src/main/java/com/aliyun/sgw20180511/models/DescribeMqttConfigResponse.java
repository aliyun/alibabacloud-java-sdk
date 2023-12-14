// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeMqttConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMqttConfigResponseBody body;

    public static DescribeMqttConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMqttConfigResponse self = new DescribeMqttConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMqttConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMqttConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMqttConfigResponse setBody(DescribeMqttConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMqttConfigResponseBody getBody() {
        return this.body;
    }

}
