// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVcoRouteEntryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVcoRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVcoRouteEntryResponseBody self = new DeleteVcoRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVcoRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
