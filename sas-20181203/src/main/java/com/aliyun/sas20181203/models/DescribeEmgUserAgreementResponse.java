// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeEmgUserAgreementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEmgUserAgreementResponseBody body;

    public static DescribeEmgUserAgreementResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEmgUserAgreementResponse self = new DescribeEmgUserAgreementResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEmgUserAgreementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEmgUserAgreementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEmgUserAgreementResponse setBody(DescribeEmgUserAgreementResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEmgUserAgreementResponseBody getBody() {
        return this.body;
    }

}
