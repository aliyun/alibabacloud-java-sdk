// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyCommonBandwidthPackagePayTypeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public Long orderId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    public static ModifyCommonBandwidthPackagePayTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommonBandwidthPackagePayTypeResponse self = new ModifyCommonBandwidthPackagePayTypeResponse();
        return TeaModel.build(map, self);
    }

}
