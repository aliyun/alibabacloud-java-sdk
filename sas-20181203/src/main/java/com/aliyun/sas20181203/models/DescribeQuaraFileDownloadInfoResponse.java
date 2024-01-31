// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeQuaraFileDownloadInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeQuaraFileDownloadInfoResponseBody body;

    public static DescribeQuaraFileDownloadInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeQuaraFileDownloadInfoResponse self = new DescribeQuaraFileDownloadInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeQuaraFileDownloadInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeQuaraFileDownloadInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeQuaraFileDownloadInfoResponse setBody(DescribeQuaraFileDownloadInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeQuaraFileDownloadInfoResponseBody getBody() {
        return this.body;
    }

}
