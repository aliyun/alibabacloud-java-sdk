// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class GetAnalysisTaskResultRequest extends TeaModel {
    @NameInMap("analysisId")
    public Long analysisId;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("teamHashId")
    public String teamHashId;

    public static GetAnalysisTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAnalysisTaskResultRequest self = new GetAnalysisTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public GetAnalysisTaskResultRequest setAnalysisId(Long analysisId) {
        this.analysisId = analysisId;
        return this;
    }
    public Long getAnalysisId() {
        return this.analysisId;
    }

    public GetAnalysisTaskResultRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAnalysisTaskResultRequest setTeamHashId(String teamHashId) {
        this.teamHashId = teamHashId;
        return this;
    }
    public String getTeamHashId() {
        return this.teamHashId;
    }

}
