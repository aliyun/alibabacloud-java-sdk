// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DescribeAreasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAreasResponseBody body;

    public static DescribeAreasResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAreasResponse self = new DescribeAreasResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAreasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAreasResponse setBody(DescribeAreasResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAreasResponseBody getBody() {
        return this.body;
    }

}
