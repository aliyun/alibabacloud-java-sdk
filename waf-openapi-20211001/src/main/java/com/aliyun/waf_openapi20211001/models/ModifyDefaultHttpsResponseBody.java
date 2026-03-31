// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefaultHttpsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>276D7566-31C9-4192-9DD1-***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDefaultHttpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefaultHttpsResponseBody self = new ModifyDefaultHttpsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDefaultHttpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
