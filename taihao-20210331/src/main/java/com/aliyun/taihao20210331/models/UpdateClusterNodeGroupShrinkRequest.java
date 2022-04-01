// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateClusterNodeGroupShrinkRequest extends TeaModel {
    // updateClusterNodeGroupParam
    @NameInMap("updateClusterNodeGroupParam")
    public String updateClusterNodeGroupParamShrink;

    public static UpdateClusterNodeGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterNodeGroupShrinkRequest self = new UpdateClusterNodeGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClusterNodeGroupShrinkRequest setUpdateClusterNodeGroupParamShrink(String updateClusterNodeGroupParamShrink) {
        this.updateClusterNodeGroupParamShrink = updateClusterNodeGroupParamShrink;
        return this;
    }
    public String getUpdateClusterNodeGroupParamShrink() {
        return this.updateClusterNodeGroupParamShrink;
    }

}
