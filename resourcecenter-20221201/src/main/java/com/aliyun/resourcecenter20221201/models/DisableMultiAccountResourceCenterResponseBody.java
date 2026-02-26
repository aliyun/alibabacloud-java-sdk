// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class DisableMultiAccountResourceCenterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableMultiAccountResourceCenterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableMultiAccountResourceCenterResponseBody self = new DisableMultiAccountResourceCenterResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableMultiAccountResourceCenterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
