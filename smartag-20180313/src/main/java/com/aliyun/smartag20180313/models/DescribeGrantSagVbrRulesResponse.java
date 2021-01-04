// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeGrantSagVbrRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGrantSagVbrRulesResponseBody body;

    public static DescribeGrantSagVbrRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGrantSagVbrRulesResponse self = new DescribeGrantSagVbrRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGrantSagVbrRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGrantSagVbrRulesResponse setBody(DescribeGrantSagVbrRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGrantSagVbrRulesResponseBody getBody() {
        return this.body;
    }

}
