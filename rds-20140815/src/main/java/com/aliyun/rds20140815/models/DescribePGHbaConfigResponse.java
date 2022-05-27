// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribePGHbaConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePGHbaConfigResponseBody body;

    public static DescribePGHbaConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePGHbaConfigResponse self = new DescribePGHbaConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribePGHbaConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePGHbaConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePGHbaConfigResponse setBody(DescribePGHbaConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePGHbaConfigResponseBody getBody() {
        return this.body;
    }

}
