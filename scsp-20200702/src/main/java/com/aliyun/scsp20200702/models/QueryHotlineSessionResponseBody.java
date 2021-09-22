// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryHotlineSessionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public QueryHotlineSessionResponseBodyData data;

    public static QueryHotlineSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHotlineSessionResponseBody self = new QueryHotlineSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHotlineSessionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryHotlineSessionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryHotlineSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHotlineSessionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryHotlineSessionResponseBody setData(QueryHotlineSessionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryHotlineSessionResponseBodyData getData() {
        return this.data;
    }

    public static class QueryHotlineSessionResponseBodyDataCallDetailRecord extends TeaModel {
        @NameInMap("CallResult")
        public String callResult;

        @NameInMap("ServicerName")
        public String servicerName;

        @NameInMap("OutQueueTime")
        public String outQueueTime;

        @NameInMap("CallContinueTime")
        public Integer callContinueTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("PickUpTime")
        public String pickUpTime;

        @NameInMap("RingContinueTime")
        public Integer ringContinueTime;

        @NameInMap("CalledNumber")
        public String calledNumber;

        @NameInMap("ServicerId")
        public String servicerId;

        @NameInMap("HangUpTime")
        public String hangUpTime;

        @NameInMap("EvaluationLevel")
        public Integer evaluationLevel;

        @NameInMap("HangUpRole")
        public String hangUpRole;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("EvaluationScore")
        public Integer evaluationScore;

        @NameInMap("Acid")
        public String acid;

        @NameInMap("RingStartTime")
        public String ringStartTime;

        @NameInMap("CallType")
        public Integer callType;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("RingEndTime")
        public String ringEndTime;

        @NameInMap("CallingNumber")
        public String callingNumber;

        @NameInMap("InQueueTime")
        public String inQueueTime;

        @NameInMap("MemberId")
        public String memberId;

        @NameInMap("QueueUpContinueTime")
        public Integer queueUpContinueTime;

        public static QueryHotlineSessionResponseBodyDataCallDetailRecord build(java.util.Map<String, ?> map) throws Exception {
            QueryHotlineSessionResponseBodyDataCallDetailRecord self = new QueryHotlineSessionResponseBodyDataCallDetailRecord();
            return TeaModel.build(map, self);
        }

        public QueryHotlineSessionResponseBodyDataCallDetailRecord setCallResult(String callResult) {
            this.callResult = callResult;
            return this;
        }
        public String getCallResult() {
            return this.callResult;
        }

        public QueryHotlineSessionResponseBodyDataCallDetailRecord setServicerName(String servicerName) {
            this.servicerName = servicerName;
            return this;
        }
        public String getServicerName() {
            return this.servicerName;
        }

        public QueryHotlineSessionResponseBodyDataCallDetailRecord setOutQueueTime(String outQueueTime) {
            this.outQueueTime = outQueueTime;
            return this;
        }
        public String getOutQueueTime() {
            return this.outQueueTime;
        }

        public QueryHotlineSessionResponseBodyDataCallDetailRecord setCallContinueTime(Integer callContinueTime) {
            this.callContinueTime = callContinueTime;
            return this;
        }
        public Integer getCallContinueTime() {
            return this.callContinueTime;
        }

        public QueryHotlineSessionResponseBodyDataCallDetailRecord setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryHotlineSessionResponseBodyDataCallDetailRecord setPickUpTime(String pickUpTime) {
            this.pickUpTime = pickUpTime;
            return this;
        }
        public String getPickUpTime() {
            return this.pickUpTime;
        }

        public QueryHotlineSessionResponseBodyDataCallDetailRecord setRingContinueTime(Integer ringContinueTime) {
            this.ringContinueTime = ringContinueTime;
            return this;
        }
        public Integer getRingContinueTime() {
            return this.ringContinueTime;
        }

        public QueryHotlineSessionResponseBodyDataCallDetailRecord setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public QueryHotlineSessionResponseBodyDataCallDetailRecord setServicerId(String servicerId) {
            this.servicerId = servicerId;
            return this;
        }
        public String getServicerId() {
            return this.servicerId;
        }

        public QueryHotlineSessionResponseBodyDataCallDetailRecord setHangUpTime(String hangUpTime) {
            this.hangUpTime = hangUpTime;
            return this;
        }
        public String getHangUpTime() {
            return this.hangUpTime;
        }

        public QueryHotlineSessionResponseBodyDataCallDetailRecord setEvaluationLevel(Integer evaluationLevel) {
            this.evaluationLevel = evaluationLevel;
            return this;
        }
        public Integer getEvaluationLevel() {
            return this.evaluationLevel;
        }

        public QueryHotlineSessionResponseBodyDataCallDetailRecord setHangUpRole(String hangUpRole) {
            this.hangUpRole = hangUpRole;
            return this;
        }
        public String getHangUpRole() {
            return this.hangUpRole;
        }

        public QueryHotlineSessionResponseBodyDataCallDetailRecord setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public QueryHotlineSessionResponseBodyDataCallDetailRecord setEvaluationScore(Integer evaluationScore) {
            this.evaluationScore = evaluationScore;
            return this;
        }
        public Integer getEvaluationScore() {
            return this.evaluationScore;
        }

        public QueryHotlineSessionResponseBodyDataCallDetailRecord setAcid(String acid) {
            this.acid = acid;
            return this;
        }
        public String getAcid() {
            return this.acid;
        }

        public QueryHotlineSessionResponseBodyDataCallDetailRecord setRingStartTime(String ringStartTime) {
            this.ringStartTime = ringStartTime;
            return this;
        }
        public String getRingStartTime() {
            return this.ringStartTime;
        }

        public QueryHotlineSessionResponseBodyDataCallDetailRecord setCallType(Integer callType) {
            this.callType = callType;
            return this;
        }
        public Integer getCallType() {
            return this.callType;
        }

        public QueryHotlineSessionResponseBodyDataCallDetailRecord setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public QueryHotlineSessionResponseBodyDataCallDetailRecord setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryHotlineSessionResponseBodyDataCallDetailRecord setRingEndTime(String ringEndTime) {
            this.ringEndTime = ringEndTime;
            return this;
        }
        public String getRingEndTime() {
            return this.ringEndTime;
        }

        public QueryHotlineSessionResponseBodyDataCallDetailRecord setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public QueryHotlineSessionResponseBodyDataCallDetailRecord setInQueueTime(String inQueueTime) {
            this.inQueueTime = inQueueTime;
            return this;
        }
        public String getInQueueTime() {
            return this.inQueueTime;
        }

        public QueryHotlineSessionResponseBodyDataCallDetailRecord setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public QueryHotlineSessionResponseBodyDataCallDetailRecord setQueueUpContinueTime(Integer queueUpContinueTime) {
            this.queueUpContinueTime = queueUpContinueTime;
            return this;
        }
        public Integer getQueueUpContinueTime() {
            return this.queueUpContinueTime;
        }

    }

    public static class QueryHotlineSessionResponseBodyData extends TeaModel {
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("CallDetailRecord")
        public java.util.List<QueryHotlineSessionResponseBodyDataCallDetailRecord> callDetailRecord;

        public static QueryHotlineSessionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryHotlineSessionResponseBodyData self = new QueryHotlineSessionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryHotlineSessionResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryHotlineSessionResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public QueryHotlineSessionResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryHotlineSessionResponseBodyData setCallDetailRecord(java.util.List<QueryHotlineSessionResponseBodyDataCallDetailRecord> callDetailRecord) {
            this.callDetailRecord = callDetailRecord;
            return this;
        }
        public java.util.List<QueryHotlineSessionResponseBodyDataCallDetailRecord> getCallDetailRecord() {
            return this.callDetailRecord;
        }

    }

}
