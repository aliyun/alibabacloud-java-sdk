// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryAnalysisComponentResponseBody extends TeaModel {
    @NameInMap("analysisId")
    public Long analysisId;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultJson")
    public String resultJson;

    public static QueryAnalysisComponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAnalysisComponentResponseBody self = new QueryAnalysisComponentResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAnalysisComponentResponseBody setAnalysisId(Long analysisId) {
        this.analysisId = analysisId;
        return this;
    }
    public Long getAnalysisId() {
        return this.analysisId;
    }

    public QueryAnalysisComponentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAnalysisComponentResponseBody setResultJson(String resultJson) {
        this.resultJson = resultJson;
        return this;
    }
    public String getResultJson() {
        return this.resultJson;
    }

}
