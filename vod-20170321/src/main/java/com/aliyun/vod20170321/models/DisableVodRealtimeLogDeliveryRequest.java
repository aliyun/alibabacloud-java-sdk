// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DisableVodRealtimeLogDeliveryRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DisableVodRealtimeLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableVodRealtimeLogDeliveryRequest self = new DisableVodRealtimeLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public DisableVodRealtimeLogDeliveryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DisableVodRealtimeLogDeliveryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
