// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeFeatureTemplateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFeatureTemplateListResponseBody body;

    public static DescribeFeatureTemplateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFeatureTemplateListResponse self = new DescribeFeatureTemplateListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFeatureTemplateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFeatureTemplateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFeatureTemplateListResponse setBody(DescribeFeatureTemplateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFeatureTemplateListResponseBody getBody() {
        return this.body;
    }

}
