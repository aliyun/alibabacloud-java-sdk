// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class EnableVodRealtimeLogDeliveryRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static EnableVodRealtimeLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableVodRealtimeLogDeliveryRequest self = new EnableVodRealtimeLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public EnableVodRealtimeLogDeliveryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public EnableVodRealtimeLogDeliveryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
