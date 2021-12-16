// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryHotlineSessionRequest extends TeaModel {
    @NameInMap("Acid")
    public String acid;

    @NameInMap("CallResult")
    public String callResult;

    @NameInMap("CallType")
    public Integer callType;

    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("CallingNumber")
    public String callingNumber;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MemberId")
    public String memberId;

    @NameInMap("MemberName")
    public String memberName;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Params")
    public String params;

    @NameInMap("QueryEndTime")
    public Long queryEndTime;

    @NameInMap("QueryStartTime")
    public Long queryStartTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServicerId")
    public String servicerId;

    @NameInMap("ServicerName")
    public String servicerName;

    public static QueryHotlineSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHotlineSessionRequest self = new QueryHotlineSessionRequest();
        return TeaModel.build(map, self);
    }

    public QueryHotlineSessionRequest setAcid(String acid) {
        this.acid = acid;
        return this;
    }
    public String getAcid() {
        return this.acid;
    }

    public QueryHotlineSessionRequest setCallResult(String callResult) {
        this.callResult = callResult;
        return this;
    }
    public String getCallResult() {
        return this.callResult;
    }

    public QueryHotlineSessionRequest setCallType(Integer callType) {
        this.callType = callType;
        return this;
    }
    public Integer getCallType() {
        return this.callType;
    }

    public QueryHotlineSessionRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public QueryHotlineSessionRequest setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
    }

    public QueryHotlineSessionRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public QueryHotlineSessionRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public QueryHotlineSessionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryHotlineSessionRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public QueryHotlineSessionRequest setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }
    public String getMemberName() {
        return this.memberName;
    }

    public QueryHotlineSessionRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryHotlineSessionRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryHotlineSessionRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public QueryHotlineSessionRequest setQueryEndTime(Long queryEndTime) {
        this.queryEndTime = queryEndTime;
        return this;
    }
    public Long getQueryEndTime() {
        return this.queryEndTime;
    }

    public QueryHotlineSessionRequest setQueryStartTime(Long queryStartTime) {
        this.queryStartTime = queryStartTime;
        return this;
    }
    public Long getQueryStartTime() {
        return this.queryStartTime;
    }

    public QueryHotlineSessionRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHotlineSessionRequest setServicerId(String servicerId) {
        this.servicerId = servicerId;
        return this;
    }
    public String getServicerId() {
        return this.servicerId;
    }

    public QueryHotlineSessionRequest setServicerName(String servicerName) {
        this.servicerName = servicerName;
        return this;
    }
    public String getServicerName() {
        return this.servicerName;
    }

}
