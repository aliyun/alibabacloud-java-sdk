// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribePubUserListBySubUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePubUserListBySubUserResponseBody body;

    public static DescribePubUserListBySubUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePubUserListBySubUserResponse self = new DescribePubUserListBySubUserResponse();
        return TeaModel.build(map, self);
    }

    public DescribePubUserListBySubUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePubUserListBySubUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePubUserListBySubUserResponse setBody(DescribePubUserListBySubUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePubUserListBySubUserResponseBody getBody() {
        return this.body;
    }

}
