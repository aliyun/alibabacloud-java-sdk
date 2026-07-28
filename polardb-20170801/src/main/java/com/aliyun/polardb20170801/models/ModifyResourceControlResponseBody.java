// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyResourceControlResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>47921222-0D37-4133-8C0D-017DC3******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyResourceControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourceControlResponseBody self = new ModifyResourceControlResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyResourceControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
