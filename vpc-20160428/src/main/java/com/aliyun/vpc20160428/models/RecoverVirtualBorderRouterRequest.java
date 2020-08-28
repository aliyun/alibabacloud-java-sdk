// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RecoverVirtualBorderRouterRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VbrId")
    @Validation(required = true)
    public String vbrId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static RecoverVirtualBorderRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        RecoverVirtualBorderRouterRequest self = new RecoverVirtualBorderRouterRequest();
        return TeaModel.build(map, self);
    }

}
