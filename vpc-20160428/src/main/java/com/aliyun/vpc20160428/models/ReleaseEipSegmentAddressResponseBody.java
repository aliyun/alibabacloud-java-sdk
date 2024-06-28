// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ReleaseEipSegmentAddressResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F7A6301A-64BA-41EC-8284-8F4838C15D1F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseEipSegmentAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseEipSegmentAddressResponseBody self = new ReleaseEipSegmentAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseEipSegmentAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
