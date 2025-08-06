// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListVodRealtimeLogDeliveryInfosRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static ListVodRealtimeLogDeliveryInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVodRealtimeLogDeliveryInfosRequest self = new ListVodRealtimeLogDeliveryInfosRequest();
        return TeaModel.build(map, self);
    }

    public ListVodRealtimeLogDeliveryInfosRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
