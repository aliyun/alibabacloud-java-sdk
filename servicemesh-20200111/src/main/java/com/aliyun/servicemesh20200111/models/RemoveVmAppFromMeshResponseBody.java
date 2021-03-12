// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RemoveVmAppFromMeshResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static RemoveVmAppFromMeshResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveVmAppFromMeshResponseBody self = new RemoveVmAppFromMeshResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveVmAppFromMeshResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveVmAppFromMeshResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
