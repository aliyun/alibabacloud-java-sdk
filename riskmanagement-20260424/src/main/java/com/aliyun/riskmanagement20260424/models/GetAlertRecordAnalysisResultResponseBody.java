// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetAlertRecordAnalysisResultResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetAlertRecordAnalysisResultResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful‌</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>99D93ED4-D462-5FC5-8518-9BC1C49C7B6C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call is successful.                               </li>
     * <li><strong>false</strong>: The call fails.</li>
     * </ul>
     * 
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
         * <p>The unique identifier of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>179deb12f25baac9b1e2909c419bcb1f</p>
         */
        @NameInMap("AlarmUniqueInfo")
        public String alarmUniqueInfo;

        /**
         * <p>The 16-digit AliUid of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>1248751055158884</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <p>The code of the tracing result.</p>
         * 
         * <strong>example:</strong>
         * <p>test_code</p>
         */
        @NameInMap("AnalysisCode")
        public String analysisCode;

        /**
         * <p>The text of the tracing result.</p>
         * 
         * <strong>example:</strong>
         * <p>exception_alert</p>
         */
        @NameInMap("AnalysisResult")
        public String analysisResult;

        /**
         * <p>Indicates whether the result is liked. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Liked.</li>
         * <li><strong>false</strong>: Not liked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ChooseLike")
        public Boolean chooseLike;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>110.22.*8.111</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The instance ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>i-adadasd-a**</p>
         */
        @NameInMap("MachineInstanceId")
        public String machineInstanceId;

        /**
         * <p>The display mode of the exception event details. Valid values:</p>
         * <ul>
         * <li><strong>text</strong>: plain text</li>
         * <li><strong>html</strong>: rich text</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auto_breaking</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The unique ID of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>390317ce81d28bbbd83c05a90b39cd6c</p>
         */
        @NameInMap("UniqueInfo")
        public String uniqueInfo;

        /**
         * <p>The UUID of the server.</p>
         * 
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
         * <p>The code of the tracing result. (Deprecated)</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AnalysisCode")
        public String analysisCode;

        /**
         * <p>The list of tracing results.</p>
         */
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
