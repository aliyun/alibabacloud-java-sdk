// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetFunctionInstanceRequest extends TeaModel {
    /**
     * <p>Specifies the richness of returned information. Valid values:</p>
     * <br>
     * <p>*   simple: displays only the basic information.</p>
     * <p>*   normal: displays information such as createParameters and cron. This is the default value.</p>
     * <p>*   detail: returns the details of the training task.</p>
     */
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
