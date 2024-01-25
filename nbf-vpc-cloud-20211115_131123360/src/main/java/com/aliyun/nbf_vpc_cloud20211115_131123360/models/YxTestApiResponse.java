// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf_vpc_cloud20211115_131123360.models;

import com.aliyun.tea.*;

public class YxTestApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public YxTestApiResponseBody body;

    public static YxTestApiResponse build(java.util.Map<String, ?> map) throws Exception {
        YxTestApiResponse self = new YxTestApiResponse();
        return TeaModel.build(map, self);
    }

    public YxTestApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public YxTestApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public YxTestApiResponse setBody(YxTestApiResponseBody body) {
        this.body = body;
        return this;
    }
    public YxTestApiResponseBody getBody() {
        return this.body;
    }

}
