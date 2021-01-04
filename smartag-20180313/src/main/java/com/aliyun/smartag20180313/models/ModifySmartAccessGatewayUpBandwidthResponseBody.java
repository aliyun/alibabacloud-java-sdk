// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySmartAccessGatewayUpBandwidthResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySmartAccessGatewayUpBandwidthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySmartAccessGatewayUpBandwidthResponseBody self = new ModifySmartAccessGatewayUpBandwidthResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySmartAccessGatewayUpBandwidthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
