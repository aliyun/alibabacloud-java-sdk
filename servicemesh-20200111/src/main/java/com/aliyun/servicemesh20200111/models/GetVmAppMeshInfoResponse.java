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

    public GetVmAppMeshInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVmAppMeshInfoResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
