// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteCloudConnectNetworkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCloudConnectNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudConnectNetworkResponseBody self = new DeleteCloudConnectNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCloudConnectNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
