// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetDeliveryChannelStatisticsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dc-6q79dm4o9***</p>
     */
    @NameInMap("DeliveryChannelId")
    public String deliveryChannelId;

    public static GetDeliveryChannelStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeliveryChannelStatisticsRequest self = new GetDeliveryChannelStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetDeliveryChannelStatisticsRequest setDeliveryChannelId(String deliveryChannelId) {
        this.deliveryChannelId = deliveryChannelId;
        return this;
    }
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

}
