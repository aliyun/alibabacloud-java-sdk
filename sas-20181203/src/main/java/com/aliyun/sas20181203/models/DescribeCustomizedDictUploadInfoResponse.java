// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCustomizedDictUploadInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomizedDictUploadInfoResponseBody body;

    public static DescribeCustomizedDictUploadInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizedDictUploadInfoResponse self = new DescribeCustomizedDictUploadInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizedDictUploadInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomizedDictUploadInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomizedDictUploadInfoResponse setBody(DescribeCustomizedDictUploadInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomizedDictUploadInfoResponseBody getBody() {
        return this.body;
    }

}
