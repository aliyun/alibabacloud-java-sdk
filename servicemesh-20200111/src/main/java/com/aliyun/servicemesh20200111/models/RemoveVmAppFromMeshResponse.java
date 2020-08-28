// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RemoveVmAppFromMeshResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    public static RemoveVmAppFromMeshResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveVmAppFromMeshResponse self = new RemoveVmAppFromMeshResponse();
        return TeaModel.build(map, self);
    }

}
