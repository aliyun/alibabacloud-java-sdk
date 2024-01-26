// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.status20200117.models;

import com.aliyun.tea.*;

public class ListEventInProgressRequest extends TeaModel {
    @NameInMap("RegionIds")
    public java.util.List<String> regionIds;

    public static ListEventInProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventInProgressRequest self = new ListEventInProgressRequest();
        return TeaModel.build(map, self);
    }

    public ListEventInProgressRequest setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

}
