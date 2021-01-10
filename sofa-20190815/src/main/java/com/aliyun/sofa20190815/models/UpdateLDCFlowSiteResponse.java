// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCFlowSiteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLDCFlowSiteResponseBody body;

    public static UpdateLDCFlowSiteResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCFlowSiteResponse self = new UpdateLDCFlowSiteResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLDCFlowSiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLDCFlowSiteResponse setBody(UpdateLDCFlowSiteResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLDCFlowSiteResponseBody getBody() {
        return this.body;
    }

}
