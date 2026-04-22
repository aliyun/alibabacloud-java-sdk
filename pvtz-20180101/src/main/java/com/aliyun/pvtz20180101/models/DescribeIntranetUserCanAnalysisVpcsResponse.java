// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeIntranetUserCanAnalysisVpcsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIntranetUserCanAnalysisVpcsResponseBody body;

    public static DescribeIntranetUserCanAnalysisVpcsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIntranetUserCanAnalysisVpcsResponse self = new DescribeIntranetUserCanAnalysisVpcsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIntranetUserCanAnalysisVpcsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIntranetUserCanAnalysisVpcsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIntranetUserCanAnalysisVpcsResponse setBody(DescribeIntranetUserCanAnalysisVpcsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIntranetUserCanAnalysisVpcsResponseBody getBody() {
        return this.body;
    }

}
