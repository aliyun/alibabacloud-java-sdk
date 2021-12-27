// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RefreshContainerNetworkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshContainerNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshContainerNetworkResponseBody self = new RefreshContainerNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshContainerNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
