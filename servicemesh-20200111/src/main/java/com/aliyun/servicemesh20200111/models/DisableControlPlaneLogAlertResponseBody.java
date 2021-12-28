// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DisableControlPlaneLogAlertResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableControlPlaneLogAlertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableControlPlaneLogAlertResponseBody self = new DisableControlPlaneLogAlertResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableControlPlaneLogAlertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
