// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateEipSegmentAddressResponseBody extends TeaModel {
    /**
     * <p>The ID of the contiguous EIP group.</p>
     */
    @NameInMap("EipSegmentInstanceId")
    public String eipSegmentInstanceId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AllocateEipSegmentAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateEipSegmentAddressResponseBody self = new AllocateEipSegmentAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateEipSegmentAddressResponseBody setEipSegmentInstanceId(String eipSegmentInstanceId) {
        this.eipSegmentInstanceId = eipSegmentInstanceId;
        return this;
    }
    public String getEipSegmentInstanceId() {
        return this.eipSegmentInstanceId;
    }

    public AllocateEipSegmentAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
