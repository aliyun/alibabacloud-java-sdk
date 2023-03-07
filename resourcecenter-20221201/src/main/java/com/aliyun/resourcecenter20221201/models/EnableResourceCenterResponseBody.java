// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class EnableResourceCenterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static EnableResourceCenterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableResourceCenterResponseBody self = new EnableResourceCenterResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableResourceCenterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableResourceCenterResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
