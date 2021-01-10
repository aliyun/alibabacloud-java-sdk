// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsRulesGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsRulesGroupsResponseBodyResponse response;

    public static QueryRmsRulesGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsRulesGroupsResponseBody self = new QueryRmsRulesGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsRulesGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsRulesGroupsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsRulesGroupsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsRulesGroupsResponseBody setResponse(QueryRmsRulesGroupsResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsRulesGroupsResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsRulesGroupsResponseBodyResponseEntityData extends TeaModel {
        @NameInMap("RuleGroupName")
        public String ruleGroupName;

        @NameInMap("RuleType")
        public String ruleType;

        public static QueryRmsRulesGroupsResponseBodyResponseEntityData build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsRulesGroupsResponseBodyResponseEntityData self = new QueryRmsRulesGroupsResponseBodyResponseEntityData();
            return TeaModel.build(map, self);
        }

        public QueryRmsRulesGroupsResponseBodyResponseEntityData setRuleGroupName(String ruleGroupName) {
            this.ruleGroupName = ruleGroupName;
            return this;
        }
        public String getRuleGroupName() {
            return this.ruleGroupName;
        }

        public QueryRmsRulesGroupsResponseBodyResponseEntityData setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

    }

    public static class QueryRmsRulesGroupsResponseBodyResponseEntity extends TeaModel {
        @NameInMap("Data")
        public java.util.List<QueryRmsRulesGroupsResponseBodyResponseEntityData> data;

        public static QueryRmsRulesGroupsResponseBodyResponseEntity build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsRulesGroupsResponseBodyResponseEntity self = new QueryRmsRulesGroupsResponseBodyResponseEntity();
            return TeaModel.build(map, self);
        }

        public QueryRmsRulesGroupsResponseBodyResponseEntity setData(java.util.List<QueryRmsRulesGroupsResponseBodyResponseEntityData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryRmsRulesGroupsResponseBodyResponseEntityData> getData() {
            return this.data;
        }

    }

    public static class QueryRmsRulesGroupsResponseBodyResponse extends TeaModel {
        @NameInMap("Layer")
        public String layer;

        @NameInMap("Entity")
        public QueryRmsRulesGroupsResponseBodyResponseEntity entity;

        public static QueryRmsRulesGroupsResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsRulesGroupsResponseBodyResponse self = new QueryRmsRulesGroupsResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsRulesGroupsResponseBodyResponse setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public QueryRmsRulesGroupsResponseBodyResponse setEntity(QueryRmsRulesGroupsResponseBodyResponseEntity entity) {
            this.entity = entity;
            return this;
        }
        public QueryRmsRulesGroupsResponseBodyResponseEntity getEntity() {
            return this.entity;
        }

    }

}
