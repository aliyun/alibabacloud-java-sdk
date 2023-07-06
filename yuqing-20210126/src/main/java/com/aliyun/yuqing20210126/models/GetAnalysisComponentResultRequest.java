// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class GetAnalysisComponentResultRequest extends TeaModel {
    @NameInMap("analysisId")
    public Long analysisId;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("teamHashId")
    public String teamHashId;

    public static GetAnalysisComponentResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAnalysisComponentResultRequest self = new GetAnalysisComponentResultRequest();
        return TeaModel.build(map, self);
    }

    public GetAnalysisComponentResultRequest setAnalysisId(Long analysisId) {
        this.analysisId = analysisId;
        return this;
    }
    public Long getAnalysisId() {
        return this.analysisId;
    }

    public GetAnalysisComponentResultRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAnalysisComponentResultRequest setTeamHashId(String teamHashId) {
        this.teamHashId = teamHashId;
        return this;
    }
    public String getTeamHashId() {
        return this.teamHashId;
    }

}
