// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class AggregateSearchYuqingRequest extends TeaModel {
    @NameInMap("aggregateFunction")
    public String aggregateFunction;

    @NameInMap("groupByKey")
    public String groupByKey;

    @NameInMap("groupLimits")
    public Long groupLimits;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("searchCondition")
    public SearchCondition searchCondition;

    @NameInMap("teamHashId")
    public String teamHashId;

    public static AggregateSearchYuqingRequest build(java.util.Map<String, ?> map) throws Exception {
        AggregateSearchYuqingRequest self = new AggregateSearchYuqingRequest();
        return TeaModel.build(map, self);
    }

    public AggregateSearchYuqingRequest setAggregateFunction(String aggregateFunction) {
        this.aggregateFunction = aggregateFunction;
        return this;
    }
    public String getAggregateFunction() {
        return this.aggregateFunction;
    }

    public AggregateSearchYuqingRequest setGroupByKey(String groupByKey) {
        this.groupByKey = groupByKey;
        return this;
    }
    public String getGroupByKey() {
        return this.groupByKey;
    }

    public AggregateSearchYuqingRequest setGroupLimits(Long groupLimits) {
        this.groupLimits = groupLimits;
        return this;
    }
    public Long getGroupLimits() {
        return this.groupLimits;
    }

    public AggregateSearchYuqingRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AggregateSearchYuqingRequest setSearchCondition(SearchCondition searchCondition) {
        this.searchCondition = searchCondition;
        return this;
    }
    public SearchCondition getSearchCondition() {
        return this.searchCondition;
    }

    public AggregateSearchYuqingRequest setTeamHashId(String teamHashId) {
        this.teamHashId = teamHashId;
        return this;
    }
    public String getTeamHashId() {
        return this.teamHashId;
    }

}
