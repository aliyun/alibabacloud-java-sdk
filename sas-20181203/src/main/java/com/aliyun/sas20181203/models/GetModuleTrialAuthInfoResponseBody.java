// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetModuleTrialAuthInfoResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetModuleTrialAuthInfoResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
     */
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
        /**
         * <p>The quota.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AuthLimit")
        public Long authLimit;

        /**
         * <p>The list of quotas. This parameter is available if the value of the ModuleCode parameter is cloudSiem. The value of this parameter consists of the log storage capacity for the threat analysis and response feature and the log data to add. Units: GB and GB-day.</p>
         * 
         * <strong>example:</strong>
         * <p>[1,100]</p>
         */
        @NameInMap("AuthLimitList")
        public String authLimitList;

        /**
         * <p>The end time of the trial use.</p>
         * 
         * <strong>example:</strong>
         * <p>1679760000000</p>
         */
        @NameInMap("GmtEnd")
        public Long gmtEnd;

        /**
         * <p>The start time of the trial use.</p>
         * 
         * <strong>example:</strong>
         * <p>1669824000000</p>
         */
        @NameInMap("GmtStart")
        public Long gmtStart;

        /**
         * <p>The code of the feature. Valid values:</p>
         * <ul>
         * <li><strong>vulFix</strong>: vulnerability fixing.</li>
         * <li><strong>cloudSiem</strong>: threat analysis and response.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vulFix</p>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        /**
         * <p>The status of the trial use. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The feature is in trial use.</li>
         * <li><strong>0</strong>: The trial use ends.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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

        public GetModuleTrialAuthInfoResponseBodyDataTrialRecordList setAuthLimitList(String authLimitList) {
            this.authLimitList = authLimitList;
            return this;
        }
        public String getAuthLimitList() {
            return this.authLimitList;
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
        /**
         * <p>Indicates whether the user is qualified for the trial use. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanTry")
        public Boolean canTry;

        /**
         * <p>The code of the feature. Valid values:</p>
         * <ul>
         * <li><strong>vulFix</strong>: vulnerability fixing.</li>
         * <li><strong>cloudSiem</strong>: threat analysis and response.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vulFix</p>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        /**
         * <p>The trial use record.</p>
         */
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
