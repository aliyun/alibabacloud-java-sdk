// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class GetPipelineRunNodeRequest extends TeaModel {
    @NameInMap("Depth")
    public Integer depth;

    @NameInMap("Type")
    public String type;

    public static GetPipelineRunNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineRunNodeRequest self = new GetPipelineRunNodeRequest();
        return TeaModel.build(map, self);
    }

    public GetPipelineRunNodeRequest setDepth(Integer depth) {
        this.depth = depth;
        return this;
    }
    public Integer getDepth() {
        return this.depth;
    }

    public GetPipelineRunNodeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
