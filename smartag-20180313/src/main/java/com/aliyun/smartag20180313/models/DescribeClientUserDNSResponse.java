// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeClientUserDNSResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClientUserDNSResponseBody body;

    public static DescribeClientUserDNSResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientUserDNSResponse self = new DescribeClientUserDNSResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClientUserDNSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClientUserDNSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClientUserDNSResponse setBody(DescribeClientUserDNSResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClientUserDNSResponseBody getBody() {
        return this.body;
    }

}
