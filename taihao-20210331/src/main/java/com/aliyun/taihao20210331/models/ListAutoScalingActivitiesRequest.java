// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListAutoScalingActivitiesRequest extends TeaModel {
    // listAutoScalingActivitiesParam
    @NameInMap("listAutoScalingActivitiesParam")
    public ListAutoScalingActivitiesParam listAutoScalingActivitiesParam;

    public static ListAutoScalingActivitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingActivitiesRequest self = new ListAutoScalingActivitiesRequest();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingActivitiesRequest setListAutoScalingActivitiesParam(ListAutoScalingActivitiesParam listAutoScalingActivitiesParam) {
        this.listAutoScalingActivitiesParam = listAutoScalingActivitiesParam;
        return this;
    }
    public ListAutoScalingActivitiesParam getListAutoScalingActivitiesParam() {
        return this.listAutoScalingActivitiesParam;
    }

}
