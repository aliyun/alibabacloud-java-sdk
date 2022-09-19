// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class SubmitAnalysisTaskResponseBody extends TeaModel {
    @NameInMap("analysisId")
    public Long analysisId;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultJson")
    public String resultJson;

    public static SubmitAnalysisTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAnalysisTaskResponseBody self = new SubmitAnalysisTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAnalysisTaskResponseBody setAnalysisId(Long analysisId) {
        this.analysisId = analysisId;
        return this;
    }
    public Long getAnalysisId() {
        return this.analysisId;
    }

    public SubmitAnalysisTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitAnalysisTaskResponseBody setResultJson(String resultJson) {
        this.resultJson = resultJson;
        return this;
    }
    public String getResultJson() {
        return this.resultJson;
    }

}
