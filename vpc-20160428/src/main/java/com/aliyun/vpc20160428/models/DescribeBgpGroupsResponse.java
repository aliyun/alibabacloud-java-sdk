// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeBgpGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBgpGroupsResponseBody body;

    public static DescribeBgpGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBgpGroupsResponse self = new DescribeBgpGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBgpGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBgpGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBgpGroupsResponse setBody(DescribeBgpGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBgpGroupsResponseBody getBody() {
        return this.body;
    }

}
