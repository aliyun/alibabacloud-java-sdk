// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeRoleZoneInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRoleZoneInfoResponseBody body;

    public static DescribeRoleZoneInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoleZoneInfoResponse self = new DescribeRoleZoneInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRoleZoneInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRoleZoneInfoResponse setBody(DescribeRoleZoneInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRoleZoneInfoResponseBody getBody() {
        return this.body;
    }

}
