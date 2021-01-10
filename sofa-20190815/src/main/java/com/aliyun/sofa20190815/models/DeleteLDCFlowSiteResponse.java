// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLDCFlowSiteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLDCFlowSiteResponseBody body;

    public static DeleteLDCFlowSiteResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLDCFlowSiteResponse self = new DeleteLDCFlowSiteResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLDCFlowSiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLDCFlowSiteResponse setBody(DeleteLDCFlowSiteResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLDCFlowSiteResponseBody getBody() {
        return this.body;
    }

}
