// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetInstanceInspectionReportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>complete</p>
     */
    @NameInMap("completion")
    public String completion;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("coverage")
    public java.util.List<GetInstanceInspectionReportResponseBodyCoverage> coverage;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("findings")
    public java.util.List<GetInstanceInspectionReportResponseBodyFindings> findings;

    /**
     * <strong>example:</strong>
     * <p>2026-09-18T08:02:00Z</p>
     */
    @NameInMap("finishedAt")
    public String finishedAt;

    /**
     * <strong>example:</strong>
     * <h1>实例巡检诊断报告</h1>
     */
    @NameInMap("html")
    public String html;

    /**
     * <strong>example:</strong>
     * <p>irun-example</p>
     */
    @NameInMap("inspectionRunId")
    public String inspectionRunId;

    /**
     * <strong>example:</strong>
     * <p>rmq-cn-example</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>订单实例</p>
     */
    @NameInMap("instanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <h1>实例巡检诊断报告</h1>
     */
    @NameInMap("markdown")
    public String markdown;

    /**
     * <strong>example:</strong>
     * <p>消费延迟与容量限制可能相关</p>
     */
    @NameInMap("overview")
    public String overview;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>irpt-example</p>
     */
    @NameInMap("reportId")
    public String reportId;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("reportSummary")
    public GetInstanceInspectionReportResponseBodyReportSummary reportSummary;

    /**
     * <strong>example:</strong>
     * <p>inspection-v2.1</p>
     */
    @NameInMap("templateVersion")
    public String templateVersion;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("timeRange")
    public GetInstanceInspectionReportResponseBodyTimeRange timeRange;

    public static GetInstanceInspectionReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceInspectionReportResponseBody self = new GetInstanceInspectionReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceInspectionReportResponseBody setCompletion(String completion) {
        this.completion = completion;
        return this;
    }
    public String getCompletion() {
        return this.completion;
    }

    public GetInstanceInspectionReportResponseBody setCoverage(java.util.List<GetInstanceInspectionReportResponseBodyCoverage> coverage) {
        this.coverage = coverage;
        return this;
    }
    public java.util.List<GetInstanceInspectionReportResponseBodyCoverage> getCoverage() {
        return this.coverage;
    }

    public GetInstanceInspectionReportResponseBody setFindings(java.util.List<GetInstanceInspectionReportResponseBodyFindings> findings) {
        this.findings = findings;
        return this;
    }
    public java.util.List<GetInstanceInspectionReportResponseBodyFindings> getFindings() {
        return this.findings;
    }

    public GetInstanceInspectionReportResponseBody setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }
    public String getFinishedAt() {
        return this.finishedAt;
    }

    public GetInstanceInspectionReportResponseBody setHtml(String html) {
        this.html = html;
        return this;
    }
    public String getHtml() {
        return this.html;
    }

    public GetInstanceInspectionReportResponseBody setInspectionRunId(String inspectionRunId) {
        this.inspectionRunId = inspectionRunId;
        return this;
    }
    public String getInspectionRunId() {
        return this.inspectionRunId;
    }

    public GetInstanceInspectionReportResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceInspectionReportResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public GetInstanceInspectionReportResponseBody setMarkdown(String markdown) {
        this.markdown = markdown;
        return this;
    }
    public String getMarkdown() {
        return this.markdown;
    }

    public GetInstanceInspectionReportResponseBody setOverview(String overview) {
        this.overview = overview;
        return this;
    }
    public String getOverview() {
        return this.overview;
    }

    public GetInstanceInspectionReportResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetInstanceInspectionReportResponseBody setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public GetInstanceInspectionReportResponseBody setReportSummary(GetInstanceInspectionReportResponseBodyReportSummary reportSummary) {
        this.reportSummary = reportSummary;
        return this;
    }
    public GetInstanceInspectionReportResponseBodyReportSummary getReportSummary() {
        return this.reportSummary;
    }

    public GetInstanceInspectionReportResponseBody setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public GetInstanceInspectionReportResponseBody setTimeRange(GetInstanceInspectionReportResponseBodyTimeRange timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public GetInstanceInspectionReportResponseBodyTimeRange getTimeRange() {
        return this.timeRange;
    }

    public static class GetInstanceInspectionReportResponseBodyCoverageTimeRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-09-08T00:00:00Z</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>2026-09-01T00:00:00Z</p>
         */
        @NameInMap("startTime")
        public String startTime;

        public static GetInstanceInspectionReportResponseBodyCoverageTimeRange build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionReportResponseBodyCoverageTimeRange self = new GetInstanceInspectionReportResponseBodyCoverageTimeRange();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionReportResponseBodyCoverageTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetInstanceInspectionReportResponseBodyCoverageTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetInstanceInspectionReportResponseBodyCoverage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("diagnosisStatus")
        public String diagnosisStatus;

        /**
         * <strong>example:</strong>
         * <p>消费健康</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2026-09-01T01:00:00Z</p>
         */
        @NameInMap("observedAt")
        public String observedAt;

        /**
         * <strong>example:</strong>
         * <p>risk</p>
         */
        @NameInMap("result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>rmq.consumer-health</p>
         */
        @NameInMap("templateCode")
        public String templateCode;

        /**
         * <strong>example:</strong>
         * <p>{&quot;startTime&quot;:&quot;2026-09-01T00:00:00Z&quot;,&quot;endTime&quot;:&quot;2026-09-01T01:00:00Z&quot;}</p>
         */
        @NameInMap("timeRange")
        public GetInstanceInspectionReportResponseBodyCoverageTimeRange timeRange;

        public static GetInstanceInspectionReportResponseBodyCoverage build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionReportResponseBodyCoverage self = new GetInstanceInspectionReportResponseBodyCoverage();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionReportResponseBodyCoverage setDiagnosisStatus(String diagnosisStatus) {
            this.diagnosisStatus = diagnosisStatus;
            return this;
        }
        public String getDiagnosisStatus() {
            return this.diagnosisStatus;
        }

        public GetInstanceInspectionReportResponseBodyCoverage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInstanceInspectionReportResponseBodyCoverage setObservedAt(String observedAt) {
            this.observedAt = observedAt;
            return this;
        }
        public String getObservedAt() {
            return this.observedAt;
        }

        public GetInstanceInspectionReportResponseBodyCoverage setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetInstanceInspectionReportResponseBodyCoverage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetInstanceInspectionReportResponseBodyCoverage setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public GetInstanceInspectionReportResponseBodyCoverage setTimeRange(GetInstanceInspectionReportResponseBodyCoverageTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public GetInstanceInspectionReportResponseBodyCoverageTimeRange getTimeRange() {
            return this.timeRange;
        }

    }

    public static class GetInstanceInspectionReportResponseBodyFindingsResource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>GID-orders</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>订单消费组</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>group</p>
         */
        @NameInMap("type")
        public String type;

        public static GetInstanceInspectionReportResponseBodyFindingsResource build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionReportResponseBodyFindingsResource self = new GetInstanceInspectionReportResponseBodyFindingsResource();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionReportResponseBodyFindingsResource setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetInstanceInspectionReportResponseBodyFindingsResource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInstanceInspectionReportResponseBodyFindingsResource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetInstanceInspectionReportResponseBodyFindingsTimeRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-09-08T00:00:00Z</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>2026-09-01T00:00:00Z</p>
         */
        @NameInMap("startTime")
        public String startTime;

        public static GetInstanceInspectionReportResponseBodyFindingsTimeRange build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionReportResponseBodyFindingsTimeRange self = new GetInstanceInspectionReportResponseBodyFindingsTimeRange();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionReportResponseBodyFindingsTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetInstanceInspectionReportResponseBodyFindingsTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetInstanceInspectionReportResponseBodyFindings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("alternatives")
        public java.util.List<String> alternatives;

        /**
         * <strong>example:</strong>
         * <p>消费环节</p>
         */
        @NameInMap("boundary")
        public String boundary;

        /**
         * <strong>example:</strong>
         * <p>消费者处理速度可能不足</p>
         */
        @NameInMap("cause")
        public String cause;

        /**
         * <strong>example:</strong>
         * <p>likely</p>
         */
        @NameInMap("confidence")
        public String confidence;

        /**
         * <strong>example:</strong>
         * <p>[&quot;消费延迟 60 秒&quot;]</p>
         */
        @NameInMap("evidence")
        public java.util.List<String> evidence;

        /**
         * <strong>example:</strong>
         * <p>消息处理延迟升高</p>
         */
        @NameInMap("impact")
        public String impact;

        /**
         * <strong>example:</strong>
         * <p>消费组监控</p>
         */
        @NameInMap("location")
        public String location;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("missingEvidence")
        public java.util.List<String> missingEvidence;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("observations")
        public java.util.List<String> observations;

        /**
         * <strong>example:</strong>
         * <p>2026-09-01T01:00:00Z</p>
         */
        @NameInMap("observedAt")
        public String observedAt;

        /**
         * <strong>example:</strong>
         * <p>[&quot;检查消费者处理耗时&quot;]</p>
         */
        @NameInMap("recommendations")
        public java.util.List<String> recommendations;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("resource")
        public GetInstanceInspectionReportResponseBodyFindingsResource resource;

        /**
         * <strong>example:</strong>
         * <p>消费延迟</p>
         */
        @NameInMap("riskType")
        public String riskType;

        /**
         * <strong>example:</strong>
         * <p>script</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>rmq.consumer-health</p>
         */
        @NameInMap("templateCode")
        public String templateCode;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("timeRange")
        public GetInstanceInspectionReportResponseBodyFindingsTimeRange timeRange;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("verification")
        public java.util.List<String> verification;

        public static GetInstanceInspectionReportResponseBodyFindings build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionReportResponseBodyFindings self = new GetInstanceInspectionReportResponseBodyFindings();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionReportResponseBodyFindings setAlternatives(java.util.List<String> alternatives) {
            this.alternatives = alternatives;
            return this;
        }
        public java.util.List<String> getAlternatives() {
            return this.alternatives;
        }

        public GetInstanceInspectionReportResponseBodyFindings setBoundary(String boundary) {
            this.boundary = boundary;
            return this;
        }
        public String getBoundary() {
            return this.boundary;
        }

        public GetInstanceInspectionReportResponseBodyFindings setCause(String cause) {
            this.cause = cause;
            return this;
        }
        public String getCause() {
            return this.cause;
        }

        public GetInstanceInspectionReportResponseBodyFindings setConfidence(String confidence) {
            this.confidence = confidence;
            return this;
        }
        public String getConfidence() {
            return this.confidence;
        }

        public GetInstanceInspectionReportResponseBodyFindings setEvidence(java.util.List<String> evidence) {
            this.evidence = evidence;
            return this;
        }
        public java.util.List<String> getEvidence() {
            return this.evidence;
        }

        public GetInstanceInspectionReportResponseBodyFindings setImpact(String impact) {
            this.impact = impact;
            return this;
        }
        public String getImpact() {
            return this.impact;
        }

        public GetInstanceInspectionReportResponseBodyFindings setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetInstanceInspectionReportResponseBodyFindings setMissingEvidence(java.util.List<String> missingEvidence) {
            this.missingEvidence = missingEvidence;
            return this;
        }
        public java.util.List<String> getMissingEvidence() {
            return this.missingEvidence;
        }

        public GetInstanceInspectionReportResponseBodyFindings setObservations(java.util.List<String> observations) {
            this.observations = observations;
            return this;
        }
        public java.util.List<String> getObservations() {
            return this.observations;
        }

        public GetInstanceInspectionReportResponseBodyFindings setObservedAt(String observedAt) {
            this.observedAt = observedAt;
            return this;
        }
        public String getObservedAt() {
            return this.observedAt;
        }

        public GetInstanceInspectionReportResponseBodyFindings setRecommendations(java.util.List<String> recommendations) {
            this.recommendations = recommendations;
            return this;
        }
        public java.util.List<String> getRecommendations() {
            return this.recommendations;
        }

        public GetInstanceInspectionReportResponseBodyFindings setResource(GetInstanceInspectionReportResponseBodyFindingsResource resource) {
            this.resource = resource;
            return this;
        }
        public GetInstanceInspectionReportResponseBodyFindingsResource getResource() {
            return this.resource;
        }

        public GetInstanceInspectionReportResponseBodyFindings setRiskType(String riskType) {
            this.riskType = riskType;
            return this;
        }
        public String getRiskType() {
            return this.riskType;
        }

        public GetInstanceInspectionReportResponseBodyFindings setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetInstanceInspectionReportResponseBodyFindings setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public GetInstanceInspectionReportResponseBodyFindings setTimeRange(GetInstanceInspectionReportResponseBodyFindingsTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public GetInstanceInspectionReportResponseBodyFindingsTimeRange getTimeRange() {
            return this.timeRange;
        }

        public GetInstanceInspectionReportResponseBodyFindings setVerification(java.util.List<String> verification) {
            this.verification = verification;
            return this;
        }
        public java.util.List<String> getVerification() {
            return this.verification;
        }

    }

    public static class GetInstanceInspectionReportResponseBodyReportSummary extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("infoCount")
        public Integer infoCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("riskCount")
        public Integer riskCount;

        public static GetInstanceInspectionReportResponseBodyReportSummary build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionReportResponseBodyReportSummary self = new GetInstanceInspectionReportResponseBodyReportSummary();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionReportResponseBodyReportSummary setInfoCount(Integer infoCount) {
            this.infoCount = infoCount;
            return this;
        }
        public Integer getInfoCount() {
            return this.infoCount;
        }

        public GetInstanceInspectionReportResponseBodyReportSummary setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

    }

    public static class GetInstanceInspectionReportResponseBodyTimeRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-09-08T00:00:00Z</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>2026-09-01T00:00:00Z</p>
         */
        @NameInMap("startTime")
        public String startTime;

        public static GetInstanceInspectionReportResponseBodyTimeRange build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInspectionReportResponseBodyTimeRange self = new GetInstanceInspectionReportResponseBodyTimeRange();
            return TeaModel.build(map, self);
        }

        public GetInstanceInspectionReportResponseBodyTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetInstanceInspectionReportResponseBodyTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
