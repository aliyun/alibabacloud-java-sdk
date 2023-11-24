// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetFunctionResourceRequest extends TeaModel {
    @NameInMap("output")
    public String output;

    public static GetFunctionResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionResourceRequest self = new GetFunctionResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetFunctionResourceRequest setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

}
