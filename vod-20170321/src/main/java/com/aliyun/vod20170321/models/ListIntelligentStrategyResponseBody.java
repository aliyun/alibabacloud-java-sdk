// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListIntelligentStrategyResponseBody extends TeaModel {
    @NameInMap("IntelligentStrategyList")
    public java.util.List<ListIntelligentStrategyResponseBodyIntelligentStrategyList> intelligentStrategyList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    public static ListIntelligentStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIntelligentStrategyResponseBody self = new ListIntelligentStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIntelligentStrategyResponseBody setIntelligentStrategyList(java.util.List<ListIntelligentStrategyResponseBodyIntelligentStrategyList> intelligentStrategyList) {
        this.intelligentStrategyList = intelligentStrategyList;
        return this;
    }
    public java.util.List<ListIntelligentStrategyResponseBodyIntelligentStrategyList> getIntelligentStrategyList() {
        return this.intelligentStrategyList;
    }

    public ListIntelligentStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIntelligentStrategyResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListIntelligentStrategyResponseBodyIntelligentStrategyList extends TeaModel {
        @NameInMap("Conditions")
        public String conditions;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ExecuteParams")
        public String executeParams;

        @NameInMap("MatchLimit")
        public Long matchLimit;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("State")
        public String state;

        @NameInMap("StrategyId")
        public String strategyId;

        @NameInMap("Type")
        public String type;

        public static ListIntelligentStrategyResponseBodyIntelligentStrategyList build(java.util.Map<String, ?> map) throws Exception {
            ListIntelligentStrategyResponseBodyIntelligentStrategyList self = new ListIntelligentStrategyResponseBodyIntelligentStrategyList();
            return TeaModel.build(map, self);
        }

        public ListIntelligentStrategyResponseBodyIntelligentStrategyList setConditions(String conditions) {
            this.conditions = conditions;
            return this;
        }
        public String getConditions() {
            return this.conditions;
        }

        public ListIntelligentStrategyResponseBodyIntelligentStrategyList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListIntelligentStrategyResponseBodyIntelligentStrategyList setExecuteParams(String executeParams) {
            this.executeParams = executeParams;
            return this;
        }
        public String getExecuteParams() {
            return this.executeParams;
        }

        public ListIntelligentStrategyResponseBodyIntelligentStrategyList setMatchLimit(Long matchLimit) {
            this.matchLimit = matchLimit;
            return this;
        }
        public Long getMatchLimit() {
            return this.matchLimit;
        }

        public ListIntelligentStrategyResponseBodyIntelligentStrategyList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListIntelligentStrategyResponseBodyIntelligentStrategyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIntelligentStrategyResponseBodyIntelligentStrategyList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListIntelligentStrategyResponseBodyIntelligentStrategyList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListIntelligentStrategyResponseBodyIntelligentStrategyList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListIntelligentStrategyResponseBodyIntelligentStrategyList setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public ListIntelligentStrategyResponseBodyIntelligentStrategyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
