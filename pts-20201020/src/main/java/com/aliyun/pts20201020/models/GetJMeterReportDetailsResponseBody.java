// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetJMeterReportDetailsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CodeKey")
    public String codeKey;

    @NameInMap("DocumentUrl")
    public String documentUrl;

    @NameInMap("DynamicCtx")
    public String dynamicCtx;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("ReportOverView")
    public GetJMeterReportDetailsResponseBodyReportOverView reportOverView;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SamplerMetricsList")
    public java.util.List<GetJMeterReportDetailsResponseBodySamplerMetricsList> samplerMetricsList;

    @NameInMap("SceneMetrics")
    public GetJMeterReportDetailsResponseBodySceneMetrics sceneMetrics;

    @NameInMap("Success")
    public Boolean success;

    public static GetJMeterReportDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJMeterReportDetailsResponseBody self = new GetJMeterReportDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJMeterReportDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetJMeterReportDetailsResponseBody setCodeKey(String codeKey) {
        this.codeKey = codeKey;
        return this;
    }
    public String getCodeKey() {
        return this.codeKey;
    }

    public GetJMeterReportDetailsResponseBody setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
        return this;
    }
    public String getDocumentUrl() {
        return this.documentUrl;
    }

    public GetJMeterReportDetailsResponseBody setDynamicCtx(String dynamicCtx) {
        this.dynamicCtx = dynamicCtx;
        return this;
    }
    public String getDynamicCtx() {
        return this.dynamicCtx;
    }

    public GetJMeterReportDetailsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetJMeterReportDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJMeterReportDetailsResponseBody setReportOverView(GetJMeterReportDetailsResponseBodyReportOverView reportOverView) {
        this.reportOverView = reportOverView;
        return this;
    }
    public GetJMeterReportDetailsResponseBodyReportOverView getReportOverView() {
        return this.reportOverView;
    }

    public GetJMeterReportDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJMeterReportDetailsResponseBody setSamplerMetricsList(java.util.List<GetJMeterReportDetailsResponseBodySamplerMetricsList> samplerMetricsList) {
        this.samplerMetricsList = samplerMetricsList;
        return this;
    }
    public java.util.List<GetJMeterReportDetailsResponseBodySamplerMetricsList> getSamplerMetricsList() {
        return this.samplerMetricsList;
    }

    public GetJMeterReportDetailsResponseBody setSceneMetrics(GetJMeterReportDetailsResponseBodySceneMetrics sceneMetrics) {
        this.sceneMetrics = sceneMetrics;
        return this;
    }
    public GetJMeterReportDetailsResponseBodySceneMetrics getSceneMetrics() {
        return this.sceneMetrics;
    }

    public GetJMeterReportDetailsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetJMeterReportDetailsResponseBodyReportOverView extends TeaModel {
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

        public static GetJMeterReportDetailsResponseBodyReportOverView build(java.util.Map<String, ?> map) throws Exception {
            GetJMeterReportDetailsResponseBodyReportOverView self = new GetJMeterReportDetailsResponseBodyReportOverView();
            return TeaModel.build(map, self);
        }

        public GetJMeterReportDetailsResponseBodyReportOverView setAgentCount(Integer agentCount) {
            this.agentCount = agentCount;
            return this;
        }
        public Integer getAgentCount() {
            return this.agentCount;
        }

        public GetJMeterReportDetailsResponseBodyReportOverView setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetJMeterReportDetailsResponseBodyReportOverView setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public GetJMeterReportDetailsResponseBodyReportOverView setReportName(String reportName) {
            this.reportName = reportName;
            return this;
        }
        public String getReportName() {
            return this.reportName;
        }

        public GetJMeterReportDetailsResponseBodyReportOverView setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetJMeterReportDetailsResponseBodyReportOverView setVum(Long vum) {
            this.vum = vum;
            return this;
        }
        public Long getVum() {
            return this.vum;
        }

    }

    public static class GetJMeterReportDetailsResponseBodySamplerMetricsList extends TeaModel {
        @NameInMap("AllCount")
        public Long allCount;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("AvgRt")
        public Double avgRt;

        @NameInMap("AvgTps")
        public Double avgTps;

        @NameInMap("FailCountReq")
        public Long failCountReq;

        @NameInMap("MaxRt")
        public Double maxRt;

        @NameInMap("MinRt")
        public Double minRt;

        @NameInMap("Seg75Rt")
        public Double seg75Rt;

        @NameInMap("Seg90Rt")
        public Double seg90Rt;

        @NameInMap("Seg99Rt")
        public Double seg99Rt;

        @NameInMap("SuccessRateReq")
        public Double successRateReq;

        public static GetJMeterReportDetailsResponseBodySamplerMetricsList build(java.util.Map<String, ?> map) throws Exception {
            GetJMeterReportDetailsResponseBodySamplerMetricsList self = new GetJMeterReportDetailsResponseBodySamplerMetricsList();
            return TeaModel.build(map, self);
        }

        public GetJMeterReportDetailsResponseBodySamplerMetricsList setAllCount(Long allCount) {
            this.allCount = allCount;
            return this;
        }
        public Long getAllCount() {
            return this.allCount;
        }

        public GetJMeterReportDetailsResponseBodySamplerMetricsList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public GetJMeterReportDetailsResponseBodySamplerMetricsList setAvgRt(Double avgRt) {
            this.avgRt = avgRt;
            return this;
        }
        public Double getAvgRt() {
            return this.avgRt;
        }

        public GetJMeterReportDetailsResponseBodySamplerMetricsList setAvgTps(Double avgTps) {
            this.avgTps = avgTps;
            return this;
        }
        public Double getAvgTps() {
            return this.avgTps;
        }

        public GetJMeterReportDetailsResponseBodySamplerMetricsList setFailCountReq(Long failCountReq) {
            this.failCountReq = failCountReq;
            return this;
        }
        public Long getFailCountReq() {
            return this.failCountReq;
        }

        public GetJMeterReportDetailsResponseBodySamplerMetricsList setMaxRt(Double maxRt) {
            this.maxRt = maxRt;
            return this;
        }
        public Double getMaxRt() {
            return this.maxRt;
        }

        public GetJMeterReportDetailsResponseBodySamplerMetricsList setMinRt(Double minRt) {
            this.minRt = minRt;
            return this;
        }
        public Double getMinRt() {
            return this.minRt;
        }

        public GetJMeterReportDetailsResponseBodySamplerMetricsList setSeg75Rt(Double seg75Rt) {
            this.seg75Rt = seg75Rt;
            return this;
        }
        public Double getSeg75Rt() {
            return this.seg75Rt;
        }

        public GetJMeterReportDetailsResponseBodySamplerMetricsList setSeg90Rt(Double seg90Rt) {
            this.seg90Rt = seg90Rt;
            return this;
        }
        public Double getSeg90Rt() {
            return this.seg90Rt;
        }

        public GetJMeterReportDetailsResponseBodySamplerMetricsList setSeg99Rt(Double seg99Rt) {
            this.seg99Rt = seg99Rt;
            return this;
        }
        public Double getSeg99Rt() {
            return this.seg99Rt;
        }

        public GetJMeterReportDetailsResponseBodySamplerMetricsList setSuccessRateReq(Double successRateReq) {
            this.successRateReq = successRateReq;
            return this;
        }
        public Double getSuccessRateReq() {
            return this.successRateReq;
        }

    }

    public static class GetJMeterReportDetailsResponseBodySceneMetrics extends TeaModel {
        @NameInMap("AllCount")
        public Long allCount;

        @NameInMap("AvgRt")
        public Double avgRt;

        @NameInMap("AvgTps")
        public Double avgTps;

        @NameInMap("FailCountReq")
        public Long failCountReq;

        @NameInMap("Seg90Rt")
        public Double seg90Rt;

        @NameInMap("Seg99Rt")
        public Double seg99Rt;

        @NameInMap("SuccessRateReq")
        public Double successRateReq;

        public static GetJMeterReportDetailsResponseBodySceneMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetJMeterReportDetailsResponseBodySceneMetrics self = new GetJMeterReportDetailsResponseBodySceneMetrics();
            return TeaModel.build(map, self);
        }

        public GetJMeterReportDetailsResponseBodySceneMetrics setAllCount(Long allCount) {
            this.allCount = allCount;
            return this;
        }
        public Long getAllCount() {
            return this.allCount;
        }

        public GetJMeterReportDetailsResponseBodySceneMetrics setAvgRt(Double avgRt) {
            this.avgRt = avgRt;
            return this;
        }
        public Double getAvgRt() {
            return this.avgRt;
        }

        public GetJMeterReportDetailsResponseBodySceneMetrics setAvgTps(Double avgTps) {
            this.avgTps = avgTps;
            return this;
        }
        public Double getAvgTps() {
            return this.avgTps;
        }

        public GetJMeterReportDetailsResponseBodySceneMetrics setFailCountReq(Long failCountReq) {
            this.failCountReq = failCountReq;
            return this;
        }
        public Long getFailCountReq() {
            return this.failCountReq;
        }

        public GetJMeterReportDetailsResponseBodySceneMetrics setSeg90Rt(Double seg90Rt) {
            this.seg90Rt = seg90Rt;
            return this;
        }
        public Double getSeg90Rt() {
            return this.seg90Rt;
        }

        public GetJMeterReportDetailsResponseBodySceneMetrics setSeg99Rt(Double seg99Rt) {
            this.seg99Rt = seg99Rt;
            return this;
        }
        public Double getSeg99Rt() {
            return this.seg99Rt;
        }

        public GetJMeterReportDetailsResponseBodySceneMetrics setSuccessRateReq(Double successRateReq) {
            this.successRateReq = successRateReq;
            return this;
        }
        public Double getSuccessRateReq() {
            return this.successRateReq;
        }

    }

}
