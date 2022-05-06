// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeModifyPGHbaConfigLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeModifyPGHbaConfigLogResponseBody body;

    public static DescribeModifyPGHbaConfigLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModifyPGHbaConfigLogResponse self = new DescribeModifyPGHbaConfigLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModifyPGHbaConfigLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModifyPGHbaConfigLogResponse setBody(DescribeModifyPGHbaConfigLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModifyPGHbaConfigLogResponseBody getBody() {
        return this.body;
    }

}
