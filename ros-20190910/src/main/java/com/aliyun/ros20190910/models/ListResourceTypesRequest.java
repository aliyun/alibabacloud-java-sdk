// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListResourceTypesRequest extends TeaModel {
    /**
     * <p>The entity type. Valid values:</p>
     * <br>
     * <p>*   All: all resource types.</p>
     * <p>*   Resource: resources other than DataSource resources. For more information, see [Resources](~~28863~~).</p>
     * <p>*   DataSource: DataSource resources.</p>
     */
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
