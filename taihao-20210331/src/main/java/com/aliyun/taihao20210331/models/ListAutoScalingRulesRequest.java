// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListAutoScalingRulesRequest extends TeaModel {
    // listAutoScalingRulesParam
    @NameInMap("listAutoScalingRulesParam")
    public ListAutoScalingRulesParam listAutoScalingRulesParam;

    public static ListAutoScalingRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingRulesRequest self = new ListAutoScalingRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingRulesRequest setListAutoScalingRulesParam(ListAutoScalingRulesParam listAutoScalingRulesParam) {
        this.listAutoScalingRulesParam = listAutoScalingRulesParam;
        return this;
    }
    public ListAutoScalingRulesParam getListAutoScalingRulesParam() {
        return this.listAutoScalingRulesParam;
    }

}
