// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RemoveVMFromServiceMeshResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveVMFromServiceMeshResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveVMFromServiceMeshResponseBody self = new RemoveVMFromServiceMeshResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveVMFromServiceMeshResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
