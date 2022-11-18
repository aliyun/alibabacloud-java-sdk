// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagVbrRelationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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

    public DescribeSagVbrRelationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSagVbrRelationsResponse setBody(DescribeSagVbrRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagVbrRelationsResponseBody getBody() {
        return this.body;
    }

}
