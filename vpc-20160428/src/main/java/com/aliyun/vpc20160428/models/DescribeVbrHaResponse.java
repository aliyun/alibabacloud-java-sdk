// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVbrHaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVbrHaResponseBody body;

    public static DescribeVbrHaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVbrHaResponse self = new DescribeVbrHaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVbrHaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVbrHaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVbrHaResponse setBody(DescribeVbrHaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVbrHaResponseBody getBody() {
        return this.body;
    }

}
