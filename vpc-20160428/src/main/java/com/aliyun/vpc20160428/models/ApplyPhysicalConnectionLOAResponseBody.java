// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ApplyPhysicalConnectionLOAResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A47BD386-7FDE-42C4-8D22-C6223D18AA1C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ApplyPhysicalConnectionLOAResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyPhysicalConnectionLOAResponseBody self = new ApplyPhysicalConnectionLOAResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyPhysicalConnectionLOAResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
