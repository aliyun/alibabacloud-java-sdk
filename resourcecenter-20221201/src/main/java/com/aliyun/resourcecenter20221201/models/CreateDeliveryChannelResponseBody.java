// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class CreateDeliveryChannelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dc-0bzhsqpnk***</p>
     */
    @NameInMap("DeliveryChannelId")
    public String deliveryChannelId;

    /**
     * <strong>example:</strong>
     * <p>42A89312-0616-591E-B614-07BC87D3D***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDeliveryChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliveryChannelResponseBody self = new CreateDeliveryChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeliveryChannelResponseBody setDeliveryChannelId(String deliveryChannelId) {
        this.deliveryChannelId = deliveryChannelId;
        return this;
    }
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

    public CreateDeliveryChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
