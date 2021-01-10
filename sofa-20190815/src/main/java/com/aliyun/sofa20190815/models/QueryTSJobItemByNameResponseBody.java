// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSJobItemByNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryTSJobItemByNameResponseBodyData> data;

    public static QueryTSJobItemByNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTSJobItemByNameResponseBody self = new QueryTSJobItemByNameResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTSJobItemByNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTSJobItemByNameResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTSJobItemByNameResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryTSJobItemByNameResponseBody setData(java.util.List<QueryTSJobItemByNameResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryTSJobItemByNameResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryTSJobItemByNameResponseBodyData extends TeaModel {
        @NameInMap("App")
        public String app;

        @NameInMap("Cron")
        public String cron;

        @NameInMap("Des")
        public String des;

        @NameInMap("FailHandleStrategy")
        public String failHandleStrategy;

        @NameInMap("Id")
        public String id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InvokeType")
        public String invokeType;

        @NameInMap("JobItemId")
        public Long jobItemId;

        @NameInMap("MisfireStrategy")
        public String misfireStrategy;

        @NameInMap("Name")
        public String name;

        @NameInMap("RouteStrategy")
        public String routeStrategy;

        @NameInMap("SofarouterGroup")
        public String sofarouterGroup;

        @NameInMap("Timeout")
        public String timeout;

        @NameInMap("TimeUnit")
        public String timeUnit;

        @NameInMap("TimeZone")
        public String timeZone;

        @NameInMap("TriggerMode")
        public String triggerMode;

        @NameInMap("TriggerType")
        public String triggerType;

        @NameInMap("Type")
        public String type;

        @NameInMap("Zone")
        public String zone;

        @NameInMap("Handlers")
        public java.util.List<String> handlers;

        public static QueryTSJobItemByNameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTSJobItemByNameResponseBodyData self = new QueryTSJobItemByNameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTSJobItemByNameResponseBodyData setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public QueryTSJobItemByNameResponseBodyData setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public QueryTSJobItemByNameResponseBodyData setDes(String des) {
            this.des = des;
            return this;
        }
        public String getDes() {
            return this.des;
        }

        public QueryTSJobItemByNameResponseBodyData setFailHandleStrategy(String failHandleStrategy) {
            this.failHandleStrategy = failHandleStrategy;
            return this;
        }
        public String getFailHandleStrategy() {
            return this.failHandleStrategy;
        }

        public QueryTSJobItemByNameResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTSJobItemByNameResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTSJobItemByNameResponseBodyData setInvokeType(String invokeType) {
            this.invokeType = invokeType;
            return this;
        }
        public String getInvokeType() {
            return this.invokeType;
        }

        public QueryTSJobItemByNameResponseBodyData setJobItemId(Long jobItemId) {
            this.jobItemId = jobItemId;
            return this;
        }
        public Long getJobItemId() {
            return this.jobItemId;
        }

        public QueryTSJobItemByNameResponseBodyData setMisfireStrategy(String misfireStrategy) {
            this.misfireStrategy = misfireStrategy;
            return this;
        }
        public String getMisfireStrategy() {
            return this.misfireStrategy;
        }

        public QueryTSJobItemByNameResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTSJobItemByNameResponseBodyData setRouteStrategy(String routeStrategy) {
            this.routeStrategy = routeStrategy;
            return this;
        }
        public String getRouteStrategy() {
            return this.routeStrategy;
        }

        public QueryTSJobItemByNameResponseBodyData setSofarouterGroup(String sofarouterGroup) {
            this.sofarouterGroup = sofarouterGroup;
            return this;
        }
        public String getSofarouterGroup() {
            return this.sofarouterGroup;
        }

        public QueryTSJobItemByNameResponseBodyData setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

        public QueryTSJobItemByNameResponseBodyData setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public QueryTSJobItemByNameResponseBodyData setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public QueryTSJobItemByNameResponseBodyData setTriggerMode(String triggerMode) {
            this.triggerMode = triggerMode;
            return this;
        }
        public String getTriggerMode() {
            return this.triggerMode;
        }

        public QueryTSJobItemByNameResponseBodyData setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public QueryTSJobItemByNameResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryTSJobItemByNameResponseBodyData setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public QueryTSJobItemByNameResponseBodyData setHandlers(java.util.List<String> handlers) {
            this.handlers = handlers;
            return this;
        }
        public java.util.List<String> getHandlers() {
            return this.handlers;
        }

    }

}
