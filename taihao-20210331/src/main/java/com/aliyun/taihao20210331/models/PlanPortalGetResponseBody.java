// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class PlanPortalGetResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static PlanPortalGetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PlanPortalGetResponseBody self = new PlanPortalGetResponseBody();
        return TeaModel.build(map, self);
    }

    public PlanPortalGetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
