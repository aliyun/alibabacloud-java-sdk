// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ListMultimodalLabelStudioServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMultimodalLabelStudioServiceResponseBody body;

    public static ListMultimodalLabelStudioServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMultimodalLabelStudioServiceResponse self = new ListMultimodalLabelStudioServiceResponse();
        return TeaModel.build(map, self);
    }

    public ListMultimodalLabelStudioServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMultimodalLabelStudioServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMultimodalLabelStudioServiceResponse setBody(ListMultimodalLabelStudioServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMultimodalLabelStudioServiceResponseBody getBody() {
        return this.body;
    }

}
