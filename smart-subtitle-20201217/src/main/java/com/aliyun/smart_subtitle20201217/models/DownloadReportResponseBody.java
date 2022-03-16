// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smart_subtitle20201217.models;

import com.aliyun.tea.*;

public class DownloadReportResponseBody extends TeaModel {
    @NameInMap("Dashboard")
    public java.util.List<DownloadReportResponseBodyDashboard> dashboard;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("ExcelUrl")
    public String excelUrl;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public String total;

    public static DownloadReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadReportResponseBody self = new DownloadReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadReportResponseBody setDashboard(java.util.List<DownloadReportResponseBodyDashboard> dashboard) {
        this.dashboard = dashboard;
        return this;
    }
    public java.util.List<DownloadReportResponseBodyDashboard> getDashboard() {
        return this.dashboard;
    }

    public DownloadReportResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public DownloadReportResponseBody setExcelUrl(String excelUrl) {
        this.excelUrl = excelUrl;
        return this;
    }
    public String getExcelUrl() {
        return this.excelUrl;
    }

    public DownloadReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadReportResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public static class DownloadReportResponseBodyDashboard extends TeaModel {
        @NameInMap("AliyunId")
        public String aliyunId;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("Time")
        public String time;

        public static DownloadReportResponseBodyDashboard build(java.util.Map<String, ?> map) throws Exception {
            DownloadReportResponseBodyDashboard self = new DownloadReportResponseBodyDashboard();
            return TeaModel.build(map, self);
        }

        public DownloadReportResponseBodyDashboard setAliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public String getAliyunId() {
            return this.aliyunId;
        }

        public DownloadReportResponseBodyDashboard setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public DownloadReportResponseBodyDashboard setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public DownloadReportResponseBodyDashboard setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

}
