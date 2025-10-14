// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeStructureImportTaskInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStructureImportTaskInfoResponseBody body;

    public static DescribeStructureImportTaskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStructureImportTaskInfoResponse self = new DescribeStructureImportTaskInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStructureImportTaskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStructureImportTaskInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStructureImportTaskInfoResponse setBody(DescribeStructureImportTaskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStructureImportTaskInfoResponseBody getBody() {
        return this.body;
    }

}
