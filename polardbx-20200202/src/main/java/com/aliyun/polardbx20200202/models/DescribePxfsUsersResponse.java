// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribePxfsUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePxfsUsersResponseBody body;

    public static DescribePxfsUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePxfsUsersResponse self = new DescribePxfsUsersResponse();
        return TeaModel.build(map, self);
    }

    public DescribePxfsUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePxfsUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePxfsUsersResponse setBody(DescribePxfsUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePxfsUsersResponseBody getBody() {
        return this.body;
    }

}
