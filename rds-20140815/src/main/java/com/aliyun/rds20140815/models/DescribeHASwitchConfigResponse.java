// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHASwitchConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHASwitchConfigResponseBody body;

    public static DescribeHASwitchConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHASwitchConfigResponse self = new DescribeHASwitchConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHASwitchConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHASwitchConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHASwitchConfigResponse setBody(DescribeHASwitchConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHASwitchConfigResponseBody getBody() {
        return this.body;
    }

}
