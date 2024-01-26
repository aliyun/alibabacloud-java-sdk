// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.status20200117.models;

import com.aliyun.tea.*;

public class ListEventInProgressShrinkRequest extends TeaModel {
    @NameInMap("RegionIds")
    public String regionIdsShrink;

    public static ListEventInProgressShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventInProgressShrinkRequest self = new ListEventInProgressShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListEventInProgressShrinkRequest setRegionIdsShrink(String regionIdsShrink) {
        this.regionIdsShrink = regionIdsShrink;
        return this;
    }
    public String getRegionIdsShrink() {
        return this.regionIdsShrink;
    }

}
