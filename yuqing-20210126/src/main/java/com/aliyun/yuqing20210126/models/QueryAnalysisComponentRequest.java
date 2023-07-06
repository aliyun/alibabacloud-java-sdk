// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryAnalysisComponentRequest extends TeaModel {
    @NameInMap("analyseType")
    public String analyseType;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("searchCondition")
    public SearchCondition searchCondition;

    @NameInMap("teamHashId")
    public String teamHashId;

    public static QueryAnalysisComponentRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAnalysisComponentRequest self = new QueryAnalysisComponentRequest();
        return TeaModel.build(map, self);
    }

    public QueryAnalysisComponentRequest setAnalyseType(String analyseType) {
        this.analyseType = analyseType;
        return this;
    }
    public String getAnalyseType() {
        return this.analyseType;
    }

    public QueryAnalysisComponentRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAnalysisComponentRequest setSearchCondition(SearchCondition searchCondition) {
        this.searchCondition = searchCondition;
        return this;
    }
    public SearchCondition getSearchCondition() {
        return this.searchCondition;
    }

    public QueryAnalysisComponentRequest setTeamHashId(String teamHashId) {
        this.teamHashId = teamHashId;
        return this;
    }
    public String getTeamHashId() {
        return this.teamHashId;
    }

}
