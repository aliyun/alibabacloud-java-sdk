// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class GetOtsServiceStatusRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static GetOtsServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOtsServiceStatusRequest self = new GetOtsServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetOtsServiceStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
