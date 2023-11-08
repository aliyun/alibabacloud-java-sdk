// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetVmAppMeshInfoResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetVmAppMeshInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVmAppMeshInfoResponseBody self = new GetVmAppMeshInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVmAppMeshInfoResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetVmAppMeshInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
