// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListPipelineRunNodeStatusRequest extends TeaModel {
    @NameInMap("Depth")
    public Long depth;

    @NameInMap("Type")
    public String type;

    public static ListPipelineRunNodeStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineRunNodeStatusRequest self = new ListPipelineRunNodeStatusRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelineRunNodeStatusRequest setDepth(Long depth) {
        this.depth = depth;
        return this;
    }
    public Long getDepth() {
        return this.depth;
    }

    public ListPipelineRunNodeStatusRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
