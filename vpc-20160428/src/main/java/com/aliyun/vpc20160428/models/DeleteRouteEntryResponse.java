// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteRouteEntryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteEntryResponse self = new DeleteRouteEntryResponse();
        return TeaModel.build(map, self);
    }

}
