// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUuidsByVulNamesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUuidsByVulNamesResponseBody body;

    public static DescribeUuidsByVulNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUuidsByVulNamesResponse self = new DescribeUuidsByVulNamesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUuidsByVulNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUuidsByVulNamesResponse setBody(DescribeUuidsByVulNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUuidsByVulNamesResponseBody getBody() {
        return this.body;
    }

}
