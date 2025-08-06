// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListVodRealtimeLogDeliveryRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static ListVodRealtimeLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVodRealtimeLogDeliveryRequest self = new ListVodRealtimeLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public ListVodRealtimeLogDeliveryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
