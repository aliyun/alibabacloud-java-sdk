// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DeleteGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FCF40AB5-881C-A0F9-334C-B0AD423AA69D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupResponseBody self = new DeleteGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
