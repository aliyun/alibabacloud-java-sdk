// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerAppsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeContainerAppsResponseBody body;

    public static DescribeContainerAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerAppsResponse self = new DescribeContainerAppsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContainerAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContainerAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContainerAppsResponse setBody(DescribeContainerAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContainerAppsResponseBody getBody() {
        return this.body;
    }

}
