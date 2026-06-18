// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeMem0SecurityIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMem0SecurityIpsResponseBody body;

    public static DescribeMem0SecurityIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMem0SecurityIpsResponse self = new DescribeMem0SecurityIpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMem0SecurityIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMem0SecurityIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMem0SecurityIpsResponse setBody(DescribeMem0SecurityIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMem0SecurityIpsResponseBody getBody() {
        return this.body;
    }

}
