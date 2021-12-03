// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class OpenPrivateLinkServiceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static OpenPrivateLinkServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenPrivateLinkServiceRequest self = new OpenPrivateLinkServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenPrivateLinkServiceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
