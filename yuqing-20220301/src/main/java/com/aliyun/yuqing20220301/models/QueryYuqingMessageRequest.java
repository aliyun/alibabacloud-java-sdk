// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class QueryYuqingMessageRequest extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("searchCondition")
    public SearchCondition searchCondition;

    @NameInMap("teamHashId")
    public String teamHashId;

    public static QueryYuqingMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryYuqingMessageRequest self = new QueryYuqingMessageRequest();
        return TeaModel.build(map, self);
    }

    public QueryYuqingMessageRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryYuqingMessageRequest setSearchCondition(SearchCondition searchCondition) {
        this.searchCondition = searchCondition;
        return this;
    }
    public SearchCondition getSearchCondition() {
        return this.searchCondition;
    }

    public QueryYuqingMessageRequest setTeamHashId(String teamHashId) {
        this.teamHashId = teamHashId;
        return this;
    }
    public String getTeamHashId() {
        return this.teamHashId;
    }

}
