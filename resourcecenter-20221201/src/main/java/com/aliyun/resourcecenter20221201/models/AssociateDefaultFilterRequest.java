// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class AssociateDefaultFilterRequest extends TeaModel {
    @NameInMap("FilterName")
    public String filterName;

    public static AssociateDefaultFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateDefaultFilterRequest self = new AssociateDefaultFilterRequest();
        return TeaModel.build(map, self);
    }

    public AssociateDefaultFilterRequest setFilterName(String filterName) {
        this.filterName = filterName;
        return this;
    }
    public String getFilterName() {
        return this.filterName;
    }

}
