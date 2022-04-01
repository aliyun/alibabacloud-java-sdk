// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class JoinResourceGroupRequest extends TeaModel {
    @NameInMap("joinResourceGroupParam")
    public JoinResourceGroupParam joinResourceGroupParam;

    public static JoinResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        JoinResourceGroupRequest self = new JoinResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public JoinResourceGroupRequest setJoinResourceGroupParam(JoinResourceGroupParam joinResourceGroupParam) {
        this.joinResourceGroupParam = joinResourceGroupParam;
        return this;
    }
    public JoinResourceGroupParam getJoinResourceGroupParam() {
        return this.joinResourceGroupParam;
    }

}
