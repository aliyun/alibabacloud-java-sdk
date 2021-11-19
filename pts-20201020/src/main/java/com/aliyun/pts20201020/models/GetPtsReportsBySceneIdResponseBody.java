// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsReportsBySceneIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("ReportOverViewList")
    public java.util.List<GetPtsReportsBySceneIdResponseBodyReportOverViewList> reportOverViewList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetPtsReportsBySceneIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPtsReportsBySceneIdResponseBody self = new GetPtsReportsBySceneIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPtsReportsBySceneIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPtsReportsBySceneIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPtsReportsBySceneIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPtsReportsBySceneIdResponseBody setReportOverViewList(java.util.List<GetPtsReportsBySceneIdResponseBodyReportOverViewList> reportOverViewList) {
        this.reportOverViewList = reportOverViewList;
        return this;
    }
    public java.util.List<GetPtsReportsBySceneIdResponseBodyReportOverViewList> getReportOverViewList() {
        return this.reportOverViewList;
    }

    public GetPtsReportsBySceneIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPtsReportsBySceneIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPtsReportsBySceneIdResponseBodyReportOverViewList extends TeaModel {
        @NameInMap("AgentCount")
        public Integer agentCount;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ReportId")
        public String reportId;

        @NameInMap("ReportName")
        public String reportName;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Vum")
        public Long vum;

        public static GetPtsReportsBySceneIdResponseBodyReportOverViewList build(java.util.Map<String, ?> map) throws Exception {
            GetPtsReportsBySceneIdResponseBodyReportOverViewList self = new GetPtsReportsBySceneIdResponseBodyReportOverViewList();
            return TeaModel.build(map, self);
        }

        public GetPtsReportsBySceneIdResponseBodyReportOverViewList setAgentCount(Integer agentCount) {
            this.agentCount = agentCount;
            return this;
        }
        public Integer getAgentCount() {
            return this.agentCount;
        }

        public GetPtsReportsBySceneIdResponseBodyReportOverViewList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetPtsReportsBySceneIdResponseBodyReportOverViewList setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public GetPtsReportsBySceneIdResponseBodyReportOverViewList setReportName(String reportName) {
            this.reportName = reportName;
            return this;
        }
        public String getReportName() {
            return this.reportName;
        }

        public GetPtsReportsBySceneIdResponseBodyReportOverViewList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetPtsReportsBySceneIdResponseBodyReportOverViewList setVum(Long vum) {
            this.vum = vum;
            return this;
        }
        public Long getVum() {
            return this.vum;
        }

    }

}
