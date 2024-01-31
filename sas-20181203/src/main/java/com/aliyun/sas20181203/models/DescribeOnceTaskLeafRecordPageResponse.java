// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeOnceTaskLeafRecordPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOnceTaskLeafRecordPageResponseBody body;

    public static DescribeOnceTaskLeafRecordPageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnceTaskLeafRecordPageResponse self = new DescribeOnceTaskLeafRecordPageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOnceTaskLeafRecordPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOnceTaskLeafRecordPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOnceTaskLeafRecordPageResponse setBody(DescribeOnceTaskLeafRecordPageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOnceTaskLeafRecordPageResponseBody getBody() {
        return this.body;
    }

}
