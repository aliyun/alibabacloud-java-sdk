// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetCallsPerDayResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCallsPerDayResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetCallsPerDayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCallsPerDayResponseBody self = new GetCallsPerDayResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCallsPerDayResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCallsPerDayResponseBody setData(GetCallsPerDayResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCallsPerDayResponseBodyData getData() {
        return this.data;
    }

    public GetCallsPerDayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCallsPerDayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCallsPerDayResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetCallsPerDayResponseBodyDataCallsPerdayResponseList extends TeaModel {
        @NameInMap("CallInCnt")
        public String callInCnt;

        @NameInMap("CallOutCnt")
        public String callOutCnt;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("HourId")
        public String hourId;

        @NameInMap("MinuteId")
        public String minuteId;

        @NameInMap("PhoneNum")
        public String phoneNum;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TenantName")
        public String tenantName;

        public static GetCallsPerDayResponseBodyDataCallsPerdayResponseList build(java.util.Map<String, ?> map) throws Exception {
            GetCallsPerDayResponseBodyDataCallsPerdayResponseList self = new GetCallsPerDayResponseBodyDataCallsPerdayResponseList();
            return TeaModel.build(map, self);
        }

        public GetCallsPerDayResponseBodyDataCallsPerdayResponseList setCallInCnt(String callInCnt) {
            this.callInCnt = callInCnt;
            return this;
        }
        public String getCallInCnt() {
            return this.callInCnt;
        }

        public GetCallsPerDayResponseBodyDataCallsPerdayResponseList setCallOutCnt(String callOutCnt) {
            this.callOutCnt = callOutCnt;
            return this;
        }
        public String getCallOutCnt() {
            return this.callOutCnt;
        }

        public GetCallsPerDayResponseBodyDataCallsPerdayResponseList setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public GetCallsPerDayResponseBodyDataCallsPerdayResponseList setHourId(String hourId) {
            this.hourId = hourId;
            return this;
        }
        public String getHourId() {
            return this.hourId;
        }

        public GetCallsPerDayResponseBodyDataCallsPerdayResponseList setMinuteId(String minuteId) {
            this.minuteId = minuteId;
            return this;
        }
        public String getMinuteId() {
            return this.minuteId;
        }

        public GetCallsPerDayResponseBodyDataCallsPerdayResponseList setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }
        public String getPhoneNum() {
            return this.phoneNum;
        }

        public GetCallsPerDayResponseBodyDataCallsPerdayResponseList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetCallsPerDayResponseBodyDataCallsPerdayResponseList setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

    }

    public static class GetCallsPerDayResponseBodyData extends TeaModel {
        @NameInMap("CallsPerdayResponseList")
        public java.util.List<GetCallsPerDayResponseBodyDataCallsPerdayResponseList> callsPerdayResponseList;

        @NameInMap("PageNo")
        public String pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalNum")
        public Long totalNum;

        public static GetCallsPerDayResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCallsPerDayResponseBodyData self = new GetCallsPerDayResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCallsPerDayResponseBodyData setCallsPerdayResponseList(java.util.List<GetCallsPerDayResponseBodyDataCallsPerdayResponseList> callsPerdayResponseList) {
            this.callsPerdayResponseList = callsPerdayResponseList;
            return this;
        }
        public java.util.List<GetCallsPerDayResponseBodyDataCallsPerdayResponseList> getCallsPerdayResponseList() {
            return this.callsPerdayResponseList;
        }

        public GetCallsPerDayResponseBodyData setPageNo(String pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public String getPageNo() {
            return this.pageNo;
        }

        public GetCallsPerDayResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetCallsPerDayResponseBodyData setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
