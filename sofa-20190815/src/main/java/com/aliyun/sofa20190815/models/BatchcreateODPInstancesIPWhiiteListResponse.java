// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchcreateODPInstancesIPWhiiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchcreateODPInstancesIPWhiiteListResponseBody body;

    public static BatchcreateODPInstancesIPWhiiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateODPInstancesIPWhiiteListResponse self = new BatchcreateODPInstancesIPWhiiteListResponse();
        return TeaModel.build(map, self);
    }

    public BatchcreateODPInstancesIPWhiiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchcreateODPInstancesIPWhiiteListResponse setBody(BatchcreateODPInstancesIPWhiiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchcreateODPInstancesIPWhiiteListResponseBody getBody() {
        return this.body;
    }

}
