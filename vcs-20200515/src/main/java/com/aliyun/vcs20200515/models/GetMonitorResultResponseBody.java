// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetMonitorResultResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetMonitorResultResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static GetMonitorResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMonitorResultResponseBody self = new GetMonitorResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMonitorResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMonitorResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMonitorResultResponseBody setData(GetMonitorResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMonitorResultResponseBodyData getData() {
        return this.data;
    }

    public GetMonitorResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetMonitorResultResponseBodyDataRecordsExtendInfo extends TeaModel {
        @NameInMap("PlateNo")
        public String plateNo;

        public static GetMonitorResultResponseBodyDataRecordsExtendInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMonitorResultResponseBodyDataRecordsExtendInfo self = new GetMonitorResultResponseBodyDataRecordsExtendInfo();
            return TeaModel.build(map, self);
        }

        public GetMonitorResultResponseBodyDataRecordsExtendInfo setPlateNo(String plateNo) {
            this.plateNo = plateNo;
            return this;
        }
        public String getPlateNo() {
            return this.plateNo;
        }

    }

    public static class GetMonitorResultResponseBodyDataRecords extends TeaModel {
        @NameInMap("PicUrl")
        public String picUrl;

        @NameInMap("RightBottomY")
        public String rightBottomY;

        @NameInMap("Score")
        public String score;

        @NameInMap("MonitorPicUrl")
        public String monitorPicUrl;

        @NameInMap("RightBottomX")
        public String rightBottomX;

        @NameInMap("ExtendInfo")
        public GetMonitorResultResponseBodyDataRecordsExtendInfo extendInfo;

        @NameInMap("GbId")
        public String gbId;

        @NameInMap("LeftUpY")
        public String leftUpY;

        @NameInMap("LeftUpX")
        public String leftUpX;

        @NameInMap("ShotTime")
        public String shotTime;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TargetPicUrl")
        public String targetPicUrl;

        public static GetMonitorResultResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            GetMonitorResultResponseBodyDataRecords self = new GetMonitorResultResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public GetMonitorResultResponseBodyDataRecords setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public GetMonitorResultResponseBodyDataRecords setRightBottomY(String rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public String getRightBottomY() {
            return this.rightBottomY;
        }

        public GetMonitorResultResponseBodyDataRecords setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetMonitorResultResponseBodyDataRecords setMonitorPicUrl(String monitorPicUrl) {
            this.monitorPicUrl = monitorPicUrl;
            return this;
        }
        public String getMonitorPicUrl() {
            return this.monitorPicUrl;
        }

        public GetMonitorResultResponseBodyDataRecords setRightBottomX(String rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public String getRightBottomX() {
            return this.rightBottomX;
        }

        public GetMonitorResultResponseBodyDataRecords setExtendInfo(GetMonitorResultResponseBodyDataRecordsExtendInfo extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public GetMonitorResultResponseBodyDataRecordsExtendInfo getExtendInfo() {
            return this.extendInfo;
        }

        public GetMonitorResultResponseBodyDataRecords setGbId(String gbId) {
            this.gbId = gbId;
            return this;
        }
        public String getGbId() {
            return this.gbId;
        }

        public GetMonitorResultResponseBodyDataRecords setLeftUpY(String leftUpY) {
            this.leftUpY = leftUpY;
            return this;
        }
        public String getLeftUpY() {
            return this.leftUpY;
        }

        public GetMonitorResultResponseBodyDataRecords setLeftUpX(String leftUpX) {
            this.leftUpX = leftUpX;
            return this;
        }
        public String getLeftUpX() {
            return this.leftUpX;
        }

        public GetMonitorResultResponseBodyDataRecords setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public GetMonitorResultResponseBodyDataRecords setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetMonitorResultResponseBodyDataRecords setTargetPicUrl(String targetPicUrl) {
            this.targetPicUrl = targetPicUrl;
            return this;
        }
        public String getTargetPicUrl() {
            return this.targetPicUrl;
        }

    }

    public static class GetMonitorResultResponseBodyData extends TeaModel {
        @NameInMap("MaxId")
        public String maxId;

        @NameInMap("Records")
        public java.util.List<GetMonitorResultResponseBodyDataRecords> records;

        public static GetMonitorResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMonitorResultResponseBodyData self = new GetMonitorResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMonitorResultResponseBodyData setMaxId(String maxId) {
            this.maxId = maxId;
            return this;
        }
        public String getMaxId() {
            return this.maxId;
        }

        public GetMonitorResultResponseBodyData setRecords(java.util.List<GetMonitorResultResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<GetMonitorResultResponseBodyDataRecords> getRecords() {
            return this.records;
        }

    }

}
