// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListAutoScalingPoliciesRequest extends TeaModel {
    // listAutoScalingPoliciesParam
    @NameInMap("listAutoScalingPoliciesParam")
    public ListAutoScalingPoliciesParam listAutoScalingPoliciesParam;

    public static ListAutoScalingPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingPoliciesRequest self = new ListAutoScalingPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingPoliciesRequest setListAutoScalingPoliciesParam(ListAutoScalingPoliciesParam listAutoScalingPoliciesParam) {
        this.listAutoScalingPoliciesParam = listAutoScalingPoliciesParam;
        return this;
    }
    public ListAutoScalingPoliciesParam getListAutoScalingPoliciesParam() {
        return this.listAutoScalingPoliciesParam;
    }

}
