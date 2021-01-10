// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlarmMetricResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public java.util.List<QueryRmsAlarmMetricResponseBodyResponse> response;

    public static QueryRmsAlarmMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlarmMetricResponseBody self = new QueryRmsAlarmMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlarmMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsAlarmMetricResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsAlarmMetricResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsAlarmMetricResponseBody setResponse(java.util.List<QueryRmsAlarmMetricResponseBodyResponse> response) {
        this.response = response;
        return this;
    }
    public java.util.List<QueryRmsAlarmMetricResponseBodyResponse> getResponse() {
        return this.response;
    }

    public static class QueryRmsAlarmMetricResponseBodyResponseMasTriggersDownsample extends TeaModel {
        @NameInMap("Aggregator")
        public String aggregator;

        @NameInMap("Interval")
        public String interval;

        @NameInMap("Units")
        public String units;

        public static QueryRmsAlarmMetricResponseBodyResponseMasTriggersDownsample build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlarmMetricResponseBodyResponseMasTriggersDownsample self = new QueryRmsAlarmMetricResponseBodyResponseMasTriggersDownsample();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlarmMetricResponseBodyResponseMasTriggersDownsample setAggregator(String aggregator) {
            this.aggregator = aggregator;
            return this;
        }
        public String getAggregator() {
            return this.aggregator;
        }

        public QueryRmsAlarmMetricResponseBodyResponseMasTriggersDownsample setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public QueryRmsAlarmMetricResponseBodyResponseMasTriggersDownsample setUnits(String units) {
            this.units = units;
            return this;
        }
        public String getUnits() {
            return this.units;
        }

    }

    public static class QueryRmsAlarmMetricResponseBodyResponseMasTriggers extends TeaModel {
        @NameInMap("Aggregator")
        public String aggregator;

        @NameInMap("Id")
        public Long id;

        @NameInMap("N")
        public String n;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("TriggerOperator")
        public String triggerOperator;

        @NameInMap("TriggerType")
        public String triggerType;

        @NameInMap("Downsample")
        public QueryRmsAlarmMetricResponseBodyResponseMasTriggersDownsample downsample;

        public static QueryRmsAlarmMetricResponseBodyResponseMasTriggers build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlarmMetricResponseBodyResponseMasTriggers self = new QueryRmsAlarmMetricResponseBodyResponseMasTriggers();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlarmMetricResponseBodyResponseMasTriggers setAggregator(String aggregator) {
            this.aggregator = aggregator;
            return this;
        }
        public String getAggregator() {
            return this.aggregator;
        }

        public QueryRmsAlarmMetricResponseBodyResponseMasTriggers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryRmsAlarmMetricResponseBodyResponseMasTriggers setN(String n) {
            this.n = n;
            return this;
        }
        public String getN() {
            return this.n;
        }

        public QueryRmsAlarmMetricResponseBodyResponseMasTriggers setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public QueryRmsAlarmMetricResponseBodyResponseMasTriggers setTriggerOperator(String triggerOperator) {
            this.triggerOperator = triggerOperator;
            return this;
        }
        public String getTriggerOperator() {
            return this.triggerOperator;
        }

        public QueryRmsAlarmMetricResponseBodyResponseMasTriggers setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public QueryRmsAlarmMetricResponseBodyResponseMasTriggers setDownsample(QueryRmsAlarmMetricResponseBodyResponseMasTriggersDownsample downsample) {
            this.downsample = downsample;
            return this;
        }
        public QueryRmsAlarmMetricResponseBodyResponseMasTriggersDownsample getDownsample() {
            return this.downsample;
        }

    }

    public static class QueryRmsAlarmMetricResponseBodyResponseMasAmBlackLists extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static QueryRmsAlarmMetricResponseBodyResponseMasAmBlackLists build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlarmMetricResponseBodyResponseMasAmBlackLists self = new QueryRmsAlarmMetricResponseBodyResponseMasAmBlackLists();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlarmMetricResponseBodyResponseMasAmBlackLists setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryRmsAlarmMetricResponseBodyResponseMasAmBlackLists setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class QueryRmsAlarmMetricResponseBodyResponseMasAmWhiteLists extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static QueryRmsAlarmMetricResponseBodyResponseMasAmWhiteLists build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlarmMetricResponseBodyResponseMasAmWhiteLists self = new QueryRmsAlarmMetricResponseBodyResponseMasAmWhiteLists();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlarmMetricResponseBodyResponseMasAmWhiteLists setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryRmsAlarmMetricResponseBodyResponseMasAmWhiteLists setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class QueryRmsAlarmMetricResponseBodyResponseMasAm extends TeaModel {
        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("BlackLists")
        public java.util.List<QueryRmsAlarmMetricResponseBodyResponseMasAmBlackLists> blackLists;

        @NameInMap("WhiteLists")
        public java.util.List<QueryRmsAlarmMetricResponseBodyResponseMasAmWhiteLists> whiteLists;

        public static QueryRmsAlarmMetricResponseBodyResponseMasAm build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlarmMetricResponseBodyResponseMasAm self = new QueryRmsAlarmMetricResponseBodyResponseMasAm();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlarmMetricResponseBodyResponseMasAm setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public QueryRmsAlarmMetricResponseBodyResponseMasAm setBlackLists(java.util.List<QueryRmsAlarmMetricResponseBodyResponseMasAmBlackLists> blackLists) {
            this.blackLists = blackLists;
            return this;
        }
        public java.util.List<QueryRmsAlarmMetricResponseBodyResponseMasAmBlackLists> getBlackLists() {
            return this.blackLists;
        }

        public QueryRmsAlarmMetricResponseBodyResponseMasAm setWhiteLists(java.util.List<QueryRmsAlarmMetricResponseBodyResponseMasAmWhiteLists> whiteLists) {
            this.whiteLists = whiteLists;
            return this;
        }
        public java.util.List<QueryRmsAlarmMetricResponseBodyResponseMasAmWhiteLists> getWhiteLists() {
            return this.whiteLists;
        }

    }

    public static class QueryRmsAlarmMetricResponseBodyResponseMas extends TeaModel {
        @NameInMap("HasOne")
        public Boolean hasOne;

        @NameInMap("Id")
        public Long id;

        @NameInMap("MaName")
        public String maName;

        @NameInMap("Triggers")
        public java.util.List<QueryRmsAlarmMetricResponseBodyResponseMasTriggers> triggers;

        @NameInMap("Am")
        public QueryRmsAlarmMetricResponseBodyResponseMasAm am;

        public static QueryRmsAlarmMetricResponseBodyResponseMas build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlarmMetricResponseBodyResponseMas self = new QueryRmsAlarmMetricResponseBodyResponseMas();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlarmMetricResponseBodyResponseMas setHasOne(Boolean hasOne) {
            this.hasOne = hasOne;
            return this;
        }
        public Boolean getHasOne() {
            return this.hasOne;
        }

        public QueryRmsAlarmMetricResponseBodyResponseMas setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryRmsAlarmMetricResponseBodyResponseMas setMaName(String maName) {
            this.maName = maName;
            return this;
        }
        public String getMaName() {
            return this.maName;
        }

        public QueryRmsAlarmMetricResponseBodyResponseMas setTriggers(java.util.List<QueryRmsAlarmMetricResponseBodyResponseMasTriggers> triggers) {
            this.triggers = triggers;
            return this;
        }
        public java.util.List<QueryRmsAlarmMetricResponseBodyResponseMasTriggers> getTriggers() {
            return this.triggers;
        }

        public QueryRmsAlarmMetricResponseBodyResponseMas setAm(QueryRmsAlarmMetricResponseBodyResponseMasAm am) {
            this.am = am;
            return this;
        }
        public QueryRmsAlarmMetricResponseBodyResponseMasAm getAm() {
            return this.am;
        }

    }

    public static class QueryRmsAlarmMetricResponseBodyResponseSubers extends TeaModel {
        @NameInMap("SuberId")
        public String suberId;

        @NameInMap("SuberType")
        public String suberType;

        public static QueryRmsAlarmMetricResponseBodyResponseSubers build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlarmMetricResponseBodyResponseSubers self = new QueryRmsAlarmMetricResponseBodyResponseSubers();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlarmMetricResponseBodyResponseSubers setSuberId(String suberId) {
            this.suberId = suberId;
            return this;
        }
        public String getSuberId() {
            return this.suberId;
        }

        public QueryRmsAlarmMetricResponseBodyResponseSubers setSuberType(String suberType) {
            this.suberType = suberType;
            return this;
        }
        public String getSuberType() {
            return this.suberType;
        }

    }

    public static class QueryRmsAlarmMetricResponseBodyResponseAt extends TeaModel {
        @NameInMap("CheckMinute")
        public Long checkMinute;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("PauseEndTime")
        public Long pauseEndTime;

        @NameInMap("PauseStartTime")
        public Long pauseStartTime;

        @NameInMap("SilentPeriod")
        public Long silentPeriod;

        @NameInMap("StartTime")
        public Long startTime;

        public static QueryRmsAlarmMetricResponseBodyResponseAt build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlarmMetricResponseBodyResponseAt self = new QueryRmsAlarmMetricResponseBodyResponseAt();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlarmMetricResponseBodyResponseAt setCheckMinute(Long checkMinute) {
            this.checkMinute = checkMinute;
            return this;
        }
        public Long getCheckMinute() {
            return this.checkMinute;
        }

        public QueryRmsAlarmMetricResponseBodyResponseAt setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryRmsAlarmMetricResponseBodyResponseAt setPauseEndTime(Long pauseEndTime) {
            this.pauseEndTime = pauseEndTime;
            return this;
        }
        public Long getPauseEndTime() {
            return this.pauseEndTime;
        }

        public QueryRmsAlarmMetricResponseBodyResponseAt setPauseStartTime(Long pauseStartTime) {
            this.pauseStartTime = pauseStartTime;
            return this;
        }
        public Long getPauseStartTime() {
            return this.pauseStartTime;
        }

        public QueryRmsAlarmMetricResponseBodyResponseAt setSilentPeriod(Long silentPeriod) {
            this.silentPeriod = silentPeriod;
            return this;
        }
        public Long getSilentPeriod() {
            return this.silentPeriod;
        }

        public QueryRmsAlarmMetricResponseBodyResponseAt setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class QueryRmsAlarmMetricResponseBodyResponseStatus extends TeaModel {
        @NameInMap("LastCheckResult")
        public Boolean lastCheckResult;

        @NameInMap("LastCheckSuccess")
        public Boolean lastCheckSuccess;

        @NameInMap("LastCheckTime")
        public Long lastCheckTime;

        @NameInMap("LastNotifyTime")
        public Long lastNotifyTime;

        public static QueryRmsAlarmMetricResponseBodyResponseStatus build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlarmMetricResponseBodyResponseStatus self = new QueryRmsAlarmMetricResponseBodyResponseStatus();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlarmMetricResponseBodyResponseStatus setLastCheckResult(Boolean lastCheckResult) {
            this.lastCheckResult = lastCheckResult;
            return this;
        }
        public Boolean getLastCheckResult() {
            return this.lastCheckResult;
        }

        public QueryRmsAlarmMetricResponseBodyResponseStatus setLastCheckSuccess(Boolean lastCheckSuccess) {
            this.lastCheckSuccess = lastCheckSuccess;
            return this;
        }
        public Boolean getLastCheckSuccess() {
            return this.lastCheckSuccess;
        }

        public QueryRmsAlarmMetricResponseBodyResponseStatus setLastCheckTime(Long lastCheckTime) {
            this.lastCheckTime = lastCheckTime;
            return this;
        }
        public Long getLastCheckTime() {
            return this.lastCheckTime;
        }

        public QueryRmsAlarmMetricResponseBodyResponseStatus setLastNotifyTime(Long lastNotifyTime) {
            this.lastNotifyTime = lastNotifyTime;
            return this;
        }
        public Long getLastNotifyTime() {
            return this.lastNotifyTime;
        }

    }

    public static class QueryRmsAlarmMetricResponseBodyResponse extends TeaModel {
        @NameInMap("AlertLevel")
        public Long alertLevel;

        @NameInMap("HasOne")
        public Boolean hasOne;

        @NameInMap("Id")
        public String id;

        @NameInMap("MagName")
        public String magName;

        @NameInMap("Open")
        public Boolean open;

        @NameInMap("Mas")
        public java.util.List<QueryRmsAlarmMetricResponseBodyResponseMas> mas;

        @NameInMap("Subers")
        public java.util.List<QueryRmsAlarmMetricResponseBodyResponseSubers> subers;

        @NameInMap("At")
        public QueryRmsAlarmMetricResponseBodyResponseAt at;

        @NameInMap("Status")
        public QueryRmsAlarmMetricResponseBodyResponseStatus status;

        public static QueryRmsAlarmMetricResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlarmMetricResponseBodyResponse self = new QueryRmsAlarmMetricResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlarmMetricResponseBodyResponse setAlertLevel(Long alertLevel) {
            this.alertLevel = alertLevel;
            return this;
        }
        public Long getAlertLevel() {
            return this.alertLevel;
        }

        public QueryRmsAlarmMetricResponseBodyResponse setHasOne(Boolean hasOne) {
            this.hasOne = hasOne;
            return this;
        }
        public Boolean getHasOne() {
            return this.hasOne;
        }

        public QueryRmsAlarmMetricResponseBodyResponse setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryRmsAlarmMetricResponseBodyResponse setMagName(String magName) {
            this.magName = magName;
            return this;
        }
        public String getMagName() {
            return this.magName;
        }

        public QueryRmsAlarmMetricResponseBodyResponse setOpen(Boolean open) {
            this.open = open;
            return this;
        }
        public Boolean getOpen() {
            return this.open;
        }

        public QueryRmsAlarmMetricResponseBodyResponse setMas(java.util.List<QueryRmsAlarmMetricResponseBodyResponseMas> mas) {
            this.mas = mas;
            return this;
        }
        public java.util.List<QueryRmsAlarmMetricResponseBodyResponseMas> getMas() {
            return this.mas;
        }

        public QueryRmsAlarmMetricResponseBodyResponse setSubers(java.util.List<QueryRmsAlarmMetricResponseBodyResponseSubers> subers) {
            this.subers = subers;
            return this;
        }
        public java.util.List<QueryRmsAlarmMetricResponseBodyResponseSubers> getSubers() {
            return this.subers;
        }

        public QueryRmsAlarmMetricResponseBodyResponse setAt(QueryRmsAlarmMetricResponseBodyResponseAt at) {
            this.at = at;
            return this;
        }
        public QueryRmsAlarmMetricResponseBodyResponseAt getAt() {
            return this.at;
        }

        public QueryRmsAlarmMetricResponseBodyResponse setStatus(QueryRmsAlarmMetricResponseBodyResponseStatus status) {
            this.status = status;
            return this;
        }
        public QueryRmsAlarmMetricResponseBodyResponseStatus getStatus() {
            return this.status;
        }

    }

}
