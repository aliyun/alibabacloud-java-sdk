// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDynamicDictResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDynamicDictResponseBody body;

    public static DescribeDynamicDictResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDynamicDictResponse self = new DescribeDynamicDictResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDynamicDictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDynamicDictResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDynamicDictResponse setBody(DescribeDynamicDictResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDynamicDictResponseBody getBody() {
        return this.body;
    }

}
