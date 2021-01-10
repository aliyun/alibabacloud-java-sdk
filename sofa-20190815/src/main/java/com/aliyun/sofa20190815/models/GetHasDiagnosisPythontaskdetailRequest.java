// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisPythontaskdetailRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    public static GetHasDiagnosisPythontaskdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisPythontaskdetailRequest self = new GetHasDiagnosisPythontaskdetailRequest();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisPythontaskdetailRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

}
