// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCharacterSetNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCharacterSetNameResponseBody body;

    public static DescribeCharacterSetNameResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCharacterSetNameResponse self = new DescribeCharacterSetNameResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCharacterSetNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCharacterSetNameResponse setBody(DescribeCharacterSetNameResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCharacterSetNameResponseBody getBody() {
        return this.body;
    }

}
