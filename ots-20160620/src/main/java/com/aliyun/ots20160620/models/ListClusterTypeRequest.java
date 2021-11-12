// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class ListClusterTypeRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ListClusterTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterTypeRequest self = new ListClusterTypeRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterTypeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
