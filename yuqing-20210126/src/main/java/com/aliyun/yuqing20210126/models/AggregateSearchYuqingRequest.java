// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class AggregateSearchYuqingRequest extends TeaModel {
    // 聚合函数
    @NameInMap("aggregateFunction")
    public String aggregateFunction;

    // 聚合字段名字,枚举值
    @NameInMap("groupByKey")
    public String groupByKey;

    // 聚合结果条数
    @NameInMap("groupLimits")
    public Long groupLimits;

    // 请求id
    @NameInMap("requestId")
    public String requestId;

    // 查询舆情条件
    @NameInMap("searchCondition")
    public SearchCondition searchCondition;

    // 舆情团队HashId
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
