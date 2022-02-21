// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StartParentPlatformRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static StartParentPlatformRequest build(java.util.Map<String, ?> map) throws Exception {
        StartParentPlatformRequest self = new StartParentPlatformRequest();
        return TeaModel.build(map, self);
    }

    public StartParentPlatformRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public StartParentPlatformRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
