// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class SetServiceRegistrySourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static SetServiceRegistrySourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetServiceRegistrySourceResponseBody self = new SetServiceRegistrySourceResponseBody();
        return TeaModel.build(map, self);
    }

    public SetServiceRegistrySourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetServiceRegistrySourceResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
