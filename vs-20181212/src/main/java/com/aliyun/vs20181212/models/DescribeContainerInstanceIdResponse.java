// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeContainerInstanceIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeContainerInstanceIdResponseBody body;

    public static DescribeContainerInstanceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerInstanceIdResponse self = new DescribeContainerInstanceIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContainerInstanceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContainerInstanceIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContainerInstanceIdResponse setBody(DescribeContainerInstanceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContainerInstanceIdResponseBody getBody() {
        return this.body;
    }

}
