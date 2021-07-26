// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetNodeInputSchemaRequest extends TeaModel {
    @NameInMap("InputId")
    public String inputId;

    @NameInMap("InputIndex")
    public Integer inputIndex;

    public static GetNodeInputSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodeInputSchemaRequest self = new GetNodeInputSchemaRequest();
        return TeaModel.build(map, self);
    }

    public GetNodeInputSchemaRequest setInputId(String inputId) {
        this.inputId = inputId;
        return this;
    }
    public String getInputId() {
        return this.inputId;
    }

    public GetNodeInputSchemaRequest setInputIndex(Integer inputIndex) {
        this.inputIndex = inputIndex;
        return this;
    }
    public Integer getInputIndex() {
        return this.inputIndex;
    }

}
