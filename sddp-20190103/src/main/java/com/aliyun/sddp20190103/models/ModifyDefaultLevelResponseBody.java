// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyDefaultLevelResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>208B016D-4CB9-4A85-96A5-0B8ED1EBF271</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDefaultLevelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefaultLevelResponseBody self = new ModifyDefaultLevelResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDefaultLevelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
