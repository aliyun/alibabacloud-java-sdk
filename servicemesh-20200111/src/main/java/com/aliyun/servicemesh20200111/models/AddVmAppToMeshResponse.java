// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class AddVmAppToMeshResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    public static AddVmAppToMeshResponse build(java.util.Map<String, ?> map) throws Exception {
        AddVmAppToMeshResponse self = new AddVmAppToMeshResponse();
        return TeaModel.build(map, self);
    }

}
