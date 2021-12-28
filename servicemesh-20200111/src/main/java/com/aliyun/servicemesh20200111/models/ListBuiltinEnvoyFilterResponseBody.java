// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ListBuiltinEnvoyFilterResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListBuiltinEnvoyFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBuiltinEnvoyFilterResponseBody self = new ListBuiltinEnvoyFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBuiltinEnvoyFilterResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ListBuiltinEnvoyFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
