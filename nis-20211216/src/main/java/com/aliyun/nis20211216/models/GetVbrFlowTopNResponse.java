// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetVbrFlowTopNResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVbrFlowTopNResponseBody body;

    public static GetVbrFlowTopNResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVbrFlowTopNResponse self = new GetVbrFlowTopNResponse();
        return TeaModel.build(map, self);
    }

    public GetVbrFlowTopNResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVbrFlowTopNResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVbrFlowTopNResponse setBody(GetVbrFlowTopNResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVbrFlowTopNResponseBody getBody() {
        return this.body;
    }

}
