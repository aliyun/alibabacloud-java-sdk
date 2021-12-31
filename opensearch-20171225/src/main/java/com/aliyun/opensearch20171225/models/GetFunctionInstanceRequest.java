// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetFunctionInstanceRequest extends TeaModel {
    @NameInMap("output")
    public String output;

    public static GetFunctionInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionInstanceRequest self = new GetFunctionInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetFunctionInstanceRequest setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

}
