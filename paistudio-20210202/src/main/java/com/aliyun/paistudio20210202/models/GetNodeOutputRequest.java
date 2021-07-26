// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetNodeOutputRequest extends TeaModel {
    @NameInMap("OutputIndex")
    public String outputIndex;

    public static GetNodeOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodeOutputRequest self = new GetNodeOutputRequest();
        return TeaModel.build(map, self);
    }

    public GetNodeOutputRequest setOutputIndex(String outputIndex) {
        this.outputIndex = outputIndex;
        return this;
    }
    public String getOutputIndex() {
        return this.outputIndex;
    }

}
