// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class GetAnalysisComponentResultResponseBody extends TeaModel {
    // 任务Id
    @NameInMap("analysisId")
    public Long analysisId;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // 任务结果json。参考opinion.analysis.component.query的result_json
    @NameInMap("resultJson")
    public String resultJson;

    public static GetAnalysisComponentResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAnalysisComponentResultResponseBody self = new GetAnalysisComponentResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAnalysisComponentResultResponseBody setAnalysisId(Long analysisId) {
        this.analysisId = analysisId;
        return this;
    }
    public Long getAnalysisId() {
        return this.analysisId;
    }

    public GetAnalysisComponentResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAnalysisComponentResultResponseBody setResultJson(String resultJson) {
        this.resultJson = resultJson;
        return this;
    }
    public String getResultJson() {
        return this.resultJson;
    }

}
