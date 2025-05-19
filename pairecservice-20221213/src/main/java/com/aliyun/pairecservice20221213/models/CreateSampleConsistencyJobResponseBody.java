// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateSampleConsistencyJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SampleConsistencyJobId")
    public String sampleConsistencyJobId;

    public static CreateSampleConsistencyJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSampleConsistencyJobResponseBody self = new CreateSampleConsistencyJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSampleConsistencyJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSampleConsistencyJobResponseBody setSampleConsistencyJobId(String sampleConsistencyJobId) {
        this.sampleConsistencyJobId = sampleConsistencyJobId;
        return this;
    }
    public String getSampleConsistencyJobId() {
        return this.sampleConsistencyJobId;
    }

}
