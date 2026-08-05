// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class GetFunctionInstanceRequest extends TeaModel {
    /**
     * <p>Controls the richness of the returned information. Valid values:</p>
     * <ul>
     * <li>simple: displays only basic information.</li>
     * <li>normal: displays information such as createParameters and cron. This is the default value.</li>
     * <li>detail: returns training task information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
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
