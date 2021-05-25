// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ListBuiltinEnvoyFilterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static ListBuiltinEnvoyFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBuiltinEnvoyFilterResponseBody self = new ListBuiltinEnvoyFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBuiltinEnvoyFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBuiltinEnvoyFilterResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
