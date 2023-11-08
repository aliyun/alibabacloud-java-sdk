// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetModuleTrialAuthInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetModuleTrialAuthInfoResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetModuleTrialAuthInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModuleTrialAuthInfoResponseBody self = new GetModuleTrialAuthInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModuleTrialAuthInfoResponseBody setData(GetModuleTrialAuthInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetModuleTrialAuthInfoResponseBodyData getData() {
        return this.data;
    }

    public GetModuleTrialAuthInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetModuleTrialAuthInfoResponseBodyDataTrialRecordList extends TeaModel {
        @NameInMap("AuthLimit")
        public Long authLimit;

        @NameInMap("GmtEnd")
        public Long gmtEnd;

        @NameInMap("GmtStart")
        public Long gmtStart;

        @NameInMap("ModuleCode")
        public String moduleCode;

        @NameInMap("Status")
        public Integer status;

        public static GetModuleTrialAuthInfoResponseBodyDataTrialRecordList build(java.util.Map<String, ?> map) throws Exception {
            GetModuleTrialAuthInfoResponseBodyDataTrialRecordList self = new GetModuleTrialAuthInfoResponseBodyDataTrialRecordList();
            return TeaModel.build(map, self);
        }

        public GetModuleTrialAuthInfoResponseBodyDataTrialRecordList setAuthLimit(Long authLimit) {
            this.authLimit = authLimit;
            return this;
        }
        public Long getAuthLimit() {
            return this.authLimit;
        }

        public GetModuleTrialAuthInfoResponseBodyDataTrialRecordList setGmtEnd(Long gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public Long getGmtEnd() {
            return this.gmtEnd;
        }

        public GetModuleTrialAuthInfoResponseBodyDataTrialRecordList setGmtStart(Long gmtStart) {
            this.gmtStart = gmtStart;
            return this;
        }
        public Long getGmtStart() {
            return this.gmtStart;
        }

        public GetModuleTrialAuthInfoResponseBodyDataTrialRecordList setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public GetModuleTrialAuthInfoResponseBodyDataTrialRecordList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetModuleTrialAuthInfoResponseBodyData extends TeaModel {
        @NameInMap("CanTry")
        public Boolean canTry;

        @NameInMap("ModuleCode")
        public String moduleCode;

        @NameInMap("TrialRecordList")
        public java.util.List<GetModuleTrialAuthInfoResponseBodyDataTrialRecordList> trialRecordList;

        public static GetModuleTrialAuthInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetModuleTrialAuthInfoResponseBodyData self = new GetModuleTrialAuthInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetModuleTrialAuthInfoResponseBodyData setCanTry(Boolean canTry) {
            this.canTry = canTry;
            return this;
        }
        public Boolean getCanTry() {
            return this.canTry;
        }

        public GetModuleTrialAuthInfoResponseBodyData setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public GetModuleTrialAuthInfoResponseBodyData setTrialRecordList(java.util.List<GetModuleTrialAuthInfoResponseBodyDataTrialRecordList> trialRecordList) {
            this.trialRecordList = trialRecordList;
            return this;
        }
        public java.util.List<GetModuleTrialAuthInfoResponseBodyDataTrialRecordList> getTrialRecordList() {
            return this.trialRecordList;
        }

    }

}
