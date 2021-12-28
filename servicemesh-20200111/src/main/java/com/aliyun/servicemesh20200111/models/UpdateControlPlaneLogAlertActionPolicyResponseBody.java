// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateControlPlaneLogAlertActionPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateControlPlaneLogAlertActionPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateControlPlaneLogAlertActionPolicyResponseBody self = new UpdateControlPlaneLogAlertActionPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateControlPlaneLogAlertActionPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
