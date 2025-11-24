// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ModifyServiceMeshNameResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EDDC0D86-2FC3-56FB-9213-96EB0A3523F1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyServiceMeshNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyServiceMeshNameResponseBody self = new ModifyServiceMeshNameResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyServiceMeshNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
