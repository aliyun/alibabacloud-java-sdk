// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CheckVodDefaultRoleRequest extends TeaModel {
    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    public static CheckVodDefaultRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckVodDefaultRoleRequest self = new CheckVodDefaultRoleRequest();
        return TeaModel.build(map, self);
    }

    public CheckVodDefaultRoleRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CheckVodDefaultRoleRequest setResourceRealOwnerId(Long resourceRealOwnerId) {
        this.resourceRealOwnerId = resourceRealOwnerId;
        return this;
    }
    public Long getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

}
