// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetBuiltinEnvoyFilterResponseBody extends TeaModel {
    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("RequestId")
    public String requestId;

    public static GetBuiltinEnvoyFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBuiltinEnvoyFilterResponseBody self = new GetBuiltinEnvoyFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBuiltinEnvoyFilterResponseBody setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public GetBuiltinEnvoyFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
