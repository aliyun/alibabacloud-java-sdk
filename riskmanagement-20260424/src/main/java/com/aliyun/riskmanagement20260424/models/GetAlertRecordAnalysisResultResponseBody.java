// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetAlertRecordAnalysisResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAlertRecordAnalysisResultResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AlarmUniqueInfo")
        public String alarmUniqueInfo;

        @NameInMap("AliUid")
        public String aliUid;

        @NameInMap("AnalysisCode")
        public String analysisCode;

        @NameInMap("AnalysisResult")
        public String analysisResult;

        @NameInMap("ChooseLike")
        public Boolean chooseLike;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("MachineInstanceId")
        public String machineInstanceId;

        @NameInMap("Type")
        public String type;

        @NameInMap("UniqueInfo")
        public String uniqueInfo;

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
