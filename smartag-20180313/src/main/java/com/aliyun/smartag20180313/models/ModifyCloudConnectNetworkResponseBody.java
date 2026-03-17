// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyCloudConnectNetworkResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0BAAF2B9-88B8-4574-BDBE-102A90EE3FEE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCloudConnectNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudConnectNetworkResponseBody self = new ModifyCloudConnectNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCloudConnectNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
