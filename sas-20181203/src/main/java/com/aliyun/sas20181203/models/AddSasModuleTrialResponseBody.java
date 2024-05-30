// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddSasModuleTrialResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public AddSasModuleTrialResponseBodyData data;

    /**
     * <p>The request ID.</p>
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
         * <p>The purchased quota.</p>
         */
        @NameInMap("AuthLimit")
        public Long authLimit;

        /**
         * <p>List of purchased quotas.</p>
         */
        @NameInMap("AuthLimitList")
        public String authLimitList;

        /**
         * <p>The end time of the trial use.</p>
         */
        @NameInMap("GmtEnd")
        public Long gmtEnd;

        /**
         * <p>The start time of the trial use.</p>
         */
        @NameInMap("GmtStart")
        public Long gmtStart;

        /**
         * <p>The code of the module. Valid values:</p>
         * <br>
         * <p>*   **vulFix**: vulnerability fixing</p>
         * <p>*   **cloudSiem**: threat analysis</p>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        /**
         * <p>The status of the trial use. Valid values:</p>
         * <br>
         * <p>*   **1**: enabled</p>
         * <p>*   **0**: finished</p>
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
