// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateCalculationJobsResponseBody extends TeaModel {
    @NameInMap("CalculationJobIds")
    public java.util.List<String> calculationJobIds;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateCalculationJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCalculationJobsResponseBody self = new CreateCalculationJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCalculationJobsResponseBody setCalculationJobIds(java.util.List<String> calculationJobIds) {
        this.calculationJobIds = calculationJobIds;
        return this;
    }
    public java.util.List<String> getCalculationJobIds() {
        return this.calculationJobIds;
    }

    public CreateCalculationJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
