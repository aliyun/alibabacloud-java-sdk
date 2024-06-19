// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupSupportParamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeParameterGroupSupportParamResponseBody body;

    public static DescribeParameterGroupSupportParamResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterGroupSupportParamResponse self = new DescribeParameterGroupSupportParamResponse();
        return TeaModel.build(map, self);
    }

    public DescribeParameterGroupSupportParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeParameterGroupSupportParamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeParameterGroupSupportParamResponse setBody(DescribeParameterGroupSupportParamResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeParameterGroupSupportParamResponseBody getBody() {
        return this.body;
    }

}
