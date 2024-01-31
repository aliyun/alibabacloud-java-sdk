// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerCriteriaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeContainerCriteriaResponseBody body;

    public static DescribeContainerCriteriaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerCriteriaResponse self = new DescribeContainerCriteriaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContainerCriteriaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContainerCriteriaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContainerCriteriaResponse setBody(DescribeContainerCriteriaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContainerCriteriaResponseBody getBody() {
        return this.body;
    }

}
