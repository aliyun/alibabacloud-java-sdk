// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeCharacterSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeCharacterSetResponse setBody(DescribeCharacterSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCharacterSetResponseBody getBody() {
        return this.body;
    }

}
