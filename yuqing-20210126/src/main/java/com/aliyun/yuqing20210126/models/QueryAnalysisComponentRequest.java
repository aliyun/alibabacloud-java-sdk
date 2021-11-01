// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryAnalysisComponentRequest extends TeaModel {
    // 分析任务类型名称，具体可以填写的值可以在舆情平台查看
    @NameInMap("analyseType")
    public String analyseType;

    // 请求id
    @NameInMap("requestId")
    public String requestId;

    // 搜索舆情条件
    @NameInMap("searchCondition")
    public SearchCondition searchCondition;

    // 舆情团队HashId
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
