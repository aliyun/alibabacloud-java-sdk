// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDSTTraceHistoriesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Histories")
    public java.util.List<ListDSTTraceHistoriesResponseBodyHistories> histories;

    public static ListDSTTraceHistoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDSTTraceHistoriesResponseBody self = new ListDSTTraceHistoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDSTTraceHistoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDSTTraceHistoriesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDSTTraceHistoriesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListDSTTraceHistoriesResponseBody setHistories(java.util.List<ListDSTTraceHistoriesResponseBodyHistories> histories) {
        this.histories = histories;
        return this;
    }
    public java.util.List<ListDSTTraceHistoriesResponseBodyHistories> getHistories() {
        return this.histories;
    }

    public static class ListDSTTraceHistoriesResponseBodyHistories extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("UserId")
        public String userId;

        public static ListDSTTraceHistoriesResponseBodyHistories build(java.util.Map<String, ?> map) throws Exception {
            ListDSTTraceHistoriesResponseBodyHistories self = new ListDSTTraceHistoriesResponseBodyHistories();
            return TeaModel.build(map, self);
        }

        public ListDSTTraceHistoriesResponseBodyHistories setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDSTTraceHistoriesResponseBodyHistories setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public ListDSTTraceHistoriesResponseBodyHistories setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
