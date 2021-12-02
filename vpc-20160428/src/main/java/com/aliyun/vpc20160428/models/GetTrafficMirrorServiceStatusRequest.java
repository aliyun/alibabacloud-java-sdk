// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetTrafficMirrorServiceStatusRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static GetTrafficMirrorServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrafficMirrorServiceStatusRequest self = new GetTrafficMirrorServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetTrafficMirrorServiceStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
