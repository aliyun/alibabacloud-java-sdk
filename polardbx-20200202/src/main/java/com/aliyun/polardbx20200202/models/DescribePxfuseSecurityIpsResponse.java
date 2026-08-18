// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribePxfuseSecurityIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePxfuseSecurityIpsResponseBody body;

    public static DescribePxfuseSecurityIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePxfuseSecurityIpsResponse self = new DescribePxfuseSecurityIpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePxfuseSecurityIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePxfuseSecurityIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePxfuseSecurityIpsResponse setBody(DescribePxfuseSecurityIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePxfuseSecurityIpsResponseBody getBody() {
        return this.body;
    }

}
