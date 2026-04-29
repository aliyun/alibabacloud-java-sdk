// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawPluginsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePolarClawPluginsResponseBody body;

    public static DescribePolarClawPluginsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawPluginsResponse self = new DescribePolarClawPluginsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawPluginsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarClawPluginsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolarClawPluginsResponse setBody(DescribePolarClawPluginsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarClawPluginsResponseBody getBody() {
        return this.body;
    }

}
