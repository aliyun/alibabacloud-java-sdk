// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisPodtaskdetailRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    public static GetHasDiagnosisPodtaskdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisPodtaskdetailRequest self = new GetHasDiagnosisPodtaskdetailRequest();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisPodtaskdetailRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

}
