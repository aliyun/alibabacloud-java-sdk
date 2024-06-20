// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyApisecLogDeliveryStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F35F45B0-5D6B-4238-BE02-A62D****E840</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyApisecLogDeliveryStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyApisecLogDeliveryStatusResponseBody self = new ModifyApisecLogDeliveryStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyApisecLogDeliveryStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
