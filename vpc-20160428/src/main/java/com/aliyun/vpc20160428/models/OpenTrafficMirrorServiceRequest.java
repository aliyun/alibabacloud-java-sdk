// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class OpenTrafficMirrorServiceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static OpenTrafficMirrorServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenTrafficMirrorServiceRequest self = new OpenTrafficMirrorServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenTrafficMirrorServiceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
