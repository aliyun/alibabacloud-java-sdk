// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventsVariableListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventsVariableListResponseBody body;

    public static DescribeEventsVariableListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsVariableListResponse self = new DescribeEventsVariableListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventsVariableListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventsVariableListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventsVariableListResponse setBody(DescribeEventsVariableListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventsVariableListResponseBody getBody() {
        return this.body;
    }

}
