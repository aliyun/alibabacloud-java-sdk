// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryODPInstancesMappingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchqueryODPInstancesMappingsResponseBody body;

    public static BatchqueryODPInstancesMappingsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryODPInstancesMappingsResponse self = new BatchqueryODPInstancesMappingsResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryODPInstancesMappingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchqueryODPInstancesMappingsResponse setBody(BatchqueryODPInstancesMappingsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchqueryODPInstancesMappingsResponseBody getBody() {
        return this.body;
    }

}
