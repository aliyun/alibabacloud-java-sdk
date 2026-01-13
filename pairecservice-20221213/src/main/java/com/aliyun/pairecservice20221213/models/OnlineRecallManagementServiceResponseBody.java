// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class OnlineRecallManagementServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OnlineRecallManagementServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnlineRecallManagementServiceResponseBody self = new OnlineRecallManagementServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OnlineRecallManagementServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
