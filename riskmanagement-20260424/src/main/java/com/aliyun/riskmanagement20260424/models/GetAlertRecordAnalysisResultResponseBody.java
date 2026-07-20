// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetAlertRecordAnalysisResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAlertRecordAnalysisResultResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful‌</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>99D93ED4-D462-5FC5-8518-9BC1C49C7B6C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAlertRecordAnalysisResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlertRecordAnalysisResultResponseBody self = new GetAlertRecordAnalysisResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlertRecordAnalysisResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAlertRecordAnalysisResultResponseBody setData(GetAlertRecordAnalysisResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAlertRecordAnalysisResultResponseBodyData getData() {
        return this.data;
    }

    public GetAlertRecordAnalysisResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAlertRecordAnalysisResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAlertRecordAnalysisResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAlertRecordAnalysisResultResponseBodyDataUniqueTagList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>179deb12f25baac9b1e2909c419bcb1f</p>
         */
        @NameInMap("AlarmUniqueInfo")
        public String alarmUniqueInfo;

        /**
         * <strong>example:</strong>
         * <p>1248751055158884</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <strong>example:</strong>
         * <p>test_code</p>
         */
        @NameInMap("AnalysisCode")
        public String analysisCode;

        /**
         * <strong>example:</strong>
         * <p>exception_alert</p>
         */
        @NameInMap("AnalysisResult")
        public String analysisResult;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ChooseLike")
        public Boolean chooseLike;

        /**
         * <strong>example:</strong>
         * <p>110.22.*8.111</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>i-adadasd-a**</p>
         */
        @NameInMap("MachineInstanceId")
        public String machineInstanceId;

        /**
         * <strong>example:</strong>
         * <p>auto_breaking</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>390317ce81d28bbbd83c05a90b39cd6c</p>
         */
        @NameInMap("UniqueInfo")
        public String uniqueInfo;

        /**
         * <strong>example:</strong>
         * <p>bb3051ca-c0dd-4da2-91be-ea5c80926132</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static GetAlertRecordAnalysisResultResponseBodyDataUniqueTagList build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRecordAnalysisResultResponseBodyDataUniqueTagList self = new GetAlertRecordAnalysisResultResponseBodyDataUniqueTagList();
            return TeaModel.build(map, self);
        }

        public GetAlertRecordAnalysisResultResponseBodyDataUniqueTagList setAlarmUniqueInfo(String alarmUniqueInfo) {
            this.alarmUniqueInfo = alarmUniqueInfo;
            return this;
        }
        public String getAlarmUniqueInfo() {
            return this.alarmUniqueInfo;
        }

        public GetAlertRecordAnalysisResultResponseBodyDataUniqueTagList setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public GetAlertRecordAnalysisResultResponseBodyDataUniqueTagList setAnalysisCode(String analysisCode) {
            this.analysisCode = analysisCode;
            return this;
        }
        public String getAnalysisCode() {
            return this.analysisCode;
        }

        public GetAlertRecordAnalysisResultResponseBodyDataUniqueTagList setAnalysisResult(String analysisResult) {
            this.analysisResult = analysisResult;
            return this;
        }
        public String getAnalysisResult() {
            return this.analysisResult;
        }

        public GetAlertRecordAnalysisResultResponseBodyDataUniqueTagList setChooseLike(Boolean chooseLike) {
            this.chooseLike = chooseLike;
            return this;
        }
        public Boolean getChooseLike() {
            return this.chooseLike;
        }

        public GetAlertRecordAnalysisResultResponseBodyDataUniqueTagList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetAlertRecordAnalysisResultResponseBodyDataUniqueTagList setMachineInstanceId(String machineInstanceId) {
            this.machineInstanceId = machineInstanceId;
            return this;
        }
        public String getMachineInstanceId() {
            return this.machineInstanceId;
        }

        public GetAlertRecordAnalysisResultResponseBodyDataUniqueTagList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAlertRecordAnalysisResultResponseBodyDataUniqueTagList setUniqueInfo(String uniqueInfo) {
            this.uniqueInfo = uniqueInfo;
            return this;
        }
        public String getUniqueInfo() {
            return this.uniqueInfo;
        }

        public GetAlertRecordAnalysisResultResponseBodyDataUniqueTagList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class GetAlertRecordAnalysisResultResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AnalysisCode")
        public String analysisCode;

        @NameInMap("UniqueTagList")
        public java.util.List<GetAlertRecordAnalysisResultResponseBodyDataUniqueTagList> uniqueTagList;

        public static GetAlertRecordAnalysisResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRecordAnalysisResultResponseBodyData self = new GetAlertRecordAnalysisResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAlertRecordAnalysisResultResponseBodyData setAnalysisCode(String analysisCode) {
            this.analysisCode = analysisCode;
            return this;
        }
        public String getAnalysisCode() {
            return this.analysisCode;
        }

        public GetAlertRecordAnalysisResultResponseBodyData setUniqueTagList(java.util.List<GetAlertRecordAnalysisResultResponseBodyDataUniqueTagList> uniqueTagList) {
            this.uniqueTagList = uniqueTagList;
            return this;
        }
        public java.util.List<GetAlertRecordAnalysisResultResponseBodyDataUniqueTagList> getUniqueTagList() {
            return this.uniqueTagList;
        }

    }

}
