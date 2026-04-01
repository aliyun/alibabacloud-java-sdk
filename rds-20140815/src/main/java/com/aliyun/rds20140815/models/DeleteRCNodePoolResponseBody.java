// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCNodePoolResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7A41C147-C8D0-4DAE-A1A2-17EBCD60DFA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRCNodePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRCNodePoolResponseBody self = new DeleteRCNodePoolResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRCNodePoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
