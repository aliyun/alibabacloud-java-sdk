// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLDCFlowSiteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLDCFlowSiteResponseBody body;

    public static CreateLDCFlowSiteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLDCFlowSiteResponse self = new CreateLDCFlowSiteResponse();
        return TeaModel.build(map, self);
    }

    public CreateLDCFlowSiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLDCFlowSiteResponse setBody(CreateLDCFlowSiteResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLDCFlowSiteResponseBody getBody() {
        return this.body;
    }

}
