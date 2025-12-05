// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsReportsBySceneIdResponseBody extends TeaModel {
    /**
     * <p>The system status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message. If the request was successful, this parameter is left empty.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The reports.</p>
     */
    @NameInMap("ReportOverViewList")
    public java.util.List<GetPtsReportsBySceneIdResponseBodyReportOverViewList> reportOverViewList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DC4E3177-6745-4925-B423-4E89VV34221A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The number of stress testers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentCount")
        public Integer agentCount;

        /**
         * <p>The end time of the stress testing.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-26 16:38:30</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The report ID.</p>
         * 
         * <strong>example:</strong>
         * <p>NGGB5FV</p>
         */
        @NameInMap("ReportId")
        public String reportId;

        /**
         * <p>The title of the report.</p>
         * 
         * <strong>example:</strong>
         * <p>PTS-test-20240920094710</p>
         */
        @NameInMap("ReportName")
        public String reportName;

        /**
         * <p>The start time of the stress testing.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-26 16:28:30</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The consumed Virtual User Minutes (VUM).</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
