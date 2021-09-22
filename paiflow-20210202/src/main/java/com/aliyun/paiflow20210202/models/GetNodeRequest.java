// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class GetNodeRequest extends TeaModel {
    @NameInMap("Depth")
    public Integer depth;

    public static GetNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodeRequest self = new GetNodeRequest();
        return TeaModel.build(map, self);
    }

    public GetNodeRequest setDepth(Integer depth) {
        this.depth = depth;
        return this;
    }
    public Integer getDepth() {
        return this.depth;
    }

}
