// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDSTTracesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Traces")
    public java.util.List<ListDSTTracesResponseBodyTraces> traces;

    public static ListDSTTracesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDSTTracesResponseBody self = new ListDSTTracesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDSTTracesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDSTTracesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDSTTracesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListDSTTracesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDSTTracesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDSTTracesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListDSTTracesResponseBody setTraces(java.util.List<ListDSTTracesResponseBodyTraces> traces) {
        this.traces = traces;
        return this;
    }
    public java.util.List<ListDSTTracesResponseBodyTraces> getTraces() {
        return this.traces;
    }

    public static class ListDSTTracesResponseBodyTraces extends TeaModel {
        @NameInMap("Collected")
        public Boolean collected;

        @NameInMap("CollectedDescription")
        public String collectedDescription;

        @NameInMap("CollectedName")
        public String collectedName;

        @NameInMap("CollectedTime")
        public String collectedTime;

        @NameInMap("CollectedUserName")
        public String collectedUserName;

        @NameInMap("TraceId")
        public String traceId;

        public static ListDSTTracesResponseBodyTraces build(java.util.Map<String, ?> map) throws Exception {
            ListDSTTracesResponseBodyTraces self = new ListDSTTracesResponseBodyTraces();
            return TeaModel.build(map, self);
        }

        public ListDSTTracesResponseBodyTraces setCollected(Boolean collected) {
            this.collected = collected;
            return this;
        }
        public Boolean getCollected() {
            return this.collected;
        }

        public ListDSTTracesResponseBodyTraces setCollectedDescription(String collectedDescription) {
            this.collectedDescription = collectedDescription;
            return this;
        }
        public String getCollectedDescription() {
            return this.collectedDescription;
        }

        public ListDSTTracesResponseBodyTraces setCollectedName(String collectedName) {
            this.collectedName = collectedName;
            return this;
        }
        public String getCollectedName() {
            return this.collectedName;
        }

        public ListDSTTracesResponseBodyTraces setCollectedTime(String collectedTime) {
            this.collectedTime = collectedTime;
            return this;
        }
        public String getCollectedTime() {
            return this.collectedTime;
        }

        public ListDSTTracesResponseBodyTraces setCollectedUserName(String collectedUserName) {
            this.collectedUserName = collectedUserName;
            return this;
        }
        public String getCollectedUserName() {
            return this.collectedUserName;
        }

        public ListDSTTracesResponseBodyTraces setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

}
