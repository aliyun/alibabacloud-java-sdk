// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisShelltaskdetailRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    public static GetHasDiagnosisShelltaskdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisShelltaskdetailRequest self = new GetHasDiagnosisShelltaskdetailRequest();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisShelltaskdetailRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

}
