// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteSagStaticRouteResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A53F71B6-7577-492A-A0CD-C7D3DFFE2D0E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSagStaticRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSagStaticRouteResponseBody self = new DeleteSagStaticRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSagStaticRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
