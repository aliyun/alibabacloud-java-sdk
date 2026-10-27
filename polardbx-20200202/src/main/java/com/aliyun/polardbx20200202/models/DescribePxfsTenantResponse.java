// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribePxfsTenantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePxfsTenantResponseBody body;

    public static DescribePxfsTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePxfsTenantResponse self = new DescribePxfsTenantResponse();
        return TeaModel.build(map, self);
    }

    public DescribePxfsTenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePxfsTenantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePxfsTenantResponse setBody(DescribePxfsTenantResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePxfsTenantResponseBody getBody() {
        return this.body;
    }

}
