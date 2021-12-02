// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribePodEventsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribePodEventsResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribePodEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePodEventsResponseBody self = new DescribePodEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePodEventsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribePodEventsResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DescribePodEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePodEventsResponseBody setResult(DescribePodEventsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribePodEventsResponseBodyResult getResult() {
        return this.result;
    }

    public DescribePodEventsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribePodEventsResponseBodyResultPodEvents extends TeaModel {
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

        @NameInMap("Message")
        public String message;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Type")
        public String type;

        public static DescribePodEventsResponseBodyResultPodEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribePodEventsResponseBodyResultPodEvents self = new DescribePodEventsResponseBodyResultPodEvents();
            return TeaModel.build(map, self);
        }

        public DescribePodEventsResponseBodyResultPodEvents setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribePodEventsResponseBodyResultPodEvents setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePodEventsResponseBodyResultPodEvents setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public DescribePodEventsResponseBodyResultPodEvents setFirstTimestamp(String firstTimestamp) {
            this.firstTimestamp = firstTimestamp;
            return this;
        }
        public String getFirstTimestamp() {
            return this.firstTimestamp;
        }

        public DescribePodEventsResponseBodyResultPodEvents setLastTimestamp(String lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public String getLastTimestamp() {
            return this.lastTimestamp;
        }

        public DescribePodEventsResponseBodyResultPodEvents setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribePodEventsResponseBodyResultPodEvents setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribePodEventsResponseBodyResultPodEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribePodEventsResponseBodyResult extends TeaModel {
        @NameInMap("DeployOrderName")
        public String deployOrderName;

        @NameInMap("PodEvents")
        public java.util.List<DescribePodEventsResponseBodyResultPodEvents> podEvents;

        public static DescribePodEventsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribePodEventsResponseBodyResult self = new DescribePodEventsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribePodEventsResponseBodyResult setDeployOrderName(String deployOrderName) {
            this.deployOrderName = deployOrderName;
            return this;
        }
        public String getDeployOrderName() {
            return this.deployOrderName;
        }

        public DescribePodEventsResponseBodyResult setPodEvents(java.util.List<DescribePodEventsResponseBodyResultPodEvents> podEvents) {
            this.podEvents = podEvents;
            return this;
        }
        public java.util.List<DescribePodEventsResponseBodyResultPodEvents> getPodEvents() {
            return this.podEvents;
        }

    }

}
