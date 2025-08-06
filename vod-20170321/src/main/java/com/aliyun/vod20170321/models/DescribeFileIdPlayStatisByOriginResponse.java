// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeFileIdPlayStatisByOriginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFileIdPlayStatisByOriginResponseBody body;

    public static DescribeFileIdPlayStatisByOriginResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileIdPlayStatisByOriginResponse self = new DescribeFileIdPlayStatisByOriginResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFileIdPlayStatisByOriginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFileIdPlayStatisByOriginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFileIdPlayStatisByOriginResponse setBody(DescribeFileIdPlayStatisByOriginResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFileIdPlayStatisByOriginResponseBody getBody() {
        return this.body;
    }

}
