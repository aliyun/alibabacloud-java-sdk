// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVirtualBorderRouterResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VbrId")
    @Validation(required = true)
    public String vbrId;

    public static CreateVirtualBorderRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualBorderRouterResponse self = new CreateVirtualBorderRouterResponse();
        return TeaModel.build(map, self);
    }

}
