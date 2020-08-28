// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetVmAppMeshInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    public static GetVmAppMeshInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVmAppMeshInfoResponse self = new GetVmAppMeshInfoResponse();
        return TeaModel.build(map, self);
    }

}
