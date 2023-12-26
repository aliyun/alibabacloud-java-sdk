// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class CreateFilterRequest extends TeaModel {
    @NameInMap("FilterConfiguration")
    public String filterConfiguration;

    @NameInMap("FilterName")
    public String filterName;

    public static CreateFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFilterRequest self = new CreateFilterRequest();
        return TeaModel.build(map, self);
    }

    public CreateFilterRequest setFilterConfiguration(String filterConfiguration) {
        this.filterConfiguration = filterConfiguration;
        return this;
    }
    public String getFilterConfiguration() {
        return this.filterConfiguration;
    }

    public CreateFilterRequest setFilterName(String filterName) {
        this.filterName = filterName;
        return this;
    }
    public String getFilterName() {
        return this.filterName;
    }

}
