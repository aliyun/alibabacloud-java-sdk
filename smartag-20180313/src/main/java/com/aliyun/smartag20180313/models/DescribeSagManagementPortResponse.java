// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagManagementPortResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSagManagementPortResponseBody body;

    public static DescribeSagManagementPortResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagManagementPortResponse self = new DescribeSagManagementPortResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagManagementPortResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagManagementPortResponse setBody(DescribeSagManagementPortResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagManagementPortResponseBody getBody() {
        return this.body;
    }

}
