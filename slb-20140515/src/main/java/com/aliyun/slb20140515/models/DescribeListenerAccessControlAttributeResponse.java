// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeListenerAccessControlAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeListenerAccessControlAttributeResponseBody body;

    public static DescribeListenerAccessControlAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeListenerAccessControlAttributeResponse self = new DescribeListenerAccessControlAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeListenerAccessControlAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeListenerAccessControlAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeListenerAccessControlAttributeResponse setBody(DescribeListenerAccessControlAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeListenerAccessControlAttributeResponseBody getBody() {
        return this.body;
    }

}
