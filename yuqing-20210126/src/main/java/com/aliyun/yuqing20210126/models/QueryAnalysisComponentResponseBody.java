// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryAnalysisComponentResponseBody extends TeaModel {
    // 分析任务Id，用于查询这个任务对应的结果。如果是快速完成类型的分析，会直接返回结果。如果无结果返回，业务方可以根据这个id轮询查询结果。
    @NameInMap("analysisId")
    public Long analysisId;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // 分析任务返回的结果json字符串，不同分析任务返回的json格式不一样。
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
