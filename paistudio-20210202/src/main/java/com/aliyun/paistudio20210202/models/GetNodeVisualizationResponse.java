// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetNodeVisualizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetNodeVisualizationResponseBody body;

    public static GetNodeVisualizationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodeVisualizationResponse self = new GetNodeVisualizationResponse();
        return TeaModel.build(map, self);
    }

    public GetNodeVisualizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNodeVisualizationResponse setBody(GetNodeVisualizationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNodeVisualizationResponseBody getBody() {
        return this.body;
    }

}
