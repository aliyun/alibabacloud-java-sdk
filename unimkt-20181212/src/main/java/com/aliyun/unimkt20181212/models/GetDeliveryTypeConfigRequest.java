// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class GetDeliveryTypeConfigRequest extends TeaModel {
    @NameInMap("DeliveryType")
    public String deliveryType;

    public static GetDeliveryTypeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeliveryTypeConfigRequest self = new GetDeliveryTypeConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetDeliveryTypeConfigRequest setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }
    public String getDeliveryType() {
        return this.deliveryType;
    }

}
