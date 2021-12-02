// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeJobLogResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeJobLogResponseBodyResult result;

    public static DescribeJobLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobLogResponseBody self = new DescribeJobLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeJobLogResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeJobLogResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DescribeJobLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeJobLogResponseBody setResult(DescribeJobLogResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeJobLogResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeJobLogResponseBodyResultEvents extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("EventTime")
        public String eventTime;

        @NameInMap("FirstTimestamp")
        public String firstTimestamp;

        @NameInMap("LastTimestamp")
        public String lastTimestamp;

        @NameInMap("Mesage")
        public String mesage;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Type")
        public String type;

        public static DescribeJobLogResponseBodyResultEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobLogResponseBodyResultEvents self = new DescribeJobLogResponseBodyResultEvents();
            return TeaModel.build(map, self);
        }

        public DescribeJobLogResponseBodyResultEvents setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeJobLogResponseBodyResultEvents setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeJobLogResponseBodyResultEvents setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public DescribeJobLogResponseBodyResultEvents setFirstTimestamp(String firstTimestamp) {
            this.firstTimestamp = firstTimestamp;
            return this;
        }
        public String getFirstTimestamp() {
            return this.firstTimestamp;
        }

        public DescribeJobLogResponseBodyResultEvents setLastTimestamp(String lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public String getLastTimestamp() {
            return this.lastTimestamp;
        }

        public DescribeJobLogResponseBodyResultEvents setMesage(String mesage) {
            this.mesage = mesage;
            return this;
        }
        public String getMesage() {
            return this.mesage;
        }

        public DescribeJobLogResponseBodyResultEvents setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeJobLogResponseBodyResultEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeJobLogResponseBodyResult extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("EnvId")
        public Long envId;

        @NameInMap("Events")
        public java.util.List<DescribeJobLogResponseBodyResultEvents> events;

        @NameInMap("JobLog")
        public String jobLog;

        @NameInMap("PodName")
        public String podName;

        public static DescribeJobLogResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobLogResponseBodyResult self = new DescribeJobLogResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeJobLogResponseBodyResult setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public DescribeJobLogResponseBodyResult setEnvId(Long envId) {
            this.envId = envId;
            return this;
        }
        public Long getEnvId() {
            return this.envId;
        }

        public DescribeJobLogResponseBodyResult setEvents(java.util.List<DescribeJobLogResponseBodyResultEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<DescribeJobLogResponseBodyResultEvents> getEvents() {
            return this.events;
        }

        public DescribeJobLogResponseBodyResult setJobLog(String jobLog) {
            this.jobLog = jobLog;
            return this;
        }
        public String getJobLog() {
            return this.jobLog;
        }

        public DescribeJobLogResponseBodyResult setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

    }

}
