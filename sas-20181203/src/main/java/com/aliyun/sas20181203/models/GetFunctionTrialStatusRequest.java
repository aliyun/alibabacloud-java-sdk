// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFunctionTrialStatusRequest extends TeaModel {
    /**
     * <p>The name of the function module.</p>
     * 
     * <strong>example:</strong>
     * <p>trail_file_detect_api_reward</p>
     */
    @NameInMap("FunctionName")
    public String functionName;

    public static GetFunctionTrialStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionTrialStatusRequest self = new GetFunctionTrialStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetFunctionTrialStatusRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

}
