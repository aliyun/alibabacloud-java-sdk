// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RefreshContainerAssetsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshContainerAssetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshContainerAssetsResponseBody self = new RefreshContainerAssetsResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshContainerAssetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
