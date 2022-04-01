// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeleteAutoScalingPolicyRequest extends TeaModel {
    // deleteAutoScalingPolicyParam
    @NameInMap("deleteAutoScalingPolicyParam")
    public DeleteAutoScalingPolicyParam deleteAutoScalingPolicyParam;

    public static DeleteAutoScalingPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoScalingPolicyRequest self = new DeleteAutoScalingPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAutoScalingPolicyRequest setDeleteAutoScalingPolicyParam(DeleteAutoScalingPolicyParam deleteAutoScalingPolicyParam) {
        this.deleteAutoScalingPolicyParam = deleteAutoScalingPolicyParam;
        return this;
    }
    public DeleteAutoScalingPolicyParam getDeleteAutoScalingPolicyParam() {
        return this.deleteAutoScalingPolicyParam;
    }

}
