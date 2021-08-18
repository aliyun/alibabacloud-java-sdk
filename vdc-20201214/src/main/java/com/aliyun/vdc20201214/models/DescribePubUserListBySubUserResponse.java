// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribePubUserListBySubUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribePubUserListBySubUserResponse setBody(DescribePubUserListBySubUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePubUserListBySubUserResponseBody getBody() {
        return this.body;
    }

}
