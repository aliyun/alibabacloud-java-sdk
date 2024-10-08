// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class DeleteFilterRequest extends TeaModel {
    /**
     * <p>The name of the filter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("FilterName")
    public String filterName;

    public static DeleteFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFilterRequest self = new DeleteFilterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFilterRequest setFilterName(String filterName) {
        this.filterName = filterName;
        return this;
    }
    public String getFilterName() {
        return this.filterName;
    }

}
