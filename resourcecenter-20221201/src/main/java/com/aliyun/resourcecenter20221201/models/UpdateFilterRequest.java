// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class UpdateFilterRequest extends TeaModel {
    @NameInMap("FilterConfiguration")
    public String filterConfiguration;

    @NameInMap("FilterName")
    public String filterName;

    public static UpdateFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFilterRequest self = new UpdateFilterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFilterRequest setFilterConfiguration(String filterConfiguration) {
        this.filterConfiguration = filterConfiguration;
        return this;
    }
    public String getFilterConfiguration() {
        return this.filterConfiguration;
    }

    public UpdateFilterRequest setFilterName(String filterName) {
        this.filterName = filterName;
        return this;
    }
    public String getFilterName() {
        return this.filterName;
    }

}
