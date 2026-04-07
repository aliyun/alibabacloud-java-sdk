// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeMem0InfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMem0InfoResponseBody body;

    public static DescribeMem0InfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMem0InfoResponse self = new DescribeMem0InfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMem0InfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMem0InfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMem0InfoResponse setBody(DescribeMem0InfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMem0InfoResponseBody getBody() {
        return this.body;
    }

}
