// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class ModifySourceServerAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySourceServerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySourceServerAttributeResponseBody self = new ModifySourceServerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySourceServerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
