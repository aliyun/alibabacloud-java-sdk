// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSSubsStatsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetDWSSubsStatsResponseBodyData data;

    public static GetDWSSubsStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSSubsStatsResponseBody self = new GetDWSSubsStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSSubsStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSSubsStatsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSSubsStatsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSSubsStatsResponseBody setData(GetDWSSubsStatsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDWSSubsStatsResponseBodyData getData() {
        return this.data;
    }

    public static class GetDWSSubsStatsResponseBodyData extends TeaModel {
        @NameInMap("Exception")
        public Long exception;

        @NameInMap("Initializing")
        public Long initializing;

        @NameInMap("Running")
        public Long running;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Unsubscribe")
        public Long unsubscribe;

        @NameInMap("Waiting")
        public Long waiting;

        public static GetDWSSubsStatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSSubsStatsResponseBodyData self = new GetDWSSubsStatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSSubsStatsResponseBodyData setException(Long exception) {
            this.exception = exception;
            return this;
        }
        public Long getException() {
            return this.exception;
        }

        public GetDWSSubsStatsResponseBodyData setInitializing(Long initializing) {
            this.initializing = initializing;
            return this;
        }
        public Long getInitializing() {
            return this.initializing;
        }

        public GetDWSSubsStatsResponseBodyData setRunning(Long running) {
            this.running = running;
            return this;
        }
        public Long getRunning() {
            return this.running;
        }

        public GetDWSSubsStatsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public GetDWSSubsStatsResponseBodyData setUnsubscribe(Long unsubscribe) {
            this.unsubscribe = unsubscribe;
            return this;
        }
        public Long getUnsubscribe() {
            return this.unsubscribe;
        }

        public GetDWSSubsStatsResponseBodyData setWaiting(Long waiting) {
            this.waiting = waiting;
            return this;
        }
        public Long getWaiting() {
            return this.waiting;
        }

    }

}
