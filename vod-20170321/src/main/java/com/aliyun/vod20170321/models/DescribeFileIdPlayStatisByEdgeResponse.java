// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeFileIdPlayStatisByEdgeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFileIdPlayStatisByEdgeResponseBody body;

    public static DescribeFileIdPlayStatisByEdgeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileIdPlayStatisByEdgeResponse self = new DescribeFileIdPlayStatisByEdgeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFileIdPlayStatisByEdgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFileIdPlayStatisByEdgeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFileIdPlayStatisByEdgeResponse setBody(DescribeFileIdPlayStatisByEdgeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFileIdPlayStatisByEdgeResponseBody getBody() {
        return this.body;
    }

}
