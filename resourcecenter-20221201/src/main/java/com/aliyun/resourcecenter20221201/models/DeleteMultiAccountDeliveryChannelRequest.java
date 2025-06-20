// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class DeleteMultiAccountDeliveryChannelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dc-0bzhsqpnkxxx</p>
     */
    @NameInMap("DeliveryChannelId")
    public String deliveryChannelId;

    public static DeleteMultiAccountDeliveryChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultiAccountDeliveryChannelRequest self = new DeleteMultiAccountDeliveryChannelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMultiAccountDeliveryChannelRequest setDeliveryChannelId(String deliveryChannelId) {
        this.deliveryChannelId = deliveryChannelId;
        return this;
    }
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

}
