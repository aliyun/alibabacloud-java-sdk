// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyRenderingInstanceResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6DFE7B89-8532-566F-B5CE-924B10FCE7AC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRenderingInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRenderingInstanceResponseBody self = new ModifyRenderingInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRenderingInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
