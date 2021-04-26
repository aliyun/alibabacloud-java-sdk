// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class ListMaskDetectionResultsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMaskDetectionResultsResponseBody body;

    public static ListMaskDetectionResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMaskDetectionResultsResponse self = new ListMaskDetectionResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListMaskDetectionResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMaskDetectionResultsResponse setBody(ListMaskDetectionResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMaskDetectionResultsResponseBody getBody() {
        return this.body;
    }

}
