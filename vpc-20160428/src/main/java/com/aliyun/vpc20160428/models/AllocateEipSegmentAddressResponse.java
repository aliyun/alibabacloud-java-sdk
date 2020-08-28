// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateEipSegmentAddressResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("EipSegmentInstanceId")
    @Validation(required = true)
    public String eipSegmentInstanceId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public Long orderId;

    public static AllocateEipSegmentAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateEipSegmentAddressResponse self = new AllocateEipSegmentAddressResponse();
        return TeaModel.build(map, self);
    }

}
