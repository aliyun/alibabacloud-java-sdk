// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DeleteCustomLineResponseBody extends TeaModel {
    /**
     * <p>The unique ID of the custom line.</p>
     * 
     * <strong>example:</strong>
     * <p>520002</p>
     */
    @NameInMap("LineId")
    public String lineId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A73F3BD0-B1A8-42A9-A9B6-689BBABC4891</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCustomLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomLineResponseBody self = new DeleteCustomLineResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCustomLineResponseBody setLineId(String lineId) {
        this.lineId = lineId;
        return this;
    }
    public String getLineId() {
        return this.lineId;
    }

    public DeleteCustomLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
