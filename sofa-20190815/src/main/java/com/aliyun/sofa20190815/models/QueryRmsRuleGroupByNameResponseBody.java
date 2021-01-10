// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsRuleGroupByNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsRuleGroupByNameResponseBodyResponse response;

    public static QueryRmsRuleGroupByNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsRuleGroupByNameResponseBody self = new QueryRmsRuleGroupByNameResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsRuleGroupByNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsRuleGroupByNameResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsRuleGroupByNameResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsRuleGroupByNameResponseBody setResponse(QueryRmsRuleGroupByNameResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsRuleGroupByNameResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsRuleGroupByNameResponseBodyResponseEntityData extends TeaModel {
        @NameInMap("MonitorItemType")
        public String monitorItemType;

        @NameInMap("MonitorOptionKey")
        public String monitorOptionKey;

        @NameInMap("MonitorPort")
        public Long monitorPort;

        @NameInMap("StatisticalMethod")
        public String statisticalMethod;

        @NameInMap("StatisticalPeriod")
        public Long statisticalPeriod;

        @NameInMap("TriggerCountThreshold")
        public String triggerCountThreshold;

        @NameInMap("TriggerOperator")
        public String triggerOperator;

        @NameInMap("TriggerValueThreshold")
        public Long triggerValueThreshold;

        public static QueryRmsRuleGroupByNameResponseBodyResponseEntityData build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsRuleGroupByNameResponseBodyResponseEntityData self = new QueryRmsRuleGroupByNameResponseBodyResponseEntityData();
            return TeaModel.build(map, self);
        }

        public QueryRmsRuleGroupByNameResponseBodyResponseEntityData setMonitorItemType(String monitorItemType) {
            this.monitorItemType = monitorItemType;
            return this;
        }
        public String getMonitorItemType() {
            return this.monitorItemType;
        }

        public QueryRmsRuleGroupByNameResponseBodyResponseEntityData setMonitorOptionKey(String monitorOptionKey) {
            this.monitorOptionKey = monitorOptionKey;
            return this;
        }
        public String getMonitorOptionKey() {
            return this.monitorOptionKey;
        }

        public QueryRmsRuleGroupByNameResponseBodyResponseEntityData setMonitorPort(Long monitorPort) {
            this.monitorPort = monitorPort;
            return this;
        }
        public Long getMonitorPort() {
            return this.monitorPort;
        }

        public QueryRmsRuleGroupByNameResponseBodyResponseEntityData setStatisticalMethod(String statisticalMethod) {
            this.statisticalMethod = statisticalMethod;
            return this;
        }
        public String getStatisticalMethod() {
            return this.statisticalMethod;
        }

        public QueryRmsRuleGroupByNameResponseBodyResponseEntityData setStatisticalPeriod(Long statisticalPeriod) {
            this.statisticalPeriod = statisticalPeriod;
            return this;
        }
        public Long getStatisticalPeriod() {
            return this.statisticalPeriod;
        }

        public QueryRmsRuleGroupByNameResponseBodyResponseEntityData setTriggerCountThreshold(String triggerCountThreshold) {
            this.triggerCountThreshold = triggerCountThreshold;
            return this;
        }
        public String getTriggerCountThreshold() {
            return this.triggerCountThreshold;
        }

        public QueryRmsRuleGroupByNameResponseBodyResponseEntityData setTriggerOperator(String triggerOperator) {
            this.triggerOperator = triggerOperator;
            return this;
        }
        public String getTriggerOperator() {
            return this.triggerOperator;
        }

        public QueryRmsRuleGroupByNameResponseBodyResponseEntityData setTriggerValueThreshold(Long triggerValueThreshold) {
            this.triggerValueThreshold = triggerValueThreshold;
            return this;
        }
        public Long getTriggerValueThreshold() {
            return this.triggerValueThreshold;
        }

    }

    public static class QueryRmsRuleGroupByNameResponseBodyResponseEntity extends TeaModel {
        @NameInMap("Data")
        public java.util.List<QueryRmsRuleGroupByNameResponseBodyResponseEntityData> data;

        public static QueryRmsRuleGroupByNameResponseBodyResponseEntity build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsRuleGroupByNameResponseBodyResponseEntity self = new QueryRmsRuleGroupByNameResponseBodyResponseEntity();
            return TeaModel.build(map, self);
        }

        public QueryRmsRuleGroupByNameResponseBodyResponseEntity setData(java.util.List<QueryRmsRuleGroupByNameResponseBodyResponseEntityData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryRmsRuleGroupByNameResponseBodyResponseEntityData> getData() {
            return this.data;
        }

    }

    public static class QueryRmsRuleGroupByNameResponseBodyResponse extends TeaModel {
        @NameInMap("Layer")
        public String layer;

        @NameInMap("Entity")
        public QueryRmsRuleGroupByNameResponseBodyResponseEntity entity;

        public static QueryRmsRuleGroupByNameResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsRuleGroupByNameResponseBodyResponse self = new QueryRmsRuleGroupByNameResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsRuleGroupByNameResponseBodyResponse setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public QueryRmsRuleGroupByNameResponseBodyResponse setEntity(QueryRmsRuleGroupByNameResponseBodyResponseEntity entity) {
            this.entity = entity;
            return this;
        }
        public QueryRmsRuleGroupByNameResponseBodyResponseEntity getEntity() {
            return this.entity;
        }

    }

}
