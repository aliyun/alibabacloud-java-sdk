// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CountDTXBizTypeTrendsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CountDTXBizTypeTrendsResponseBodyData data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Success")
    public Boolean success;

    public static CountDTXBizTypeTrendsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CountDTXBizTypeTrendsResponseBody self = new CountDTXBizTypeTrendsResponseBody();
        return TeaModel.build(map, self);
    }

    public CountDTXBizTypeTrendsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CountDTXBizTypeTrendsResponseBody setData(CountDTXBizTypeTrendsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CountDTXBizTypeTrendsResponseBodyData getData() {
        return this.data;
    }

    public CountDTXBizTypeTrendsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CountDTXBizTypeTrendsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CountDTXBizTypeTrendsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CountDTXBizTypeTrendsResponseBodyDataExceptionTrend extends TeaModel {
        @NameInMap("Time")
        public Long time;

        @NameInMap("Total")
        public Long total;

        public static CountDTXBizTypeTrendsResponseBodyDataExceptionTrend build(java.util.Map<String, ?> map) throws Exception {
            CountDTXBizTypeTrendsResponseBodyDataExceptionTrend self = new CountDTXBizTypeTrendsResponseBodyDataExceptionTrend();
            return TeaModel.build(map, self);
        }

        public CountDTXBizTypeTrendsResponseBodyDataExceptionTrend setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public CountDTXBizTypeTrendsResponseBodyDataExceptionTrend setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class CountDTXBizTypeTrendsResponseBodyDataActivityTrend extends TeaModel {
        @NameInMap("Rollback")
        public Long rollback;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Success")
        public Long success;

        @NameInMap("Total")
        public Long total;

        public static CountDTXBizTypeTrendsResponseBodyDataActivityTrend build(java.util.Map<String, ?> map) throws Exception {
            CountDTXBizTypeTrendsResponseBodyDataActivityTrend self = new CountDTXBizTypeTrendsResponseBodyDataActivityTrend();
            return TeaModel.build(map, self);
        }

        public CountDTXBizTypeTrendsResponseBodyDataActivityTrend setRollback(Long rollback) {
            this.rollback = rollback;
            return this;
        }
        public Long getRollback() {
            return this.rollback;
        }

        public CountDTXBizTypeTrendsResponseBodyDataActivityTrend setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public CountDTXBizTypeTrendsResponseBodyDataActivityTrend setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public CountDTXBizTypeTrendsResponseBodyDataActivityTrend setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class CountDTXBizTypeTrendsResponseBodyDataActionTrend extends TeaModel {
        @NameInMap("Rollback")
        public Long rollback;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Success")
        public Long success;

        @NameInMap("Total")
        public Long total;

        public static CountDTXBizTypeTrendsResponseBodyDataActionTrend build(java.util.Map<String, ?> map) throws Exception {
            CountDTXBizTypeTrendsResponseBodyDataActionTrend self = new CountDTXBizTypeTrendsResponseBodyDataActionTrend();
            return TeaModel.build(map, self);
        }

        public CountDTXBizTypeTrendsResponseBodyDataActionTrend setRollback(Long rollback) {
            this.rollback = rollback;
            return this;
        }
        public Long getRollback() {
            return this.rollback;
        }

        public CountDTXBizTypeTrendsResponseBodyDataActionTrend setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public CountDTXBizTypeTrendsResponseBodyDataActionTrend setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public CountDTXBizTypeTrendsResponseBodyDataActionTrend setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class CountDTXBizTypeTrendsResponseBodyData extends TeaModel {
        @NameInMap("ExceptionTrend")
        public java.util.List<CountDTXBizTypeTrendsResponseBodyDataExceptionTrend> exceptionTrend;

        @NameInMap("ActivityTrend")
        public java.util.List<CountDTXBizTypeTrendsResponseBodyDataActivityTrend> activityTrend;

        @NameInMap("ActionTrend")
        public java.util.List<CountDTXBizTypeTrendsResponseBodyDataActionTrend> actionTrend;

        public static CountDTXBizTypeTrendsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CountDTXBizTypeTrendsResponseBodyData self = new CountDTXBizTypeTrendsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CountDTXBizTypeTrendsResponseBodyData setExceptionTrend(java.util.List<CountDTXBizTypeTrendsResponseBodyDataExceptionTrend> exceptionTrend) {
            this.exceptionTrend = exceptionTrend;
            return this;
        }
        public java.util.List<CountDTXBizTypeTrendsResponseBodyDataExceptionTrend> getExceptionTrend() {
            return this.exceptionTrend;
        }

        public CountDTXBizTypeTrendsResponseBodyData setActivityTrend(java.util.List<CountDTXBizTypeTrendsResponseBodyDataActivityTrend> activityTrend) {
            this.activityTrend = activityTrend;
            return this;
        }
        public java.util.List<CountDTXBizTypeTrendsResponseBodyDataActivityTrend> getActivityTrend() {
            return this.activityTrend;
        }

        public CountDTXBizTypeTrendsResponseBodyData setActionTrend(java.util.List<CountDTXBizTypeTrendsResponseBodyDataActionTrend> actionTrend) {
            this.actionTrend = actionTrend;
            return this;
        }
        public java.util.List<CountDTXBizTypeTrendsResponseBodyDataActionTrend> getActionTrend() {
            return this.actionTrend;
        }

    }

}
