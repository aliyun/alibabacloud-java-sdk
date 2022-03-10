// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetForeignIdByCMSIdRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserId")
    public Long userId;

    public static GetForeignIdByCMSIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetForeignIdByCMSIdRequest self = new GetForeignIdByCMSIdRequest();
        return TeaModel.build(map, self);
    }

    public GetForeignIdByCMSIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetForeignIdByCMSIdRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
