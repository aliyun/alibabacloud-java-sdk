// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCFlowUidRangeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLDCFlowUidRangeResponseBody body;

    public static UpdateLDCFlowUidRangeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCFlowUidRangeResponse self = new UpdateLDCFlowUidRangeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLDCFlowUidRangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLDCFlowUidRangeResponse setBody(UpdateLDCFlowUidRangeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLDCFlowUidRangeResponseBody getBody() {
        return this.body;
    }

}
