// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class CreateMultiAccountDeliveryChannelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dc-6q79dm4o9***</p>
     */
    @NameInMap("DeliveryChannelId")
    public String deliveryChannelId;

    /**
     * <strong>example:</strong>
     * <p>994BFEFE-4BB5-5A27-8917-4583DEEF2***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateMultiAccountDeliveryChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiAccountDeliveryChannelResponseBody self = new CreateMultiAccountDeliveryChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMultiAccountDeliveryChannelResponseBody setDeliveryChannelId(String deliveryChannelId) {
        this.deliveryChannelId = deliveryChannelId;
        return this;
    }
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

    public CreateMultiAccountDeliveryChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
