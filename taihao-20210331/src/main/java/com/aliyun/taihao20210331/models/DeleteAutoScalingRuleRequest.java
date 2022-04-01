// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeleteAutoScalingRuleRequest extends TeaModel {
    // deleteAutoScalingRuleParam
    @NameInMap("deleteAutoScalingRuleParam")
    public DeleteAutoScalingRuleParam deleteAutoScalingRuleParam;

    public static DeleteAutoScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoScalingRuleRequest self = new DeleteAutoScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAutoScalingRuleRequest setDeleteAutoScalingRuleParam(DeleteAutoScalingRuleParam deleteAutoScalingRuleParam) {
        this.deleteAutoScalingRuleParam = deleteAutoScalingRuleParam;
        return this;
    }
    public DeleteAutoScalingRuleParam getDeleteAutoScalingRuleParam() {
        return this.deleteAutoScalingRuleParam;
    }

}
