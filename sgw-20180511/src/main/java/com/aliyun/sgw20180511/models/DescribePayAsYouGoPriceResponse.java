// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribePayAsYouGoPriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePayAsYouGoPriceResponseBody body;

    public static DescribePayAsYouGoPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePayAsYouGoPriceResponse self = new DescribePayAsYouGoPriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribePayAsYouGoPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePayAsYouGoPriceResponse setBody(DescribePayAsYouGoPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePayAsYouGoPriceResponseBody getBody() {
        return this.body;
    }

}
