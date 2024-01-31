// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeContainerTagsResponseBody body;

    public static DescribeContainerTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerTagsResponse self = new DescribeContainerTagsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContainerTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContainerTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContainerTagsResponse setBody(DescribeContainerTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContainerTagsResponseBody getBody() {
        return this.body;
    }

}
