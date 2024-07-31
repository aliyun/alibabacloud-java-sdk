// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeCloudAssistantAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudAssistantAttributesResponseBody body;

    public static DescribeCloudAssistantAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudAssistantAttributesResponse self = new DescribeCloudAssistantAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudAssistantAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudAssistantAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudAssistantAttributesResponse setBody(DescribeCloudAssistantAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudAssistantAttributesResponseBody getBody() {
        return this.body;
    }

}
