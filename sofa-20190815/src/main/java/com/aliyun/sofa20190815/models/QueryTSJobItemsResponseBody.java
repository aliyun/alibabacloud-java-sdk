// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSJobItemsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryTSJobItemsResponseBodyData> data;

    public static QueryTSJobItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTSJobItemsResponseBody self = new QueryTSJobItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTSJobItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTSJobItemsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTSJobItemsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryTSJobItemsResponseBody setData(java.util.List<QueryTSJobItemsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryTSJobItemsResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryTSJobItemsResponseBodyData extends TeaModel {
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

        @NameInMap("Status")
        public String status;

        @NameInMap("JobZone")
        public String jobZone;

        @NameInMap("JobRunMode")
        public String jobRunMode;

        @NameInMap("CountOfClient")
        public Long countOfClient;

        @NameInMap("TotalZone")
        public String totalZone;

        @NameInMap("CountOfActiveZone")
        public Boolean countOfActiveZone;

        @NameInMap("ExtensionInfo")
        public String extensionInfo;

        @NameInMap("Handlers")
        public java.util.List<String> handlers;

        public static QueryTSJobItemsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTSJobItemsResponseBodyData self = new QueryTSJobItemsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTSJobItemsResponseBodyData setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public QueryTSJobItemsResponseBodyData setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public QueryTSJobItemsResponseBodyData setDes(String des) {
            this.des = des;
            return this;
        }
        public String getDes() {
            return this.des;
        }

        public QueryTSJobItemsResponseBodyData setFailHandleStrategy(String failHandleStrategy) {
            this.failHandleStrategy = failHandleStrategy;
            return this;
        }
        public String getFailHandleStrategy() {
            return this.failHandleStrategy;
        }

        public QueryTSJobItemsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTSJobItemsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTSJobItemsResponseBodyData setInvokeType(String invokeType) {
            this.invokeType = invokeType;
            return this;
        }
        public String getInvokeType() {
            return this.invokeType;
        }

        public QueryTSJobItemsResponseBodyData setJobItemId(Long jobItemId) {
            this.jobItemId = jobItemId;
            return this;
        }
        public Long getJobItemId() {
            return this.jobItemId;
        }

        public QueryTSJobItemsResponseBodyData setMisfireStrategy(String misfireStrategy) {
            this.misfireStrategy = misfireStrategy;
            return this;
        }
        public String getMisfireStrategy() {
            return this.misfireStrategy;
        }

        public QueryTSJobItemsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTSJobItemsResponseBodyData setRouteStrategy(String routeStrategy) {
            this.routeStrategy = routeStrategy;
            return this;
        }
        public String getRouteStrategy() {
            return this.routeStrategy;
        }

        public QueryTSJobItemsResponseBodyData setSofarouterGroup(String sofarouterGroup) {
            this.sofarouterGroup = sofarouterGroup;
            return this;
        }
        public String getSofarouterGroup() {
            return this.sofarouterGroup;
        }

        public QueryTSJobItemsResponseBodyData setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

        public QueryTSJobItemsResponseBodyData setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public QueryTSJobItemsResponseBodyData setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public QueryTSJobItemsResponseBodyData setTriggerMode(String triggerMode) {
            this.triggerMode = triggerMode;
            return this;
        }
        public String getTriggerMode() {
            return this.triggerMode;
        }

        public QueryTSJobItemsResponseBodyData setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public QueryTSJobItemsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryTSJobItemsResponseBodyData setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public QueryTSJobItemsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTSJobItemsResponseBodyData setJobZone(String jobZone) {
            this.jobZone = jobZone;
            return this;
        }
        public String getJobZone() {
            return this.jobZone;
        }

        public QueryTSJobItemsResponseBodyData setJobRunMode(String jobRunMode) {
            this.jobRunMode = jobRunMode;
            return this;
        }
        public String getJobRunMode() {
            return this.jobRunMode;
        }

        public QueryTSJobItemsResponseBodyData setCountOfClient(Long countOfClient) {
            this.countOfClient = countOfClient;
            return this;
        }
        public Long getCountOfClient() {
            return this.countOfClient;
        }

        public QueryTSJobItemsResponseBodyData setTotalZone(String totalZone) {
            this.totalZone = totalZone;
            return this;
        }
        public String getTotalZone() {
            return this.totalZone;
        }

        public QueryTSJobItemsResponseBodyData setCountOfActiveZone(Boolean countOfActiveZone) {
            this.countOfActiveZone = countOfActiveZone;
            return this;
        }
        public Boolean getCountOfActiveZone() {
            return this.countOfActiveZone;
        }

        public QueryTSJobItemsResponseBodyData setExtensionInfo(String extensionInfo) {
            this.extensionInfo = extensionInfo;
            return this;
        }
        public String getExtensionInfo() {
            return this.extensionInfo;
        }

        public QueryTSJobItemsResponseBodyData setHandlers(java.util.List<String> handlers) {
            this.handlers = handlers;
            return this;
        }
        public java.util.List<String> getHandlers() {
            return this.handlers;
        }

    }

}
