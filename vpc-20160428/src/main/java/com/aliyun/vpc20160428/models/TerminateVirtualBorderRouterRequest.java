// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class TerminateVirtualBorderRouterRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VbrId")
    @Validation(required = true)
    public String vbrId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static TerminateVirtualBorderRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminateVirtualBorderRouterRequest self = new TerminateVirtualBorderRouterRequest();
        return TeaModel.build(map, self);
    }

}
