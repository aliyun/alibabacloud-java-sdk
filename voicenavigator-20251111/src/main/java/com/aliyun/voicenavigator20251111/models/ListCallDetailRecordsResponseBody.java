// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListCallDetailRecordsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListCallDetailRecordsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A8AED3C8-F57B-5D71-9A34-4A170287533F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCallDetailRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCallDetailRecordsResponseBody self = new ListCallDetailRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCallDetailRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCallDetailRecordsResponseBody setData(ListCallDetailRecordsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCallDetailRecordsResponseBodyData getData() {
        return this.data;
    }

    public ListCallDetailRecordsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCallDetailRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCallDetailRecordsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListCallDetailRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCallDetailRecordsResponseBodyDataCallDetailRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>15100000001</p>
         */
        @NameInMap("Callee")
        public String callee;

        /**
         * <strong>example:</strong>
         * <p>4001027277</p>
         */
        @NameInMap("Caller")
        public String caller;

        /**
         * <strong>example:</strong>
         * <p>Answered</p>
         */
        @NameInMap("DispositionCode")
        public String dispositionCode;

        /**
         * <strong>example:</strong>
         * <p>ConcurrentLimitExceeded</p>
         */
        @NameInMap("DispositionReason")
        public String dispositionReason;

        /**
         * <strong>example:</strong>
         * <p>265</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <strong>example:</strong>
         * <p>1767315903531</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IssueResolved")
        public Boolean issueResolved;

        /**
         * <strong>example:</strong>
         * <p>Customer</p>
         */
        @NameInMap("ReleaseInitiator")
        public String releaseInitiator;

        /**
         * <strong>example:</strong>
         * <p>unknown</p>
         */
        @NameInMap("ResolutionEvidence")
        public String resolutionEvidence;

        /**
         * <strong>example:</strong>
         * <p>99eebcba-7f8a-4a54-b0da-603ada79d8e2</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>1767315903531</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>245</p>
         */
        @NameInMap("TalkTime")
        public Integer talkTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TalkTurns")
        public Integer talkTurns;

        /**
         * <strong>example:</strong>
         * <p>default@testinstance1</p>
         */
        @NameInMap("TransferTarget")
        public String transferTarget;

        /**
         * <strong>example:</strong>
         * <p>Agent</p>
         */
        @NameInMap("TransferType")
        public String transferType;

        public static ListCallDetailRecordsResponseBodyDataCallDetailRecords build(java.util.Map<String, ?> map) throws Exception {
            ListCallDetailRecordsResponseBodyDataCallDetailRecords self = new ListCallDetailRecordsResponseBodyDataCallDetailRecords();
            return TeaModel.build(map, self);
        }

        public ListCallDetailRecordsResponseBodyDataCallDetailRecords setCallee(String callee) {
            this.callee = callee;
            return this;
        }
        public String getCallee() {
            return this.callee;
        }

        public ListCallDetailRecordsResponseBodyDataCallDetailRecords setCaller(String caller) {
            this.caller = caller;
            return this;
        }
        public String getCaller() {
            return this.caller;
        }

        public ListCallDetailRecordsResponseBodyDataCallDetailRecords setDispositionCode(String dispositionCode) {
            this.dispositionCode = dispositionCode;
            return this;
        }
        public String getDispositionCode() {
            return this.dispositionCode;
        }

        public ListCallDetailRecordsResponseBodyDataCallDetailRecords setDispositionReason(String dispositionReason) {
            this.dispositionReason = dispositionReason;
            return this;
        }
        public String getDispositionReason() {
            return this.dispositionReason;
        }

        public ListCallDetailRecordsResponseBodyDataCallDetailRecords setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListCallDetailRecordsResponseBodyDataCallDetailRecords setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListCallDetailRecordsResponseBodyDataCallDetailRecords setIssueResolved(Boolean issueResolved) {
            this.issueResolved = issueResolved;
            return this;
        }
        public Boolean getIssueResolved() {
            return this.issueResolved;
        }

        public ListCallDetailRecordsResponseBodyDataCallDetailRecords setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public ListCallDetailRecordsResponseBodyDataCallDetailRecords setResolutionEvidence(String resolutionEvidence) {
            this.resolutionEvidence = resolutionEvidence;
            return this;
        }
        public String getResolutionEvidence() {
            return this.resolutionEvidence;
        }

        public ListCallDetailRecordsResponseBodyDataCallDetailRecords setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListCallDetailRecordsResponseBodyDataCallDetailRecords setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListCallDetailRecordsResponseBodyDataCallDetailRecords setTalkTime(Integer talkTime) {
            this.talkTime = talkTime;
            return this;
        }
        public Integer getTalkTime() {
            return this.talkTime;
        }

        public ListCallDetailRecordsResponseBodyDataCallDetailRecords setTalkTurns(Integer talkTurns) {
            this.talkTurns = talkTurns;
            return this;
        }
        public Integer getTalkTurns() {
            return this.talkTurns;
        }

        public ListCallDetailRecordsResponseBodyDataCallDetailRecords setTransferTarget(String transferTarget) {
            this.transferTarget = transferTarget;
            return this;
        }
        public String getTransferTarget() {
            return this.transferTarget;
        }

        public ListCallDetailRecordsResponseBodyDataCallDetailRecords setTransferType(String transferType) {
            this.transferType = transferType;
            return this;
        }
        public String getTransferType() {
            return this.transferType;
        }

    }

    public static class ListCallDetailRecordsResponseBodyData extends TeaModel {
        @NameInMap("CallDetailRecords")
        public java.util.List<ListCallDetailRecordsResponseBodyDataCallDetailRecords> callDetailRecords;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>362</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCallDetailRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCallDetailRecordsResponseBodyData self = new ListCallDetailRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCallDetailRecordsResponseBodyData setCallDetailRecords(java.util.List<ListCallDetailRecordsResponseBodyDataCallDetailRecords> callDetailRecords) {
            this.callDetailRecords = callDetailRecords;
            return this;
        }
        public java.util.List<ListCallDetailRecordsResponseBodyDataCallDetailRecords> getCallDetailRecords() {
            return this.callDetailRecords;
        }

        public ListCallDetailRecordsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCallDetailRecordsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCallDetailRecordsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
