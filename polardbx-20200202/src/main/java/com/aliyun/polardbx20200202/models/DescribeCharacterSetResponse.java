// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeCharacterSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCharacterSetResponseBody body;

    public static DescribeCharacterSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCharacterSetResponse self = new DescribeCharacterSetResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCharacterSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCharacterSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCharacterSetResponse setBody(DescribeCharacterSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCharacterSetResponseBody getBody() {
        return this.body;
    }

}
