// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCCloudAssistantStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCCloudAssistantStatusResponseBody body;

    public static DescribeRCCloudAssistantStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCCloudAssistantStatusResponse self = new DescribeRCCloudAssistantStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCCloudAssistantStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCCloudAssistantStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCCloudAssistantStatusResponse setBody(DescribeRCCloudAssistantStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCCloudAssistantStatusResponseBody getBody() {
        return this.body;
    }

}
