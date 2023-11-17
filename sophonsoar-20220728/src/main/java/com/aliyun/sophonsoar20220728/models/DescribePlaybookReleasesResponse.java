// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybookReleasesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePlaybookReleasesResponseBody body;

    public static DescribePlaybookReleasesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlaybookReleasesResponse self = new DescribePlaybookReleasesResponse();
        return TeaModel.build(map, self);
    }

    public DescribePlaybookReleasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePlaybookReleasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePlaybookReleasesResponse setBody(DescribePlaybookReleasesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePlaybookReleasesResponseBody getBody() {
        return this.body;
    }

}
