// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetMonitorResultResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetMonitorResultResponseData data;

    public static GetMonitorResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMonitorResultResponse self = new GetMonitorResultResponse();
        return TeaModel.build(map, self);
    }

    public GetMonitorResultResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMonitorResultResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMonitorResultResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMonitorResultResponse setData(GetMonitorResultResponseData data) {
        this.data = data;
        return this;
    }
    public GetMonitorResultResponseData getData() {
        return this.data;
    }

    public static class GetMonitorResultResponseDataRecordsExtendInfo extends TeaModel {
        @NameInMap("PlateNo")
        @Validation(required = true)
        public String plateNo;

        public static GetMonitorResultResponseDataRecordsExtendInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMonitorResultResponseDataRecordsExtendInfo self = new GetMonitorResultResponseDataRecordsExtendInfo();
            return TeaModel.build(map, self);
        }

        public GetMonitorResultResponseDataRecordsExtendInfo setPlateNo(String plateNo) {
            this.plateNo = plateNo;
            return this;
        }
        public String getPlateNo() {
            return this.plateNo;
        }

    }

    public static class GetMonitorResultResponseDataRecords extends TeaModel {
        @NameInMap("RightBottomY")
        @Validation(required = true)
        public String rightBottomY;

        @NameInMap("RightBottomX")
        @Validation(required = true)
        public String rightBottomX;

        @NameInMap("LeftUpY")
        @Validation(required = true)
        public String leftUpY;

        @NameInMap("LeftUpX")
        @Validation(required = true)
        public String leftUpX;

        @NameInMap("GbId")
        @Validation(required = true)
        public String gbId;

        @NameInMap("Score")
        @Validation(required = true)
        public String score;

        @NameInMap("PicUrl")
        @Validation(required = true)
        public String picUrl;

        @NameInMap("ShotTime")
        @Validation(required = true)
        public String shotTime;

        @NameInMap("MonitorPicUrl")
        @Validation(required = true)
        public String monitorPicUrl;

        @NameInMap("TargetPicUrl")
        @Validation(required = true)
        public String targetPicUrl;

        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("ExtendInfo")
        @Validation(required = true)
        public GetMonitorResultResponseDataRecordsExtendInfo extendInfo;

        public static GetMonitorResultResponseDataRecords build(java.util.Map<String, ?> map) throws Exception {
            GetMonitorResultResponseDataRecords self = new GetMonitorResultResponseDataRecords();
            return TeaModel.build(map, self);
        }

        public GetMonitorResultResponseDataRecords setRightBottomY(String rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public String getRightBottomY() {
            return this.rightBottomY;
        }

        public GetMonitorResultResponseDataRecords setRightBottomX(String rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public String getRightBottomX() {
            return this.rightBottomX;
        }

        public GetMonitorResultResponseDataRecords setLeftUpY(String leftUpY) {
            this.leftUpY = leftUpY;
            return this;
        }
        public String getLeftUpY() {
            return this.leftUpY;
        }

        public GetMonitorResultResponseDataRecords setLeftUpX(String leftUpX) {
            this.leftUpX = leftUpX;
            return this;
        }
        public String getLeftUpX() {
            return this.leftUpX;
        }

        public GetMonitorResultResponseDataRecords setGbId(String gbId) {
            this.gbId = gbId;
            return this;
        }
        public String getGbId() {
            return this.gbId;
        }

        public GetMonitorResultResponseDataRecords setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetMonitorResultResponseDataRecords setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public GetMonitorResultResponseDataRecords setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public GetMonitorResultResponseDataRecords setMonitorPicUrl(String monitorPicUrl) {
            this.monitorPicUrl = monitorPicUrl;
            return this;
        }
        public String getMonitorPicUrl() {
            return this.monitorPicUrl;
        }

        public GetMonitorResultResponseDataRecords setTargetPicUrl(String targetPicUrl) {
            this.targetPicUrl = targetPicUrl;
            return this;
        }
        public String getTargetPicUrl() {
            return this.targetPicUrl;
        }

        public GetMonitorResultResponseDataRecords setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetMonitorResultResponseDataRecords setExtendInfo(GetMonitorResultResponseDataRecordsExtendInfo extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public GetMonitorResultResponseDataRecordsExtendInfo getExtendInfo() {
            return this.extendInfo;
        }

    }

    public static class GetMonitorResultResponseData extends TeaModel {
        @NameInMap("MaxId")
        @Validation(required = true)
        public String maxId;

        @NameInMap("Records")
        @Validation(required = true)
        public java.util.List<GetMonitorResultResponseDataRecords> records;

        public static GetMonitorResultResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMonitorResultResponseData self = new GetMonitorResultResponseData();
            return TeaModel.build(map, self);
        }

        public GetMonitorResultResponseData setMaxId(String maxId) {
            this.maxId = maxId;
            return this;
        }
        public String getMaxId() {
            return this.maxId;
        }

        public GetMonitorResultResponseData setRecords(java.util.List<GetMonitorResultResponseDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<GetMonitorResultResponseDataRecords> getRecords() {
            return this.records;
        }

    }

}
