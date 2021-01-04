// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagVbrRelationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSagVbrRelationsResponseBody body;

    public static DescribeSagVbrRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagVbrRelationsResponse self = new DescribeSagVbrRelationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagVbrRelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagVbrRelationsResponse setBody(DescribeSagVbrRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagVbrRelationsResponseBody getBody() {
        return this.body;
    }

}
