// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetAlertRecordAnalysisResultRequest extends TeaModel {
    @NameInMap("AlarmUniqueInfo")
    public String alarmUniqueInfo;

    @NameInMap("AliyunLang")
    public String aliyunLang;

    @NameInMap("UniqueInfo")
    public String uniqueInfo;

    @NameInMap("UniqueTagList")
    public java.util.List<GetAlertRecordAnalysisResultRequestUniqueTagList> uniqueTagList;

    @NameInMap("Uuid")
    public String uuid;

    public static GetAlertRecordAnalysisResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlertRecordAnalysisResultRequest self = new GetAlertRecordAnalysisResultRequest();
        return TeaModel.build(map, self);
    }

    public GetAlertRecordAnalysisResultRequest setAlarmUniqueInfo(String alarmUniqueInfo) {
        this.alarmUniqueInfo = alarmUniqueInfo;
        return this;
    }
    public String getAlarmUniqueInfo() {
        return this.alarmUniqueInfo;
    }

    public GetAlertRecordAnalysisResultRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public GetAlertRecordAnalysisResultRequest setUniqueInfo(String uniqueInfo) {
        this.uniqueInfo = uniqueInfo;
        return this;
    }
    public String getUniqueInfo() {
        return this.uniqueInfo;
    }

    public GetAlertRecordAnalysisResultRequest setUniqueTagList(java.util.List<GetAlertRecordAnalysisResultRequestUniqueTagList> uniqueTagList) {
        this.uniqueTagList = uniqueTagList;
        return this;
    }
    public java.util.List<GetAlertRecordAnalysisResultRequestUniqueTagList> getUniqueTagList() {
        return this.uniqueTagList;
    }

    public GetAlertRecordAnalysisResultRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public static class GetAlertRecordAnalysisResultRequestUniqueTagList extends TeaModel {
        @NameInMap("AlarmUniqueInfo")
        public String alarmUniqueInfo;

        @NameInMap("ChooseLike")
        public Boolean chooseLike;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("MachineInstanceId")
        public String machineInstanceId;

        @NameInMap("QueryTime")
        public String queryTime;

        @NameInMap("Type")
        public String type;

        @NameInMap("UniqueInfo")
        public String uniqueInfo;

        @NameInMap("Uuid")
        public String uuid;

        public static GetAlertRecordAnalysisResultRequestUniqueTagList build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRecordAnalysisResultRequestUniqueTagList self = new GetAlertRecordAnalysisResultRequestUniqueTagList();
            return TeaModel.build(map, self);
        }

        public GetAlertRecordAnalysisResultRequestUniqueTagList setAlarmUniqueInfo(String alarmUniqueInfo) {
            this.alarmUniqueInfo = alarmUniqueInfo;
            return this;
        }
        public String getAlarmUniqueInfo() {
            return this.alarmUniqueInfo;
        }

        public GetAlertRecordAnalysisResultRequestUniqueTagList setChooseLike(Boolean chooseLike) {
            this.chooseLike = chooseLike;
            return this;
        }
        public Boolean getChooseLike() {
            return this.chooseLike;
        }

        public GetAlertRecordAnalysisResultRequestUniqueTagList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetAlertRecordAnalysisResultRequestUniqueTagList setMachineInstanceId(String machineInstanceId) {
            this.machineInstanceId = machineInstanceId;
            return this;
        }
        public String getMachineInstanceId() {
            return this.machineInstanceId;
        }

        public GetAlertRecordAnalysisResultRequestUniqueTagList setQueryTime(String queryTime) {
            this.queryTime = queryTime;
            return this;
        }
        public String getQueryTime() {
            return this.queryTime;
        }

        public GetAlertRecordAnalysisResultRequestUniqueTagList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAlertRecordAnalysisResultRequestUniqueTagList setUniqueInfo(String uniqueInfo) {
            this.uniqueInfo = uniqueInfo;
            return this;
        }
        public String getUniqueInfo() {
            return this.uniqueInfo;
        }

        public GetAlertRecordAnalysisResultRequestUniqueTagList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
