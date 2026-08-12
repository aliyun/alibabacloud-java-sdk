// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateLogDeliveryConfigResponseBody extends TeaModel {
    /**
     * <p>The name of the log delivery configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("DeliveryName")
    public String deliveryName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>26E46541-7AAB-5565-801D-F14DBDC5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLogDeliveryConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLogDeliveryConfigResponseBody self = new CreateLogDeliveryConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLogDeliveryConfigResponseBody setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
        return this;
    }
    public String getDeliveryName() {
        return this.deliveryName;
    }

    public CreateLogDeliveryConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
