// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class SubmitAnalysisTaskRequest extends TeaModel {
    @NameInMap("analyseType")
    public String analyseType;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("searchCondition")
    public SearchCondition searchCondition;

    @NameInMap("teamHashId")
    public String teamHashId;

    public static SubmitAnalysisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAnalysisTaskRequest self = new SubmitAnalysisTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAnalysisTaskRequest setAnalyseType(String analyseType) {
        this.analyseType = analyseType;
        return this;
    }
    public String getAnalyseType() {
        return this.analyseType;
    }

    public SubmitAnalysisTaskRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitAnalysisTaskRequest setSearchCondition(SearchCondition searchCondition) {
        this.searchCondition = searchCondition;
        return this;
    }
    public SearchCondition getSearchCondition() {
        return this.searchCondition;
    }

    public SubmitAnalysisTaskRequest setTeamHashId(String teamHashId) {
        this.teamHashId = teamHashId;
        return this;
    }
    public String getTeamHashId() {
        return this.teamHashId;
    }

}
