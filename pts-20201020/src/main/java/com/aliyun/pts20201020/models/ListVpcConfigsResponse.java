// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListVpcConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVpcConfigsResponseBody body;

    public static ListVpcConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVpcConfigsResponse self = new ListVpcConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListVpcConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVpcConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVpcConfigsResponse setBody(ListVpcConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpcConfigsResponseBody getBody() {
        return this.body;
    }

}
