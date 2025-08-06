// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddFilterConfigsRequest extends TeaModel {
    @NameInMap("FilterName")
    public String filterName;

    @NameInMap("ItemConfigs")
    public String itemConfigs;

    @NameInMap("Type")
    public String type;

    public static AddFilterConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFilterConfigsRequest self = new AddFilterConfigsRequest();
        return TeaModel.build(map, self);
    }

    public AddFilterConfigsRequest setFilterName(String filterName) {
        this.filterName = filterName;
        return this;
    }
    public String getFilterName() {
        return this.filterName;
    }

    public AddFilterConfigsRequest setItemConfigs(String itemConfigs) {
        this.itemConfigs = itemConfigs;
        return this;
    }
    public String getItemConfigs() {
        return this.itemConfigs;
    }

    public AddFilterConfigsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
