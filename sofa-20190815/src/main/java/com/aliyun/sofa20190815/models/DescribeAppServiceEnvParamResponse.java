// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeAppServiceEnvParamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppServiceEnvParamResponseBody body;

    public static DescribeAppServiceEnvParamResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppServiceEnvParamResponse self = new DescribeAppServiceEnvParamResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppServiceEnvParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppServiceEnvParamResponse setBody(DescribeAppServiceEnvParamResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppServiceEnvParamResponseBody getBody() {
        return this.body;
    }

}
