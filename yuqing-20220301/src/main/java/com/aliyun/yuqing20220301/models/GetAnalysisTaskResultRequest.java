// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class GetAnalysisTaskResultRequest extends TeaModel {
    @NameInMap("analysisId")
    public String analysisId;

    // A short description of struct
    @NameInMap("requestId")
    public String requestId;

    public static GetAnalysisTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAnalysisTaskResultRequest self = new GetAnalysisTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public GetAnalysisTaskResultRequest setAnalysisId(String analysisId) {
        this.analysisId = analysisId;
        return this;
    }
    public String getAnalysisId() {
        return this.analysisId;
    }

    public GetAnalysisTaskResultRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
