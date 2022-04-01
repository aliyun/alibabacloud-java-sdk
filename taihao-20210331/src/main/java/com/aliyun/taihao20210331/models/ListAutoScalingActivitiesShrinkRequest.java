// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListAutoScalingActivitiesShrinkRequest extends TeaModel {
    // listAutoScalingActivitiesParam
    @NameInMap("listAutoScalingActivitiesParam")
    public String listAutoScalingActivitiesParamShrink;

    public static ListAutoScalingActivitiesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingActivitiesShrinkRequest self = new ListAutoScalingActivitiesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingActivitiesShrinkRequest setListAutoScalingActivitiesParamShrink(String listAutoScalingActivitiesParamShrink) {
        this.listAutoScalingActivitiesParamShrink = listAutoScalingActivitiesParamShrink;
        return this;
    }
    public String getListAutoScalingActivitiesParamShrink() {
        return this.listAutoScalingActivitiesParamShrink;
    }

}
