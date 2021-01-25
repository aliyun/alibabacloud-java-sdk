// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class SetServiceRegistrySourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Result")
    @Validation(required = true)
    public String result;

    public static SetServiceRegistrySourceResponse build(java.util.Map<String, ?> map) throws Exception {
        SetServiceRegistrySourceResponse self = new SetServiceRegistrySourceResponse();
        return TeaModel.build(map, self);
    }

    public SetServiceRegistrySourceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetServiceRegistrySourceResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
