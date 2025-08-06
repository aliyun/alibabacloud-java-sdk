// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetIntelligentStrategyResponseBody extends TeaModel {
    @NameInMap("IntelligentStrategy")
    public GetIntelligentStrategyResponseBodyIntelligentStrategy intelligentStrategy;

    @NameInMap("RequestId")
    public String requestId;

    public static GetIntelligentStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIntelligentStrategyResponseBody self = new GetIntelligentStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIntelligentStrategyResponseBody setIntelligentStrategy(GetIntelligentStrategyResponseBodyIntelligentStrategy intelligentStrategy) {
        this.intelligentStrategy = intelligentStrategy;
        return this;
    }
    public GetIntelligentStrategyResponseBodyIntelligentStrategy getIntelligentStrategy() {
        return this.intelligentStrategy;
    }

    public GetIntelligentStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIntelligentStrategyResponseBodyIntelligentStrategy extends TeaModel {
        @NameInMap("Conditions")
        public String conditions;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ExecuteParams")
        public String executeParams;

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

        public static GetIntelligentStrategyResponseBodyIntelligentStrategy build(java.util.Map<String, ?> map) throws Exception {
            GetIntelligentStrategyResponseBodyIntelligentStrategy self = new GetIntelligentStrategyResponseBodyIntelligentStrategy();
            return TeaModel.build(map, self);
        }

        public GetIntelligentStrategyResponseBodyIntelligentStrategy setConditions(String conditions) {
            this.conditions = conditions;
            return this;
        }
        public String getConditions() {
            return this.conditions;
        }

        public GetIntelligentStrategyResponseBodyIntelligentStrategy setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetIntelligentStrategyResponseBodyIntelligentStrategy setExecuteParams(String executeParams) {
            this.executeParams = executeParams;
            return this;
        }
        public String getExecuteParams() {
            return this.executeParams;
        }

        public GetIntelligentStrategyResponseBodyIntelligentStrategy setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetIntelligentStrategyResponseBodyIntelligentStrategy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetIntelligentStrategyResponseBodyIntelligentStrategy setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetIntelligentStrategyResponseBodyIntelligentStrategy setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetIntelligentStrategyResponseBodyIntelligentStrategy setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetIntelligentStrategyResponseBodyIntelligentStrategy setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public GetIntelligentStrategyResponseBodyIntelligentStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
