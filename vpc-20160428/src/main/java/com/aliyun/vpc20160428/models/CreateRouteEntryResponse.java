// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouteEntryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteEntryResponse self = new CreateRouteEntryResponse();
        return TeaModel.build(map, self);
    }

}
