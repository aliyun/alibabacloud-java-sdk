// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsReportDetailsResponseBody extends TeaModel {
    /**
     * <p>The metrics for API operations in the PTS scenario</p>
     */
    @NameInMap("ApiMetricsList")
    public java.util.List<GetPtsReportDetailsResponseBodyApiMetricsList> apiMetricsList;

    /**
     * <p>The system status code. If the operation is successful, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code. If the operation is successful, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message. If the operation is successful, this parameter is not returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The summary of the report.</p>
     */
    @NameInMap("ReportOverView")
    public GetPtsReportDetailsResponseBodyReportOverView reportOverView;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DC4E3177-6745-4925-B423-4E89VV34221A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The metrics of the scenario.</p>
     */
    @NameInMap("SceneMetrics")
    public GetPtsReportDetailsResponseBodySceneMetrics sceneMetrics;

    /**
     * <p>The snapshot of the scenario.</p>
     */
    @NameInMap("SceneSnapShot")
    public GetPtsReportDetailsResponseBodySceneSnapShot sceneSnapShot;

    /**
     * <p>Indicates whether the operation is successful. Valid values:</p>
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

    public static GetPtsReportDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPtsReportDetailsResponseBody self = new GetPtsReportDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPtsReportDetailsResponseBody setApiMetricsList(java.util.List<GetPtsReportDetailsResponseBodyApiMetricsList> apiMetricsList) {
        this.apiMetricsList = apiMetricsList;
        return this;
    }
    public java.util.List<GetPtsReportDetailsResponseBodyApiMetricsList> getApiMetricsList() {
        return this.apiMetricsList;
    }

    public GetPtsReportDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPtsReportDetailsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPtsReportDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPtsReportDetailsResponseBody setReportOverView(GetPtsReportDetailsResponseBodyReportOverView reportOverView) {
        this.reportOverView = reportOverView;
        return this;
    }
    public GetPtsReportDetailsResponseBodyReportOverView getReportOverView() {
        return this.reportOverView;
    }

    public GetPtsReportDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPtsReportDetailsResponseBody setSceneMetrics(GetPtsReportDetailsResponseBodySceneMetrics sceneMetrics) {
        this.sceneMetrics = sceneMetrics;
        return this;
    }
    public GetPtsReportDetailsResponseBodySceneMetrics getSceneMetrics() {
        return this.sceneMetrics;
    }

    public GetPtsReportDetailsResponseBody setSceneSnapShot(GetPtsReportDetailsResponseBodySceneSnapShot sceneSnapShot) {
        this.sceneSnapShot = sceneSnapShot;
        return this;
    }
    public GetPtsReportDetailsResponseBodySceneSnapShot getSceneSnapShot() {
        return this.sceneSnapShot;
    }

    public GetPtsReportDetailsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPtsReportDetailsResponseBodyApiMetricsList extends TeaModel {
        /**
         * <p>The total number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>11872</p>
         */
        @NameInMap("AllCount")
        public Long allCount;

        /**
         * <p>The name of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>Test-API</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The average response time. Unit: ms.</p>
         * 
         * <strong>example:</strong>
         * <p>170.49</p>
         */
        @NameInMap("AvgRt")
        public Float avgRt;

        /**
         * <p>The average TPS.</p>
         * 
         * <strong>example:</strong>
         * <p>100.61</p>
         */
        @NameInMap("AvgTps")
        public Float avgTps;

        /**
         * <p>The number of business-related failures. If a checkpoint is defined, a failure occurs when the conditions for the checkpoint are not satisfied.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailCountBiz")
        public Long failCountBiz;

        /**
         * <p>The number of failed requests.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailCountReq")
        public Long failCountReq;

        /**
         * <p>The maximum response time. Unit: ms.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("MaxRt")
        public Float maxRt;

        /**
         * <p>The minimum response time. Unit: ms.</p>
         * 
         * <strong>example:</strong>
         * <p>162</p>
         */
        @NameInMap("MinRt")
        public Float minRt;

        /**
         * <p>The 50th percentile response time.</p>
         * 
         * <strong>example:</strong>
         * <p>168</p>
         */
        @NameInMap("Seg50Rt")
        public Float seg50Rt;

        /**
         * <p>The 75th percentile response time.</p>
         * 
         * <strong>example:</strong>
         * <p>169</p>
         */
        @NameInMap("Seg75Rt")
        public Float seg75Rt;

        /**
         * <p>The 90th percentile response time.</p>
         * 
         * <strong>example:</strong>
         * <p>170</p>
         */
        @NameInMap("Seg90Rt")
        public Float seg90Rt;

        /**
         * <p>The 99th percentile response time.</p>
         * 
         * <strong>example:</strong>
         * <p>284</p>
         */
        @NameInMap("Seg99Rt")
        public Float seg99Rt;

        /**
         * <p>The business success rate. The value is the ratio of the number of successful business to the total number of business.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SuccessRateBiz")
        public Float successRateBiz;

        /**
         * <p>The request success rate. The value is the ratio of the number of successful requests to the total number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessRateReq")
        public Float successRateReq;

        public static GetPtsReportDetailsResponseBodyApiMetricsList build(java.util.Map<String, ?> map) throws Exception {
            GetPtsReportDetailsResponseBodyApiMetricsList self = new GetPtsReportDetailsResponseBodyApiMetricsList();
            return TeaModel.build(map, self);
        }

        public GetPtsReportDetailsResponseBodyApiMetricsList setAllCount(Long allCount) {
            this.allCount = allCount;
            return this;
        }
        public Long getAllCount() {
            return this.allCount;
        }

        public GetPtsReportDetailsResponseBodyApiMetricsList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public GetPtsReportDetailsResponseBodyApiMetricsList setAvgRt(Float avgRt) {
            this.avgRt = avgRt;
            return this;
        }
        public Float getAvgRt() {
            return this.avgRt;
        }

        public GetPtsReportDetailsResponseBodyApiMetricsList setAvgTps(Float avgTps) {
            this.avgTps = avgTps;
            return this;
        }
        public Float getAvgTps() {
            return this.avgTps;
        }

        public GetPtsReportDetailsResponseBodyApiMetricsList setFailCountBiz(Long failCountBiz) {
            this.failCountBiz = failCountBiz;
            return this;
        }
        public Long getFailCountBiz() {
            return this.failCountBiz;
        }

        public GetPtsReportDetailsResponseBodyApiMetricsList setFailCountReq(Long failCountReq) {
            this.failCountReq = failCountReq;
            return this;
        }
        public Long getFailCountReq() {
            return this.failCountReq;
        }

        public GetPtsReportDetailsResponseBodyApiMetricsList setMaxRt(Float maxRt) {
            this.maxRt = maxRt;
            return this;
        }
        public Float getMaxRt() {
            return this.maxRt;
        }

        public GetPtsReportDetailsResponseBodyApiMetricsList setMinRt(Float minRt) {
            this.minRt = minRt;
            return this;
        }
        public Float getMinRt() {
            return this.minRt;
        }

        public GetPtsReportDetailsResponseBodyApiMetricsList setSeg50Rt(Float seg50Rt) {
            this.seg50Rt = seg50Rt;
            return this;
        }
        public Float getSeg50Rt() {
            return this.seg50Rt;
        }

        public GetPtsReportDetailsResponseBodyApiMetricsList setSeg75Rt(Float seg75Rt) {
            this.seg75Rt = seg75Rt;
            return this;
        }
        public Float getSeg75Rt() {
            return this.seg75Rt;
        }

        public GetPtsReportDetailsResponseBodyApiMetricsList setSeg90Rt(Float seg90Rt) {
            this.seg90Rt = seg90Rt;
            return this;
        }
        public Float getSeg90Rt() {
            return this.seg90Rt;
        }

        public GetPtsReportDetailsResponseBodyApiMetricsList setSeg99Rt(Float seg99Rt) {
            this.seg99Rt = seg99Rt;
            return this;
        }
        public Float getSeg99Rt() {
            return this.seg99Rt;
        }

        public GetPtsReportDetailsResponseBodyApiMetricsList setSuccessRateBiz(Float successRateBiz) {
            this.successRateBiz = successRateBiz;
            return this;
        }
        public Float getSuccessRateBiz() {
            return this.successRateBiz;
        }

        public GetPtsReportDetailsResponseBodyApiMetricsList setSuccessRateReq(Float successRateReq) {
            this.successRateReq = successRateReq;
            return this;
        }
        public Float getSuccessRateReq() {
            return this.successRateReq;
        }

    }

    public static class GetPtsReportDetailsResponseBodyReportOverView extends TeaModel {
        /**
         * <p>The number of load generators. Each load generator has an IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentCount")
        public Integer agentCount;

        /**
         * <p>The end time of the performance testing task.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-20 10:41:33</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The ID of the report.</p>
         * 
         * <strong>example:</strong>
         * <p>GHB56VD</p>
         */
        @NameInMap("ReportId")
        public String reportId;

        /**
         * <p>The name of the report.</p>
         * 
         * <strong>example:</strong>
         * <p>PTS-TEST</p>
         */
        @NameInMap("ReportName")
        public String reportName;

        /**
         * <p>The start time of the performance testing task.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-20 10:39:33</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The virtual user minutes (VUM).</p>
         * 
         * <strong>example:</strong>
         * <p>1012</p>
         */
        @NameInMap("Vum")
        public Long vum;

        public static GetPtsReportDetailsResponseBodyReportOverView build(java.util.Map<String, ?> map) throws Exception {
            GetPtsReportDetailsResponseBodyReportOverView self = new GetPtsReportDetailsResponseBodyReportOverView();
            return TeaModel.build(map, self);
        }

        public GetPtsReportDetailsResponseBodyReportOverView setAgentCount(Integer agentCount) {
            this.agentCount = agentCount;
            return this;
        }
        public Integer getAgentCount() {
            return this.agentCount;
        }

        public GetPtsReportDetailsResponseBodyReportOverView setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetPtsReportDetailsResponseBodyReportOverView setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public GetPtsReportDetailsResponseBodyReportOverView setReportName(String reportName) {
            this.reportName = reportName;
            return this;
        }
        public String getReportName() {
            return this.reportName;
        }

        public GetPtsReportDetailsResponseBodyReportOverView setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetPtsReportDetailsResponseBodyReportOverView setVum(Long vum) {
            this.vum = vum;
            return this;
        }
        public Long getVum() {
            return this.vum;
        }

    }

    public static class GetPtsReportDetailsResponseBodySceneMetrics extends TeaModel {
        /**
         * <p>The number of requests in the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>11872</p>
         */
        @NameInMap("AllCount")
        public Long allCount;

        /**
         * <p>The average response time in the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>170.49</p>
         */
        @NameInMap("AvgRt")
        public Float avgRt;

        /**
         * <p>The average transactions per second (TPS) in the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>100.61</p>
         */
        @NameInMap("AvgTps")
        public Float avgTps;

        /**
         * <p>The number of business failures in the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailCountBiz")
        public Long failCountBiz;

        /**
         * <p>The number of failed requests in the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailCountReq")
        public Long failCountReq;

        /**
         * <p>The 90th percentile response time.</p>
         * 
         * <strong>example:</strong>
         * <p>170</p>
         */
        @NameInMap("Seg90Rt")
        public Float seg90Rt;

        /**
         * <p>The 99th percentile response time.</p>
         * 
         * <strong>example:</strong>
         * <p>284</p>
         */
        @NameInMap("Seg99Rt")
        public Float seg99Rt;

        /**
         * <p>The business success rate in the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SuccessRateBiz")
        public Float successRateBiz;

        /**
         * <p>The request success rate in the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessRateReq")
        public Float successRateReq;

        public static GetPtsReportDetailsResponseBodySceneMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetPtsReportDetailsResponseBodySceneMetrics self = new GetPtsReportDetailsResponseBodySceneMetrics();
            return TeaModel.build(map, self);
        }

        public GetPtsReportDetailsResponseBodySceneMetrics setAllCount(Long allCount) {
            this.allCount = allCount;
            return this;
        }
        public Long getAllCount() {
            return this.allCount;
        }

        public GetPtsReportDetailsResponseBodySceneMetrics setAvgRt(Float avgRt) {
            this.avgRt = avgRt;
            return this;
        }
        public Float getAvgRt() {
            return this.avgRt;
        }

        public GetPtsReportDetailsResponseBodySceneMetrics setAvgTps(Float avgTps) {
            this.avgTps = avgTps;
            return this;
        }
        public Float getAvgTps() {
            return this.avgTps;
        }

        public GetPtsReportDetailsResponseBodySceneMetrics setFailCountBiz(Long failCountBiz) {
            this.failCountBiz = failCountBiz;
            return this;
        }
        public Long getFailCountBiz() {
            return this.failCountBiz;
        }

        public GetPtsReportDetailsResponseBodySceneMetrics setFailCountReq(Long failCountReq) {
            this.failCountReq = failCountReq;
            return this;
        }
        public Long getFailCountReq() {
            return this.failCountReq;
        }

        public GetPtsReportDetailsResponseBodySceneMetrics setSeg90Rt(Float seg90Rt) {
            this.seg90Rt = seg90Rt;
            return this;
        }
        public Float getSeg90Rt() {
            return this.seg90Rt;
        }

        public GetPtsReportDetailsResponseBodySceneMetrics setSeg99Rt(Float seg99Rt) {
            this.seg99Rt = seg99Rt;
            return this;
        }
        public Float getSeg99Rt() {
            return this.seg99Rt;
        }

        public GetPtsReportDetailsResponseBodySceneMetrics setSuccessRateBiz(Float successRateBiz) {
            this.successRateBiz = successRateBiz;
            return this;
        }
        public Float getSuccessRateBiz() {
            return this.successRateBiz;
        }

        public GetPtsReportDetailsResponseBodySceneMetrics setSuccessRateReq(Float successRateReq) {
            this.successRateReq = successRateReq;
            return this;
        }
        public Float getSuccessRateReq() {
            return this.successRateReq;
        }

    }

    public static class GetPtsReportDetailsResponseBodySceneSnapShotAdvanceSettingDomainBindingList extends TeaModel {
        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The IP addresses bound to the domain name.</p>
         */
        @NameInMap("Ips")
        public java.util.List<String> ips;

        public static GetPtsReportDetailsResponseBodySceneSnapShotAdvanceSettingDomainBindingList build(java.util.Map<String, ?> map) throws Exception {
            GetPtsReportDetailsResponseBodySceneSnapShotAdvanceSettingDomainBindingList self = new GetPtsReportDetailsResponseBodySceneSnapShotAdvanceSettingDomainBindingList();
            return TeaModel.build(map, self);
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotAdvanceSettingDomainBindingList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotAdvanceSettingDomainBindingList setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

    }

    public static class GetPtsReportDetailsResponseBodySceneSnapShotAdvanceSetting extends TeaModel {
        /**
         * <p>The timeout period of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ConnectionTimeoutInSecond")
        public Integer connectionTimeoutInSecond;

        /**
         * <p>The domain name-IP address binding relationships.</p>
         */
        @NameInMap("DomainBindingList")
        public java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotAdvanceSettingDomainBindingList> domainBindingList;

        /**
         * <p>The log sampling rate.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LogRate")
        public Integer logRate;

        /**
         * <p>The custom success code.</p>
         * 
         * <strong>example:</strong>
         * <p>429,404</p>
         */
        @NameInMap("SuccessCode")
        public String successCode;

        public static GetPtsReportDetailsResponseBodySceneSnapShotAdvanceSetting build(java.util.Map<String, ?> map) throws Exception {
            GetPtsReportDetailsResponseBodySceneSnapShotAdvanceSetting self = new GetPtsReportDetailsResponseBodySceneSnapShotAdvanceSetting();
            return TeaModel.build(map, self);
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotAdvanceSetting setConnectionTimeoutInSecond(Integer connectionTimeoutInSecond) {
            this.connectionTimeoutInSecond = connectionTimeoutInSecond;
            return this;
        }
        public Integer getConnectionTimeoutInSecond() {
            return this.connectionTimeoutInSecond;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotAdvanceSetting setDomainBindingList(java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotAdvanceSettingDomainBindingList> domainBindingList) {
            this.domainBindingList = domainBindingList;
            return this;
        }
        public java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotAdvanceSettingDomainBindingList> getDomainBindingList() {
            return this.domainBindingList;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotAdvanceSetting setLogRate(Integer logRate) {
            this.logRate = logRate;
            return this;
        }
        public Integer getLogRate() {
            return this.logRate;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotAdvanceSetting setSuccessCode(String successCode) {
            this.successCode = successCode;
            return this;
        }
        public String getSuccessCode() {
            return this.successCode;
        }

    }

    public static class GetPtsReportDetailsResponseBodySceneSnapShotFileParameterList extends TeaModel {
        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>test.csv</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The Object Storage Service (OSS) URL of the file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test-bucket.oss-cn-shanghai.aliyuncs.com/test.csv">https://test-bucket.oss-cn-shanghai.aliyuncs.com/test.csv</a></p>
         */
        @NameInMap("FileOssAddress")
        public String fileOssAddress;

        public static GetPtsReportDetailsResponseBodySceneSnapShotFileParameterList build(java.util.Map<String, ?> map) throws Exception {
            GetPtsReportDetailsResponseBodySceneSnapShotFileParameterList self = new GetPtsReportDetailsResponseBodySceneSnapShotFileParameterList();
            return TeaModel.build(map, self);
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotFileParameterList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotFileParameterList setFileOssAddress(String fileOssAddress) {
            this.fileOssAddress = fileOssAddress;
            return this;
        }
        public String getFileOssAddress() {
            return this.fileOssAddress;
        }

    }

    public static class GetPtsReportDetailsResponseBodySceneSnapShotGlobalParameterList extends TeaModel {
        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
        @NameInMap("ParamName")
        public String paramName;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>user01</p>
         */
        @NameInMap("ParamValue")
        public String paramValue;

        public static GetPtsReportDetailsResponseBodySceneSnapShotGlobalParameterList build(java.util.Map<String, ?> map) throws Exception {
            GetPtsReportDetailsResponseBodySceneSnapShotGlobalParameterList self = new GetPtsReportDetailsResponseBodySceneSnapShotGlobalParameterList();
            return TeaModel.build(map, self);
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotGlobalParameterList setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotGlobalParameterList setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

    }

    public static class GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigApiLoadConfigList extends TeaModel {
        /**
         * <p>The starting requests per second (RPS).</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RpsBegin")
        public Integer rpsBegin;

        /**
         * <p>The maximum RPS.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RpsLimit")
        public Integer rpsLimit;

        public static GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigApiLoadConfigList build(java.util.Map<String, ?> map) throws Exception {
            GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigApiLoadConfigList self = new GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigApiLoadConfigList();
            return TeaModel.build(map, self);
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigApiLoadConfigList setRpsBegin(Integer rpsBegin) {
            this.rpsBegin = rpsBegin;
            return this;
        }
        public Integer getRpsBegin() {
            return this.rpsBegin;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigApiLoadConfigList setRpsLimit(Integer rpsLimit) {
            this.rpsLimit = rpsLimit;
            return this;
        }
        public Integer getRpsLimit() {
            return this.rpsLimit;
        }

    }

    public static class GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigConfiguration extends TeaModel {
        /**
         * <p>The starting number of concurrent virtual users in the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AllConcurrencyBegin")
        public Integer allConcurrencyBegin;

        /**
         * <p>The maximum number of concurrent virtual users in the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("AllConcurrencyLimit")
        public Integer allConcurrencyLimit;

        /**
         * <p>The starting RPS in the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AllRpsBegin")
        public Integer allRpsBegin;

        /**
         * <p>The maximum RPS in the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("AllRpsLimit")
        public Integer allRpsLimit;

        public static GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigConfiguration self = new GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigConfiguration();
            return TeaModel.build(map, self);
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigConfiguration setAllConcurrencyBegin(Integer allConcurrencyBegin) {
            this.allConcurrencyBegin = allConcurrencyBegin;
            return this;
        }
        public Integer getAllConcurrencyBegin() {
            return this.allConcurrencyBegin;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigConfiguration setAllConcurrencyLimit(Integer allConcurrencyLimit) {
            this.allConcurrencyLimit = allConcurrencyLimit;
            return this;
        }
        public Integer getAllConcurrencyLimit() {
            return this.allConcurrencyLimit;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigConfiguration setAllRpsBegin(Integer allRpsBegin) {
            this.allRpsBegin = allRpsBegin;
            return this;
        }
        public Integer getAllRpsBegin() {
            return this.allRpsBegin;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigConfiguration setAllRpsLimit(Integer allRpsLimit) {
            this.allRpsLimit = allRpsLimit;
            return this;
        }
        public Integer getAllRpsLimit() {
            return this.allRpsLimit;
        }

    }

    public static class GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigRelationLoadConfigList extends TeaModel {
        /**
         * <p>The starting number of concurrent virtual users.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ConcurrencyBegin")
        public Integer concurrencyBegin;

        /**
         * <p>The maximum number of concurrent virtual users.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ConcurrencyLimit")
        public Integer concurrencyLimit;

        public static GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigRelationLoadConfigList build(java.util.Map<String, ?> map) throws Exception {
            GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigRelationLoadConfigList self = new GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigRelationLoadConfigList();
            return TeaModel.build(map, self);
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigRelationLoadConfigList setConcurrencyBegin(Integer concurrencyBegin) {
            this.concurrencyBegin = concurrencyBegin;
            return this;
        }
        public Integer getConcurrencyBegin() {
            return this.concurrencyBegin;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigRelationLoadConfigList setConcurrencyLimit(Integer concurrencyLimit) {
            this.concurrencyLimit = concurrencyLimit;
            return this;
        }
        public Integer getConcurrencyLimit() {
            return this.concurrencyLimit;
        }

    }

    public static class GetPtsReportDetailsResponseBodySceneSnapShotLoadConfig extends TeaModel {
        /**
         * <p>The number of load generators.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentCount")
        public Integer agentCount;

        /**
         * <p>The API request load settings.</p>
         */
        @NameInMap("ApiLoadConfigList")
        public java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigApiLoadConfigList> apiLoadConfigList;

        /**
         * <p>The concurrency and RPS limits in the scenario.</p>
         */
        @NameInMap("Configuration")
        public GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigConfiguration configuration;

        /**
         * <p>The maximum running time. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxRunningTime")
        public Integer maxRunningTime;

        /**
         * <p>The settings of the session.</p>
         */
        @NameInMap("RelationLoadConfigList")
        public java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigRelationLoadConfigList> relationLoadConfigList;

        /**
         * <p>The load application mode.</p>
         * 
         * <strong>example:</strong>
         * <p>TPS</p>
         */
        @NameInMap("TestMode")
        public String testMode;

        public static GetPtsReportDetailsResponseBodySceneSnapShotLoadConfig build(java.util.Map<String, ?> map) throws Exception {
            GetPtsReportDetailsResponseBodySceneSnapShotLoadConfig self = new GetPtsReportDetailsResponseBodySceneSnapShotLoadConfig();
            return TeaModel.build(map, self);
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotLoadConfig setAgentCount(Integer agentCount) {
            this.agentCount = agentCount;
            return this;
        }
        public Integer getAgentCount() {
            return this.agentCount;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotLoadConfig setApiLoadConfigList(java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigApiLoadConfigList> apiLoadConfigList) {
            this.apiLoadConfigList = apiLoadConfigList;
            return this;
        }
        public java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigApiLoadConfigList> getApiLoadConfigList() {
            return this.apiLoadConfigList;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotLoadConfig setConfiguration(GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigConfiguration getConfiguration() {
            return this.configuration;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotLoadConfig setMaxRunningTime(Integer maxRunningTime) {
            this.maxRunningTime = maxRunningTime;
            return this;
        }
        public Integer getMaxRunningTime() {
            return this.maxRunningTime;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotLoadConfig setRelationLoadConfigList(java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigRelationLoadConfigList> relationLoadConfigList) {
            this.relationLoadConfigList = relationLoadConfigList;
            return this;
        }
        public java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotLoadConfigRelationLoadConfigList> getRelationLoadConfigList() {
            return this.relationLoadConfigList;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotLoadConfig setTestMode(String testMode) {
            this.testMode = testMode;
            return this;
        }
        public String getTestMode() {
            return this.testMode;
        }

    }

    public static class GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListBody extends TeaModel {
        /**
         * <p>The content of the request body.</p>
         * 
         * <strong>example:</strong>
         * <p>{key:value}</p>
         */
        @NameInMap("BodyValue")
        public String bodyValue;

        /**
         * <p>The type of the request body.</p>
         * 
         * <strong>example:</strong>
         * <p>application/x-www-form-urlencoded</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        public static GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListBody build(java.util.Map<String, ?> map) throws Exception {
            GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListBody self = new GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListBody();
            return TeaModel.build(map, self);
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListBody setBodyValue(String bodyValue) {
            this.bodyValue = bodyValue;
            return this;
        }
        public String getBodyValue() {
            return this.bodyValue;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListBody setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

    }

    public static class GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListCheckPointList extends TeaModel {
        /**
         * <p>The checked item.</p>
         * 
         * <strong>example:</strong>
         * <p>userId</p>
         */
        @NameInMap("CheckPoint")
        public String checkPoint;

        /**
         * <p>The check type.</p>
         * 
         * <strong>example:</strong>
         * <p>EXPORTED_PARAM</p>
         */
        @NameInMap("CheckType")
        public String checkType;

        /**
         * <p>The expected value.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("ExpectValue")
        public String expectValue;

        /**
         * <p>The check operator.</p>
         * 
         * <strong>example:</strong>
         * <p>ctn</p>
         */
        @NameInMap("Operator")
        public String operator;

        public static GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListCheckPointList build(java.util.Map<String, ?> map) throws Exception {
            GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListCheckPointList self = new GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListCheckPointList();
            return TeaModel.build(map, self);
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListCheckPointList setCheckPoint(String checkPoint) {
            this.checkPoint = checkPoint;
            return this;
        }
        public String getCheckPoint() {
            return this.checkPoint;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListCheckPointList setCheckType(String checkType) {
            this.checkType = checkType;
            return this;
        }
        public String getCheckType() {
            return this.checkType;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListCheckPointList setExpectValue(String expectValue) {
            this.expectValue = expectValue;
            return this;
        }
        public String getExpectValue() {
            return this.expectValue;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListCheckPointList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

    public static class GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListExportList extends TeaModel {
        /**
         * <p>The index of the export parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The name of the export parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>userId</p>
         */
        @NameInMap("ExportName")
        public String exportName;

        /**
         * <p>The source of the export parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>BODY_JSON</p>
         */
        @NameInMap("ExportType")
        public String exportType;

        /**
         * <p>The actual path from which you want to extract the export parameter values.</p>
         * 
         * <strong>example:</strong>
         * <p>data.userId</p>
         */
        @NameInMap("ExportValue")
        public String exportValue;

        public static GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListExportList build(java.util.Map<String, ?> map) throws Exception {
            GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListExportList self = new GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListExportList();
            return TeaModel.build(map, self);
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListExportList setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListExportList setExportName(String exportName) {
            this.exportName = exportName;
            return this;
        }
        public String getExportName() {
            return this.exportName;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListExportList setExportType(String exportType) {
            this.exportType = exportType;
            return this;
        }
        public String getExportType() {
            return this.exportType;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListExportList setExportValue(String exportValue) {
            this.exportValue = exportValue;
            return this;
        }
        public String getExportValue() {
            return this.exportValue;
        }

    }

    public static class GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListHeaderList extends TeaModel {
        /**
         * <p>The name of the header.</p>
         * 
         * <strong>example:</strong>
         * <p>User-Agent</p>
         */
        @NameInMap("HeaderName")
        public String headerName;

        /**
         * <p>The value of the header.</p>
         * 
         * <strong>example:</strong>
         * <p>PTS</p>
         */
        @NameInMap("HeaderValue")
        public String headerValue;

        public static GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListHeaderList build(java.util.Map<String, ?> map) throws Exception {
            GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListHeaderList self = new GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListHeaderList();
            return TeaModel.build(map, self);
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListHeaderList setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListHeaderList setHeaderValue(String headerValue) {
            this.headerValue = headerValue;
            return this;
        }
        public String getHeaderValue() {
            return this.headerValue;
        }

    }

    public static class GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiList extends TeaModel {
        /**
         * <p>The ID of the API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>MNB45</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The name of the API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Test-API</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The request body.</p>
         */
        @NameInMap("Body")
        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListBody body;

        /**
         * <p>The checkpoints of the API operation.</p>
         */
        @NameInMap("CheckPointList")
        public java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListCheckPointList> checkPointList;

        /**
         * <p>The export parameters.</p>
         */
        @NameInMap("ExportList")
        public java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListExportList> exportList;

        /**
         * <p>The headers.</p>
         */
        @NameInMap("HeaderList")
        public java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListHeaderList> headerList;

        /**
         * <p>The method of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The number of redirections.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RedirectCountLimit")
        public Integer redirectCountLimit;

        /**
         * <p>The timeout period.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TimeoutInSecond")
        public Integer timeoutInSecond;

        /**
         * <p>The URL to which the API request is sent.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/">http://www.example.com/</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiList build(java.util.Map<String, ?> map) throws Exception {
            GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiList self = new GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiList();
            return TeaModel.build(map, self);
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiList setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiList setBody(GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListBody body) {
            this.body = body;
            return this;
        }
        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListBody getBody() {
            return this.body;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiList setCheckPointList(java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListCheckPointList> checkPointList) {
            this.checkPointList = checkPointList;
            return this;
        }
        public java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListCheckPointList> getCheckPointList() {
            return this.checkPointList;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiList setExportList(java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListExportList> exportList) {
            this.exportList = exportList;
            return this;
        }
        public java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListExportList> getExportList() {
            return this.exportList;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiList setHeaderList(java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListHeaderList> headerList) {
            this.headerList = headerList;
            return this;
        }
        public java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiListHeaderList> getHeaderList() {
            return this.headerList;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiList setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiList setRedirectCountLimit(Integer redirectCountLimit) {
            this.redirectCountLimit = redirectCountLimit;
            return this;
        }
        public Integer getRedirectCountLimit() {
            return this.redirectCountLimit;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiList setTimeoutInSecond(Integer timeoutInSecond) {
            this.timeoutInSecond = timeoutInSecond;
            return this;
        }
        public Integer getTimeoutInSecond() {
            return this.timeoutInSecond;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetPtsReportDetailsResponseBodySceneSnapShotRelationListFileParameterExplainList extends TeaModel {
        /**
         * <p>Indicates whether the file is used as the baseline file.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BaseFile")
        public Boolean baseFile;

        /**
         * <p>Indicates whether the parameters are used once.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CycleOnce")
        public Boolean cycleOnce;

        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>test.csv</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The parameters in the file.</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
        @NameInMap("FileParamName")
        public String fileParamName;

        public static GetPtsReportDetailsResponseBodySceneSnapShotRelationListFileParameterExplainList build(java.util.Map<String, ?> map) throws Exception {
            GetPtsReportDetailsResponseBodySceneSnapShotRelationListFileParameterExplainList self = new GetPtsReportDetailsResponseBodySceneSnapShotRelationListFileParameterExplainList();
            return TeaModel.build(map, self);
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListFileParameterExplainList setBaseFile(Boolean baseFile) {
            this.baseFile = baseFile;
            return this;
        }
        public Boolean getBaseFile() {
            return this.baseFile;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListFileParameterExplainList setCycleOnce(Boolean cycleOnce) {
            this.cycleOnce = cycleOnce;
            return this;
        }
        public Boolean getCycleOnce() {
            return this.cycleOnce;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListFileParameterExplainList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationListFileParameterExplainList setFileParamName(String fileParamName) {
            this.fileParamName = fileParamName;
            return this;
        }
        public String getFileParamName() {
            return this.fileParamName;
        }

    }

    public static class GetPtsReportDetailsResponseBodySceneSnapShotRelationList extends TeaModel {
        /**
         * <p>The settings of the API operation.</p>
         */
        @NameInMap("ApiList")
        public java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiList> apiList;

        /**
         * <p>The file parameters used by the session.</p>
         */
        @NameInMap("FileParameterExplainList")
        public java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotRelationListFileParameterExplainList> fileParameterExplainList;

        /**
         * <p>The ID of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>HGBN4D</p>
         */
        @NameInMap("RelationId")
        public String relationId;

        /**
         * <p>The name of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>Test-session-1</p>
         */
        @NameInMap("RelationName")
        public String relationName;

        public static GetPtsReportDetailsResponseBodySceneSnapShotRelationList build(java.util.Map<String, ?> map) throws Exception {
            GetPtsReportDetailsResponseBodySceneSnapShotRelationList self = new GetPtsReportDetailsResponseBodySceneSnapShotRelationList();
            return TeaModel.build(map, self);
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationList setApiList(java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiList> apiList) {
            this.apiList = apiList;
            return this;
        }
        public java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotRelationListApiList> getApiList() {
            return this.apiList;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationList setFileParameterExplainList(java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotRelationListFileParameterExplainList> fileParameterExplainList) {
            this.fileParameterExplainList = fileParameterExplainList;
            return this;
        }
        public java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotRelationListFileParameterExplainList> getFileParameterExplainList() {
            return this.fileParameterExplainList;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationList setRelationId(String relationId) {
            this.relationId = relationId;
            return this;
        }
        public String getRelationId() {
            return this.relationId;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShotRelationList setRelationName(String relationName) {
            this.relationName = relationName;
            return this;
        }
        public String getRelationName() {
            return this.relationName;
        }

    }

    public static class GetPtsReportDetailsResponseBodySceneSnapShot extends TeaModel {
        /**
         * <p>The advanced settings of the scenario.</p>
         */
        @NameInMap("AdvanceSetting")
        public GetPtsReportDetailsResponseBodySceneSnapShotAdvanceSetting advanceSetting;

        /**
         * <p>The time when the scenario was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-20 09:28:10</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The file used in the scenario.</p>
         */
        @NameInMap("FileParameterList")
        public java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotFileParameterList> fileParameterList;

        /**
         * <p>The global parameters.</p>
         */
        @NameInMap("GlobalParameterList")
        public java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotGlobalParameterList> globalParameterList;

        /**
         * <p>The load settings.</p>
         */
        @NameInMap("LoadConfig")
        public GetPtsReportDetailsResponseBodySceneSnapShotLoadConfig loadConfig;

        /**
         * <p>The last modification time of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-10 10:10:10</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The sessions.</p>
         */
        @NameInMap("RelationList")
        public java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotRelationList> relationList;

        /**
         * <p>The ID of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>7HBNS3</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        /**
         * <p>The name of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>PTS-TEST</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>The status of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>STOPPED</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetPtsReportDetailsResponseBodySceneSnapShot build(java.util.Map<String, ?> map) throws Exception {
            GetPtsReportDetailsResponseBodySceneSnapShot self = new GetPtsReportDetailsResponseBodySceneSnapShot();
            return TeaModel.build(map, self);
        }

        public GetPtsReportDetailsResponseBodySceneSnapShot setAdvanceSetting(GetPtsReportDetailsResponseBodySceneSnapShotAdvanceSetting advanceSetting) {
            this.advanceSetting = advanceSetting;
            return this;
        }
        public GetPtsReportDetailsResponseBodySceneSnapShotAdvanceSetting getAdvanceSetting() {
            return this.advanceSetting;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShot setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShot setFileParameterList(java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotFileParameterList> fileParameterList) {
            this.fileParameterList = fileParameterList;
            return this;
        }
        public java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotFileParameterList> getFileParameterList() {
            return this.fileParameterList;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShot setGlobalParameterList(java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotGlobalParameterList> globalParameterList) {
            this.globalParameterList = globalParameterList;
            return this;
        }
        public java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotGlobalParameterList> getGlobalParameterList() {
            return this.globalParameterList;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShot setLoadConfig(GetPtsReportDetailsResponseBodySceneSnapShotLoadConfig loadConfig) {
            this.loadConfig = loadConfig;
            return this;
        }
        public GetPtsReportDetailsResponseBodySceneSnapShotLoadConfig getLoadConfig() {
            return this.loadConfig;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShot setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShot setRelationList(java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotRelationList> relationList) {
            this.relationList = relationList;
            return this;
        }
        public java.util.List<GetPtsReportDetailsResponseBodySceneSnapShotRelationList> getRelationList() {
            return this.relationList;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShot setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShot setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetPtsReportDetailsResponseBodySceneSnapShot setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
