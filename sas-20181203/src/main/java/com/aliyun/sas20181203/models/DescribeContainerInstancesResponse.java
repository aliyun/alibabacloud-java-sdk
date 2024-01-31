// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeContainerInstancesResponseBody body;

    public static DescribeContainerInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerInstancesResponse self = new DescribeContainerInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContainerInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContainerInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContainerInstancesResponse setBody(DescribeContainerInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContainerInstancesResponseBody getBody() {
        return this.body;
    }

}
