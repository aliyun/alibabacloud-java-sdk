// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCFlowCellWeightResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLDCFlowCellWeightResponseBody body;

    public static UpdateLDCFlowCellWeightResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCFlowCellWeightResponse self = new UpdateLDCFlowCellWeightResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLDCFlowCellWeightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLDCFlowCellWeightResponse setBody(UpdateLDCFlowCellWeightResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLDCFlowCellWeightResponseBody getBody() {
        return this.body;
    }

}
