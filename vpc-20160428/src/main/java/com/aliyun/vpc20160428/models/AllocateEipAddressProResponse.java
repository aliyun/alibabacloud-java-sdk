// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateEipAddressProResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AllocationId")
    @Validation(required = true)
    public String allocationId;

    @NameInMap("EipAddress")
    @Validation(required = true)
    public String eipAddress;

    @NameInMap("OrderId")
    @Validation(required = true)
    public Long orderId;

    @NameInMap("ResourceGroupId")
    @Validation(required = true)
    public String resourceGroupId;

    public static AllocateEipAddressProResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateEipAddressProResponse self = new AllocateEipAddressProResponse();
        return TeaModel.build(map, self);
    }

}
