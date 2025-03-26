// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyEipForwardModeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>62C6A6A5-1534-53D9-AB1E-C9307A147ED5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyEipForwardModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyEipForwardModeResponseBody self = new ModifyEipForwardModeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyEipForwardModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
