// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListResourceTypesRequest extends TeaModel {
    @NameInMap("EntityType")
    public String entityType;

    public static ListResourceTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTypesRequest self = new ListResourceTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceTypesRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

}
