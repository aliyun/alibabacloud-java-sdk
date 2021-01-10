// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetLDCFlowDefaultUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetLDCFlowDefaultUidResponseBody body;

    public static SetLDCFlowDefaultUidResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLDCFlowDefaultUidResponse self = new SetLDCFlowDefaultUidResponse();
        return TeaModel.build(map, self);
    }

    public SetLDCFlowDefaultUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLDCFlowDefaultUidResponse setBody(SetLDCFlowDefaultUidResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLDCFlowDefaultUidResponseBody getBody() {
        return this.body;
    }

}
