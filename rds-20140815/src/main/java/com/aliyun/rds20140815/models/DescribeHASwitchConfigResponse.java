// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHASwitchConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHASwitchConfigResponseBody body;

    public static DescribeHASwitchConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHASwitchConfigResponse self = new DescribeHASwitchConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHASwitchConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHASwitchConfigResponse setBody(DescribeHASwitchConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHASwitchConfigResponseBody getBody() {
        return this.body;
    }

}
