// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class JoinResourceGroupShrinkRequest extends TeaModel {
    @NameInMap("joinResourceGroupParam")
    public String joinResourceGroupParamShrink;

    public static JoinResourceGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        JoinResourceGroupShrinkRequest self = new JoinResourceGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public JoinResourceGroupShrinkRequest setJoinResourceGroupParamShrink(String joinResourceGroupParamShrink) {
        this.joinResourceGroupParamShrink = joinResourceGroupParamShrink;
        return this;
    }
    public String getJoinResourceGroupParamShrink() {
        return this.joinResourceGroupParamShrink;
    }

}
