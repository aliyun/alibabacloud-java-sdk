// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddSasModuleTrialResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public AddSasModuleTrialResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>09969D2C-4FAD-429E-BFBF-9A60DEF8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddSasModuleTrialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSasModuleTrialResponseBody self = new AddSasModuleTrialResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSasModuleTrialResponseBody setData(AddSasModuleTrialResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddSasModuleTrialResponseBodyData getData() {
        return this.data;
    }

    public AddSasModuleTrialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddSasModuleTrialResponseBodyDataTrialRecordList extends TeaModel {
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
         * <p>1638201599999</p>
         */
        @NameInMap("GmtEnd")
        public Long gmtEnd;

        /**
         * <p>The start time of the trial use.</p>
         * 
         * <strong>example:</strong>
         * <p>1667232000000</p>
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

        public static AddSasModuleTrialResponseBodyDataTrialRecordList build(java.util.Map<String, ?> map) throws Exception {
            AddSasModuleTrialResponseBodyDataTrialRecordList self = new AddSasModuleTrialResponseBodyDataTrialRecordList();
            return TeaModel.build(map, self);
        }

        public AddSasModuleTrialResponseBodyDataTrialRecordList setAuthLimit(Long authLimit) {
            this.authLimit = authLimit;
            return this;
        }
        public Long getAuthLimit() {
            return this.authLimit;
        }

        public AddSasModuleTrialResponseBodyDataTrialRecordList setAuthLimitList(String authLimitList) {
            this.authLimitList = authLimitList;
            return this;
        }
        public String getAuthLimitList() {
            return this.authLimitList;
        }

        public AddSasModuleTrialResponseBodyDataTrialRecordList setGmtEnd(Long gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public Long getGmtEnd() {
            return this.gmtEnd;
        }

        public AddSasModuleTrialResponseBodyDataTrialRecordList setGmtStart(Long gmtStart) {
            this.gmtStart = gmtStart;
            return this;
        }
        public Long getGmtStart() {
            return this.gmtStart;
        }

        public AddSasModuleTrialResponseBodyDataTrialRecordList setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public AddSasModuleTrialResponseBodyDataTrialRecordList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class AddSasModuleTrialResponseBodyData extends TeaModel {
        /**
         * <p>The information about the trial use.</p>
         */
        @NameInMap("TrialRecordList")
        public java.util.List<AddSasModuleTrialResponseBodyDataTrialRecordList> trialRecordList;

        public static AddSasModuleTrialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddSasModuleTrialResponseBodyData self = new AddSasModuleTrialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddSasModuleTrialResponseBodyData setTrialRecordList(java.util.List<AddSasModuleTrialResponseBodyDataTrialRecordList> trialRecordList) {
            this.trialRecordList = trialRecordList;
            return this;
        }
        public java.util.List<AddSasModuleTrialResponseBodyDataTrialRecordList> getTrialRecordList() {
            return this.trialRecordList;
        }

    }

}
