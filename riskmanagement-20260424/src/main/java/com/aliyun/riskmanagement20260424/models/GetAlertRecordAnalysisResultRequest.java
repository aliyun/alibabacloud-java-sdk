// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetAlertRecordAnalysisResultRequest extends TeaModel {
    /**
     * <p>The unique identifier of the alert event. (Deprecated)</p>
     * 
     * <strong>example:</strong>
     * <p>9b57f0fcf98181df8d8487d1cc91cb8d</p>
     */
    @NameInMap("AlarmUniqueInfo")
    public String alarmUniqueInfo;

    /**
     * <p>The language of the content. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>The unique ID of the alert event. (Deprecated)</p>
     * 
     * <strong>example:</strong>
     * <p>fc312aa0c32ba8a6147db6221fb1c1ee</p>
     */
    @NameInMap("UniqueInfo")
    public String uniqueInfo;

    /**
     * <p>The array of tracing requests.</p>
     */
    @NameInMap("UniqueTagList")
    public java.util.List<GetAlertRecordAnalysisResultRequestUniqueTagList> uniqueTagList;

    /**
     * <p>The unique identifier of the asset. (Deprecated)</p>
     * 
     * <strong>example:</strong>
     * <p>ebde6d4e3e4aba728962eec43a69196e9J7tt7H47Pc</p>
     */
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
        /**
         * <p>The unique ID of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>10a19b654e73ff079ede61ce3f4465e0</p>
         */
        @NameInMap("AlarmUniqueInfo")
        public String alarmUniqueInfo;

        /**
         * <p>Indicates whether the result is liked. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Liked.</li>
         * <li><strong>false</strong>: Not liked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ChooseLike")
        public Boolean chooseLike;

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp19up785757dz800</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-rj9c7d4bli38***tuym</p>
         */
        @NameInMap("MachineInstanceId")
        public String machineInstanceId;

        /**
         * <p>The query tracing time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-27 00:00:00</p>
         */
        @NameInMap("QueryTime")
        public String queryTime;

        /**
         * <p>The vulnerability type.</p>
         * 
         * <strong>example:</strong>
         * <p>BusinessLicense</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The unique identifier of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>fc312aa0c32ba8a6147db6221fb1c1ee</p>
         */
        @NameInMap("UniqueInfo")
        public String uniqueInfo;

        /**
         * <p>The unique identifier of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>3309e55fcb1ed8d4bc6af098e62e0353RNabnQSO1bx</p>
         */
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
