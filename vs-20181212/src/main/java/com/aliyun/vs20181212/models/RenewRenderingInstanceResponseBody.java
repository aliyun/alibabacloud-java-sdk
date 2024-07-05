// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class RenewRenderingInstanceResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RenewRenderingInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewRenderingInstanceResponseBody self = new RenewRenderingInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewRenderingInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
