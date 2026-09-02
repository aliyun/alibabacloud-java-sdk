// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUuidVulNumClassifyStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUuidVulNumClassifyStatisticResponseBody body;

    public static DescribeUuidVulNumClassifyStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUuidVulNumClassifyStatisticResponse self = new DescribeUuidVulNumClassifyStatisticResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUuidVulNumClassifyStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUuidVulNumClassifyStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUuidVulNumClassifyStatisticResponse setBody(DescribeUuidVulNumClassifyStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUuidVulNumClassifyStatisticResponseBody getBody() {
        return this.body;
    }

}
