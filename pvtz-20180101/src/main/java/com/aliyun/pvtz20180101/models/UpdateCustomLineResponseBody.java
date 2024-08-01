// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateCustomLineResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>765001</p>
     */
    @NameInMap("LineId")
    public String lineId;

    /**
     * <strong>example:</strong>
     * <p>0B7AD377-7E86-44A8-B9A8-53E8666E72FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCustomLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomLineResponseBody self = new UpdateCustomLineResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCustomLineResponseBody setLineId(String lineId) {
        this.lineId = lineId;
        return this;
    }
    public String getLineId() {
        return this.lineId;
    }

    public UpdateCustomLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
