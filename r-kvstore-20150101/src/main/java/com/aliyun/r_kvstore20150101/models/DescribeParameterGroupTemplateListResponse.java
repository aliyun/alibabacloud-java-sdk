// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupTemplateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeParameterGroupTemplateListResponseBody body;

    public static DescribeParameterGroupTemplateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterGroupTemplateListResponse self = new DescribeParameterGroupTemplateListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeParameterGroupTemplateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeParameterGroupTemplateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeParameterGroupTemplateListResponse setBody(DescribeParameterGroupTemplateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeParameterGroupTemplateListResponseBody getBody() {
        return this.body;
    }

}
