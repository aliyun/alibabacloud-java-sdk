// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetMultiAccountDeliveryChannelRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dc-6q79dm4o9***</p>
     */
    @NameInMap("DeliveryChannelId")
    public String deliveryChannelId;

    public static GetMultiAccountDeliveryChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMultiAccountDeliveryChannelRequest self = new GetMultiAccountDeliveryChannelRequest();
        return TeaModel.build(map, self);
    }

    public GetMultiAccountDeliveryChannelRequest setDeliveryChannelId(String deliveryChannelId) {
        this.deliveryChannelId = deliveryChannelId;
        return this;
    }
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

}
