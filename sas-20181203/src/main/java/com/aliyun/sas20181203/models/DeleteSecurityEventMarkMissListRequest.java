// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteSecurityEventMarkMissListRequest extends TeaModel {
    /**
     * <p>The IDs of custom defense rule.</p>
     */
    @NameInMap("Ids")
    public java.util.List<Long> ids;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteSecurityEventMarkMissListRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityEventMarkMissListRequest self = new DeleteSecurityEventMarkMissListRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityEventMarkMissListRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    public DeleteSecurityEventMarkMissListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
