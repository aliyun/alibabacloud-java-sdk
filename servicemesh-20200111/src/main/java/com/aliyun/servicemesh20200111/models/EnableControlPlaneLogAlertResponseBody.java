// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class EnableControlPlaneLogAlertResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableControlPlaneLogAlertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableControlPlaneLogAlertResponseBody self = new EnableControlPlaneLogAlertResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableControlPlaneLogAlertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
