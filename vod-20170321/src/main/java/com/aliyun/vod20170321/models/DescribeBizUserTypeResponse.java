// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeBizUserTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBizUserTypeResponseBody body;

    public static DescribeBizUserTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBizUserTypeResponse self = new DescribeBizUserTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBizUserTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBizUserTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBizUserTypeResponse setBody(DescribeBizUserTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBizUserTypeResponseBody getBody() {
        return this.body;
    }

}
