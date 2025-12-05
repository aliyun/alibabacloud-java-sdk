// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetJMeterReportDetailsResponseBody extends TeaModel {
    /**
     * <p>The system status code. If the request was successful, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>4001</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The code key that corresponds to the key in Medusa. If no code key is available, or if the content corresponding to the code key fails to be obtained or is empty, the returned message is displayed as the default information.</p>
     */
    @NameInMap("CodeKey")
    public String codeKey;

    /**
     * <p>The URL used to access the document.</p>
     */
    @NameInMap("DocumentUrl")
    public String documentUrl;

    /**
     * <p>The returned dynamic contents that are separated by the &amp;&amp; operator.</p>
     */
    @NameInMap("DynamicCtx")
    public String dynamicCtx;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message. If the request was successful, this parameter is not returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The details of the report.</p>
     */
    @NameInMap("ReportOverView")
    public GetJMeterReportDetailsResponseBodyReportOverView reportOverView;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A8E16480-15C1-555A-922F-B736A005E52D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The dimensions of APIs.</p>
     */
    @NameInMap("SamplerMetricsList")
    public java.util.List<GetJMeterReportDetailsResponseBodySamplerMetricsList> samplerMetricsList;

    /**
     * <p>The dimensions of the whole scenario.</p>
     */
    @NameInMap("SceneMetrics")
    public GetJMeterReportDetailsResponseBodySceneMetrics sceneMetrics;

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
        /**
         * <p>The number of used engines.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentCount")
        public Integer agentCount;

        /**
         * <p>The end of the queried time range.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-03 10:45:11</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The report ID.</p>
         * 
         * <strong>example:</strong>
         * <p>GHB56VD</p>
         */
        @NameInMap("ReportId")
        public String reportId;

        /**
         * <p>The report name.</p>
         */
        @NameInMap("ReportName")
        public String reportName;

        /**
         * <p>The beginning of the queried time range.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-03 10:35:11</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The consumed Virtual User Minutes (VUM).</p>
         * 
         * <strong>example:</strong>
         * <p>4452</p>
         */
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
        /**
         * <p>The total number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>731</p>
         */
        @NameInMap("AllCount")
        public Long allCount;

        /**
         * <p>The API name.</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The average RT. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>44.2</p>
         */
        @NameInMap("AvgRt")
        public Double avgRt;

        /**
         * <p>The average TPS.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("AvgTps")
        public Double avgTps;

        /**
         * <p>The request failure rate.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FailCountReq")
        public Long failCountReq;

        /**
         * <p>The maximum RT. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>78</p>
         */
        @NameInMap("MaxRt")
        public Double maxRt;

        /**
         * <p>The minimum RT. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("MinRt")
        public Double minRt;

        /**
         * <p>The 75th percentile of RT. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>22.4</p>
         */
        @NameInMap("Seg75Rt")
        public Double seg75Rt;

        /**
         * <p>The 90th percentile of RT. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>65</p>
         */
        @NameInMap("Seg90Rt")
        public Double seg90Rt;

        /**
         * <p>The 99th percentile of RT. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>77</p>
         */
        @NameInMap("Seg99Rt")
        public Double seg99Rt;

        /**
         * <p>The request success rate. The parameter value must be a non-negative number less than or equal to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
        /**
         * <p>The total number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>717</p>
         */
        @NameInMap("AllCount")
        public Long allCount;

        /**
         * <p>The average response time (RT). Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("AvgRt")
        public Double avgRt;

        /**
         * <p>The average transactions per second (TPS).</p>
         * 
         * <strong>example:</strong>
         * <p>78</p>
         */
        @NameInMap("AvgTps")
        public Double avgTps;

        /**
         * <p>The request failure rate.</p>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("FailCountReq")
        public Long failCountReq;

        /**
         * <p>The 90th percentile of RT. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>35</p>
         */
        @NameInMap("Seg90Rt")
        public Double seg90Rt;

        /**
         * <p>The 99th percentile of RT. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>56</p>
         */
        @NameInMap("Seg99Rt")
        public Double seg99Rt;

        /**
         * <p>The request success rate. The parameter value must be a non-negative number less than or equal to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>0.99</p>
         */
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
